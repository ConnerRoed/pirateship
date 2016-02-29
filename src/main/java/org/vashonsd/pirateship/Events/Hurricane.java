package events;

public class Hurricane extends Event {
	
	public Hurricane(String theName) {
		super(theName);
		setMydamage(new MajorDamage());
	}

}
