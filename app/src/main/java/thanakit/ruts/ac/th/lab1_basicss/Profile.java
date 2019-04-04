package thanakit.ruts.ac.th.lab1_basicss;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Profile extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mediaPlayer=MediaPlayer.create(this,R.raw.burbank);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        btnNext = (Button)findViewById(R.id.imgbtnn);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Login.class);
                startActivity(intent);
            }
        });

    }
}

