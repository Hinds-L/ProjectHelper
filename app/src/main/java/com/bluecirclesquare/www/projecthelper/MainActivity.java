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


public class MainActivity extends AppCompatActivity implements
    BottomNavigationView.OnNavigationItemSelectedListener {

  private TextView fragmentTitle;
  private FloatingActionButton mapButton;
  private FloatingActionButton emailButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    fragmentTitle = findViewById(R.id.fragment_title);
    BottomNavigationView navigation = findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(this);
    navigation.setSelectedItemId(R.id.quote);

    mapButton = findViewById(R.id.map_button);

    mapButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        Snackbar.make(v, "Map", Snackbar.LENGTH_LONG).setAction("Action", null).show();
      }
    });

    emailButton = findViewById(R.id.create_email);
    emailButton.setOnClickListener(new View.OnClickListener()
   {
     @Override
     public void onClick(View view) {

       Snackbar.make(view, "Email", Snackbar.LENGTH_LONG).setAction("Action", null).show();
     }
   }
    );
  }

  @Override
  public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
    boolean handled = true;
    Fragment fragment = null;
    switch (menuItem.getItemId()) {
      case R.id.quote:
        fragment = new QuoteFragment();
        break;
      case R.id.invoice:
        fragment = new InvoiceFragment();
        break;
      case R.id.jobitems:
        fragment = new JobFragment();
        break;
      default:
        handled = false;
    }
    if (handled) {
      fragmentTitle.setText(menuItem.getTitle());
      if (fragment != null) {
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, fragment).commit();
      }

    }

    return handled;
  }


}



