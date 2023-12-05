// Programmer: Shane Sparber
// Class: CS 145
// Date: 12/1/23
// Assignment 3: The last tea shop
// Purpose: To play the last tea shop
// I did not create the game the last tea shop, it was made by Spring Villager.
// I created all the code to play the game you see here.

public class TheLastTeaShopMain
{
    public static void main(String[] args)
    {
        TheLastTeaShopManager teaShop = new TheLastTeaShopManager();
        teaShop.intro();
        System.out.println();
        teaShop.settingUp();
        System.out.println();
        teaShop.affinities();
        teaShop.supplies();
        teaShop.supplies();
        teaShop.supplies();
        teaShop.week();
    } // end of main
} // end of class
