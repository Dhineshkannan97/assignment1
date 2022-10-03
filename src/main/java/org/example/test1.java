package org.example;

public class test1 {

    public static void main(String[] args) {
          String num = "12";
         int  sum=0;

         // char [] arr=num.toCharArray();
        //for (int i = 0; i < arr.length; i++) {
              int l = Integer.parseInt(num);
            System.out.println(l);
       // }
        while(l>0){
            int  r=l%10;
             sum=sum+r;
             l=l/10;

        }
        System.out.println(sum);
    }
}
