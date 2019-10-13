package com.lyn.test;

import com.lyn.utils.Jisuan;
import com.lyn.utils.Jisuan2;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        int a =1;
        int b =2;

        int c = a+b;

        Jisuan jisuan = new Jisuan();
        jisuan.jia(a,b);

        Jisuan2.jia(1,2);





        Dongwu dongwu=new Dongwu();

        Person person=new Person();

        dongwu.eat("");
        person.eat("");
        person.zou();
    }
}
