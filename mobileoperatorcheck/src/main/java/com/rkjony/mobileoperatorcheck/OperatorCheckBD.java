package com.rkjony.mobileoperatorcheck;

public class OperatorCheckBD {
    public String checkWithPhone(String phoneNumber){

        if (phoneNumber.startsWith("+88018") || phoneNumber.startsWith("018") ){
            return BDOperatorList.Robi;
        }else if(phoneNumber.startsWith("+88017") || phoneNumber.startsWith("017") || phoneNumber.startsWith("+88013") || phoneNumber.startsWith("013")){
            return BDOperatorList.GrameenPhone;
        }else if (phoneNumber.startsWith("+88016") || phoneNumber.startsWith("016")){
            return BDOperatorList.Airtel;
        }else if (phoneNumber.startsWith("+88019") || phoneNumber.startsWith("019") || phoneNumber.startsWith("+88014") || phoneNumber.startsWith("014")){
            return BDOperatorList.Banglalink;
        }else if (phoneNumber.startsWith("+88015") || phoneNumber.startsWith("015")){
            return BDOperatorList.Teletalk;
        }else {
            return BDOperatorList.Others;
        }


    }
}
