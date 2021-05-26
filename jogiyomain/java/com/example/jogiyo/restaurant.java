package com.example.jogiyo;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class restaurant extends AppCompatActivity{
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant);
        findViewById(R.id.rst1).setOnClickListener(myClick);
        findViewById(R.id.rst2).setOnClickListener(myClick);
        findViewById(R.id.rst3).setOnClickListener(myClick);
        findViewById(R.id.rst4).setOnClickListener(myClick);
        findViewById(R.id.rst5).setOnClickListener(myClick);
        findViewById(R.id.rst6).setOnClickListener(myClick);
        findViewById(R.id.rst7).setOnClickListener(myClick);
        b1 = findViewById(R.id.rs1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                finish();
            }
        });

    }

    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.rst1:
                    Intent intent1 = new Intent(getApplicationContext(),sampleshow.class);
                    startActivity(intent1);
                    break;
                case R.id.rst2:
                    Intent intent2 = new Intent(getApplicationContext(),sampleshow2.class);
                    startActivity(intent2);
                    break;
                case R.id.rst3:
                    Intent intent3 = new Intent(getApplicationContext(),sampleshow3.class);
                    startActivity(intent3);
                    break;
                case R.id.rst4:
                    Intent intent4 = new Intent(getApplicationContext(),sampleshow4.class);
                    startActivity(intent4);
                    break;
                case R.id.rst5:
                    Intent intent5 = new Intent(getApplicationContext(),sampleshow5.class);
                    startActivity(intent5);
                    break;
                case R.id.rst6:
                    Intent intent6 = new Intent(getApplicationContext(),sampleshow6.class);
                    startActivity(intent6);
                    break;
                case R.id.rst7:
                    Intent intent7 = new Intent(getApplicationContext(),sampleshow7.class);
                    startActivity(intent7);
                    break;
            }
        }
    };

}
