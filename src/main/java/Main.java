import java.util.*;

public class Main {
  public static void main(String[] args) {
    char[][] board = new char[3][3];

    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = ' ';
      }
    }
    int len=board.length;
    char player = 'O';
    boolean winner = false;
    int moves=0;
    Scanner sc = new Scanner(System.in);
    while (!winner && moves < len * len) {
      printboard(board);
      System.out.println("Player " + player + " enter row and col (0-2):");
      
      try {
        int row = sc.nextInt();
        int col = sc.nextInt();
        if(row < 0 || row >= len || col < 0 || col >= len ){
          System.out.println("Invalid row or col...try again!");
          continue;
        }
        if (board[row][col] == ' ') {
          board[row][col] = player;
          moves++;
          
          if (checkboard(board, player)) {
            winner = true;
            printboard(board);
            System.out.println(player + " is the winner!");
            break;
          }

          player = (player == 'O') ? 'X' : 'O';
        } else {
          System.out.println("Invalid move..try again!");
        }
      } catch (Exception e) {
        System.out.println("Invalid row or col...try again!");
        sc.nextLine();
      }
    }

    if(!winner){
      System.out.println("match is draw");
    }
  }

  public static void printboard(char[][] board) {
    
    System.out.println("Board:");
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++) {
        System.out.print( (board[r][c] == ' ') ?  '-' : board[r][c] + " ");
      }
      System.out.println();
    }
  }

  public static boolean checkboard(char[][] board, char player) {
    int n = board.length;
    int m = board[0].length;

    for (int i = 0; i < n; i++) {
      int row = 0, col = 0;
      for (int j = 0; j < m; j++) {
        if (board[i][j] == player) {
          row++;
        }
        if (board[j][i] == player) {
          col++;
        }
      }

      if (row == n || col == n) {
        return true;
      }
    }

    int diag1=0,diag2=0;
    for(int i=0;i<n;i++){
      if(board[i][i] == player){
        diag1++;
      }
      if(board[i][n-i-1] == player){
        diag2++;
      }
    }

    if(diag1  == n || diag2 == n) return true;
    return false;

  }
}