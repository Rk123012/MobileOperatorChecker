package com.rkjony.mobileoperatorcheck;

public class OperatorCheckBD {
    public String checkWithPhone(String phoneNumber){

        if (phoneNumber.startsWith("+88018") || phoneNumber.startsWith("018") ){
            return "Robi";
        }else if(phoneNumber.startsWith("+88017") || phoneNumber.startsWith("017") || phoneNumber.startsWith("+88013") || phoneNumber.startsWith("013")){
            return "GrameenPhone";
        }else if (phoneNumber.startsWith("+88016") || phoneNumber.startsWith("016")){
            return "Airtel";
        }else if (phoneNumber.startsWith("+88019") || phoneNumber.startsWith("019") || phoneNumber.startsWith("+88014") || phoneNumber.startsWith("014")){
            return "Banglalink";
        }else if (phoneNumber.startsWith("+88015") || phoneNumber.startsWith("015")){
            return "Teletalk";
        }else {
            return "Other";
        }

        git remote add origin https://github.com/Rk123012/MobileOperatorChecker.git
    }
}
