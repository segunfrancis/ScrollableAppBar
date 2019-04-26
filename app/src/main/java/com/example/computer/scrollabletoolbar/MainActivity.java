package com.example.computer.scrollabletoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button scrollFlags, scrollEnterAlways, enterAlwaysCollapsed, exitUntilCollapsed;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollFlags = findViewById(R.id.scroll_flags);
        scrollEnterAlways = findViewById(R.id.scroll_enter_always);
        enterAlwaysCollapsed = findViewById(R.id.enter_always_collapsed);
        exitUntilCollapsed = findViewById(R.id.exit_until_collapsed);
        toolbar = findViewById(R.id.toolbar);

        toolbar.setTitle(R.string.app_name);

        scrollFlags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScrollFlagActivity.class));
            }
        });

        scrollEnterAlways.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScrollEnterAlwaysActivity.class));
            }
        });

        enterAlwaysCollapsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EnterAlwaysCollapsedActivity.class));
            }
        });

        exitUntilCollapsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ExitUntilCollapsedActivity.class));
            }
        });
    }
}
