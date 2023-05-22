package com.bridgelabz.logicalprogram;

public class LgicalPrograms {
    public static void fibonacciSeries() {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
    public static void perfectNumber(){
        int num=28;
        int sum=0;
        int temp=num;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==temp){
            System.out.println("Number is perfect");
        }else{
            System.out.println("Number is not perfect");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("welcome to logical program");
        fibonacciSeries();
        perfectNumber();
    }
}
