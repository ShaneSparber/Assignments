// Programmer: Shane Sparber
// Class: CS 145
// Date: 12/1/23
// Assignment 3: The last tea shop
// Purpose: To play the last tea shop
// I did not create the game the last tea shop, it was made by Spring Villager. 
// I created all the code to play the game you see here.

import java.util.Random;
import java.util.Scanner;

public class TheLastTeaShopManager 
{
    Scanner input = new Scanner(System.in);

    private int[] items = new int[13];
    private int DAYS = 0;

    // start of dice roll
    public int dice()
    {
        System.out.println();
        Random rndm = new Random();
        int dice = rndm.nextInt(6)+1;
        System.out.println("You rolled!: " + dice);
        return dice;
    } // end of dice roll

    // start of silent dice roll
    public int diceSil()
    {
        System.out.println();
        Random rndm = new Random();
        int dice = rndm.nextInt(6)+1;
        return dice;
    } // end of silent dice roll

    // start of intro
    public void intro()
    {
        System.out.println("You run a tea shop on the border of the living and the ");
        System.out.println("dead. The recently deceased visit for one last hot drink, ");
        System.out.println("before their long journey to the Great Beyond.");
        System.out.println();
        System.out.println("Time is strange here. Days and memories blur. Nobody ");
        System.out.println("visited yesterday-you are sure of that. Someone passed");
        System.out.println("last week, but you are unable to picture their face.");
        System.out.println();
        System.out.println("The fog thins. A figure approaches. You stoke the fire.");
        System.out.println();
        System.out.println();
        System.out.println("What you will need!");
        System.out.println("Quiet time and some tea.");
    } // end of intro

    // start of setting up
    public void settingUp()
    {
        System.out.println("Press [1] to roll where your shop is located");

        int shop = input.nextInt();

        if(shop == 1)
        {
            int choice = dice();

            switch(choice)
            {
            case 1:
                System.out.println("Atop a windy cliff overlooking the ocean.");
                break;
            case 2:
                System.out.println("Within a cloud forest glade.");
                break;
            case 3:
                System.out.println("Beside a river in a mountain.");
                break;
            case 4:
                System.out.println("An island of ferns surrounded by swamp.");
                break;
            case 5:
                System.out.println("A seemingly endless field of moss.");
                break;
            case 6:
                System.out.println("A back alley in old Town.");
                break;
            }
        }
    } // end of setting up

    // start of affinities
    public void affinities()
    {
        System.out.println("Choose (or invent) two affinities: Luck, Incense, ");
        System.out.println("Frogs, Secrets, Shadows, Dust, Moonlight, Ghosts, ");
        System.out.println("Cards, Memories, Mice, Lost objects, Dreams, Mist.");
        System.out.println();
        System.out.println("Describe your stall. How are your affinities part of this place?.");

        String stall = input.nextLine();
        input.nextLine();
        System.out.println();
    } // end of affinities

    // start of storage
    public void storage()
    {
        System.out.println();
        System.out.println("~Inventory of Ingredients~");
        System.out.println("Sea Salt: " + items[1]);
        System.out.println("Kawakawa Leaf: " + items[2]);
        System.out.println("Quartz Crystal: " + items[3]);
        System.out.println("Bird Nest Fungi: " + items[4]);
        System.out.println("Reindeer Lichen: " + items[5]);
        System.out.println("Bright Gumdrop: " + items[6]);
        System.out.println("Ancient Seashell: " + items[7]);  
        System.out.println("Cloud Dew: " + items[8]);
        System.out.println("Giant Puffball: " + items[9]);
        System.out.println("Ginkgo Leaf: " + items[10]);
        System.out.println("Feather Moss: " + items[11]);
        System.out.println("Dried Sage: " + items[12]);
        System.out.println();
    } // end of storage
    
    // start of supplies
    public void supplies()
    {
        System.out.println("Press [1] to roll for your supplies!");

        int y = 0;
        y = input.nextInt();

        if(y == 1)
        {
            for(int x = 0; x < 1; x++)
                {
                    int column = dice();
                    int row = dice();
                    System.out.println();

                    if (column == 1 || column == 2 || column == 3)
                    {
                        switch(row)
                        {
                        case 1:
                            items[1] = items[1] + 1;
                            System.out.println("-Sea Salt: " + items[1]);    
                            break;
                        case 2:
                            items[2] = items[2] + 1;
                            System.out.println("-Kawakawa Leaf: " + items[2]);
                            break;
                        case 3:
                            items[3] = items[3] + 1;
                            System.out.println("-Quartz Crystal: " + items[3]);
                            break;
                        case 4:
                            items[4] = items[4] + 1;
                            System.out.println("-Bird Nest Fungi: " + items[4]);
                            break;
                        case 5:
                            items[5] = items[5] + 1;
                            System.out.println("-Reindeer Lichen: " + items[5]);
                            break;
                        case 6:
                            items[6] = items[6] + 1;
                            System.out.println("-Bright Gumdrop: " + items[6]);
                            break;           
                        }
                    }
                    else
                    {
                        switch(row)
                        {
                        case 1:
                            items[7] = items[7] + 1;
                            System.out.println("-Ancient Seashell: " + items[7]);    
                            break;
                        case 2:
                            items[8] = items[8] + 1;
                            System.out.println("-Cloud Dew: " + items[8]);
                            break;
                        case 3:
                            items[9] = items[9] + 1;
                            System.out.println("-Giant Puffball: " + items[9]);
                            break;
                        case 4:
                            items[10] = items[10] + 1;
                            System.out.println("-Ginkgo Leaf: " + items[10]);
                            break;
                        case 5:
                            items[11] = items[11] + 1;
                            System.out.println("-Feather Moss: " + items[11]);
                            break;
                        case 6:
                            items[12] = items[12] + 1;
                            System.out.println("-Dried Sage: " + items[12]);
                            break;
                        }
                    }
                }
                System.out.println();
        }
    } // end of supplies

    // start of days
    public void week()
    {
        int x = 0;
        int y = 0;
        String atmos = "";
        String tone = "";

        while(DAYS < 24)
        {
            System.out.println("Press [1] to roll for the days that have passed ");
            System.out.println("and the Vistor who you will meet!");
            x = input.nextInt();

            if(x == 1)
            {
                DAYS = DAYS + dice();
                int weath = diceSil();

                switch(weath)
                {
                case 1:
                    atmos = "Bruised purple fog.";
                    tone = "Pained";
                    break;
                case 2:
                    atmos = "Heavy blue fog.";
                    tone = "Melancholy";
                    break;
                case 3:
                    atmos = "Shadow mists.";
                    tone = "Scared";
                    break;
                case 4:
                    atmos = "Swirling white mist.";
                    tone = "Confused";
                    break;
                case 5:
                    atmos = "Persistent drizzle.";
                    tone = "Exhausted";
                    break;
                case 6:
                    atmos = "Gentle sunbeams.";
                    tone = "Calm";
                    break;
                }

                switch(DAYS)
                {
                    case 1:
                        System.out.println(DAYS + " Day has passed, you see outside the  " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Gambler.");
                        break;
                    case 2:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Stablehand.");
                        break;
                    case 3:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Messenger.");
                        break;
                    case 4:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Sailor.");
                        break;
                    case 5:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Scout.");
                        break;
                    case 6:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Baker.");
                        break;
                    case 7:
                        System.out.println(DAYS + " Day has passed, you see outside the  " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Beekeeper.");
                        break;
                    case 8:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Shepherd.");
                        break;
                    case 9:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Forester.");
                        break;
                    case 10:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Tailor.");
                        break;
                    case 11:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Minestrel.");
                        break;
                    case 12:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Librarian.");
                        break;
                    case 13:
                        System.out.println(DAYS + " Day has passed, you see outside the  " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Outcast.");
                        break;
                    case 14:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Monk/Nun.");
                        break;
                    case 15:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Hermit.");
                        break;
                    case 16:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Artist.");
                        break;
                    case 17:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Bodyguard.");
                        break;
                    case 18:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Merchant.");
                        break;
                    case 19:
                        System.out.println(DAYS + " Day has passed, you see outside the  " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Diplomat.");
                        break;
                    case 20:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Sage.");
                        break;
                    case 21:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Hero.");
                        break;
                    case 22:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " princess.");
                        break;
                    case 23:
                        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
                        System.out.println("The visitor that walks through the door is a " + tone + " Emperor.");
                        break;
                    default:
                    veiled();
                    y = 1;
                    break;
                }
            }
            if (y == 0)
            {
                storage();
                recipe();
                brew();
                conversation1();
                conversation2();
                question();
                endConversation();
                gift();
            }
        }
    } // end of days

    // start of veiled one
    public void veiled()
    {
        String atmos = "";
        String tone = "";
        String veil = "";
        int weath = dice();

        switch(weath)
        {
        case 1:
            atmos = "Bruised purple fog.";
            tone = "Pained";
            break;
        case 2:
            atmos = "Heavy blue fog.";
            tone = "Melancholy";
            break;
        case 3:
            atmos = "Shadow mists.";
            tone = "Scared";
            break;
        case 4:
            atmos = "Swirling white mist.";
            tone = "Confused";
            break;
        case 5:
            atmos = "Persistent drizzle.";
            tone = "Exhausted";
            break;
        case 6:
            atmos = "Gentle sunbeams.";
            tone = "Calm";
            break;
        }

        System.out.println(DAYS + " Days have passed, you see outside the " + atmos);
        System.out.println("The visitor that walks through the door is a " + tone + " Veiled One.");

        storage();
        recipe();
        brew();
        conversation1();
        conversation2();
        endConversation();
        
        System.out.println();
        System.out.println("What happens next?");
        veil = input.nextLine();

    } // end of veiled

    // start of question
    public void question()
    {
        System.out.println();
        System.out.println("At some point ask each visitor, How did you know ");
        System.out.println("my last customer? If the moment seems right, ");
        System.out.println("weave an Affinity into the situation. Describe ");
        System.out.println("how it transforms or eases things.");
        System.out.println();
        System.out.println("Press [1] to ask the question or [2] if the moment dosen't feel right.");

        int x = 0;
        x = input.nextInt();
        String quest = "";

        if(x == 1)
        {
            quest = input.nextLine();
            System.out.println();
        }
        System.out.println();
        input.nextLine();
    } // end of question

    // start of recipe
    public void recipe()
    {
        System.out.println("Select the tea you would like to start brewing!");
        System.out.println();
        System.out.println("[TEA RECIPES]");
        System.out.println();
        System.out.println("[1]");
        System.out.println("~Gumboot Tea~");
        System.out.println("Warms the Soul");
        System.out.println("No special ingredients required. Brew anytime.");
        System.out.println();
        System.out.println("[2]");
        System.out.println("~Tea of Mirth~");
        System.out.println("An hour spent laughing at everything and nothing");
        System.out.println("Bright Gumdrop, Cloud Dew, or Reindeer Lichen.");
        System.out.println();
        System.out.println("[3]");
        System.out.println("~Draft of Recall~");
        System.out.println("Relive a memory in vivid detail");
        System.out.println("Quartz Crystal, Ginkgo Leaf, or Ancient Seashell.");
        System.out.println();
        System.out.println("[4]");
        System.out.println("~Comforting Brew~");
        System.out.println("Creates a safe space. Eases what ails you");
        System.out.println("Dried Sage, Sea Salt, or Feather Moss");
        System.out.println();
        System.out.println("[5]");
        System.out.println("~Distance Tea~");
        System.out.println("Drink to calm a difficult memory");
        System.out.println("Kawakawa Leaf, Giant Puffball, or Bird Nest Fungi.");
    } // end of recipe

    // start of brew
    public void brew()
    {
        int tea = 0;
        tea = input.nextInt();

        switch (tea) 
        {
            case 1:
                int gum = 1;
                switch(gum)
                {
                    case 1:
                        System.out.println();
                        System.out.println("You start brewing the Gumboot Tea");
                        break;
                }
                break;
            case 2:
                System.out.println("~Tea of Mirth~");
                System.out.println("Select which item you would like to use to brew some Tea of Mirth!");
                System.out.println("[1] Bright Gumdrop [2] Cloud Dew [3] Reindeer Lichen");

                int mirth = 0;
                mirth = input.nextInt();
                System.out.println();
                
                if(items[6] > 0 && mirth == 1)
                {
                    items[6] = items[6] - 1;
                    System.out.println("You add some Bright Gumdrop to the Tea of Mirth");
                }
                else if(items[8] > 0 && mirth == 2)
                {
                    items[8] = items[8] - 1;
                    System.out.println("You add some Cloud Dew to the Tea of Mirth");
                }
                else if(items[5] > 0 && mirth == 3)
                {
                    items[5] = items[5] - 1;
                    System.out.println("You add some Bright Reindeer Lichen to the Tea of Mirth");
                }
                else
                {
                    System.out.println("You do not have the ingredients needed to brew a Tea of Mirth");
                    recipe();
                    brew();
                }
                break;
            case 3:
                System.out.println("~Draft of Recall~");
                System.out.println("Select which item you would like to use to brew a Draft of Recall!");
                System.out.println("[1] Quartz Crystal [2] Ginkgo Leaf [3] Ancient Seashell");

                int recall = 0;
                recall = input.nextInt();
                System.out.println();
                
                if(items[3] > 0 && recall == 1)
                {
                    items[3] = items[3] - 1;
                    System.out.println("You add some Quartz Crystal to the Draft of Recall");
                }
                else if(items[10] > 0 && recall == 2)
                {
                    items[10] = items[10] - 1;
                    System.out.println("You add some Ginkgo Leaf to the Draft of Recall");
                }
                else if(items[7] > 0 && recall == 3)
                {
                    items[7] = items[7] - 1;
                    System.out.println("You add some Ancient Seashell to the Draft of Recall");
                }
                else
                {
                    System.out.println("You do not have the ingredients needed to brew a Draft of Recall");
                    recipe();
                    brew();
                }
                break;
            case 4:
                System.out.println("~Comforting Brew~");
                System.out.println("Select which item you would like to use to brew a Comforting Brew!");
                System.out.println("[1] Dried Sage [2] Sea Salt [3] Feather Moss");

                int comfort = 0;
                comfort = input.nextInt();
                System.out.println();
                
                if(items[12] > 0 && comfort == 1)
                {
                    items[12] = items[12] - 1;
                    System.out.println("You add some Dried Sage to the Comforting Brew");
                }
                else if(items[1] > 0 && comfort == 2)
                {
                    items[1] = items[1] - 1;
                    System.out.println("You add some Sea Salt to the Comforting Brew");
                }
                else if(items[11] > 0 && comfort == 3)
                {
                    items[11] = items[11] - 1;
                    System.out.println("You add some Feather Moss to the Comforting Brew");   
                }
                else
                {
                    System.out.println("You do not have the ingredients needed to brew a Comforting Brew");
                    recipe();
                    brew();
                }
                break;
            case 5:
                System.out.println("~Distance Tea~");
                System.out.println("Select which item you would like to use to brew the Distance Tea!");
                System.out.println("[1] Kawakawa Leaf [2] Giant Puffball [3] Bird Nest Fungi");

                int distance = 0;
                distance = input.nextInt();
                System.out.println();
                
                if(items[2] > 0 && distance == 1)
                {
                    items[2] = items[2] - 1;
                    System.out.println("You add some Kawakawa Leaf to the Distance Tea");
                }
                else if(items[9] > 0 && distance == 2)
                {
                        items[9] = items[9] - 1;
                        System.out.println("You add some Giant Puffball to the Distance Tea");
                }
                else if(items[4] > 0 && distance == 3)
                {
                        items[4] = items[4] - 1;
                        System.out.println("You add some Bird Nest Fungi to the Distance Tea");
                }
                else
                {
                    System.out.println("You do not have the ingredients needed to brew a Distance Tea");
                    recipe();
                    brew();
                }
                break;
        }
    } // end of brew

    // start of questions
    public void questions()
    {
        System.out.println("What is the last thing you remember?");
        System.out.println("Where did you live?");
        System.out.println("What are you proud of? or What do you regret?");
        System.out.println("Who will you miss?");
        System.out.println("You saw something unusual. What did you see?");
        System.out.println("You lost something valuable. What happened?");
        System.out.println("You left something unfinished. What is undone?");
        System.out.println("You hid something. What did you hide?");
        System.out.println("You recently relized something. What was it?");
        System.out.println("Tell me about your journey to the tea shop.");
    } // end of questions

    // start of first conversation
    public void conversation1()
    {
        System.out.println();
        System.out.println("As you prepare tea, there is a time to ask a ");
        System.out.println("question. Use question prompts or make ");
        System.out.println("up your own. Write an evocative response to ");
        System.out.println("each question. Consider there emotional state.");
        System.out.println();

        questions();

        System.out.println();
        String conver1 = input.nextLine();
        input.nextLine();

    } // end of first conversation 

    // start of second conversation
    public void conversation2()
    {
        System.out.println();
        System.out.println("Serve tea. Ask a second question as the visitor ");
        System.out.println("drinks. This time take tea effects into account ");
        System.out.println("when the visitor provides their answers.");
        System.out.println();
        String conver2 = input.nextLine();
    } // end of second conversation

    // start of end of conversation
    public void endConversation()
    {
        System.out.println();
        System.out.println("When the tea is finished, bid you visitor farewell ");
        System.out.println("Describe the visitor's state upon leaving the stall.");
        System.out.println();
        String endConver = input.nextLine();
        System.out.println();
    } // end of conversation

    // start of gift
    public void gift()
    {
        if(DAYS == 2 || DAYS == 3 || DAYS == 4 || DAYS == 5 || DAYS == 13 || DAYS == 17 || DAYS == 21)
        {
            System.out.println();
            System.out.println("The visitor leaves and time seems to pass more quickly than usual.");
            System.out.println();
            DAYS = DAYS + 2;
        }
        else if (DAYS == 6 || DAYS == 7 || DAYS == 9 || DAYS == 18 || DAYS == 19 || DAYS == 20 || DAYS == 23)
        {
            System.out.println();
            System.out.println("The visitor leaves and you see that they left you a supply.");
            System.out.println();
            supplies();
        }
    } // end of gift 

} //end of class
