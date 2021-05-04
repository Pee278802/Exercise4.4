class Orange extends Fruit{							//subclass of fruit
	double price;
	double weight;
	String colour;
	public Orange(String name, String colour, double weight, double price) {
		super(name);
		this.colour = colour;
		this.weight = weight;
		this.price = price;
		System.out.println();
		
		if (this.weight < 1.00) {
			System.out.println("The total price is RM" + totalPrice());
			
		}else if ((this.weight >= 1) && (this.weight < 5)) {
			double p = 5;
			System.out.println("The total price is RM" + totalPrice(p));
			
		}else {
			double p = 3;
			double w = this.weight;
			System.out.println("The total price is RM" + totalPrice(p, w));
		}
		
	}
	public void type(){	//overriding
		String [] typesOfOrange = {"Navel", "Mandarin", "Blood Oranges", "Valencia"};
		System.out.println("Types of Orange:");
		for (int i = 0; i < typesOfOrange.length; i++) {
			System.out.println(typesOfOrange[i]);
		}		System.out.println();
	}
	
	public String toString() { //toString //overriding
		return ("Name = " + super.name + "" + "\n colour = " + colour + "\n weight = " + weight + "\n price :" + price + "per kg");
	}

	public double totalPrice() {				//overloading with no arg
		return this.price * this.weight;
	}
	
	public double totalPrice(double p) {		//overloading with 1 arg
		return p * this.weight;
	}
	
	public double totalPrice(double p, double w) {	//overloading with 2 arg
		return p * w;
	}
}
