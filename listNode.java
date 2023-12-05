// Programmer: Shane Sparber
// Class: CS 145
// Date: 10/30/23
// Assignment 2: Phonebook
// Purpose: A linked list to create a phonebook


public class listNode 
{
    private final String name;
    private final String address;
    private final String city;
    private final String phoneNumber;
    listNode next;

    // start of list node constructor
    public listNode(String name, String address, String city, String phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
    } // end of list node constructor

    public String getName()
    {
        return name;
    }

     public String getAddress()
    {
        return address;
    }

     public String getCity()
    {
        return city;
    }

     public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String toString()
    {
        return this.name + this.address + this.city + this.phoneNumber;
    }

} // end of class
