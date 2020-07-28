package com.base01;

public class Obj01 implements Cloneable {

    private int anInt = 0;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = 666;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return anInt + "";
    }
}
