package emailapp;

import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private int defaultPasswordLength = 10;
   private int mailboxCapacity;

   private String alternateEmail;

   // constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Your Department is: "+this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: "+ this.password);
    }

//     Ask for the departments
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "none";
        }
    }


    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDERFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i <length; i++){
           int randomValue = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(randomValue);
        }
        return new String(password);
    }

    // Set mailbox capacity

    // Set alternate email

    // Change the password
}
