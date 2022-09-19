package ru.savilin;

import java.io.*;

public class Main {
    private static int nums[] = null;
    private static int arrLenght;
    private static String numSequence;
    private static Request requests[];
    private static final int MAX_ARRAY_LENGTH = 100000;
    private static final int MAX_REQUESTS_VALUE = 100000;
    private static int[] results;

    public static void main(String[] args) throws IOException {
        MyConnection connection = new MyConnection();

        System.out.println("Input array length: ");
        arrLenght = Integer.parseInt(connection.getBufferedReader().readLine());

        if ((arrLenght>1)&&(arrLenght<=MAX_ARRAY_LENGTH)){
            nums = new int[arrLenght];
            System.out.print("Input array content:");
            numSequence = connection.getBufferedReader().readLine();
            nums = DataManager.getArrFromString(numSequence);
            System.out.println("Input count of requests");
            int countOfRequests = Integer.parseInt(connection.getBufferedReader().readLine());

            if (countOfRequests<MAX_REQUESTS_VALUE){
                requests = new Request[countOfRequests];
                results = new int[countOfRequests];
                for (int i = 0;i<countOfRequests;i++){
                    System.out.println("Input first request param " );
                    int begin = Integer.parseInt(connection.getBufferedReader().readLine());
                    System.out.println("Input second request param " );
                    int end = Integer.parseInt(connection.getBufferedReader().readLine());
                    System.out.println(i +" param stored" );
                    requests[i] = new Request(begin,end);
                    results[i] = DataManager.getSumFromSequence(nums,requests[i]);
                }
                for (int i:results){
                    System.out.print(i + " ");
                }
            }else{
                throw new RuntimeException("exceeded the maximum number of requests");
            }
        }else{
            throw new RuntimeException("exceeded the maximum number of array elements");
        }

    }
}
