Traffic Invader
Authors: Karan Dalal, Eric Decasper, Vikram Penumarti
Revision: 4/27/2021


Introduction: 
[In a few paragraphs totaling about ½ page, introduce the high-level concept of your program. What this looks like depends a lot on what type of thing you are making. An introduction for an application will look different than one for a game. In general, your introduction should address questions like these:


What does your program do?


Our program is an endless game where the player is a car dodging through traffic while the screen scrolls down. The program moves the screen down while the player navigates through traffic that increases in speed and quantity as time passes. It also keeps score as a function of time.[a]


What Problem Does it Solve? Why did you Write it?


We wrote our program to provide a fun, catchy game to play while bored. Our game was formed through the idea of a game where a player can play for as long as they want, but also be challenged with constant obstacles and increasing difficulty.


What is the story?


It’s every child’s, any maybe even some adult’s, dream to go fast. To achieve the adrenaline that comes with high thrill speeds. However, in our current world, this is simply impossible – in fact, extremely dangerous to attempt on normal interstates and highways. We created this game to allow people to achieve the thrill of swerving in and out of traffic at high speeds, just as they see on their favorite racing channels, such as F1. 


What are the rules? What is the goal?


In short, you are a car that has to navigate the busy interstate – swearing and weaving your way through traffic. If you make contact with another object / vehicle, the game is ended. Your goal is to “live as long as you can” and achieve the highest score possible. 






Who would want to use your program?


Our program is rated “E for everyone” meaning that anyone can use our game. Many people may want to use our program – from adults who are frustrated with their commute to children who want the thrill of the ride, Traffic Invader is made for all.


Instructions:


Explain how to use the program. This needs to be specific: 


Which keyboard keys will do what? 


The left and right arrow keys will be used to navigate the car left and right in order to swerve through traffic.


Where will you need to click? 


In order to start the game, you must click the start button. Once the game is over, you have the option to rerun the game or return to the main menu.


Will you have menus that need to be navigated? What will they look like? 


The main menu will be the first screen to navigate too. It will have buttons to play the game, and also display the overall high score. If achievable, we will include options to customize car colors and set powerups.[b][c]


Do actions need to be taken in a certain order?


Our user interface will be very simple and easy to navigate. In order to start the game, a user would launch the program and click the start button.


Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):
Must-have Features:
[These are features that we agree you will definitely have by the project due date. A good final project would have all of these completed. At least 5 are required. Each feature should be fully described (at least a few full sentences for each)]
* High Score: This must-have feature displays a scoreboard with the highest score in the current program session. This means that the high score is reset every time the program is run.
* Main Game Screen: This is the main game screen where users (players) navigate through traffic. This feature encompasses the display element of the game.
* Pause/Restart: This must have feature allows users to pause in the middle of their game and even restart without having to return to the main menu.
* Infinite Obstacle Generation: We would like the game to continue on forever. This feature will implement infinite obstacle generation so that the user never reaches a certain “end” to the game. Instead, their goal is to get the highest score.
* Power Ups: To add some more “pizzazz” to our game, we would add additional power ups which can be picked up on the interstate. Some examples include score boosts, shields from obstacles, and increased speed.
* Initial Menu: We would like to implement a separate, modern initial menu to display game options to customize and run the game.
* Life System: In order to add a little flair into our game, we would like to implement a life system based on how many collisions you can take and an invulnerability period after a certain collision.


Want-to-have Features:[d]
[These are features that you would like to have by the project due date, but you’re unsure whether you’ll hit all of them. A good final project would have perhaps half of these completed. At least 5 are required. Again, fully describe each.]
* Music: This stretch feature would involve the addition of music, with multiple channels, into our game.
* Animations: In order to make the game more entertaining the addition of collision and spin of animations would do a lot to make the game look more fluid.
* The ability to use your mouse. The ability to use your mouse to control the car as a different means of movement.
* Different “skins” for the car that you are driving. Not just solid colors but patterns and different images.
* Different types of cars with different traits. For example you may be able to select a sports car or a semi truck that have different speeds and health.


Stretch Features:
[These are features that we agree a fully complete version of this program would have, but that you probably will not have time to implement. A good final project does not necessarily need to have any of these completed at all. At least 3 are required. Again, fully describe each.]
* Online high score list: Our game is competitive by nature, and in order to increase our competitiveness, we wanted to create an online high score list that can be viewed by any player from anywhere. This online high score list will store the top 10 scores ever achieved in our game, and encourage users to beat them.
* Different POV: A different birds eye view that is 3D where you can see more specifics of the oncoming cars perhaps the people driving it even.
* 2 players: A way to compete with other plays online with the same obstacles with the person who last the longest being the winner.










Class List:
[This section lists the Java classes that make up the program and very briefly describes what each represents. It’s totally fine to put this section in list format and not to use full sentences.]


Game.java: Extends PApplet. Runs the main game loop. 
Car.java: Represents the incoming cars or obstacles.


Player.java: Represents the player – a.k.a a car.
Entity.java: The superclass of Car and Player.


BackGroundManager.java: Manages variety of backgrounds. Picks and displays them.
BackGround.java: Superclass of all backgrounds
NormalRoad.java: Default background of program
DoubleRoad.java Same as NormalRoad, except has two lane dividers
Sound.java : Handles music and sound elements


Credits:
Eric Decasper: 
MainMenu.java: the main menu screen,
Car.java: Represents the incoming cars or obstacles.
Player.java: Represents the player also a car.
Entity.java: The superclass of Car and Player.

Karan Dalal: 
Game.java: Extends PApplet. Has the main game loop.
Runner.java: runs the program.
 
Vikram:
BackGroundManager.java: manages backgrounds. Picks and displayed them
BackGround.java: Superclass of all backgrounds
NormalRoad.java: default background.
DoubleRoad.java: Same as NormalRoad, except has two lane dividers
Screen.java: the superclass of all screens




[a]I saw this was stated later on, but I think it would also be worth mentioning that the game can be replayed here as well.
[b]Can you pause this game?
[c]You might need to talk about the menu screen somewhere also if you include it in the must-have features
[d]I was wondering what feature customization would be a part of since you talked about it up above but I don't see it on the list