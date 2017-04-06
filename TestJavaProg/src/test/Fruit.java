package test;


public class Fruit extends Food{
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	public Fruit(String food) {
		// TODO Auto-generated constructor stub	
		super.food=food;
	}
	@Override
	public void serveFood() {
		System.out.println("I'm serving "+ super.food);		
	}

}
