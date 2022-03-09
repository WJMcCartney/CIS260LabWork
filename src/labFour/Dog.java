package labFour;

class Dog extends Animals {
	public void sounds() {
		super.sounds();
		System.out.println("bark");
	}

	public void eats() {
		super.eats();
		System.out.println("eats dog food");
	}
}
