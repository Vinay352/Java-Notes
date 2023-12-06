package com.company;

public class Game {

    private String name;

    Game(String name)	{
        this.name = name;
    }
    public String nameOfTheGame()    {
        return name;
    }
    public static void main(String args[]) {
        Game aGame = new Game("BackGammon");
        Player playerOne = new Player("Rose");
        Player playerTwo = new Player("John");

        System.out.println(playerOne.getName() + " and " + playerTwo.getName() +
                " are playing a game of " + aGame.nameOfTheGame() + ".");
    }
}
