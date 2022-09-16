package com.example.testgit;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.testgit.databinding.ActivityAdapterBinding;

import java.util.ArrayList;

public class AdapterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // create array of Strings
    // and store name of courses
    String[] courses = { "C", "Data structures",
            "Interview prep", "Algorithms",
            "DSA with java", "OS" };

    public static ArrayList<View> empViews, mgrViews;
    private ArrayAdapter<CharSequence> employeeAdapter, managerAdapter;
    private Spinner leftSpinner, rightSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*empViews = new ArrayList<View>();
        empViews.add(view.findViewById(R.id.empTaskView));
        empViews.add(view.findViewById(R.id.empExecutionView));

        employeeAdapter = ArrayAdapter.createFromResource(getContext(), R.array.employee_views_array, android.R.layout.simple_spinner_item);

        mgrViews = new ArrayList<View>();
        mgrViews.add(view.findViewById(R.id.mgrTaskView));
        mgrViews.add(view.findViewById(R.id.mgrAMBreadMathView));
        mgrViews.add(view.findViewById(R.id.mgrPMBreadMathView));
        mgrViews.add(view.findViewById(R.id.mgrAMPunchList));
        mgrViews.add(view.findViewById(R.id.mgrPMPunchList));
        mgrViews.add(view.findViewById(R.id.mgrPrepList));

        ViewGroup leftViews = view.findViewById(R.id.leftView);
        //leftViews.addView(child);
        //leftViews.removeView(child);
        leftViews.removeAllViews();

        managerAdapter = ArrayAdapter.createFromResource(getContext(), R.array.manager_views_array, android.R.layout.simple_spinner_item);
        managerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        leftSpinner = view.findViewById(R.id.leftViewSpinner);
        leftSpinner.setOnItemClickListener()
        leftSpinner.setAdapter(managerAdapter);*/
        /*leftSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);
            }
        });*/
        //rightSpinner = view.findViewById(R.id.rightViewSpinner);











        // Take the instance of Spinner and
        // apply OnItemSelectedListener on it which
        // tells which item of spinner is clicked
        Spinner spin = findViewById(R.id.leftViewSpinner);
        spin.setOnItemSelectedListener(this);

        // Create the instance of ArrayAdapter
        // having the list of courses
        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                courses);

        // set simple layout resource file
        // for each item of spinner
        ad.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);

        // Set the ArrayAdapter (ad) data on the
        // Spinner which binds data to spinner
        spin.setAdapter(ad);
    }

    // Performing action when ItemSelected
    // from spinner, Overriding onItemSelected method
    @Override
    public void onItemSelected(AdapterView<?> arg0,
                               View arg1,
                               int position,
                               long id)
    {

        // make toastof name of course
        // which is selected in spinner
        Toast.makeText(getApplicationContext(),
                        courses[position],
                        Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0)
    {
        // Auto-generated method stub
    }
}