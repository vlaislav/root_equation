package org.example;

public class Main {
   public static double func(double x){
       return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.2 * x - 23;
   }

    public static  double solved(double start, double end) {
      /*
    Eсли мы хотим добиться нужной точности не по x, по y, то условие
    в методе следует переписать:
      if(Math.abs(func(start)- func(end)) <= 0.001){
            return start;
        }
      */
       if(end - start <= 0.001){
           return start;
       }

       double x = start + (end -start) / 2;

       if (func(start) * func(x) > 0){
           return  solved(x, end);
       } else {
           return solved(start, x);
       }
    }

    public static void main(String[] args) {
       System.out.println((solved(0,10)));
    }
    }
