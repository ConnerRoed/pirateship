package events;

public class Event {
	private String name;
	private DamageBehavior mydamage;
	
	public Event(String theName) {
		name = theName;
	}
	
	public String sayName() {
		return name;
	}
	
	public String sayDamage() {
		return getMydamage().dealDamage();
	}

	public DamageBehavior getMydamage() {
		return mydamage;
	}

	public void setMydamage(DamageBehavior mydamage) {
		this.mydamage = mydamage;
	}
}
