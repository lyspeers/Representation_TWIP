package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*Binary, octal, decimal, hexadecimal, ASCII
        System.out.print(Integer.toHexString((int) hi.charAt(1)));*/

        String a  = "", b = "", c = "", d = "", e  = "", a2  = "", b2 = "", c2 = "", d2 = "", e2  = "", a3  = "", b3 = "", c3 = "", d3 = "", e3  = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word or phrase less thn 15 characters to be encoded");
        String x = input.nextLine();
        int encoder = (int)(Math.random()*x.length()),i = 0;



        for(i = 0;i < x.length();i++){
            if(i <= 4){
                if(encoder % 5 == 0){
                 a = Integer.toBinaryString(((int) x.charAt(i)));
                encoder++;
                }else if(encoder % 5 == 1){
                 b = Integer.toOctalString((int) x.charAt(i));
                encoder++;
                }else if(encoder % 5 == 2){
                char y = x.charAt(i);
                 c = "" +(int) y;
                encoder++;
                }else if(encoder % 5 == 3){
                 d = Integer.toHexString((int) x.charAt(i));
                encoder++;
                }else {
                 e = ""  + x.charAt(i);
                encoder++;
                }
            }else if(i <= 9){
                if(encoder % 5 == 0){
                    a2 = Integer.toBinaryString(((int) x.charAt(i)));
                    encoder++;
                }else if(encoder % 5 == 1){
                    b2 = Integer.toOctalString((int) x.charAt(i));
                    encoder++;
                }else if(encoder % 5 == 2){
                    char y = x.charAt(i);
                    c2 = "" +(int) y;
                    encoder++;
                }else if(encoder % 5 == 3){
                    d2 = Integer.toHexString((int) x.charAt(i));
                    encoder++;
                }else{
                    e2 = ""  + x.charAt(i);
                    encoder++;
                }
            }else if(i < 15){
                if(encoder % 5 == 0){
                    a3 = Integer.toBinaryString(((int) x.charAt(i)));
                    encoder++;
                }else if(encoder % 5 == 1){
                    b3 = Integer.toOctalString((int) x.charAt(i));
                    encoder++;
                }else if(encoder % 5 == 2){
                    char y = x.charAt(i);
                    c3 = "" +(int) y;
                    encoder++;
                }else if(encoder % 5 == 3){
                    d3 = Integer.toHexString((int) x.charAt(i));
                    encoder++;
                }else {
                    e3 = ""  + x.charAt(i);
                    encoder++;
                }
            }else{
                break;
            }


        }if(i < 5 && i > 0){
            String encoded = a + b + c + d + e;
            System.out.print(encoded);
        }else if(i < 10){
            String encoded = a + b + c + d + e + a2 + b2 + c2 + d2 + e2;
            System.out.print(encoded);
        }else if(i < 15){
            String encoded = a + b + c + d + e + a2 + b2 + c2 + d2 + e2 + a3 + b3 + c3 + d3 + e3;
            System.out.println(encoded);
        }else{
            System.out.println("Please input a valid word or phrase");
        }

    }
}
