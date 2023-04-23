package com.blackflower.curriculumcreator.core;

/**
 *
 * @author emirs
 */
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageResizer {

    public static ImageIcon resizeImage(String imagePath, int width, int height) throws IOException {
        BufferedImage originalImage = ImageIO.read(new File(imagePath));
        int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D g = resizedImage.createGraphics();
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g.setRenderingHints(hints);
        g.drawImage(scaledImage, 0, 0, width, height, null);
        g.dispose();

        // Create a new ImageIcon with the resized image
        return new ImageIcon(resizedImage);
    }

}
