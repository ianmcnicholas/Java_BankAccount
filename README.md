# Java_BankAccount
## This is my first attempt at coding in Java!

This is a simple BankAccount program that has been developed using basic TDD.

At present, the program allows the user to create a bank account, depsoit and withdraw from the account, with each of these actions creating appropriate transactional information.  If the user attempts to withdraw or deposit a ZERO or NEGATIVE amount, an error is triggered (and handled), along with if the user tries to withdraw more $$$ than they have!

The next stages of the project would be as follows:
* Create a Printer class that would handle the printing of statements.
* Look into mocking within the testing suite to allow testing in isolation.
* Revise dependancy injection and encapsulation as the program currently has not been created with these in mind.
