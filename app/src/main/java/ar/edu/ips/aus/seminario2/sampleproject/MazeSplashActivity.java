package ar.edu.ips.aus.seminario2.sampleproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MazeSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maze_splash_screen);

        Button btnCallGame = (Button) findViewById(R.id.buttonJugar);
        btnCallGame.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent elJuegoPosta = new Intent(MazeSplashActivity.this, GameSelectionActivity.class);
                startActivity(elJuegoPosta);
                finish();
            }
        });


    }

}
