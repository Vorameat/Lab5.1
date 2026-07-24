package com.example.myapplication;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextNote noteA = new TextNote();
        TextNote noteB = new TextNote();
        TextNote note1 = new TextNote();

        noteA.setTitle("Do Lab");
        noteA.setContent("create class diagram and code");
        noteA.setCreatedDate("06/07/2026");

        noteB.setTitle("");
        noteB.setContent("");
        noteB.setCreatedDate("6 July 2026");
        noteB.getSummary();

        User user1 = new User();
        user1.setIdCard("6812247012");
        user1.setName("PECK KUB");
        user1.setPassword("123456");
        user1.login();

        user1.addTextNote(noteA);
        user1.addTextNote(noteB);
        user1.addTextNote(note1);
    }
}

