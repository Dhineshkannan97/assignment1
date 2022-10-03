package org.example;

import org.w3c.dom.ls.LSOutput;

public class test2 {
//    String num = "1,2";
//    char[]r = num.toCharArray();

    public static void main(String[] args) {
        String num = "1,2";
        int sum=0;
//        char[]r = num.toCharArray();
         String[] split = num.split(",");
        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
                     int m= Integer.parseInt(split[i]);
            while (m>0) {
                int  r=m%10;
                sum=sum+r;
                m=m/10;
            }

        }
        System.out.println(sum);


    }


}
