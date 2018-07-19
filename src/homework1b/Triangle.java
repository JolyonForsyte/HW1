package homework1b;

public class Triangle {
	
	
	private int sideAB;
	private int sideAC;
	private int sideBC;
	
	public Triangle(int sideAB, int sideAC, int sideBC) {
	super();
		this.sideAB = sideAB;
		this.sideAC = sideAC;
		this.sideBC = sideBC;
	}

	
	public Triangle() {
		
	}


	


	public int getSideAB() {
		return sideAB;
	}


	public void setSideAB(int sideAB) {
		this.sideAB = sideAB;
	}


	public int getSideAC() {
		return sideAC;
	}


	public void setSideAC(int sideAC) {
		this.sideAC = sideAC;
	}


	public int getSideBC() {
		return sideBC;
	}


	public void setSideBC(int sideBC) {
		this.sideBC = sideBC;
	}


/*	public double getHalfPerimeter() {
		return ((sideAB+sideBC+sideAC))/2;
	}
	*/
	
	public double getSpace() {
		double perimeter =(sideAB+sideBC+sideAC)/2;
		return Math.sqrt(perimeter*(perimeter-sideAB)*(perimeter-sideBC)*(perimeter-sideAC));
	}


	@Override
	public String toString() {
		return "Triangle [sideAB=" + sideAB + ", sideAC=" + sideAC + ", sideBC=" + sideBC + ", Space = " +getSpace()+ "]";
	}
	
	
}
