package com.example.laba1;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<String> inputData;
    private MutableLiveData<String> outputData;
    private MutableLiveData<Unit> inputSpinner;
    private MutableLiveData<Unit> outputSpinner;

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<String> getInputData(){
        if(inputData == null){
            inputData = new MutableLiveData<String>();
            inputData.setValue("");
        }
        return inputData;
    }

    public MutableLiveData<String> getOutputData(){
        if(inputData == null){
            outputData = new MutableLiveData<String>();
            outputData.setValue("");
        }
        return outputData;
    }

    public MutableLiveData<Unit> getInputSpinner(){
        if(inputSpinner == null){
            inputSpinner = new MutableLiveData<Unit>();
            inputSpinner.setValue(Unit.METERS);
        }
        return inputSpinner;
    }

    public MutableLiveData<Unit> getOutputSpinner(){
        if(outputSpinner == null){
            outputSpinner = new MutableLiveData<Unit>();
            outputSpinner.setValue(Unit.METERS);
        }
        return outputSpinner;
    }
}
