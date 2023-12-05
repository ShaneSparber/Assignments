// Programmer: Shane Sparber
// Class: CS 145
// Date: 10/30/23
// Assignment 2: Phonebook
// Purpose: A linked list to create a phonebook


import java.util.NoSuchElementException;
import java.util.*;

public class phonebookManager 
{
    listNode front = null;
    listNode back = null;
    listNode current = null;

    // start of add
    public void add(String name, String address, String city, String phoneNumber)
    {
        if (front == null)
        {
            front = new listNode(name, address, city, phoneNumber);
        }
        else
        {
            listNode current = front;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = new listNode(name, address, city, phoneNumber);
        }
    } // end of add

    // start of index add
    public void indexAdd(int index, String name, String address, String city, String phoneNumber)
    {
        if (index == 0)
        {
            front = new listNode(name, address, city, phoneNumber);
        }
        else
        {
            current = front;
            for (int i = 0; i < index - 1; i++)
            {
                current = current.next;
            }
            current.next = new listNode(name, address, city, phoneNumber);
        }
    } // end of index add

    // start of intro
    public void intro()
    {
        System.out.println("This is a phonebook manager, ");
        System.out.println("you can add and remove entries using the below choices.");
        System.out.println();
        System.out.println("(1) Add entry to the phonebook.");
        System.out.println("(2) Add entry at a specific index to the phonebook.");
        System.out.println("(3) Remove last entered entry from the phonebook.");
        System.out.println("(4) Remove entry at a specific index from the phonebook.");
        System.out.println("(5) Display phonebook entries.");
        System.out.println("(0) To quit phonebook manager.");
        System.out.println();
        System.out.println("Please enter a number (0-5)");
    } // end of intro

    // start of display
    public void display()
    {
        listNode current = front;

        if(front == null)
        {
            System.out.println("No phoneBook addresses: ");
            return;
        }
        System.out.println("PhoneBook addresses: ");

        while(current != null)
        {
            System.out.print(current);
            System.out.println();
            current = current.next;
        }
        System.out.println();
    } // end of display

    // start of remove
    public listNode remove()
    {
        if(front == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            listNode result = front.next;
            front = front.next;
            return result;
        }
    } // end of remove

    // start of index remove
    public void indexRemove(int index)
    {
        if(index == 0)
        {
            front = front.next;
        }
        else
        {
            listNode current = front;
            for(int i = 0; i < index -1; i++)
            {
                current = current.next;
            }
            current.next = current.next.next;
        }
    } // end of index remove

} // end of class
