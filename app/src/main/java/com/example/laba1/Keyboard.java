package com.example.laba1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class Keyboard extends Fragment implements View.OnClickListener {

    private MainViewModel mViewModel;

    public static Keyboard newInstance() {
        return new Keyboard();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.keyboard_fragment, container, false);
        mViewModel = ViewModelProviders.of(requireActivity()).get(MainViewModel.class);
        Button button = (Button) view.findViewById(R.id.button1);
        button.setOnClickListener(this);
        button = (Button) view.findViewById(R.id.button2);
        button.setOnClickListener(this);
        button = (Button) view.findViewById(R.id.button3);
        button.setOnClickListener(this);
        button = (Button) view.findViewById(R.id.button4);
        button.setOnClickListener(this);
        button = (Button) view.findViewById(R.id.button5);
        button.setOnClickListener(this);
        button = (Button) view.findViewById(R.id.button6);
        button.setOnClickListener(this);
        button = (Button) view.findViewById(R.id.button7);
        button.setOnClickListener(this);
        button = (Button) view.findViewById(R.id.button8);
        button.setOnClickListener(this);
        button = (Button) view.findViewById(R.id.button9);
        button.setOnClickListener(this);
        button = (Button) view.findViewById(R.id.button0);
        button.setOnClickListener(this);
        button = (Button) view.findViewById(R.id.buttonDel);
        button.setOnClickListener(item -> mViewModel.getInputData().setValue(""));
        button = (Button) view.findViewById(R.id.buttonDot);
        button.setOnClickListener(dotKey);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: Use the ViewModel
    }

    @Override
    public void onClick(View view) {
        Button btn = (Button)view;
        mViewModel.getInputData().setValue(mViewModel.getInputData().getValue() + btn.getText());
    }

    private View.OnClickListener dotKey = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            String input = mViewModel.getInputData().getValue();
            if(!input.contains(".") && !input.equals("")){
                mViewModel.getInputData().setValue(mViewModel.getInputData().getValue() + ".");
            }
        }
    };
}