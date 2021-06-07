package com.example.implicitintent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    public static  final  String EXTRA_NAME = "com.example.implicitintent.NAME";
    public static final String EXTRA_TEXT = "com.example.implicitintent.TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.url);
        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlText = editText.getText().toString();
                Toast.makeText(MainActivity.this,urlText,Toast.LENGTH_SHORT).show();
                // implicit intent to open a webpage
//                Uri webpage = Uri.parse(urlText);
//                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
//                if (intent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intent);
//                }

//                String addresses [] = {"asharmehmood360@gmail.com"};
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("*/*");
//                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
//                intent.putExtra(Intent.EXTRA_SUBJECT, urlText);
//                if (intent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intent);
//                }




            }
        });

    }



}