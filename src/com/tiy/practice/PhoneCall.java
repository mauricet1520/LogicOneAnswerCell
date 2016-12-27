package com.tiy.practice;

/**
 * Created by crci1 on 12/27/2016.
 */
public class PhoneCall {


    public boolean answerPhone(boolean isMorning, boolean isMom, boolean isAsleep) {

        if (isAsleep){
            return false;
        }
        else if (isMorning && isMom){
            return true;
        }
        else if (isMorning){
            return false;

        }
        return true;
    }
}
