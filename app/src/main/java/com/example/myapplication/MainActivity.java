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


        Note noteA = new Note();
        Note noteB = new Note();
        Note note1 = new Note();

        noteA.title = "Do Lab";
        noteA.content = "create class diagram and code";
        noteA.createdDate = "06/07/2026";
noteB .title ="";
noteB.content ="";
noteB.createdDate = "6 July 2026";
noteB.getSummary();
User user1 = new User();
user1.IDcard = "6812247012";
user1.Name = "PECK KUB";
user1.Password ="123456";
user1.login();
    }

}

