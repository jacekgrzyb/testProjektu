package com.sda.oajiety;

public class kolo implements InerfaceTest{
    int r;
    @Override
    public int pole() {
        return 2*3*r;
    }

    @Override
    public int obwod() {
        return 3*r*r;
    }
}
