package com.company;

public class DummyClass {
    public int length,width;
    void setValues(int l, int w)
    {
        this.length = l;
        this.width = w;
    }
    public void Area() {
        int area = length*width;
        System.out.println("The area of the reactangle is "+ area);
    }
}

