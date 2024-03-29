package com.rkjony.mobileoperatorcheck;

import java.util.HashMap;
import java.util.Map;

public class CountryAndOperatorCheck {
    public String checkWithPhoneNumber(String phoneNumber){
          String countryOperator = "";
          String numberToParse = removeDashBraceHyphenSpace(phoneNumber);
          AllCountryPhoneNumbers allCountryPhoneNumbers = new AllCountryPhoneNumbers();
          Map<String,String> mobileNumberMap = new HashMap<>();
          mobileNumberMap = allCountryPhoneNumbers.mobileNumberMap;

        for (Map.Entry<String, String> entry : mobileNumberMap.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            if (numberToParse.startsWith(key)){
               countryOperator = val;
            }
        }
        return  countryOperator;
    }

    private String removeDashBraceHyphenSpace(String num){
        String s1 = num.replaceAll("\\s", "");
        String s2 = s1.replaceAll("\\(","");
        String s3 = s2.replaceAll("\\)","");
        return  s3;
    }
}
