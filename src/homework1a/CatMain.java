package homework1a;

public class CatMain {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Mascha", 2, 5);
		Cat cat2 = new Cat("Vasya", 4, 9);

		System.out.println(cat1);
		System.out.println(cat2);
		
		
		cat2.setName("Mursik");
		System.out.println(cat2);
		cat2.voice();
		
	}

}
