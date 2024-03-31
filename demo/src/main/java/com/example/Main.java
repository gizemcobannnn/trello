package com.example;

/**
 * Trello project
 *
 */
public class Main 
{
    public static void main( String[] args )
    {

        Board board1 = new Board();
        board1.openWeb();
        board1.createBoard();
        board1.addCard();
        board1.closeBoard();
        board1.closeWeb();
    }
}
