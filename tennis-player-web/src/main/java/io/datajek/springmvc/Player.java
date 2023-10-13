package io.datajek.springmvc;

import java.util.Date;

public class Player {
    private int id;
    private String name;
    private String nationality;
    private Date dateOfBirth;
    private int titles;

    public Player(int id, String name, String nationality, Date dateOfBirth, int titles) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.titles = titles;
    }

    public Player(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTitles() {
        return titles;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }
}
