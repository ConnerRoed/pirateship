package events;

public class Waterspout extends Event {
	
	public Waterspout(String theName) {
		super(theName);
		setMydamage(new MajorDamage());
	}
}
