# Movie-Ticketing-System

## Overview 
This Java program simulates a movie theater ticketing system. It initializes a 2D array named seats, where each element represents a seat in the theater.

## Usage 
The value 0 represents an available (free) seat.
The value 1 represents a sold seat.
The program then prompts the user to input a row and column number, indicating the desired seat location. It checks the corresponding element in the seats array to determine whether the seat is available or sold.

If the seat is available (seats[row][column] is 0), it prints "Free".
If the seat is sold (seats[row][column] is 1), it prints "Sold".
