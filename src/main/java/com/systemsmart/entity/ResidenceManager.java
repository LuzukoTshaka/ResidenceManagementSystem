package com.systemsmart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/*  Author: Christ Kitenge Mbuyi <217248756@mycput.ac.za>
    Description: This class specifies the attributes of the Residence Manager entity using builder pattern
    Date: 05 July 2020
*/
@Entity
public class ResidenceManager implements Serializable {

    @Id
    private int employeeId;
    private String firstName;
    private String lastName;
    private String employmentDate;
    private String residenceName;
    private int accessLevel;

    protected ResidenceManager(){}

    // Constructor
    public ResidenceManager(Builder builder)
    {
        this.employeeId = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.employmentDate = builder.employmentDate;
        this.residenceName = builder.residenceName;
        this.accessLevel = builder.accessLevel;

    }

    // Getters
    public int getEmployeeId()
    {
        return employeeId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getEmploymentDate()
    {
        return employmentDate;
    }

    public String getResidenceName()
    {
        return residenceName;
    }

    public int getAccessLevel()
    {
        return accessLevel;
    }

    @Override
    public String toString() {
        return "ResidenceManager{" +
                "employeeId: " + employeeId +
                ", firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", employmentDate: '" + employmentDate + '\'' +
                ", residenceName: '" + residenceName + '\'' +
                ", accessLevel: " + accessLevel +
                '}';
    }

    // Builder Class
    public static class Builder {
        private int employeeId;
        private String firstName, lastName, employmentDate, residenceName;
        private int accessLevel;

        public Builder setEmployeeId(int employeeId)
        {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setFirstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName)
        {
            this.lastName = lastName;
            return this;

        }

        public Builder setEmploymentDate(String employmentDate)
        {
            this.employmentDate = employmentDate;
            return this;
        }

        public Builder setResidenceName(String residenceName)
        {
            this.residenceName = residenceName;
            return this;
        }

        public Builder setAccessLevel(int accessLevel)
        {
            this.accessLevel = accessLevel;
            return this;
        }

        public  Builder copy(ResidenceManager residenceManager)
        {
            this.employeeId = residenceManager.employeeId;
            this.firstName = residenceManager.firstName;
            this.lastName = residenceManager.lastName;
            this.employmentDate = residenceManager.employmentDate;
            this.residenceName = residenceManager.residenceName;
            this.accessLevel = residenceManager.accessLevel;
            return this;
        }

        public ResidenceManager build()
        {
            return new ResidenceManager(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidenceManager that = (ResidenceManager) o;
        return employeeId == that.employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
}
