package com.corp;

import java.util.Scanner;

import java.io.*;
import java.util.Scanner;
import java.util.Scanner;

public class Calculate {


    double result;
    public static void main(String[] args) {

        Calculate calculate=new Calculate();
        calculate.factorial(4);
        System.out.println(calculate.getResult());
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER FIRST DIGIT");
        int a = scanner.nextInt();
        System.out.println("ENTER SECOND DIGIT");
        int b = scanner.nextInt();
        System.out.println("ENTER operation");
        String c =new String();
        c= scanner.next();
//        switch (c) {
//            case "+":calculate.add(a,b);
//                calculate.getResult();
//                break;
//            case "-":calculate.minus(a,b);
//                calculate.getResult();
//                break;
//            case "*":calculate.multiple(a,b);
//                calculate.getResult();
//                break;
//            case "/":calculate.div(a,b);
//                calculate.getResult();
//                break;
//            case "%":calculate.mod(a,b);
//                calculate.getResult();
//                break;
//
//        }

    }
    void factorial(int a){
        int res=1;
        for (int i = 1; i <=a; i++){
            res = res*i;
        }
        result=res;
    }

    void add(double x, double y){
        result=x+y;
    }

    void minus(double a, double b){
        result=a-b;
    }

    void multiple(double a, double b){
        result=a+b;
    }

    void div(double a,double b){
        result=a/b;
    }
    void mod(double a, double b ){
        result=a%b;
    }
    double getResult(){
        return result;    }

}


