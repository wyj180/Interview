package com.base01;

class TestSubClass {

    public int a;
    protected int b;
    int c;
    private int d;

}

public class Test_4_1_6 extends TestSubClass2 {

    // java 中的作用域有哪些？

    // 作用域对比

    /**
     * 作用域与可见性    当前类   同一包   子类    其他地方
     * public            \/      \/       \/      \/
     * protected         yes     yes      yes     no
     * default(<)        yes     yes      no      no
     * private           yes     no       no      no
     *
     */

    public static void main(String[] args) {
        Test_4_1_6 test01 = new Test_4_1_6();
        System.out.println(test01.a);
        System.out.println(test01.b);
        System.out.println(test01.c);
        // System.out.println(test01.d); // d为private修饰，这里不可见
    }

}
