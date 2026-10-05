package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnAddNote;
    private TextView tvUserInfo, tvNoteList;
    private NoteController noteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddNote = findViewById(R.id.btnAddNote);
        tvUserInfo = findViewById(R.id.tvUserInfo);
        tvNoteList = findViewById(R.id.tvNoteList);


        User currentUser = new User("Vorameat", "vorameat@email.com");


        noteController = new NoteController(currentUser);


        tvUserInfo.setText(noteController.getUserInfo());


        btnAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddNoteActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        displayNotes();
    }

    private void displayNotes() {
        StringBuilder builder = new StringBuilder();
        for (Note note : noteController.getUserNotes()) {
            builder.append("- ").append(note.getTitle()).append("\n");
        }

        if (builder.length() == 0) {
            tvNoteList.setText("ยังไม่มีรายการโน้ต");
        } else {
            tvNoteList.setText(builder.toString());
        }
    }
}