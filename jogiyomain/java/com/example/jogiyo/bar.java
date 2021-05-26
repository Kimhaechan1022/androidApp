package com.example.jogiyo;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class bar extends AppCompatActivity{
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar);

        findViewById(R.id.brr1).setOnClickListener(myClick);
        findViewById(R.id.brr2).setOnClickListener(myClick);
        findViewById(R.id.brr3).setOnClickListener(myClick);
        findViewById(R.id.brr4).setOnClickListener(myClick);
        findViewById(R.id.brr5).setOnClickListener(myClick);
        findViewById(R.id.brr6).setOnClickListener(myClick);
        findViewById(R.id.brr7).setOnClickListener(myClick);

        b1 = findViewById(R.id.br1);
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
                case R.id.brr1:
                    Intent intent1 = new Intent(getApplicationContext(),bar1.class);
                    startActivity(intent1);
                    break;
                case R.id.brr2:
                    Intent intent2 = new Intent(getApplicationContext(),bar2.class);
                    startActivity(intent2);
                    break;
                case R.id.brr3:
                    Intent intent3 = new Intent(getApplicationContext(),bar3.class);
                    startActivity(intent3);
                    break;
                case R.id.brr4:
                    Intent intent4 = new Intent(getApplicationContext(),bar4.class);
                    startActivity(intent4);
                    break;
                case R.id.brr5:
                    Intent intent5 = new Intent(getApplicationContext(),bar5.class);
                    startActivity(intent5);
                    break;
                case R.id.brr6:
                    Intent intent6 = new Intent(getApplicationContext(),bar6.class);
                    startActivity(intent6);
                    break;
                case R.id.brr7:
                    Intent intent7 = new Intent(getApplicationContext(),bar7.class);
                    startActivity(intent7);
                    break;
            }
        }
    };

}
