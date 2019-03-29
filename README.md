# DiceLib
A dice rolling library written in Java designed to be simple to use and integrate.
By Joshua Orvis (5K Studios)

The purpose of this Library is to provide simulated dice rolls for other programs.
It contains all of the common dice used in most table top games such as:
D4,D6,D8,D10,D12,D20,D100. However, it also contains the base <b>roll()</b> methods
 that allows for any sided dice to be virtually rolled.

Rolls come in two flavors: <b>Standard</b>, which prints a console line, or <b>Quiet</b>, which only generates
a number and no console command.
For example:

<b>rollD6()</b>

<b>rollQuietD6()</b>

Within these two flavors are the options to perform a single roll or a multi roll:

<b>rollD6()</b> just rolls one

<b>rollD6(5)</b> rolls five d6

To make custom dice rolls you can use this:

Dice dice = new Dice();

dice.roll(5, 2); //rolls 2 5-sided dice

<i>or</i>

dice.roll(5); //if you just want one 5 sided die rolled

I hope this library proves to be effective for you. If you have questions, concerns, comments, 
or want to help me improve my code please contact me at: 5kstudiosar@gmail.com
