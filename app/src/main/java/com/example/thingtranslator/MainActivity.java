package com.example.thingtranslator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.home_container);
        AlphaAnimation animation = new AlphaAnimation(0.0f , 1.0f ) ;
        animation.setFillAfter(true);
        animation.setDuration(1200);
        layout.startAnimation(animation);
        Button bObjectdetection = (Button) findViewById(R.id.object_detection);
        Button bConversation = (Button) findViewById(R.id.start_new_conversation);
        Button bTranslation = (Button) findViewById(R.id.start_new_translation);
        Button bclickpicture = (Button) findViewById(R.id.click_picture);

        bObjectdetection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intood = new Intent(MainActivity.this, DetectorActivity.class);
                startActivity(intood);
            }
        });

        bConversation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocon = new Intent(MainActivity.this, ConversationActivity.class);
                startActivity(intocon);
            }
        });

        bTranslation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intotrans = new Intent(MainActivity.this, TranslationActivity.class);
                startActivity(intotrans);
            }
        });

        bclickpicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocam = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intocam);
            }
        });
    }
}
