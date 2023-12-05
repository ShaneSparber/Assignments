// Programmer: Shane Sparber
// Class: CS 145
// Date: 10/30/23
// Assignment 2: Phonebook
// Purpose: A linked list to create a phonebook


import java.util.*;
public class phonebookMain 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menu = 0;

        phonebookManager myphonebookManager = new phonebookManager();
        myphonebookManager.intro();

        do
        {
            menu = 10;
            menu = input.nextInt();
            switch (menu) 
            {
                case 1:
                System.out.println("Please enter: name, (enter) address, (enter) city, (enter) phonenumber (enter)");
                String name = input.next();
                String address = input.next();
                String city = input.next();
                String phoneNumber = input.next();
                myphonebookManager.add(name, address, city, phoneNumber);
                myphonebookManager.intro();
                System.out.println();
                break;

                case 2:
                System.out.println("Please enter: index, (enter) name, (enter) address, (enter) city, (enter) phonenumber (enter)");
                int index = input.nextInt();
                name = input.next();
                address = input.next();
                city = input.next();
                phoneNumber = input.next();
                myphonebookManager.indexAdd(index, name, address, city, phoneNumber);
                myphonebookManager.intro();
                System.out.println();
                break;

                case 3:
                myphonebookManager.remove();
                myphonebookManager.intro();
                System.out.println();
                break;

                case 4:
                System.out.println("Please enter: index (enter)");
                index = input.nextInt();
                myphonebookManager.indexRemove(index);
                myphonebookManager.intro();
                System.out.println();
                break;

                case 5:
                myphonebookManager.display();
                myphonebookManager.intro();
                System.out.println();
                break;
            }
        }
        while(menu != 0);
    } // end of main

} // end of class
