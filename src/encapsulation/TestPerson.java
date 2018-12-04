package encapsulation;

public class TestPerson {

	public static void main(String[] args) {
		
		Person per1 = new Person();
		per1.setPersonAge(23);
		per1.setPersonName("lius");
		
		System.out.println(per1.getPersonAge() + " " + per1.getPersonName());
		
		per1.setPersonId(56);

	}

}
