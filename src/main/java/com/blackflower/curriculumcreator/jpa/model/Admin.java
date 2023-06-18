
package com.blackflower.curriculumcreator.jpa.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author emirs
 */
@Entity
@DiscriminatorValue("Admin")
public class Admin extends Person {

    public Admin() {
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (super.getId()!= null ? super.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instructor)) {
            return false;
        }
        Instructor other = (Instructor) object;
        if ((super.getId() == null && other.getId() != null) || (super.getId() != null && !super.getId().equals(other.getId() ))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
