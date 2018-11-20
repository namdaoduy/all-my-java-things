package main;

import java.io.Console;

public class KhaLaChacKeo {

	public static final int numberOfPlayers = 4;
	public static final int numberOfDices = 4;
	public static final int winPoint = 21;
	private static Dice[] dice = new Dice[numberOfDices];
	private static Player[] player = new Player[numberOfPlayers];
	private static Judge judge;
	
	/**
	 * Initial Dices
	 */
	public static void initDices() {
		for (int i = 0; i < numberOfDices; i++) {
			setDiceById(i, new Dice(i+1));
		}
	}
	
	/**
	 * Initial Players
	 */
	public static void initPlayers(int numberOfRealPlayers) {
		for (int i = 0; i < numberOfRealPlayers; i++) {
			setPlayerById(i, new Player());
		}
		for (int i = numberOfRealPlayers; i < numberOfPlayers; i++) {
			setPlayerById(i, new NPC());
		}
	}
	
	/**
	 * Initial Judge
	 */
	public static void initJudge() {
		setJudge(new Judge());
	}
	
	public static void main(String[] args) {
		System.out.println("Kha la chac keo");
		initDices();
		initJudge();
		Console console = System.console();
		String i = console.readLine("Enter input:");
		System.out.println(i);
	}
	
	public static Player getDiceById(int i) {
		return player[i];
	}

	public static void setDiceById(int id, Dice c) {
		dice[id] = c;
	}

	public static Judge getJudge() {
		return judge;
	}

	public static void setJudge(Judge j) {
		judge = j;
	}

	public static Player getPlayerById(int i) {
		return player[i];
	}

	public static void setPlayerById(int id, Player p) {
		player[id] = p;
	}
	
	
}
