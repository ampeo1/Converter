package com.example.laba1;

import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.ViewModel;

public class KeyboardViewModel extends ViewModel {
    public void number_click(View view){
        int pepa = 123;
        Toast toast = Toast.makeText(view.getContext(), "Нажал", Toast.LENGTH_SHORT);
        toast.show();
    }
}


