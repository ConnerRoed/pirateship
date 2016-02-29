package events;

/*
 * This class is used for returning Events, given a string that represents the Event being asked for.
 * Ex: calling for "hurricane" should return a hurricane, in the form of an Event.
 */
public class Eventcaller {
	/*
	 * This is the caller for the event class; like the waitress.
	 * You send it a string like "hurricane", then it will go through 
	 * this list of compacted else if statements and if the string given 
	 * matches, it will return the event in Event form. This allows you
	 * to use the sayName(), sayDescription(), and dealDamage() methods
	 * that are inside of the Event class.
	 */
	public static void main (String[] args) {
		Event e = new Waterspout("Walter the Waterspout");
		System.out.println("I'm Walter the Waterspout. " + e.sayDamage());
		
		Event f = new Hurricane("Harry the Hurricane");
		System.out.println(f.sayDamage());
		
		Event g = new Breeze("Barry the warm breeze");
		System.out.println(g.sayDamage());
		
		Event h = new Kraken("Keith the Kraken");
		System.out.println(h.sayDamage());
		
		Event i = new Windstorm("Winston the Windstorm");
		System.out.println(i.sayDamage());
		
		Event j = new Fog("The Fog");
		System.out.println(j.sayDamage());
		
		Event k = new Battleship("Bettina the Battleship");
		System.out.println(k.sayDamage());
		
		Event l = new Dinghy("Dan the loser");
		System.out.println(l.sayDamage());
		
		Event m = new Galley("Gary the Galley");
		System.out.println(m.sayDamage());
		
	}
	

}
