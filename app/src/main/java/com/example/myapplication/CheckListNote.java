package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class CheckListNote extends Note {
    private List<String> checkList;

    public CheckListNote() {
        super();
        this.checkList = new ArrayList<>();
    }

    public CheckListNote(String title, String createdDate, User user) {
        super(title, createdDate, user);
        this.checkList = new ArrayList<>();
    }

    public void addItem(String item) {
        this.checkList.add(item);
    }

    @Override
    public void getSummary() {
        System.out.println("Title: " + title);
        System.out.println("Date: " + createdDate);
        System.out.println("Checklist items:");
        for (String item : checkList) {
            System.out.println(" - " + item);
        }
    }

    public List<String> getCheckList() {
        return checkList;
    }
}