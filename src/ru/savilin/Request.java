package ru.savilin;

public class Request {

    private int begin;
    private int end;

    public Request(int begin, int end){
        this.begin = begin;
        this.end = end;
    }
    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
