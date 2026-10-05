package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {

    private EditText etTitle;
    private EditText etContent;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        etTitle = findViewById(R.id.etTitle);
        etContent = findViewById(R.id.etContent);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = etTitle.getText().toString();
                String content = etContent.getText().toString();

                if (!title.isEmpty()) {
                    Toast.makeText(AddNoteActivity.this, "บันทึกโน๊ตเรียบร้อย!", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(AddNoteActivity.this, "กรุณากรอกชื่อโน๊ต", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}