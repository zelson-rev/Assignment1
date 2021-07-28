package com.ZachElson;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("this is the main Class");


//

         int age;
         String firstName;
         String occupation;
         String webaddress;


            User user = new User();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name ");
            firstName = scanner.nextLine();
            user.setName(firstName);

            System.out.println("What is your Occupation");
            occupation = scanner.nextLine();
            user.setOccupation(occupation);

            System.out.println("What is your github username" );
            webaddress = scanner.nextLine();
            user.setWebaddress(webaddress);

            System.out.println("What is your age");
            age = scanner.nextInt();
            user.setAge(age);



            System.out.println("Hello "+ user.getName() + " I know many "+ user.getOccupation()+"'s " + "I'll make sure to checkout your github at github.com/" + user.getWebaddress());




        }
}
