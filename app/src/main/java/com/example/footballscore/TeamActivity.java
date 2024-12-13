package com.example.footballscore;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textfield.TextInputLayout;

public class TeamActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    TextInputLayout first, second, third, fourth;
    String firstT, secondT, thirdT, fourthT;
    boolean doubleBackToExitPressedOnce = false;
    private DrawerLayout drawerLayout;
    LinearLayout LinearQuitApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        LinearQuitApp = navigationView.findViewById(R.id.LinearQuitApp);
        LinearQuitApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(TeamActivity.this);
                mBuilder.setTitle("Do you want to exit the app?");

                mBuilder.setIcon(R.drawable.logout);
                mBuilder.setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finishAffinity();
                    }
                });
               AlertDialog dialog = mBuilder.create();

                dialog.show();

            }
        });

        //call the text input layout by id
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);

        //text input layout to string
        firstT = first.getEditText().getText().toString().trim();
        secondT = second.getEditText().getText().toString().trim();
        thirdT = third.getEditText().getText().toString().trim();
        fourthT = fourth.getEditText().getText().toString().trim();
        drawerLayout = findViewById(R.id.drawer_layout);
        setupTextWatchers(first);
        setupTextWatchers(second);
        setupTextWatchers(third);
        setupTextWatchers(fourth);

        //button next
        findViewById(R.id.Next).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                findViewById(R.id.Next).setClickable(false);
                firstT = first.getEditText().getText().toString().trim();
                secondT = second.getEditText().getText().toString().trim();
                thirdT = third.getEditText().getText().toString().trim();
                fourthT = fourth.getEditText().getText().toString().trim();

                if (!valideInput()) {
                    findViewById(R.id.Next).setEnabled(false);
                    Intent intent = new Intent(TeamActivity.this, CalculatorActivity.class);
                    intent.putExtra("firstT", firstT);
                    intent.putExtra("secondT", secondT);
                    intent.putExtra("thirdT", thirdT);
                    intent.putExtra("fourthT", fourthT);
                    startActivity(intent);
                    finish();
                }
            }
        });

        findViewById(R.id.settings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
                    drawerLayout.closeDrawer(GravityCompat.END);
                } else {
                    drawerLayout.openDrawer(GravityCompat.END);
                }
            }
        });

    }

    //function valideInput to verify if the text input is empty or not
    // Function to validate the inputs
    private boolean valideInput() {
        String firstT = first.getEditText().getText().toString().trim();
        String secondT = second.getEditText().getText().toString().trim();
        String thirdT = third.getEditText().getText().toString().trim();
        String fourthT = fourth.getEditText().getText().toString().trim();

        boolean hasError = false;

        if (firstT.isEmpty()) {
            first.setError("Please enter the name of the first team");
            first.requestFocus();
            hasError = true;
        } else {
            first.setError(null);
            first.setErrorEnabled(false);
        }

        if (secondT.isEmpty()) {
            second.setError("Please enter the name of the second team");

            second.requestFocus();
            hasError = true;
        } else {
            second.setError(null);
            second.setErrorEnabled(false);
        }

        if (thirdT.isEmpty()) {
            third.setError("Please enter the name of the third team");

            third.requestFocus();
            hasError = true;
        } else {
            third.setError(null);
            third.setErrorEnabled(false);
        }

        if (fourthT.isEmpty()) {
            fourth.setError("Please enter the name of the fourth team");

            fourth.requestFocus();
            hasError = true;
        } else {
            fourth.setError(null);
            fourth.setErrorEnabled(false);
        }
        // Check if any two EditTexts have the same content
        if (firstT.equals(secondT) || firstT.equals(thirdT) || firstT.equals(fourthT)) {
            first.setError("Team names must be unique");
            first.requestFocus();
            hasError = true;
        } else if (secondT.equals(thirdT) || secondT.equals(fourthT)) {
            second.setError("Team names must be unique");
            second.requestFocus();
            hasError = true;
        } else if (thirdT.equals(fourthT)) {
            third.setError("Team names must be unique");
            third.requestFocus();
            hasError = true;
        }
        // Enable the 'Next' button after validation check
        findViewById(R.id.Next).setClickable(true);

        return hasError;
    }

    //to quit the app
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed(); // This will exit the app
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press again to exit the application", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce = false; // Reset the flag after 2 seconds
            }
        }, 2000); // 2 seconds delay
    }


    // Add TextWatchers to clear errors in real-time
    private void setupTextWatchers(TextInputLayout textInputLayout) {
        textInputLayout.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()) {
                    textInputLayout.setError(null);
                    textInputLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_contact_us) {
            startActivity(new Intent(TeamActivity.this, ContactUsActivity.class));
            finish();

        } else if (id == R.id.nav_about_us) {
            startActivity(new Intent(TeamActivity.this, AboutUsActivity.class));
            finish();

        } else if (id == R.id.nav_share) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String shareBody = "Check out this app!";
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "FootBall Score");
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(shareIntent, "Share via"));
        }
        drawerLayout.closeDrawer(GravityCompat.END);
        return true;
    }
}