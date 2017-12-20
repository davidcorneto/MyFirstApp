package codemargonda.david.com.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class PengenalanLayout extends AppCompatActivity {

    RelativeLayout relative, linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengenalan_layout);

        linear = (RelativeLayout)findViewById(R.id.linear);
        relative = (RelativeLayout)findViewById(R.id.relative);

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PengenalanLayout.this,OurLinearLayout.class));
            }
        });


        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PengenalanLayout.this, OurRelativeLayout.class));
            }
        });
    }
}
