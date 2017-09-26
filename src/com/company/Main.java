package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    /*String hi = "hi";     Bianary, octal, decimal, hexidecimal, ASCII
        System.out.print(Integer.toHexString((int) hi.charAt(1)));*/
        //need scanner
        String a  ="",b = "",c = "",d = "",e  = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to be encoded");
        String x = input.nextLine();
        int encoder = (int)(Math.random()*x.length());



        for(int i = 0;i < x.length();i++){
            if(encoder % 5 == 0){
                 a = Integer.toBinaryString(((int) x.charAt(i)));
                System.out.print(Integer.toBinaryString(((int) x.charAt(i))));
                encoder++;
            }else if(encoder % 5 == 1){
                 b = Integer.toOctalString((int) x.charAt(i));
                System.out.print(Integer.toOctalString((int) x.charAt(i)));
                encoder++;
            }else if(encoder % 5 == 2){
                char y = x.charAt(i);
                 c = "" +(int) y;
                System.out.print((int) y);
                encoder++;
            }else if(encoder % 5 == 3){
                 d = Integer.toHexString((int) x.charAt(i));
                System.out.print(Integer.toHexString((int) x.charAt(i)));
                encoder++;
            }else {
                 e = ""  + x.charAt(i);
               System.out.print(x.charAt(i));
                encoder++;

            }
        }//String encoded = a + b + c + d + e; This doesn't work for strings longer that 5 letters

    }
}
