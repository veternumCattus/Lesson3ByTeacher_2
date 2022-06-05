package ru.geekbrains.course1.lesson3byteacher_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        textCounter2 = findViewById(R.id.textView2);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2++;
                textCounter2.setText(String.valueOf(counter2));
            }
        });
    }

    public void button1_onClick(View v){
        counter1++;
        textCounter1.setText(String.valueOf(counter1));

    }

}