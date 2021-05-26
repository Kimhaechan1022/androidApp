package com.example.listenerobjectevent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListener mL =new MyListener();
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(mL);
    }

    class MyListener implements View.OnClickListener{
        public void onClick(View v){
            Toast.makeText(MainActivity.this,"리스너객체를 사용한이벤트처리",
                    Toast.LENGTH_LONG).show();
        }
    }
}

