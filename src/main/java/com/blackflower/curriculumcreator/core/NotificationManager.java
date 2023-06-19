package com.blackflower.curriculumcreator.core;

import com.blackflower.curriculumcreator.customComponents.CCAdminNotificationPanel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author emirs
 */
public class NotificationManager {

    public static ArrayList<CCAdminNotificationPanel> notifications = new ArrayList<>();

    public static void refreshAllNotifications() {
        notifications = new ArrayList<>();

        String filename = "C:\\Users\\emirs\\Documents\\NetBeansProjects\\CurriculumCreator\\settings\\notifications.txt";

        ArrayList<String> lines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        
        for (int i = 0; i < lines.size() / 4; i++) {
            String title = lines.get(i*4);
            String content = lines.get((i*4)+1);
            String date = lines.get((i*4)+2);
            String path = lines.get((i*4)+3);
            
            CCAdminNotificationPanel notification = new CCAdminNotificationPanel(path, title, content, date);
            notifications.add(notification);
        }
    }

    public static void createNotification(String notificationPath, String notifTitle, String notifContent) {
        String filename = "C:\\Users\\emirs\\Documents\\NetBeansProjects\\CurriculumCreator\\settings\\notifications.txt";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(notifTitle);
            bufferedWriter.newLine();
            bufferedWriter.write(notifContent);
            bufferedWriter.newLine();
            bufferedWriter.write(formatter.format(date));
            bufferedWriter.newLine();
            bufferedWriter.write(notificationPath);
            bufferedWriter.newLine();

            bufferedWriter.close();
            System.out.println("Content written to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        refreshAllNotifications();
    }
    
    public static void ClearNotifications(){
        String filename = "C:\\Users\\emirs\\Documents\\NetBeansProjects\\CurriculumCreator\\settings\\notifications.txt";
        try {
            FileWriter fileWriter = new FileWriter(filename, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("");

            bufferedWriter.close();
            System.out.println("Content deleted from the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        
        notifications = new ArrayList<>();
    }

}
