 import java.util.*;
 public class TicTacToe  {
       static char board[]={' ',' ',' ',' ',' ',' ',' ',' ',' '}; 
       static void printBoard() {
           System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
           System.out.println("-----------");
           System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
           System.out.println("-----------");
           System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
           System.out.println();
       }
           static boolean checkwin(char player){
            return((board[0]==player && board[1]==player && board[2]==player) ||
                   (board[3]==player && board[4]==player && board[5]==player) ||
                   (board[6]==player && board[7]==player && board[8]==player) ||
                   (board[0]==player && board[3]==player && board[6]==player) ||
                   (board[1]==player && board[4]==player && board[7]==player) ||
                   (board[2]==player && board[5]==player && board[8]==player) ||
                   (board[0]==player && board[4]==player && board[8]==player) |
                   (board[2]==player && board[4]==player && board[6]==player));
           }
           static boolean isDraw(){
            for(char c:board){
                  if(c==' ') return false;
            }
            return true;
           }
           public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            char currentPlayer='X';

            System.out.println("Tic Tac Tpe Game");
            System.out.println("1 | 2 | 3");
            System.out.println("4 | 5 | 6");
            System.out.println("7 | 8 | 9");

            while(true){
                  printBoard();
                  System.out.print("player" + currentPlayer + " enter your position (1-9): ");
                  int pos=sc.nextInt();
                  if(pos<1 || pos>9 || board[pos-1]!=' '){
                        System.out.println("Invalid move, try again.");
                        continue;
                  }
                  board[pos-1]=currentPlayer;
                  if(checkwin(currentPlayer)){
                        printBoard();
                        System.out.println("Player " + currentPlayer + " wins!");
                        break;
                  }
                  if(isDraw()){
                        printBoard();
                        System.out.println("Game is a draw!");
                        break;
                  }
                  currentPlayer=(currentPlayer=='X')?'O':'X';
            }
               sc.close();
         
           }
           

 }