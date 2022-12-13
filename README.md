SportsTeam superclass

1. Create a class called SportsTeam.  This class should include 5 instance variables :a String representing the Team’s name, an int representing the number of games played, an int representing the games won and an int representing the games lost and an int representing the number of ties.
 
2. Write two different constructors for this class.  The first constructor should have a single parameter representing the team name and all other instance variables should be initialized to zero.  The second constructor should have 5 parameters representing a value to initialize each of the instance variables to.

3. Within the SportsTeam class write a method called getWinningPercentage().  This method should return an int representing the percentage of games won.

4. Within the SportsTeam class write five separate "getters" that allow access to the class instance variables.

5. Within the SportsTeam class, write a void method called playGame() that takes a String as a parameter.  A "W" should increment the games won, an "L" should increment the games lost and any other String should increment the games tied.

6. Within the SportsTeam class write a toString() method that returns a String with all of the stats for a team.

For the remainder of the worksheet you will be defining two classes: Football and Baseball, that inherit from the SportsTeam class. The diagram below illustrates this relationship.
![alt text](https://github.com/fators22/SportsTeam/blob/master/src/main/java/Inherit.png)

Important concepts regarding inheritance.
·             A subclass can add new private instance variables.s
·             A subclass can add new public or private methods.
·             A subclass can override (redefine) inherited methods.
·             A subclass must define its own constructors.
·             A subclass cannot directly access the private members of its superclass.


Football subclass
7. Create a subclass called Football which extends the SportsTeam class.  This class should include 2 instance variables which represent the number of touchdowns and and the number of interceptions.

8. Write two different constructors for this class.  The first constructor should have a single parameter representing the team name and all other instance variables should be initialized to zero.  The second constructor should have 7 parameters representing a value to initialize each of the instance variables to.

9. Within the Football class write a method called touchDownsPerGame() which returns a double representing the number of touchdowns per game.

10. Within the Football class write a method called interceptionsPerGame() which returns a double representing the number of interceptions per game.

11. Within the Football class write a toString() method which overrides the parent toString() method in the SportsTeam class.  This toString() method should return a String which includes all of the stats for a Football team. (hint: this means the Football class should inherit information from the SportsTeam class)



Baseball subclass
12. Create a subclass called Baseball which extends the SportsTeam class.  This class should include 3 instance variables which represent the number of homeruns, the number of RBI's and the number of errors.

13. Write two different constructors for this class.  The first constructor should have a single parameter representing the team name and all other instance variables should be initialized to zero.  The second constructor should have 8 parameters representing a value to initialize each of the instance variables to.

14. Within the Baseball class write a method called homeRunsPerGame() which returns a double representing the number of homeruns per game.

15. Within the Baseball class write a method called rbisPerGame() which returns a double representing the number of RBI's per game.

16. Within the Baseball class write a method called errorsPerGame() which returns a double representing the number of errors per game.

17. Within the Baseball class write a toString() method which overrides the parent toString() method in the SportsTeam class.  This toString() method should return a String which includes all of the stats for a Baseball team. (hint: this means the Baseball class should inherit information from the SportsTeam class)


Runner class

18. Create a class called MainSports.  Use the source code below and copy and paste it into this class.  If your other classes are structured appropriately this main method should print the following information about the two Sports teams below:

![alt text](https://github.com/fators22/SportsTeam/blob/master/src/main/java/BCTS.png) 3 Wins, 4 Losses, 0 Ties, 3 Touchdowns, 1 Interceptions

![alt text](https://github.com/fators22/SportsTeam/blob/master/src/main/java/PCTS.png)16 Wins, 7 Losses, 0 Ties, 7 Homeruns, 33 RBI's, 64 Errors





