import java.util.ArrayList;

public class TurtleRace {
	public static void main(String[] args) {
		RaceWindow w = new RaceWindow();

		ArrayList<RaceTurtle> turtles = new ArrayList<RaceTurtle>();
		ArrayList<RaceTurtle> finished = new ArrayList<RaceTurtle>();
		for (int i = 0; i < 8; i++) {
			turtles.add(new RaceTurtle(w, i+1));
		}

		int place = 0;
		while (!turtles.isEmpty()) {
			for (int i = 0; i < turtles.size(); i++) {
				turtles.get(i).raceStep();
				RaceWindow.delay(10);

				if (turtles.get(i).getX() > RaceWindow.X_END_POS) {
					finished.add(turtles.get(i));
					if (place < 3) {
						place++;
						System.out.println("På plats " + place + ":" + turtles.get(i).toString());

					}
					turtles.remove(i);
					i--;
				}

			}
		}
	}

}
