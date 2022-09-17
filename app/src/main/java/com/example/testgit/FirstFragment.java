//Test Comment
//Test Comment 2??????????
package com.example.testgit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.testgit.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private ArrayList<View> empViews, mgrViews;
    private ArrayAdapter<CharSequence> employeeAdapter, managerAdapter;
    private Spinner leftSpinner, rightSpinner;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

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
        leftSpinner.setAdapter(managerAdapter);*/
        /*leftSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);
            }
        });*/
        //rightSpinner = view.findViewById(R.id.rightViewSpinner);


        /*binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });*/
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}