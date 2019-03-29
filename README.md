# DiceLib
A dice rolling library written in Java designed to be simple to use and integrate.
By Joshua Orvis (5K Studios)

The purpose of this Library is to provide simulated dicerolls for other programs.
It contains all of the common dice used in most table top games such as:
D4,D6,D8,D10,D12,D20,D100. However, it also contains the base roll() methods
 that allows for any sided dice to be virtually rolled.

Rolls come in two flavors: Standard, which prints a console line, or Quiet, which only generates
a number and no console command.
For example:
rollD6();
rollQuietD6();

Within these two flavors you have the single roll or the multi roll:
rollD6(); just rolls one
rollD6(5); rolls 5 d6

To make custom dice rolls you can use this:

Dice dice = new Dice():
dice.roll(5, 2); //rolls 2 5-sided dice

or

dice.roll(5); //if you just want one 5 sided die rolled

I hope this library proves to be effective for you. If you have questions, concerns, comments, 
or want to help me improve my code please contact me at: 5kstudiosar@gmail.com
