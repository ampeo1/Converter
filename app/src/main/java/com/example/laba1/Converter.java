package com.example.laba1;

public class Converter {
    static public String convert(String data, Unit input, Unit output){
        if(input.getCategory() == output.getCategory() && !data.equals("")){
            return String.valueOf(input.getCoefficient() / output.getCoefficient() * Double.parseDouble(data));
        }
        return "";
    }
}
