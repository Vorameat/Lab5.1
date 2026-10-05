package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String idCard;
    private String password;
    private List<Note> notes;

    public User() {
        this.name = "";
        this.idCard = "";
        this.password = "";
        this.notes = new ArrayList<>();
    }

    public User(String name, String idCard, String password) {
        this.name = name;
        this.idCard = idCard;
        this.password = password;
        this.notes = new ArrayList<>();
    }

    public void addTextNote(TextNote note) {
        this.notes.add(note);
    }

    public void addNote(Note note) {
        this.notes.add(note);
    }

    public void login() {
        System.out.println("Login: " + name + " (" + idCard + ")");
    }

    public void displayAllNotes() {
        System.out.println("=== Notes for User: " + name + " ===");
        for (Note note : notes) {
            note.getSummary();
            System.out.println("--------------------------------");
        }
    }

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIdCard() { return idCard; }
    public void setIdCard(String idCard) { this.idCard = idCard; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public List<Note> getNotes() { return notes; }
}