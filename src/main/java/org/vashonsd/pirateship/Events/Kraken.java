package events;

public class Kraken extends Event {
	
	public Kraken(String theName) {
		super(theName);
		setMydamage(new MajorDamage());
	}

}
