# 🎮 CLI Tic Tac Toe (Java)

A simple **command-line Tic Tac Toe game** built in Java. It supports **n × n boards** (default 3×3) and allows two players (`X` and `O`) to play turn by turn.

---

## 🚀 Features
- Works for any board size (n × n)  
- Detects row, column, and diagonal wins  
- Declares a draw when the board is full  
- Prevents invalid moves (occupied cell or out-of-bounds input)  

---




## 🎲 How to Play
```
The board starts empty.

Players take turns entering their move in the format:

row col

where both values are between 0 and n-1.

A player wins by filling a row, column, or diagonal.

If the board is full with no winner → it’s a draw.

📖 Example (3×3 Game)
Board:
- - -
- - -
- - -

Player O enter row and col (0-2):
0 0

Board:
O - -
- - -
- - -

Player X enter row and col (0-2):
1 1

Board:
O - -
- X -
- - -

⚡ Customization

Change the board size in Main.java:

char[][] board = new char[5][5]; // Example: 5x5 board
