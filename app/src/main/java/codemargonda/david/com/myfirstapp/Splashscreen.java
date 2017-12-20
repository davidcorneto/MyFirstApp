package codemargonda.david.com.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {

//    Delay per milisecond 3000ms berarti 3 detik
    private int DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//      Ini digunakan untuk menghubungkan layout yang ingin digunakan di Splashscreen.java
        setContentView(R.layout.activity_splashscreen);

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//              Intent yang digunakan untuk berpindah Activity
                startActivity(new Intent(Splashscreen.this, MainActivity.class));
//              Digunakan untuk mengclose activity
                finish();
            }
        }, DELAY); //waktu dalam miliSecond

    }
}

