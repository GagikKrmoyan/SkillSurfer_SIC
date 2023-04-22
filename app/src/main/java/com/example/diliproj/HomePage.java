
package com.example.diliproj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ListView listView = (ListView) findViewById(R.id.listview);

        String[] words = {"IT Skill improvement", "Havai baner", "Business Training", "Gagik Krmoyan"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, words);

        listView.setAdapter(adapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent_home = new Intent(getApplicationContext(), HomePage.class);
                    startActivity(intent_home);
                    finish();
                    return true;
                case R.id.navigation_user:
                    Intent intent_user = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent_user);
                    finish();
                    return true;
            }
            return false;
        });


    }
}