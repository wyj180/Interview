package com.base01;

// 4.1.5 Java程序初始化的顺序是怎样的？

class Base {

    static {
        System.out.println("Base static block");
    }

    public Base() {
        System.out.println("Base constructor");
    }

    {
        System.out.println("Base block");
    }

}

public class Derived extends Base {

    static {
        System.out.println("Derived static block");
    }

    public Derived() {
        System.out.println("Derived constructor");
    }

    {
        System.out.println("Derived block");
    }

    public static void main(String[] args) {
        new Derived();

        // 我的答案：

        // 父类静态方代码块
        // 子类静态方代码块

        // 父类非静态代码块，父类构造方法

        // 子类非静态代码块，子类构造函数

        /**
         * 答案：
         *
         * Base static block
         * Derived static block
         *
         * Base block
         * Base constructor
         *
         * Derived block
         * Derived constructor
         */
    }

}
