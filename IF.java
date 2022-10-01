package com.company;

import java.util.*;

public class IF {
        private static final Scanner SCANNER = new Scanner(System.in);
        public static void main(String[] args) {
            int a;
            Scanner sc1 = new Scanner(System.in);
            a = sc1.nextInt();
            sc1.close();
            if (a%2!=0) {
                System.out.println("Weird");
            }else if(a>=2&&a<=5 && a%2==0){
                System.out.println("Not Weird");
            }else if(a>=6 && a<=20 && a%2==0){
                System.out.println("Weird");

            } else if(a%2==0&&a>20){
                System.out.println("Not Weird");
            }
        }
    }


