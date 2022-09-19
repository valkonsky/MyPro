package ru.savilin;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MyConnection {
    private InputStream inputStream;
    private BufferedReader bufferedReader;
    private Reader isr;

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    MyConnection(){
        inputStream = System.in;
        isr = new InputStreamReader(inputStream);
        bufferedReader = new BufferedReader(isr);
    }



}
