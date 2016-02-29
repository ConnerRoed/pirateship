package events;

public class Breeze extends Event {
	
	public Breeze(String theName) {
		super(theName);
		setMydamage(new NoDamage());
	}

}
