package com.example.laba1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> inputData;

    public MutableLiveData<String> getInputData(){
        if(inputData == null){
            inputData = new MutableLiveData<String>();
        }
        return inputData;
    }
}
