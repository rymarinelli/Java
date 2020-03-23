
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal("Catfish");
		System.out.println(a.getName());
		System.out.println(a.toString());
		
		Dog d = new Dog(30, "Spike");
		d.setName("Spike");
		d.getName();
		d.setExerciseTime(30);
		d.getExcerciseTime();
		System.out.println(d.toString());
		
		Cat c = new Cat(9,"meowers");
		c.setLivestLeft(9);
		System.out.println(c.getLivesLeft());
		c.setName("Meowers");
		System.out.println(c.getName());
		System.out.println(c.toString());
	}

}
