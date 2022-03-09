package labFour;

class Cat extends Animals {
	public void sounds() {
		super.sounds();
		System.out.println("meow");
	}

	public void eats() {
		super.eats();
		System.out.println("eats cat food");
	}
}
