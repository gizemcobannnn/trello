package com.example;

import com.example.Board.Board;

/**
 * Trello project
 *
 */
public class App 
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
