package labFive;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("Billy");
		System.out.println(s.getName());
		
		s.setAge(19);
		System.out.println(s.getAge());

		s.setYear(2022);
		System.out.println(s.getYear());
		
		s.setID("2773800");
		System.out.println(s.getID());
	}

}
