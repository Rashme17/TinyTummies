package com.example.tinytummies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Navigate to Child Registration Screen
        findViewById(R.id.button_register_child).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterChildActivity.class));
            }
        });

        // Navigate to Growth Chart Screen
        findViewById(R.id.button_growth_chart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GrowthChartActivity.class));
            }
        });

        // Navigate to Dietary Recommendations Screen
        findViewById(R.id.button_dietary_recommendations).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DietaryRecommendationsActivity.class));
            }
        });
    }
}
