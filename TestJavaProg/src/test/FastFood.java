package test;


class FastFood extends Food{
	public FastFood() {
		// TODO Auto-generated constructor stub
	}
	public FastFood(String food) {
		// TODO Auto-generated constructor stub
		super.food=food;
		
	}

	@Override
	public void serveFood() {
		System.out.println("I'm serving "+ super.food);		
	}

}

