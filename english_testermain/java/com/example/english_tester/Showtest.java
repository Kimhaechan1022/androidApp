package com.example.english_tester;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import com.example.english_tester.R;

public class Showtest  extends AppCompatActivity {
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testlay);

        findViewById(R.id.tb1).setOnClickListener(myClick);
        findViewById(R.id.tb2).setOnClickListener(myClick);
        findViewById(R.id.tb3).setOnClickListener(myClick);
        findViewById(R.id.tb4).setOnClickListener(myClick);
        findViewById(R.id.tb5).setOnClickListener(myClick);
        findViewById(R.id.tb6).setOnClickListener(myClick);
        findViewById(R.id.tb7).setOnClickListener(myClick);
        findViewById(R.id.tb8).setOnClickListener(myClick);
        findViewById(R.id.tb9).setOnClickListener(myClick);
        findViewById(R.id.tb10).setOnClickListener(myClick);
        findViewById(R.id.tb11).setOnClickListener(myClick);
        findViewById(R.id.tb12).setOnClickListener(myClick);


        b1 = findViewById(R.id.mm1);
        b2 = findViewById(R.id.mm3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),Showanswertable.class);
                 startActivity(intent1);
            }
        });
    }
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.tb1:
                    Toast.makeText(getApplicationContext(),
                            "사과",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb2:
                    Toast.makeText(getApplicationContext(),
                            "바나나",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb3:
                    Toast.makeText(getApplicationContext(),
                            "키위",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb4:
                    Toast.makeText(getApplicationContext(),
                            "오렌지",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb5:
                    Toast.makeText(getApplicationContext(),
                            "남자아이",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb6:
                    Toast.makeText(getApplicationContext(),
                            "여자아이",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb7:
                    Toast.makeText(getApplicationContext(),
                            "남자",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb8:
                    Toast.makeText(getApplicationContext(),
                            "여자",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb9:
                    Toast.makeText(getApplicationContext(),
                            "자동차",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb10:
                    Toast.makeText(getApplicationContext(),
                            "버스",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb11:
                    Toast.makeText(getApplicationContext(),
                            "사랑",Toast.LENGTH_LONG).show();
                    break;
                case R.id.tb12:
                    Toast.makeText(getApplicationContext(),
                            "컵",Toast.LENGTH_LONG).show();
                    break;
            }
        }
    };
}

