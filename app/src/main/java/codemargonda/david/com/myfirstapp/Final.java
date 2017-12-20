package codemargonda.david.com.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    TextView btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passet);

        btnShare = (TextView)findViewById(R.id.btnShare);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Code Course Camp" + "\n\nMerupakan tempat kursus yang berada di Code Margonda, dengan adanya CCC ini kami bertujuan untuk dapat membantu masyarakat dan mahasiswa untuk dapat belajar tentang Teknologi dengan harga yang terjangkau.  \n Yuk ikut kursusnya!! \n\n Codemargonda.com" );
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });

    }
}
