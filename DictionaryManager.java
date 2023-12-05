// Programmer: Shane Sparber
// Class: CS 145
// Date: 11/25/23
// Lab 6: Binary search tree
// Purpose: Create a dictionary using binary search

public class DictionaryManager 
{
    Node root;

    // start of intro
    public void intro()
    {
        System.out.println("Welcome to the binary search dictionary.");
        System.out.println("Here you can store information similar to address books.");
        System.out.println();
    } // end of intro

    // start of options
    public void options()
    {
        System.out.println("Please choose an option below!");
        System.out.println("[1]ADD");
        System.out.println("[2]DELETE");
        System.out.println("[3]MODIFY");
        System.out.println("[4]LOOKUP");
        System.out.println("[5]DISPLAY");
        System.out.println("[0]QUIT");
    } // end of options

    // start of add
    public void add(Node node)
    {
        root = addHelper(root, node);
    } // end of add

    // start of add helper
    private Node addHelper(Node root, Node node)
    {
        int id = node.id;

        if(root == null)
        {
            root = node;
            return root;
        }
        else if(id < root.id)
        {
            root.left = addHelper(root.left, node);
        }
        else
        {
            root.right = addHelper(root.right, node);
        }
        return root;
    } // end of add helper

    // start of display
    public void display()
    {
        displayHelper(root);
    } // end of display

    // start of display helper
    private void displayHelper(Node root)
    {
        if(root != null)
        {
            displayHelper(root.left);
            System.out.printf("%d: %s, %s, %s, %s, %s, %d, %s, %s", root.id, root.fName, root.lName, root.address, root.city, root.state, root.zip, root.email, root.phoneNumber);
            System.out.println();
            displayHelper(root.right);
        }
    } // end of display helper

    // start of lookup
    public boolean lookup(int id)
    {
        return lookupHelper(root, id);
    } // end of lookup

    // start of lookup helper
    private boolean lookupHelper(Node root, int id)
    {
        if(root == null)
        {
            System.out.println(id + " -ID Does not exit");
            return false;
        }
        else if(root.id == id)
        {
            System.out.printf("%d: %s, %s, %s, %s, %s, %d, %s, %s", root.id, root.fName, root.lName, root.address, root.city, root.state, root.zip, root.email, root.phoneNumber);
            System.out.println();
            return true;
        }
        else if(root.id > id)
        {
            return lookupHelper(root.left, id);
        }
        else
        {
            return lookupHelper(root.right, id);
        }
    } // end of lookup helper

    // start of delete
    public void delete(int id)
    {
        if(lookup(id))
        {
            deleteHelper(root, id);
        }
        else
        {
            System.out.println(id + " -ID Does not exit");
        }
    } // end of delete

    // start of delete helper
    private Node deleteHelper(Node root, int id)
    {
        if(root == null)
        {
            return root;
        }
        else if(id < root.id)
        {
            root.left = deleteHelper(root.left, id);
        }
        else if(id > root.id)
        {
            root.right = deleteHelper(root.right, id);
        }
        else
        {
            if(root.left == null && root.right == null)
            {
                root = null;
            }
            else if(root.right != null)
            {
                root.id = successor(root);
                root.right = deleteHelper(root.right, id);
            }
            else
            {
                root.id = predeccessor(root);
                root.left = deleteHelper(root.left, id);
            }
        }
        return root;
    } // end of delete helper

    // start of modify
    public void modify(int id)
    {
        if(lookup(id))
        {
            modifyHelper(root, id);
        }
        else
        {
            System.out.println(id + " -ID Does not exit");
        }
    } // end of modify

    // start of modify helper
    private Node modifyHelper(Node root, int id)
    {
        return root;
    } // end of modify helper

    // start of ascii
    public void ascii()
    {
        System.out.println("HHHH    HHHH    HHHHHHHH    HHHH        HHHH         HHHHHHH");
        System.out.println("H  H    H  H    H      H    H  H        H  H        HH     HH");
        System.out.println("H  H    H  H    H  HHHHH    H  H        H  H        H       H");
        System.out.println("H  H    H  H    H  H        H  H        H  H        H       H");
        System.out.println("H  HHHHHH  H    H  HHHH     H  H        H  H        H       H");
        System.out.println("H  HHHHHH  H    H  HHHH     H  H        H  H        H       H");
        System.out.println("H  H    H  H    H  H        H  H        H  H        H       H");
        System.out.println("H  H    H  H    H  HHHHH    H  HHHHH    H  HHHHH    H       H");
        System.out.println("H  H    H  H    H      H    H      H    H      H    HH     HH");
        System.out.println("HHHH    HHHH    HHHHHHHH    HHHHHHHH    HHHHHHHH     HHHHHHH");
        System.out.println();
    } // end of ascii

    // start of successor
    private int successor(Node root)
    {
        root = root.right;
        while(root.left != null)
        {
            root = root.left;
        }
        return root.id;
    } // end of successor

    // start of predeccessor
    private int predeccessor(Node root)
    {
        root = root.left;
        while(root.right != null)
        {
            root = root.right;
        }
        return root.id;
    } // end of predeccessor

} // end of class
