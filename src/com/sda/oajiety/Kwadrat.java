package com.sda.oajiety;

public class Kwadrat implements InyterfaceTest {

    int a = 5;
    int b = 3;

    @Override
    public int pole() {
        return a * b;
    }

    @Override
    public int obwod() {
        return (2 * a) + (2 * b);
    }
}
