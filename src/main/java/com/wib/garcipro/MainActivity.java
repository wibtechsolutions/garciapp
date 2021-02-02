package com.wib.garcipro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigation_id);

        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_dashboard:
                        startActivity(new Intent(getApplicationContext(),
                                dash.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_home:

                    case R.id.nav_scan:
                        startActivity(new Intent(getApplicationContext(),
                                scan.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_notification:
                        startActivity(new Intent(getApplicationContext(),
                                notification.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_user:
                        startActivity(new Intent(getApplicationContext(),
                                user.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

}


}