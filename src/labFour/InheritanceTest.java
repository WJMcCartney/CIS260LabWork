package labFour;

public class InheritanceTest {

	public static void main(String[] args) {
		Animals dog = new Dog();
		Animals cat = new Cat();
		dog.sounds();
		cat.sounds();
		dog.eats();
		cat.eats();
	}

}
