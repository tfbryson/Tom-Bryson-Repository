package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

		/*
		 * 1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
		 * the branch?
		 */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println(remainingNumberOfBirds);
		/*
		 * 2. There are 6 birds and 3 nests. How many more birds are there than nests?
		 */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);
		/*
		 * 3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How many
		 * raccoons are left in the woods?
		 */

		int racoonsPlaying = 3;
		int racoonsLeaving = 2;
		int racoonsRemaining = racoonsPlaying - racoonsLeaving;
		System.out.println(racoonsRemaining);

		/*
		 * 4. There are 5 flowers and 3 bees. How many less bees than flowers?
		 */
		int flowers = 5;
		int bees = 3;
		int beesLessFlowers = flowers - bees;
		System.out.println(beesLessFlowers);
		/*
		 * 5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
		 * breadcrumbs, too. How many pigeons are eating breadcrumbs now?
		 */
		int lonleyPigeon = 1;
		int hungryPigeon = 1;
		int totalPigeons = lonleyPigeon + hungryPigeon;
		System.out.println(totalPigeons);
		/*
		 * 6. 3 owls were sitting on the fence. 2 more owls joined them. How many owls
		 * are on the fence now?
		 */
		int sittingOwls = 3;
		int newOwls = 2;
		int totalOwlsOnFence = sittingOwls + newOwls;
		System.out.println(totalOwlsOnFence);

		/*
		 * 7. 2 beavers were working on their home. 1 went for a swim. How many beavers
		 * are still working on their home?
		 */
		int beaversHomeBuilding = 2;
		int wentForSwimBeaver = 1;
		int remainingBeaver = beaversHomeBuilding - wentForSwimBeaver;
		System.out.println(remainingBeaver);

		/*
		 * 8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How many
		 * toucans in all?
		 */
		int toucansSitting = 2;
		int toucanJoins = 1;
		int totalToucans = toucansSitting + toucanJoins;
		System.out.println(totalToucans);
		/*
		 * 9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels are
		 * there than nuts?
		 */
		int totalSquirrel = 4;
		int totalNuts = 2;
		int squirrelVNutRatio = totalSquirrel - totalNuts;
		System.out.println(squirrelVNutRatio);

		/*
		 * 10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did she
		 * find?
		 */
		double quarter = 0.25;
		double oneDime = 0.10;
		double twoNickel = 0.10;
		double totalMoney = quarter + oneDime + twoNickel;
		System.out.println(totalMoney);
		/*
		 * 11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
		 * class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and Mrs.
		 * Flannery's class bakes 17 muffins. How many muffins does first grade bake in
		 * all?
		 */
		int classBrier = 18;
		int classMacadams = 20;
		int classFlannery = 17;
		int totalMuffinsBaked = classBrier + classMacadams + classFlannery;
		System.out.println(totalMuffinsBaked);
		/*
		 * 12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How much
		 * did she spend in all for the two toys?
		 */
		double yoyo = 0.24;
		double whistle = 0.14;
		double totalForToys = yoyo + whistle;
		System.out.println(totalForToys);
		/*
		 * 13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows and
		 * 10 mini marshmallows.How many marshmallows did she use altogether?
		 */
		int lrgMarshmellow = 8;
		int smlMarshmellow = 10;
		int totalMarshmellows = lrgMarshmellow + smlMarshmellow;
		System.out.println(totalMarshmellows);
		/*
		 * 14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
		 * Elementary School received 17 inches of snow. How much more snow did Mrs.
		 * Hilt's house have?
		 */
		int houseHiltInch = 29;
		int schoolBrecknockInch = 17;
		int differenceInSnowFall = houseHiltInch - schoolBrecknockInch;
		System.out.println(differenceInSnowFall);
		/*
		 * 15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil case.
		 * How much money does she have left?
		 */
		int startMoney = 10;
		int toyTruck = 3;
		int pencilCase = 2;
		int moneyRemaining = startMoney - toyTruck - pencilCase;
		System.out.println(moneyRemaining);

		/*
		 * 16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
		 * marbles does he have now?
		 */
		int startingMarbles = 16;
		int lostMarbles = 7;
		int totalMarbles = startingMarbles - lostMarbles;
		System.out.println(totalMarbles);
		/*
		 * 17. Megan has 19 seashells. How many more seashells does she need to find to
		 * have 25 seashells in her collection?
		 */
		int currentShells = 19;
		int desiredShells = 25;
		int needToFindShells = desiredShells - currentShells;
		System.out.println(needToFindShells);
		/*
		 * 18. Brad has 17 balloons. 8 balloons are red and the rest are green. How many
		 * green balloons does Brad have?
		 */
		int bradsBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = bradsBalloons - redBalloons;
		System.out.println(greenBalloons);
		/*
		 * 19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
		 * How many books are on the shelf now?
		 */
		int currentBooksOnShelf = 38;
		int addedBooksOnShelf = 10;
		int totalBooksOnShelf = currentBooksOnShelf + addedBooksOnShelf;
		System.out.println(totalBooksOnShelf);
		/*
		 * 20. A bee has 6 legs. How many legs do 8 bees have?
		 */
		int singleBeeLegs = 6;
		int beesNeededForQuestion = 8;
		int totalBeeLegs = singleBeeLegs * beesNeededForQuestion;
		System.out.println(totalBeeLegs);
		/*
		 * 21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
		 * cream cones cost?
		 */
		double iceCreamCone = 0.99;
		double twoConeCost = iceCreamCone + iceCreamCone;
		System.out.println(twoConeCost);
		/*
		 * 22. Mrs. Hilt wants to make a border around her garden. She needs 125 rocks
		 * to complete the border. She has 64 rocks. How many more rocks does she need
		 * to complete the border?
		 */
		int rocksNeeded = 125;
		int rocksOnHand = 64;
		int rocksToCompleteJob = rocksNeeded - rocksOnHand;
		System.out.println(rocksToCompleteJob);
		/*
		 * 23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does she
		 * have left?
		 */
		int originalMarbles = 38;
		int marblesLost = 15;
		int currentMarbleCount = originalMarbles - marblesLost;
		System.out.println(currentMarbleCount);
		/*
		 * 24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
		 * miles and then stopped for gas. How many miles did they have left to drive?
		 */
		int concertDistance = 78;
		int milesDriven = 32;
		int milesRemaining = concertDistance - milesDriven;
		System.out.println(milesRemaining);
		/*
		 * 25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday morning
		 * and 45 minutes shoveling snow on Saturday afternoon. How much total time did
		 * she spend shoveling snow?
		 */
		double morning = 1.50;
		double afternoon = 0.75;
		double totalTimeShoveling = morning + afternoon;
		System.out.println(totalTimeShoveling);
		/*
		 * 26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much money
		 * did she pay for all of the hot dogs?
		 */
		int purchasedHotDogs = 6;
		int twoHotDogs = 1;
		int totalHotDogCost = purchasedHotDogs * twoHotDogs;
		System.out.println(totalHotDogCost);

		/*
		 * 27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can she
		 * buy with the money she has?
		 */
			double hiltMoney = 0.50;
			double pencilCost = 0.07;
			double pencilsThatCanBePurchased = hiltMoney / pencilCost;
			System.out.println(pencilsThatCanBePurchased);
		/*
		 * 28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
		 * were orange. If 20 of the butterflies were orange, how many of them were red?
		 */
		int butterfliesSeen = 33;
		int orangeButterFlies = 20;
		int redButterFlies = butterfliesSeen - orangeButterFlies;
		System.out.println(redButterFlies);

		/*
		 * 29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
		 * should Kate get back?
		 */
		int moneyGiven = 1;
		double candyCost = 0.54;
		double moneyReceived = moneyGiven - candyCost;
		System.out.println(moneyReceived);
		/*
		 * 30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
		 * will he have?
		 */
		int treesOnHand = 13;
		int treesToPlant = 12;
		int totalTrees = treesOnHand + treesToPlant;
		System.out.println(totalTrees);
		/*
		 * 31. Joy will see her grandma in two days. How many hours until she sees her?
		 */
		int hoursInDay = 24;
		int daysTilVisit = 2;
		int totalHours = hoursInDay * daysTilVisit;
		System.out.println(totalHours);
		/*
		 * 32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How much
		 * gum will she need?
		 */
		int totalCousin = 4;
		int gumToDistribute = 5;
		int totalPiecesNeeded = totalCousin * gumToDistribute;
		System.out.println(totalPiecesNeeded);
		/*
		 * 33. Dan has $3.00. He bought a candy bar for $1.00. How much money is left?
		 */
		int danMoney = 3;
		int candyBar = 1;
		int moneyLeft = danMoney - candyBar;
		System.out.println(moneyLeft);
		/*
		 * 34. 5 boats are in the lake. Each boat has 3 people. How many people are on
		 * boats in the lake?
		 */
		int boatsInLake = 5;
		int peopleOnBoats = 3; 
		int totalPeopleOnBoats = boatsInLake * peopleOnBoats;
		System.out.println(totalPeopleOnBoats);
		/*
		 * 35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
		 * have now?
		 */
		int legosHad = 380;
		int legosLost = 57;
		int legosRemaining = legosHad - legosLost;
		System.out.println(legosRemaining);
		/*
		 * 36. Arthur baked 35 muffins. How many more muffins does Arthur have to bake
		 * to have 83 muffins?
		 */
		int muffinsBaked = 35;
		int muffinsDesired = 83;
		int muffinsRemaining = muffinsDesired - muffinsBaked;
		System.out.println(muffinsRemaining);
		/*
		 * 37. Willy has 1400 crayons. Lucy has 290 crayons. How many more crayons does
		 * Willy have then Lucy?
		 */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int differenceInCrayons = willyCrayons - lucyCrayons;
		System.out.println(differenceInCrayons);
		/*
		 * 38. There are 10 stickers on a page. If you have 22 pages of stickers, how
		 * many stickers do you have?
		 */
		int stickersPerPage = 10; 
		int pagesOfStickers = 22;
		int totalStickers = stickersPerPage * pagesOfStickers;
		System.out.println(totalStickers);
		/*
		 * 39. There are 96 cupcakes for 8 children to share. How much will each person
		 * get if they share the cupcakes equally?
		 */
		int cupcakesAvailable = 96;
		int childrenPresent = 8;
		int amountPerChild = cupcakesAvailable / childrenPresent;
		System.out.println(amountPerChild);
		/*
		 * 40. She made 47 gingerbread cookies which she will distribute equally in tiny
		 * glass jars. If each jar is to contain six cookies each, how many cookies will
		 * not be placed in a jar?
		 */
		int cookiesMade = 47;
		int jarsOnHand = 6;
		int cookiesNotInJars = cookiesMade % jarsOnHand;
		System.out.println(cookiesNotInJars);
		/*
		 * 41. She also prepared 59 croissants which she plans to give to her 8
		 * neighbors. If each neighbor received and equal number of croissants, how many
		 * will be left with Marian?
		 */
		int croissantPrepared = 59;
		int neighborsToReceive = 8;
		int croissantRemaining = croissantPrepared % neighborsToReceive;
		System.out.println(croissantRemaining);
		/*
		 * 42. Marian also baked oatmeal cookies for her classmates. If she can place 12
		 * cookies on a tray at a time, how many trays will she need to prepare 276
		 * oatmeal cookies at a time?
		 */
		int oatmealCookiesPerTray = 12;
		int oatmealCookiesPrepared = 276;
		int traysNeeded = oatmealCookiesPrepared / oatmealCookiesPerTray;
		System.out.println(traysNeeded);
		/*
		 * 43. Marian’s friends were coming over that afternoon so she made 480
		 * bite-sized pretzels. If one serving is equal to 12 pretzels, how many
		 * servings of bite-sized pretzels was Marian able to prepare?
		 */
		int pretzelsPrepared = 480;
		int servingSize = 12;
		int totalServings = pretzelsPrepared / servingSize; 
		System.out.println(totalServings);
		/*
		 * 44. Lastly, she baked 53 lemon cupcakes for the children living in the city
		 * orphanage. If two lemon cupcakes were left at home, how many boxes with 3
		 * lemon cupcakes each were given away?
		 */
		int cupcakesBaked = 53;
		int cupcakesForgotton = 2;
		int cakesPerBox = 3;
		int cupcakesRemaining = cupcakesBaked - cupcakesForgotton;
		int totalBoxes = cupcakesRemaining / cakesPerBox;
		System.out.println(totalBoxes);
		
		
		/*
		 * 45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots were
		 * served equally to 12 people, how many carrot sticks were left uneaten?
		 */
		int sticksPrepared = 74;
		int servedPeople = 12;
		int sticksUneaten = sticksPrepared / servedPeople;
		System.out.println(sticksUneaten);
		/*
		 * 46. Susie and her sister gathered all 98 of their teddy bears and placed them
		 * on the shelves in their bedroom. If every shelf can carry a maximum of 7
		 * teddy bears, how many shelves will be filled?
		 */
		int teddyBearTotal = 98;
		int shelfsAvailable = 7;
		int shelvesFilled = teddyBearTotal / shelfsAvailable;
		System.out.println(shelvesFilled);
		/*
		 * 47. Susie’s mother collected all family pictures and wanted to place all of
		 * them in an album. If an album can contain 20 pictures, how many albums will
		 * she need if there are 480 pictures?
		 */
		int totalPictures = 480;
		int albumMax = 20;
		int albumsRequired = totalPictures / albumMax;
		System.out.println(albumsRequired);
		

		/*
		 * 48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
		 * room and placed them in boxes. If a full box can hold a maximum of 8 cards,
		 * how many boxes were filled and how many cards are there in the unfilled box?
		 */
		int totalTradingCard = 94;
		int boxMaxVolume = 8;
		int boxesUnfilled = totalTradingCard % boxMaxVolume;
		System.out.println(boxesUnfilled);
		
		/*
		 * 49. Susie’s father repaired the bookshelves in the reading room. If he has
		 * 210 books to be distributed equally on the 10 shelves he repaired, how many
		 * books will each shelf contain?
		 */
		int booksOnHand = 210;
		int shelvesRepaired = 10;
		int volumePerShelf = booksOnHand / shelvesRepaired;
		System.out.println(volumePerShelf);
		/*
		 * 50. Cristina baked 17 croissants. If she planned to serve this equally to her
		 * seven guests, how many will each have?
		 */
		int croissantsBaked = 17;
		int guestsToServe = 7;
		int totalNumberOfServings = croissantsBaked / guestsToServe;
		System.out.println(totalNumberOfServings);

		/*
		 * CHALLENGE PROBLEMS
		 */
		
		/*
		 * Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15
		 * hours, while Jill averages 1.90 hours. How long will it take the two painter
		 * working together to paint 5 12 x 14 rooms? Hint: Calculate the hourly rate
		 * for each painter, combine them, and then divide the total walls in feet by
		 * the combined hourly rate of the painters. Challenge: How many days will it
		 * take the pair to paint 623 rooms assuming they work 8 hours a day?.
		 */
		
		double painterBillPaintRate = 2.15;
		int painterBillRoomSize = 52;
		double painterBillProductionRate =  painterBillRoomSize / painterBillPaintRate;
		System.out.println(painterBillProductionRate); 
		
		double painterJillPaintRate = 1.90;
		int painterJillRoomSize = 52;
		double painterJillProductionRate =  painterJillRoomSize / painterJillPaintRate;
		System.out.println(painterJillProductionRate);
		
		double dualPainterProductionRate= painterBillProductionRate + painterJillProductionRate;
		System.out.println(dualPainterProductionRate);
		
		int singleRoomSizeFt = 52;
		int fiveRoomsFt = singleRoomSizeFt * 5;
		System.out.println(fiveRoomsFt);
		
		double totalPaintTimeFiveRooms = fiveRoomsFt / dualPainterProductionRate;
		System.out.println(totalPaintTimeFiveRooms);
		
		int moreRooms = 623;
		double paintTimePerDay = 8.0;
		int totalBuildingFeet = moreRooms * singleRoomSizeFt;
		System.out.println(totalBuildingFeet);
		
		double totalBuildingPaintTime = totalBuildingFeet / paintTimePerDay;
		System.out.println(totalBuildingPaintTime);
				
		/*
		 * Create and assign variables to hold your first name, last name, and middle
		 * initial. Using concatenation, build an additional variable to hold your full
		 * name in the order of last name, first name, middle initial. The last and
		 * first names should be separated by a comma followed by a space, and the
		 * middle initial must end with a period. Example: "Hopper, Grace B."
		 */
		
		String firstName = "Tom";
		String lastName = "Bryson";
		String middleInitial = "F";
		String combinedName = lastName + ", " + firstName + " " + middleInitial +".";
		System.out.println(combinedName);

		/*
		 * The distance between New York and Chicago is 800 miles, and the train has
		 * already travelled 537 miles. What percentage of the trip has been completed?
		 * Hint: The percent completed is the miles already travelled divided by the
		 * total miles. Challenge: Display as an integer value between 0 and 100 using
		 * casts.
		 */

		double distanceBetweenCities = 0.800;
		double distanceTraveled = 0.537;  
		double percentOfTripComplete = distanceTraveled / distanceBetweenCities;
		System.out.println(percentOfTripComplete); 
		
		byte attemptOne = 5; 
		byte attemptTwo = 10;
		
		int challengeSolutionAttempt = attemptOne + attemptTwo; // 
		
		byte secondChallengeAttempt = (byte) (attemptOne + attemptTwo);
		System.out.println(challengeSolutionAttempt);
		
		  
		
		
	}

}
