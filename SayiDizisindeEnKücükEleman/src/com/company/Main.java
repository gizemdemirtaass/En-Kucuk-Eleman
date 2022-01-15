package com.company;

public class Main {

    public static void main(String[] args) {
	double n1=-3, n2=4, n3=-10;
    System.out.println("---Sayılar---\n");
    System.out.println(" "+n1);
    System.out.println(" "+n2);
    System.out.println(" "+n3);
    if(n1<=n2 && n1<=n3){
        System.out.println("En küçük sayı: "+n1);
    }
    else if(n2<=n1 && n2<=n3){
        System.out.println("En küçük sayı: "+n2);
    }
    else{
        System.out.println("En küçük sayı: "+n3);
    }
    }
}
