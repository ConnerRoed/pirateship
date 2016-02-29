package events;

public class Battleship extends Event {
	
	public Battleship(String theName) {
		super(theName);
		setMydamage(new MajorDamage());
	}

}
