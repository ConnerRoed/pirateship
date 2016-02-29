package events;

public class Fog extends Event {
	
	public Fog(String theName) {
		super(theName);
		setMydamage(new NoDamage());
	}

}
