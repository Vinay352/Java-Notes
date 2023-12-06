package com.company;

public class Player {

    private String name;

    Player(String name)	{
        this.name = name;
    }
    public String getName()    {
        return name;
    }
    public static void main(String args[]) {
        Player aPlayer = new Player("John");
        // Player bPlayer = new Player();
        System.out.println("Name of the PLayer is: " + aPlayer.getName() );
    }
}

