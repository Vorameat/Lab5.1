package com.example.myapplication;

public class TextNote extends Note { // <-- ต้องมี extends Note ตรงนี้
    private String content;

    public TextNote() {
        super();
        this.content = "";
    }

    public TextNote(String title, String createdDate, String content, User user) {
        super(title, createdDate, user);
        this.content = content;
    }

    @Override
    public void getSummary() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Date: " + createdDate);
    }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}