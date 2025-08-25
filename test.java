package practices;
abstract class shape{
	abstract void draw();

}

class circle extends shape{

	@Override
	void draw() {
		System.out.println("drawing circle");
		}
}

class square extends shape{

	@Override
	void draw() {
		System.out.println("drawing square");
		
	}
	
}

public class Abstracttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape s = new circle();
		shape s1 = new square();
		
		s.draw();
	
		s1.draw();
		
		

	}

}
