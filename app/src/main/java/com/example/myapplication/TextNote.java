package com.example.myapplication;

public class TextNote {
    private String title;
    private String content;
    private String createdDate;

    public TextNote() {
        this.title = "";
        this.content = "";
        this.createdDate = "";
    }

    public TextNote(String title, String createdDate, String content) {
        this.title = title;
        this.createdDate = createdDate;
        this.content = content;
    }

    public void getSummary() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Date: " + createdDate);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}