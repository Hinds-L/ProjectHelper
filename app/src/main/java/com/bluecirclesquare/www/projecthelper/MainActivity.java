package com.bluecirclesquare.www.projecthelper;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.bluecirclesquare.www.projecthelper.model.entity.Invoice;
import com.bluecirclesquare.www.projecthelper.model.entity.Quote;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private TextView fragmentTitle;
    private




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentTitle = findViewById(R.id.fragment_title);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
        navigation.setSelectedItemId(R.id.quotes);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuitem) {
        boolean handled = true;
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.quotes:
                fragment = QuoteFragment();
                break;
            case R.id.invoice:
                fragment = InvoiceFragment();
                break;
            case R.id.jobs:
                fragment = new JobFragment();
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
FloatingActionButton fab = findViewById(R.id.Fab);
    fab.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        Snackbar.make(view, "Map", Snackbar.LENGTH_SHORT).setAction(,null).show();
    }
    }
    FloatingActionButton fab = findViewById(R.id.Fab2);
    fab.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        Snackbar.make(view, "Map", Snackbar.LENGTH_SHORT).setAction(,null).show();
    }
    });

    }


