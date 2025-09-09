🎮 CLI Tic Tac Toe (Java)

A simple command-line Tic Tac Toe game built in Java.
The game supports n × n boards (default 3×3) and allows two players (X and O) to play turn by turn.

🚀 Features

Play Tic Tac Toe in the terminal/command prompt

Works for any board size (n × n)

Detects row, column, and diagonal wins

Detects draw when the board is full

Prevents invalid moves (occupied cell or out-of-bounds input)

🛠️ How to Run

Clone or download this repository.

Compile the program:

javac Main.java


Run the program:

java Main

🎲 Gameplay

The game starts with an empty board.

Players take turns entering their move:

Input format:

row col


(both values between 0 and n-1)

If a player forms a complete row, column, or diagonal → 🎉 that player wins!

If the board is full and no one wins → 🤝 it’s a draw.

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


➡ Continue until someone wins or board is full.

⚡ Customization

Change the board size:

char[][] board = new char[5][5]; // 5x5 board

Default is 3 × 3.


✅ Future Improvements

Add AI opponent (play vs computer).

Allow configurable win length (e.g., 4 in a row on a 6×6 board).

Improve board display with grid lines.

👨‍💻 Author Karthik G

Built with ❤️ in Java.
