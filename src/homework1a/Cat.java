package homework1a;

public class Cat {
	
	private String name;
	private int age;
	private int weight;
	
	
	public Cat(String name, int age, int weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void voice() {
		System.out.println("Meow!");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "years, weight=" + weight +  "]";
	}
	
	
}
