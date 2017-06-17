import java.util.Random;



public class RaceTurtle extends Turtle {
	private int nbr;
	
		
	public RaceTurtle(RaceWindow w, int nbr){
		super(w, RaceWindow.getStartXPos(nbr), RaceWindow.getStartYPos(nbr));
		this.nbr = nbr;
		penDown();
		left(270);
	}
		
	public void raceStep(){
		Random rand = new Random();
		int steps = rand.nextInt(6)+1;
		forward(steps);
	}
	public String toString(){
		return ("Nummer" + nbr);
	}
	
}
	


