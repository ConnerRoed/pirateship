package events;

public class Windstorm extends Event {
	
	public Windstorm(String theName) {
		super(theName);
		setMydamage(new MinorDamage());
	}

}
