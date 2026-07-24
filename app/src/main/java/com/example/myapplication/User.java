package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String idCard;
    private String password;
    private List<TextNote> textNotes;

    public User() {
        this.name = "";
        this.idCard = "";
        this.password = "";
        this.textNotes = new ArrayList<>();
    }

    public User(String name, String idCard, String password) {
        this.name = name;
        this.idCard = idCard;
        this.password = password;
        this.textNotes = new ArrayList<>();
    }

    public void addTextNote(TextNote note) {
        textNotes.add(note);
    }

    public void displayAllNotes() {
        System.out.println("=== Notes for User: " + name + " ===");
        for (TextNote note : textNotes) {
            note.getSummary();
            System.out.println("---------------------------------");
        }
    }

    public void login() {
        System.out.println(name);
        System.out.println(idCard);
        System.out.println(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}