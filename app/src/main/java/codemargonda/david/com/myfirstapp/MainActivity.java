package codemargonda.david.com.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //  Deklarasi variabel dengan tipe data TextView
    TextView playout, passet, codemargonda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      Menghubungkan java dengan layout
        setContentView(R.layout.activity_main);

//      Menghubungkan variabel di java dengan id yg digunakan oleh komponen di layout
        playout = (TextView) findViewById(R.id.playout);
        passet = (TextView) findViewById(R.id.passet);
        codemargonda = (TextView) findViewById(R.id.codemargonda);

//      Untuk OnClick
        playout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent untuk pindah
                startActivity(new Intent(MainActivity.this, PengenalanLayout.class));
            }
        });


        passet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Final.class));
            }
        });


        codemargonda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent Web
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.codemargonda.com"));
                startActivity(i);
            }
        });
    }
}
