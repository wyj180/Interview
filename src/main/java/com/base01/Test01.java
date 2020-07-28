package com.base01;

//

class T{
    public static void main(String[] args) {
        System.out.println("HHH");
    }
}

public class Test01 {

    // 4.1.4 如何实现在main()方法执行前输出 "hello world" ?
    static {
        System.out.println("hello world");
    }

    // 4.1.3 为什么需要main方法，是否还有其他的定义格式?
    static final synchronized    public void main(String[] args) {
        System.out.println("Test01");
    }

    static {
        System.out.println("hello world222 ");
    }
}
