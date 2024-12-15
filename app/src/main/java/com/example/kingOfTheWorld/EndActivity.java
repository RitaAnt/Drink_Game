package com.example.kingOfTheWorld;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        findViewById(R.id.replayButton).setOnClickListener(v -> {
            Intent restartIntent = new Intent(EndActivity.this, MainActivity.class);
            startActivity(restartIntent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
        });
    }

}
