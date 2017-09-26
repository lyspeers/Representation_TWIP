package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    /*String hi = "hi";     Bianary, octal, decimal, hexidecimal, ASCII
        System.out.print(Integer.toHexString((int) hi.charAt(1)));*/
        //need scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to be encoded");
        String x = input.nextLine();

        String z = "Hello";
        int encoder = (int)(Math.random()*x.length());
        for(int i = 0;i < x.length();i++){
            if(encoder%5 == 0){
                System.out.print(Integer.toBinaryString(((int) x.charAt(i))));
                encoder++;
            }else if(encoder%5 == 1){
                System.out.print(Integer.toOctalString((int) x.charAt(i)));
                encoder++;
            }else if(encoder%5 == 2){
                char y = x.charAt(i);
                System.out.print((int) y);
                encoder++;
            }else if(encoder%5 == 3){
                System.out.print(Integer.toHexString((int) x.charAt(i)));
                encoder++;
            }else {
               System.out.print(x.charAt(i));
                encoder++;

            }
        }
    }
}
