package ru.savilin;

import java.util.Arrays;

public class DataManager {
    private static final int MAX_VALUE = 1000000;

    static int[] getArrFromString(String seq){
        String[] numsOnString = seq.split(" ");
        int[] nums = new int[numsOnString.length];
        for (int i = 0;i<numsOnString.length;i++){
            if (Integer.parseInt(numsOnString[i])<MAX_VALUE)
            nums[i] = Integer.parseInt(numsOnString[i]);
            else{
                throw new RuntimeException("wrong parameter in array");
            }
        }
        return nums;
    }

    static int getSumFromSequence(int[] arr,Request request){
        int subarr[] = Arrays.copyOfRange(arr,request.getBegin()-1,request.getEnd()-1);
        int sum = 0;
        for (int i =0;i<subarr.length;i++){
            if ((i%2==0)&&(i!=0)) {
                sum += subarr[i];
            }else {
                sum = sum + changeSign(subarr[i]);
            }
        }
        return sum;
    }

   static int changeSign(int a){
        a *= -1;
        return a;
    }

}
