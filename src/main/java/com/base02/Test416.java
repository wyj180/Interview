package com.base02;

import com.base01.TestSubClass2;
import com.base01.Test_4_1_6;

public class Test416 {

    public static void main(String[] args) {
        Test_4_1_6 test01 = new Test_4_1_6();
        System.out.println(test01.a);
        // System.out.println(test01.b); // 这里访问不到b
        // System.out.println(test01.c);
        // System.out.println(test01.d); // d为private修饰，这里不可见

        // TestSubClass su = new TestSubClass(); // 访问不到在Test_4_1_6定义的内部类

        TestSubClass2 testSubClass2 = new TestSubClass2();
        System.out.println(testSubClass2.a); // 只能访问到a

    }
}
