// Programmer: Shane Sparber
// Class: CS 145
// Date: 11/25/23
// Lab 6: Binary search tree
// Purpose: Create a dictionary using binary search

public class Node 
{
    int id;
    String fName;
    String lName;
    String address;
    String city;
    String state;
    int zip;
    String email;
    String phoneNumber;
    
    Node left;
    Node right;

    // start of Node
    public Node(int id, String fName, String lName, String address, String city, String state, int zip, String email, String phoneNumber)
    {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
    } // end of Node
    
} // end of class
