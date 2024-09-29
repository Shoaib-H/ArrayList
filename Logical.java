package com.ipl;

import java.util.ArrayList;
import java.util.Scanner;

public class Logical {

	static Scanner sc = new Scanner(System.in);

	static void addDetails() {

		ArrayList<Players> CSK = new ArrayList<Players>();
		CSK.add(new Players("MS Dhoni", 7, 5243, 0, 264));
		CSK.add(new Players("Ruturaj Gaikwad", 31, 2380, 0, 66));
		CSK.add(new Players("Devon Conway", 88, 924, 0, 23));
		CSK.add(new Players("Ajinkya Rahane", 27, 4643, 1, 185));
		CSK.add(new Players("Shaik Rasheed", 66, 0, 0, 0));
		CSK.add(new Players("Sameer Rizvi", 63, 51, 0, 8));
		CSK.add(new Players("Avanish Rao Aravelly", 43, 0, 0, 0));
		CSK.add(new Players("Ravindra Jadeja", 12, 2959, 160, 240));
		CSK.add(new Players("Mitchell Santner", 74, 70, 15, 18));
		CSK.add(new Players("Moeen Ali", 18, 1162, 35, 67));
		CSK.add(new Players("Shivam Dube", 25, 1502, 5, 65));
		CSK.add(new Players("Nishant Sindhu", 21, 0, 0, 0));
		CSK.add(new Players("Richard Gleeson", 82, 2, 1, 2));
		CSK.add(new Players("Rajvardhan Hangargekar", 22, 0, 3, 2));

		ArrayList<Players> MI = new ArrayList<>();
		MI.add(new Players("Rohit Sharma", 45, 5879, 1, 227));
		MI.add(new Players("Ishan Kishan", 18, 1870, 0, 75));
		MI.add(new Players("Suryakumar Yadav", 63, 2644, 0, 123));
		MI.add(new Players("Jasprit Bumrah", 93, 19, 145, 120));
		MI.add(new Players("Kieron Pollard", 55, 3412, 69, 189));

		ArrayList<Players> RCB = new ArrayList<>();
		RCB.add(new Players("Virat Kohli", 18, 6624, 0, 223));
		RCB.add(new Players("Glenn Maxwell", 32, 2319, 28, 110));
		RCB.add(new Players("Faf du Plessis", 18, 3403, 0, 102));
		RCB.add(new Players("Mohammed Siraj", 13, 1, 59, 65));
		RCB.add(new Players("Harshal Patel", 24, 249, 97, 78));

		ArrayList<Players> KKR = new ArrayList<>();
		KKR.add(new Players("Shreyas Iyer", 41, 2776, 0, 101));
		KKR.add(new Players("Andre Russell", 12, 2035, 72, 98));
		KKR.add(new Players("Sunil Narine", 74, 954, 157, 148));
		KKR.add(new Players("Nitish Rana", 27, 2181, 7, 91));
		KKR.add(new Players("Varun Chakravarthy", 29, 22, 61, 44));

		ArrayList<Players> RR = new ArrayList<>();
		RR.add(new Players("Sanju Samson", 8, 3526, 0, 138));
		RR.add(new Players("Jos Buttler", 63, 2831, 0, 80));
		RR.add(new Players("Yashasvi Jaiswal", 23, 727, 0, 23));
		RR.add(new Players("Trent Boult", 18, 53, 92, 75));
		RR.add(new Players("Ravichandran Ashwin", 99, 472, 157, 184));

		ArrayList<Players> DC = new ArrayList<>();
		DC.add(new Players("Rishabh Pant", 17, 2838, 0, 98));
		DC.add(new Players("David Warner", 31, 5881, 0, 162));
		DC.add(new Players("Prithvi Shaw", 100, 1600, 0, 63));
		DC.add(new Players("Anrich Nortje", 88, 5, 43, 30));
		DC.add(new Players("Axar Patel", 20, 1015, 99, 121));

		ArrayList<Players> PBKS = new ArrayList<>();
		PBKS.add(new Players("Shikhar Dhawan", 42, 6244, 0, 203));
		PBKS.add(new Players("Mayank Agarwal", 16, 2327, 0, 113));
		PBKS.add(new Players("Liam Livingstone", 23, 660, 14, 23));
		PBKS.add(new Players("Arshdeep Singh", 9, 19, 40, 37));
		PBKS.add(new Players("Kagiso Rabada", 25, 86, 99, 63));

		ArrayList<Players> SRH = new ArrayList<>();
		SRH.add(new Players("Kane Williamson", 22, 2101, 0, 76));
		SRH.add(new Players("Rahul Tripathi", 52, 1768, 0, 74));
		SRH.add(new Players("Bhuvneshwar Kumar", 15, 131, 154, 146));
		SRH.add(new Players("T Natarajan", 44, 2, 40, 35));
		SRH.add(new Players("Aiden Markram", 4, 442, 0, 18));

		ArrayList<Players> GT = new ArrayList<>();
		GT.add(new Players("Hardik Pandya", 33, 1963, 50, 107));
		GT.add(new Players("Shubman Gill", 77, 1417, 0, 58));
		GT.add(new Players("David Miller", 10, 2455, 0, 105));
		GT.add(new Players("Rashid Khan", 19, 222, 112, 92));
		GT.add(new Players("Mohammed Shami", 11, 54, 99, 93));

		ArrayList<Players> LSG = new ArrayList<>();
		LSG.add(new Players("KL Rahul", 1, 3889, 0, 100));
		LSG.add(new Players("Quinton de Kock", 12, 2764, 0, 80));
		LSG.add(new Players("Deepak Hooda", 5, 1236, 0, 95));
		LSG.add(new Players("Marcus Stoinis", 49, 1008, 34, 67));
		LSG.add(new Players("Avesh Khan", 6, 8, 47, 38));

		while (true) {
			System.out.println("Welcome to IPL Franchise");
			System.out.println();
			System.out.println("Please select an Option given Below :-");
			System.out.println();
			System.out.println("1. Get all Teams");
			System.out.println("2. Get all Batters from a Team");
			System.out.println("3. Get all Bowlers from a Team");
			System.out.println("4. Get all Rounders from a Team");
			System.out.println();
			System.out.println("5. Exit");
			try {

				int option = sc.nextInt();
				switch (option) {

				case 1: {

					System.out.println("1. Chennai Super Kings");
					System.out.println("2. Mumbai Indians");
					System.out.println("3. Royal Challengers Bangalore");
					System.out.println("4. Kolkata Knight Riders");
					System.out.println("5. Rajasthan Royals");
					System.out.println("6. Delhi Capitals");
					System.out.println("7. Punjab Kings");
					System.out.println("8. Sunrisers Hyderabad");
					System.out.println("9. Gujarat Titans");
					System.out.println("10.Lucknow Super Giants");
					System.out.println();
					System.out.println("11. Exit");
					System.out.println();
					System.out.println("To get Players of the Team Enter Your Choice :-");
					int Teams = sc.nextInt();
					switch (Teams) {
					case 1:
						for (Players player : CSK) {
							System.out.println(player);

						}
						break;
					case 2:
						for (Players player : MI) {
							System.out.println(player);
						}
						break;
					case 3:
						for (Players player : RCB) {
							System.out.println(player);
						}
						break;
					case 4:
						for (Players player : KKR) {
							System.out.println(player);
						}
						break;
					case 5:
						for (Players player : RR) {
							System.out.println(player);
						}
						break;
					case 6:
						for (Players player : DC) {
							System.out.println(player);
						}
						break;
					case 7:
						for (Players player : PBKS) {
							System.out.println(player);
						}
						break;
					case 8:
						for (Players player : SRH) {
							System.out.println(player);
						}
						break;
					case 9:
						for (Players player : GT) {
							System.out.println(player);
						}
						break;
					case 10:
						for (Players player : LSG) {
							System.out.println(player);
						}
						break;

					}
					break;

				}
				default: {
					System.out.println("Invalid Option");
				}

				case 2:
					System.out.println("1. Get Batters from CSk");
					System.out.println("2. Get Batters from MI");
					System.out.println("3. Get Batters from RCB");
					System.out.println("4. Get Batters from KKR");
					System.out.println("5. Get Batters from RR");
					System.out.println("6. Get Batters from DC");
					System.out.println("7. Get Batters from PBKS");
					System.out.println("8. Get Batters from SRH");
					System.out.println("9. Get Batters from GT");
					System.out.println("10.Get Batters from LSG");
					System.out.println();
					System.out.println("11. Exit");
					int batters = sc.nextInt();
					switch (batters) {
					case 1:
						for (Players player : CSK) {
							if (player.getRuns() > 700) {
								System.out.println(player);
							}
						}
						break;
					case 2:
						for (Players player : MI) {
							if (player.getRuns() > 700) {
								System.out.println(player);
							}
						}
						break;
					case 3:
						for (Players player : RCB) {
							if (player.getRuns() > 700) {
								System.out.println(player);
							}
						}
						break;
					case 4:
						for (Players player : KKR) {
							if (player.getRuns() > 700) {
								System.out.println(player);
							}
						}
						break;
					case 5:
						for (Players player : RR) {
							if (player.getRuns() > 700) {
								System.out.println(player);
							}
						}
						break;
					case 6:
						for (Players player : DC) {
							if (player.getRuns() > 700) {
								System.out.println(player);
							}
						}
						break;
					case 7:
						for (Players player : PBKS) {
							if (player.getRuns() > 700) {
								System.out.println(player);
							}
						}
						break;
					case 8:
						for (Players player : SRH) {
							if (player.getRuns() > 700) {
								System.out.println(player);
							}
						}
						break;
					case 9:
						for (Players player : GT) {
							if (player.getRuns() > 700) {
								System.out.println(player);
							}
						}
						break;
					case 10:
						for (Players player : LSG) {
							if (player.getRuns() > 700) {
								System.out.println(player);
							}
						}
					case 11:
						if (batters == 11) {
							System.out.println("Exiting to Main Menu...");
							break;
						}
						break;
					default: {
						System.out.println("Invalid Option");
					}

					}
				case 3:
					System.out.println("1. Get Bowlers from CSk");
					System.out.println("2. Get Bowlers from MI");
					System.out.println("3. Get Bowlers from RCB");
					System.out.println("4. Get Bowlers from KKR");
					System.out.println("5. Get Bowlers from RR");
					System.out.println("6. Get Bowlers from DC");
					System.out.println("7. Get Bowlers from PBKS");
					System.out.println("8. Get Bowlers from SRH");
					System.out.println("9. Get Bowlers from GT");
					System.out.println("10.Get Bowlers from LSG");
					System.out.println();
					System.out.println("11. Exit");
					int bowlers = sc.nextInt();
					switch (bowlers) {
					case 1:
						for (Players player : CSK) {
							if (player.getRuns() < 300) {
								System.out.println(player);
							}
						}
						break;
					case 2:
						for (Players player : MI) {
							if (player.getRuns() < 300) {
								System.out.println(player);
							}
						}
						break;
					case 3:
						for (Players player : RCB) {
							if (player.getRuns() < 300) {
								System.out.println(player);
							}
						}
						break;
					case 4:
						for (Players player : KKR) {
							if (player.getRuns() < 300) {
								System.out.println(player);
							}
						}
						break;
					case 5:
						for (Players player : RR) {
							if (player.getRuns() < 300) {
								System.out.println(player);
							}
						}
						break;
					case 6:
						for (Players player : DC) {
							if (player.getRuns() < 300) {
								System.out.println(player);
							}
						}
						break;
					case 7:
						for (Players player : PBKS) {
							if (player.getRuns() < 300) {
								System.out.println(player);
							}
						}
						break;
					case 8:
						for (Players player : SRH) {
							if (player.getRuns() < 300) {
								System.out.println(player);
							}
						}
						break;
					case 9:
						for (Players player : GT) {
							if (player.getRuns() < 300) {
								System.out.println(player);
							}
						}
						break;
					case 10:
						for (Players player : LSG) {
							if (player.getRuns() < 300) {
								System.out.println(player);
							}
						}
					case 11:
						if (bowlers == 11) {
							break;
						}
						break;
					default: {
						System.out.println("Invalid Option");
					}
					}
				case 4:
					System.out.println("1. Get all Rounders from CSk");
					System.out.println("2. Get all Rounders from MI");
					System.out.println("3. Get all Rounders from RCB");
					System.out.println("4. Get all Rounders from KKR");
					System.out.println("5. Get all Rounders from RR");
					System.out.println("6. Get all Rounders from DC");
					System.out.println("7. Get all Rounders from PBKS");
					System.out.println("8. Get all Rounders from SRH");
					System.out.println("9. Get all Rounders from GT");
					System.out.println("10.Get all Rounders from LSG");
					System.out.println();
					System.out.println("11. Exit");
					int allRounders = sc.nextInt();
					switch (allRounders) {
					case 1:
						for (Players player : CSK) {
							if (player.getRuns() > 700 && player.getWickets() > 5) {
								System.out.println(player);
							}
						}
						break;
					case 2:
						for (Players player : MI) {
							if (player.getRuns() > 700 && player.getWickets() > 5) {
								System.out.println(player);
							}
						}
						break;
					case 3:
						for (Players player : RCB) {
							if (player.getRuns() > 700 && player.getWickets() > 5) {
								System.out.println(player);
							}
						}
						break;
					case 4:
						for (Players player : KKR) {
							if (player.getRuns() > 700 && player.getWickets() > 5) {
								System.out.println(player);
							}
						}
						break;
					case 5:
						for (Players player : RR) {
							if (player.getRuns() > 700 && player.getWickets() > 5) {
								System.out.println(player);
							}
						}
						break;
					case 6:
						for (Players player : DC) {
							if (player.getRuns() > 700 && player.getWickets() > 5) {
								System.out.println(player);
							}
						}
						break;
					case 7:
						for (Players player : PBKS) {
							if (player.getRuns() > 700 && player.getWickets() > 5) {
								System.out.println(player);
							}
						}
						break;
					case 8:
						for (Players player : SRH) {
							if (player.getRuns() > 700 && player.getWickets() > 5) {
								System.out.println(player);
							}
						}
						break;
					case 9:
						for (Players player : GT) {
							if (player.getRuns() > 700 && player.getWickets() > 5) {
								System.out.println(player);
							}
						}
						break;
					case 10:
						for (Players player : LSG) {
							if (player.getRuns() > 700 && player.getWickets() > 5) {
								System.out.println(player);
							}
						}

						break;
					case 11:
						System.out.println("Thank You for using Our Servise");
						System.out.println("Exiting to Main Menu...");
						break;
					default: {
						System.out.println("Invalid Option");
					}
					}
					if (allRounders == 11) {
						break;
					}
				case 5:
					System.out
							.println("Thank You For Using Our Service. Hope you liked It. Don't forget to Rate Us!!!");
					return;
				}
				if (option == 5) {
					return;
				}
			} catch (Exception e) {
				System.out.println("Kindly Enter an Integer Value");
				e.printStackTrace();
				return;
			}
		}
	}
}
