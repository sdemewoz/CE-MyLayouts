package inputFromUser;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class A {
    public static void main(String[] args){
        System.out.println("Enter your name and age: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String age = in.nextLine();
        int a = Integer.parseInt(age);
        System.out.println(name + " is " + a + " years old");
    }
}
