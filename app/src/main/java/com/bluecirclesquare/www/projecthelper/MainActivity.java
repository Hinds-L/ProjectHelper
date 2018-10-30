package com.bluecirclesquare.www.projecthelper;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private TextView fragmentTitle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fragmentTitle = findViewById(R.id.fragment_title);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
        navigation.setSelectedItemId(R.id.home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        boolean handled = true;
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.quote:
                fragment = new Fragment();
                break;
            case R.id.invoice:
                fragment = new Fragment() ;
                break;
            case R.id.jobitems:
                fragment = new Fragment();
                break;
            default:
                handled =false;
        }
        if (handled){
            fragmentTitle.setText(menuItem.getTitle());
            if(fragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment).commit();
            }

        }

        return handled;
    }

}
