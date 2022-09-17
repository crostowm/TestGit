package com.example.testgit;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.testgit.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    public static ArrayList<View> empViews, mgrViews;
    private ArrayAdapter<CharSequence> employeeAdapter, managerAdapter;
    private Spinner leftSpinner, rightSpinner;
    private ViewGroup leftViews;

    String[] courses = { "C", "Data structures",
            "Interview prep", "Algorithms",
            "DSA with java", "OS" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        empViews = new ArrayList<View>();
        empViews.add(findViewById(R.id.empTaskView));
        empViews.add(findViewById(R.id.empExecutionView));

        employeeAdapter = ArrayAdapter.createFromResource(this, R.array.employee_views_array, android.R.layout.simple_spinner_item);

        mgrViews = new ArrayList<View>();
        mgrViews.add(findViewById(R.id.mgrAMPunchList));
        mgrViews.add(findViewById(R.id.mgrPrepList));
        mgrViews.add(findViewById(R.id.mgrTaskView));
        mgrViews.add(findViewById(R.id.mgrAMBreadMathView));
        mgrViews.add(findViewById(R.id.mgrPMBreadMathView));
        mgrViews.add(findViewById(R.id.mgrPMPunchList));

        leftViews = findViewById(R.id.leftView);
        //leftViews.addView(child);
        //leftViews.removeView(child);
        leftViews.removeAllViews();

        managerAdapter = ArrayAdapter.createFromResource(this, R.array.manager_views_array, android.R.layout.simple_spinner_item);
        managerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        leftSpinner = findViewById(R.id.leftViewSpinner);
        leftSpinner.setOnItemSelectedListener(this);
        leftSpinner.setAdapter(managerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        /*String[] array = getResources().getStringArray(R.array.manager_views_array);
        int pos = -1;
        for(int ii = 0; ii < array.length; ii++) {
            if(array[ii].equals(adapterView.getItemAtPosition(position).toString()))
            pos = ii;
        }
        if(pos != -1) {*/
        /*try {
            if (adapterView.getId() == R.id.leftViewSpinner) {
                leftViews.removeAllViews();
                switch (adapterView.getItemAtPosition(position).toString().trim()) {
                    case "AM PunchList":
                        System.out.println(adapterView.getItemAtPosition(position).toString().trim() + "    " + adapterView.getId() + "   " + R.id.leftViewSpinner);
                        leftViews.addView(findViewById(R.id.mgrAMPunchList));
                        break;
                    case "Prep List":
                        leftViews.addView(findViewById(R.id.mgrPrepList));
                        break;
                    case "Tasks":
                        leftViews.addView(findViewById(R.id.mgrTaskView));
                        break;
                    case "AM Bread Math":
                        leftViews.addView(findViewById(R.id.mgrAMBreadMathView));
                        break;
                    case "PM PunchList":
                        leftViews.addView(findViewById(R.id.mgrPMPunchList));
                        break;
                    case "PM Bread Math":
                        leftViews.addView(findViewById(R.id.mgrPMBreadMathView));
                        break;
                }
                //leftViews.addView(mgrViews.get(pos));
            }
        }
        catch (IllegalArgumentException iae)
        {

        }*/


        Toast.makeText(getApplicationContext(),
                        adapterView.getItemAtPosition(position).toString(),
                        Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}