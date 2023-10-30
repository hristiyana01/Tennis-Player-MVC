package io.datajek.springmvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Athlete {
    private String firstName;
    @NotNull(message = "This is a required field.")
    @Size(min = 1, message = "This is a required field.")
    // @NotEmpty(message = "This is a required field.")
    private String lastName;
    private String country;
    private String handedness;
    private String[] grandSlams;
    public Athlete() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        this.handedness = handedness;
    }

    public String[] getGrandSlams() {
        return grandSlams;
    }

    public void setGrandSlams(String[] grandSlams) {
        this.grandSlams = grandSlams;
    }
}
