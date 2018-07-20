package assessment;

import java.util.Scanner;


public class Game {
	
	private Player mainCharacter;
	private Scanner sc = new Scanner(System.in);
	private boolean gameFinish = false;
	private Feature current; //shortcut for the current feature
	private Feature[] landmarks = {
			new Feature("Cave","A hole in the ground.\r\n Surely the end is not inside?"),
			new Feature("Barren", "Grey foggy clouds float oppressively close to you,\r\n" + 
					"reflected in the murky grey water which reaches up your\r\n" + 
					"shins."),
			new Feature("Ancient Tree", "An old willow tree\r\n" + "Legend has it, treasures are behind it"),
			new Feature("Japan", "Land of the sun" + "\n and anime, lots of anime"),
			new Feature("Hell", "How did you even arrive here" + "\n its very hot")
			}; //array used to store existing places, originally planned to use random integers to allow
			   //random access to different landmarks
	private Dial dial = new Dial();
	
	public Game() {
	
	}
	
	public void begin() { //a tutourial
		current = landmarks[1];
		dial.setDial();
		System.out.println("You awaken to an alarm on your magic compass");
		character();
		System.out.println("Try 'look' to get a grasp of where you are");
		String choice = "";
		while(choice != "look") {
			choice = sc.next();
			if(choice.equals("look")) {
				look(current);
				break;
			}
			else {
				System.out.println("type look");
			}
		}
		System.out.println("There is something in your hand \n type inspect to see what it is");
		while(choice!="inspect") {
			choice = sc.next();
			if(optionSelected(choice, "inspect")) {
				System.out.println(dial.getDesc());
				dial.getNearest();
				break;
			}
		}
	}
	
	public void adventure() { //the game
		System.out.println("What will you do? Type North, East, South or West to travel");
		String toDo = sc.next();
		optionSelected(toDo);
	}
	
	
	public void character() {
		boolean notFinished = true;
		while(notFinished) {
			System.out.println("What is your name :");
			String name = sc.nextLine();
			System.out.println("How old are you");
			int age = sc.nextInt();
			mainCharacter = new Player(name, age);
			System.out.println(name + " and " + age + " years old ?");
			System.out.println("Type Y for yes and N for No ");
			String choice = sc.next();
			notFinished = ynchecker(choice);
		}
	}
	
	public boolean ynchecker(String choice) {
		if(choice == "Y" || choice == "y") {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean optionSelected(String choice, String expected) {
		if(choice.equals(expected)) {
			return true;
		}
		else {
			System.out.println("Type " + expected);
			return false;
		}
	}
	
	public void optionSelected(String choice) {
		if(choice.equals("look")) {
			System.out.println(current.getDesc());
		}
		else if(choice.equals("inspect")){
			dial.getNearest();
		}
		else if(choice.equals("north")) {
			current = landmarks[2];
			System.out.println(current.getName());
			if(mainCharacter.getName().equals("Jesus")) {
				System.out.println("You are able to see the magical door \n you are home.");
				gameFinish = true;
			}
		}
		else if(choice.equals("west")) {
			System.out.println("You travel West so you meet Kanye West.");
			if(mainCharacter.getAge() > 18 && mainCharacter.getAge() < 25) {
				System.out.println("You are a fan of Yeezus therefore he saved you");
				gameFinish = true;
			}
			else {
				System.out.println("You do not know who Kanye West is so you go further");
			}
		}
		else if(choice.equals("east")) {
			current = landmarks[3];
			System.out.println(current.getName());
			
		}
		else if(choice.equals("south")) {
			current = landmarks[4];
			System.out.println(current.getName());
			if(mainCharacter.getName().equals("Lucifer")) {
				System.out.println("You are home");
				gameFinish = true;
			}
		}
		else {
			System.out.println("Command not recognised");
		}
	}
	
	
	public Player getPlayer() {
		return mainCharacter;
	}
	
	public void look(Feature current) {
		System.out.println("Looks like the " + current.getName());
		System.out.println(current.getDesc());
	}
	
	public boolean gameState() {
		return gameFinish;
	}
}
