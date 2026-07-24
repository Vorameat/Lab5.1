
package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class CheckListNote {
    private String title;
    private String createdDate;
    private List<String> checkList;

    public CheckListNote() {
        this.title = "";
        this.createdDate = "";
        this.checkList = new ArrayList<>();
    }

    public CheckListNote(String title, String createdDate) {
        this.title = title;
        this.createdDate = createdDate;
        this.checkList = new ArrayList<>();
    }

    public void addItem(String item) {
        checkList.add(item);
    }

    public void getSummary() {
        System.out.println("Title: " + title);
        System.out.println("Date: " + createdDate);
        System.out.println("Checklist items:");
        for (String item : checkList) {
            System.out.println(" - " + item);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public List<String> getCheckList() {
        return checkList;
    }

    public void setCheckList(List<String> checkList) {
        this.checkList = checkList;
    }
}
    public void getSummary() {
        System.out.println("Title: " + title);
        System.out.println("Date: " + createdDate);
        System.out.println("Checklist items:");
        for (String item : checkList) {
            System.out.println(" - " + item);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public List<String> getCheckList() {
        return checkList;
    }

    public void setCheckList(List<String> checkList) {
        this.checkList = checkList;
    }
}
กำลังแสดง CheckListNote.java
