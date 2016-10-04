// Write a program that swaps the values of two variables without using third variable

public class Swap {
 
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Before swap Value is:");
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap Value is:");
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
    }
}