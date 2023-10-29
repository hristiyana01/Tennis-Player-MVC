package io.datajek.springmvc;

public class Athlete {
    private String lastName;
    private String country;
    private String handedness;
    private String[] grandSlams;
    public Athlete() {

    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
