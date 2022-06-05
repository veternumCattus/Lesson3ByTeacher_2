package ru.geekbrains.course1.lesson3byteacher_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter1 = 0;
    private int counter2 = 0;

    private TextView textCounter1;
    private TextView textCounter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCounter1 = findViewById(R.id.textView1);
    }

    public void button1_onClick(View v){
        counter1++;
        textCounter1.setText(String.valueOf(counter1));

    }

}