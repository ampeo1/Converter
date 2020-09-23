package com.example.laba1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class    Fields extends Fragment {

    private MainViewModel mViewModel;

    public static Fields newInstance() {
        return new Fields();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fileds_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        final Observer<String> inputObserver = new Observer<String>(){
            @Override
            public void onChanged(String newInput) {
                EditText edit = (EditText) getView().findViewById(R.id.inputField);
                edit.setText(newInput);
            }
        };
        mViewModel.getInputData().observe(getViewLifecycleOwner(), inputObserver);
    }
    
}