class redApple extends Apple{						//subclass of Apple
	protected double price, weight;
	protected String colour;
	public redApple(String name, int quantity, double price, String colour) {
		super(name, quantity, price);
		this.colour = colour;
		System.out.println();
		
	}
	public String toString() { 		//toString //overriding
		return ("Name = " + super.name + "" + "\n colour = " + colour + "\n weight = " + weight + "\n price :" + price + "each");
	}

}
