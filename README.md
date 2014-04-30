Writing an desktop application that will help me track my workouts and lifestyle. 
I'm mainly doing this for my own personal use and also to practice my programming skills.


April 28th, 2014
----------------
	- Have successfully connected the application to a database using the JDBC Driver.
	- Successfully able to create a new user.
		- Makes sure that passwords match before creating user.
		
April 29th, 2014
----------------
	- Successfully creates new user if the person is registering for the first time
		-- Checks if the person has not previously registered by retrieving the first name
		and last names of all the previously registered users from the database and 
		checks if they match with the text that is entered in the application.
		-- Also, makes sure that the "username" that the person chooses has not been used
		before. If it does, it tells the user to choose a different username.
