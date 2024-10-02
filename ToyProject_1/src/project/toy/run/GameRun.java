package project.toy.run;

import project.toy.service.GameService;

public class GameRun {

	public static void main(String[] args) {
		try {
			new GameService().displayMenu();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
