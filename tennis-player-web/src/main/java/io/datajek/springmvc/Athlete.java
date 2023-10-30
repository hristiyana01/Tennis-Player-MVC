package io.datajek.springmvc;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class Athlete {
    private String firstName;
    @NotNull(message = "This is a required field.")
    @Size(min = 1, message = "This is a required field.")
    // @NotEmpty(message = "This is a required field.")
    private String lastName;
    private String country;
    private String handedness;
    private String[] grandSlams;

    @NotNull(message="This is a required field.")
    @Min(value = 1, message = "Value must be grater than or equal to 1.")
    @Max(value = 1, message = "Value must be less than or equal to 100.")
    private Integer rank;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Past(message="Date must be in the past.")
    private Date lastWon;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Date getLastWon() {
        return lastWon;
    }

    public void setLastWon(Date lastWon) {
        this.lastWon = lastWon;
    }

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
