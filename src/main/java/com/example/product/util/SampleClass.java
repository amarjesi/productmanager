package com.example.product.util;

public class SampleClass {

    private String geek;

    public String getGeek() {
        return geek;
    }

    public void setGeek(String geek) {
        this.geek = geek;
    }

    public SampleClass(){
        System.out.println("inside constructor");
    }
    public SampleClass(String geek){
        this.geek = geek;
        System.out.println("inside geek constructor");
    }


    public static void main(String[] args) {
        System.out.println("Product Util");
        SampleClass S1 = new SampleClass();
        SampleClass S2 = new SampleClass("myGeek");

        int a = 10, b = 20, c = 30, d = 0;

        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);

        // using logical AND to verify
        // two constraints
        if (!((a < b) || (b == c))) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else {
            System.out.println("False conditions");
    }

    }
}
