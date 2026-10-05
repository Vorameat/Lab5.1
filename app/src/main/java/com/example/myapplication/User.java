package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Note> notes;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.notes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }
}