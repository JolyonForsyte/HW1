package homework1b;

public class TriangleMain {

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle(3,4,5);
		
		System.out.println(triangle1);
		
		Triangle triangle2 = new Triangle();
		triangle2.setSideAB(6);
		triangle2.setSideAC(5);
		triangle2.setSideBC(7);
		System.out.println(triangle2);
	}

}
