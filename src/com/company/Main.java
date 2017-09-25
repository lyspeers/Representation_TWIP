package com.company;

public class Main {

    public static void main(String[] args) {
    /*String hi = "hi";     Bianary, octal, decimal, hexidecimal, ASCII
        System.out.print(Integer.toHexString((int) hi.charAt(1)));*/
        //need scanner

        String x = "Hello";
        int encoder = (int)(Math.random()*x.length());
        for(int i = 0;i < x.length();i++){
            if(encoder%5 == 0){
                System.out.print(Integer.toBinaryString(((int) x.charAt(i))));
            }else if(encoder%5 == 1){
                System.out.print(Integer.toOctalString((int) x.charAt(i)));
            }else if(encoder%5 == 2){
                char y = x.charAt(i);
                System.out.print((int) y);
            }else if(encoder%5 == 3){
                System.out.print(Integer.toHexString((int) x.charAt(i)));
            }else {
               System.out.print(x.charAt(i));
            }
        }
    }
}
