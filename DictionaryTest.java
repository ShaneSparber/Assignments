// Programmer: Shane Sparber
// Class: CS 145
// Date: 11/25/23
// Lab 6: Binary search tree
// Purpose: Create a dictionary using binary search

import java.util.Scanner;

public class DictionaryTest 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menu = 0;

        DictionaryManager tree = new DictionaryManager();
        tree.ascii();
        tree.intro();
        tree.options();

        do
        {
            menu = 10;
            menu = input.nextInt();
            switch (menu) 
            {
                case 1:
                System.out.println("Please enter: id, first name, last name, address, city, state, zip, e-mail, phone number.");
                int id = input.nextInt();
                String fName = input.next();
                String lName = input.next();
                System.out.println("Address format = xxxx-xxxx-xxx-xxx");
                String address = input.next();
                String city = input.next();
                String state = input.next();
                int zip = input.nextInt();
                String email = input.next();
                System.out.println("Phone number format = (###)###-####");
                String phoneNumber = input.next();
                tree.add(new Node(id, fName, lName, address, city, state, zip, email, phoneNumber));
                System.out.println();
                tree.options();
                break;

                case 2:
                System.out.println("Please enter the id number of the data you would like to delete.");
                int y = input.nextInt();
                tree.delete(y);
                System.out.println();
                tree.options();
                break;

                case 3:
                System.out.println("Please enter the id number of the data you would like to modify.");
                break;

                case 4:
                System.out.println("Please enter the id number of the data you would like to view.");
                int z = input.nextInt();
                System.out.println(tree.lookup(z));
                System.out.println();
                tree.options();
                break;

                case 5:
                tree.display();
                System.out.println();
                tree.options();
                break;
            }
        }
        while(menu != 0);
    } // end of main
    
} // end of class
