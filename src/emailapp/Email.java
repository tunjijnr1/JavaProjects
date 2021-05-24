package emailapp;

import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private int mailboxCapacity;
   private String alternateEmail;

   // constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
    }

//     Ask for the departments
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if(departmentChoice == 2){
            return "Development";
        } else if( departmentChoice == 3){
            return "Accounting";
        } else {
            return "none";
        }
    }


    // Generate a random password

    // Set mailbox capacity

    // Set alternate email

    // Change the password
}
