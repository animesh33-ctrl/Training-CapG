package relatioship.has_a;

public class Person {
	String name;
	PanCard pancard;
	
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Animesh Palui";
		
		PanCard card = new PanCard();
		card.panId = "ABC123";
		card.dob = "14/04/2001";
		
		person.pancard = card;
		
		System.out.println(person.name);
		System.out.println(person.pancard.panId);
		System.out.println(person.pancard.dob);
	}
}
