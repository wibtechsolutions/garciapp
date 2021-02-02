package com.wib.garcipro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class dash extends AppCompatActivity {
    Button inf, agnt,pInstruc,annouce,test,evt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigation_id);

        bottomNavigationView.setSelectedItemId(R.id.nav_dashboard);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(),
                                MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_dashboard:

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
        inf=findViewById(R.id.info);
        agnt=findViewById(R.id.Agent);
        pInstruc=findViewById(R.id.productInstruction);
        annouce=findViewById(R.id.anoucement);
        test=findViewById(R.id.testimony);
        evt=findViewById(R.id.event);

        inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo();
            }
        });
        agnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openagent();
            }
        });
        pInstruc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductionInstruction();
            }
        });
        annouce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnnoucement();
            }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentestimoni();
            }
        });
        evt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEvent();
            }
        });
    }
    public void openInfo(){
        Intent intent=new Intent(this,info.class);
        startActivity(intent);
    }
    public void openagent(){
        Intent intent=new Intent(this,agent.class);
        startActivity(intent);
        }
    public void openProductionInstruction(){
        Intent intent=new Intent(this,ProductInstruction.class);
        startActivity(intent);
    }
    public void openAnnoucement(){
        Intent intent=new Intent(this,Annoucement.class);
        startActivity(intent);
    }
    public void opentestimoni(){
        Intent intent=new Intent(this,testimoni.class);
        startActivity(intent);
    }
    public void openEvent(){
        Intent intent=new Intent(this,Event.class);
        startActivity(intent);
    }
    }
