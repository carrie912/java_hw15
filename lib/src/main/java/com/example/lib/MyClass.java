package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入時間(時:分:秒)");

        String s = scanner.next();

        String a,b;

        int c,d;

        int e =s.indexOf(":");

        int f = s.lastIndexOf(":");

        a = s.substring(0,e);

        b = s.substring(e+1,f);

        c=Integer.parseInt(a);

        d=Integer.parseInt(b);

        int totalM =c*60+d;

        if(totalM>=450&&totalM<1020){

            System.out.println("現在為上課時間");

        }

        else {

            System.out.println("現在為下課時間");

        }


    }

}
