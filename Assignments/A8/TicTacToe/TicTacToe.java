package TicTacToe;

import java.lang.reflect.Array;
import java.util.*;


public class TicTacToe 
{
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	
	public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '} };

        printGameBoard(gameBoard);


        while (true) 
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerPos = scan.nextInt();
            // write your code here
            //System.out.println(playerPos);
            
            placePiece(gameBoard, playerPos, "player");
            
            Random r = new Random();
            int cpuPos = r.nextInt(9)+1;
            placePiece(gameBoard, cpuPos, "cpu");
            
            
            //(gameBoard);
            //checkWinner();
            String s = checkWinner();
            
            	if(s.length() > 0)
            	{
            	System.out.println(s);
            	break;
            	}
            	else
            	{
            	printGameBoard(gameBoard);
            	}
            	
            }
    }
	

    public static void printGameBoard(char[][] gameBoard) 
    {
        // write your code here
    	
    	//Printing Game Board
    	for(char[] rows:gameBoard)
    	{
    		for(char c: rows)
    		{
    			System.out.print(c);  
    		}
    		System.out.println();
    	}
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) 
    {

        char symbol = ' ';
               
        if (user.equals("player")) 
        {
            symbol = 'X';
            playerPositions.add(pos);
            
        } 
        else if (user.equals("cpu")) 
        {
            symbol = 'O';
            cpuPositions.add(pos);
            
        }
        
        // write your code here
        switch(pos)
            {
            case 1: gameBoard[0][0] = symbol;
            		break;
            case 2: gameBoard[0][2] = symbol;
    				break;
            case 3: gameBoard[0][4] = symbol;
    				break;
            case 4: gameBoard[2][0] = symbol;
    				break;
            case 5: gameBoard[2][2] = symbol;
    				break;
            case 6: gameBoard[2][4] = symbol;
    				break;
            case 7: gameBoard[4][0] = symbol;
    				break;
            case 8: gameBoard[4][2] = symbol;
    				break;
            case 9: gameBoard[4][4] = symbol;
    				break;
    		default: break;
            }


    }

    public static String checkWinner() 
    {
        // write your code here
    	List topRow = Arrays.asList(1, 2, 3);
    	List middleRow = Arrays.asList(4, 5, 6);
    	List bottomRow = Arrays.asList(7, 8, 9);
    	List firstCol = Arrays.asList(1, 4, 7);
    	List middleCol = Arrays.asList(2, 5, 8);
    	List lastCol = Arrays.asList(3, 6, 9);
    	List firstDiagonal = Arrays.asList(1, 5, 9);
    	List secondDiagonal = Arrays.asList(3, 5, 7);
    	
    	List<List> win = new ArrayList<List>();
    	win.add(topRow);
    	win.add(middleRow);
    	win.add(bottomRow);
    	win.add(firstCol);
    	win.add(middleCol);
    	win.add(lastCol);
    	win.add(firstDiagonal);
    	win.add(secondDiagonal);
    	
    	for(List list : win)
    	{
    		if(playerPositions.containsAll(list))
    		{
    			return "PLAYER WIN";
    		}
    		else if(cpuPositions.containsAll(list))
    		{
    			return "CPU WIN";
    		}
    		else if(playerPositions.size()+cpuPositions.size() == 9)
    		{
    			return "MATCH DRAW";
    		}
    	}
    	return "";
    }
    
}
