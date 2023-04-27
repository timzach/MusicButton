package de.girlsday.musicbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button iAmAButton = findViewById(R.id.button);

        iAmAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iAmAButton.setText("Clicked");
                playMusic();
            }
        });
    }
    private void playMusic() {
        MediaPlayer mainmusic = MediaPlayer.create(MainActivity.this, R.raw.mainmusic);
        mainmusic.start();
    }
}