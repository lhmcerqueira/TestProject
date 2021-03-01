package helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your name:/n");
        name = sc.nextLine();
        System.out.println("Hello "+name+", it's working!");
        System.out.println("this is the new branch");
    }
}
