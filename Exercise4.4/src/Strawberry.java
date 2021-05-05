	class Strawberry extends Fruit{						//subclass of fruit
		double price;
		String colour;
		int pack;
		public Strawberry(String name, double price, int pack) {
			super(name);
			this.pack = pack;
			this.price = price;
			
			if (this.pack < 1.00) {
				System.out.println("The total price is RM" + totalPrice());
				
			}else if ((this.pack >= 1) && (this.pack < 5)) {
				double p = 5;
				System.out.println("The total price is RM" + totalPrice(p));
				
			}else {
				double p = 3;
				double pp = this.pack;
				System.out.println("The total price is RM" + totalPrice(p, pp));
			}
		}
		public void type(){	//overriding
			String [] Strawberry = {"Pineberry", "Strasberry", "Alexandria", "Sonata"};
			System.out.println("Types of Orange:");
			for (int i = 0; i < Strawberry.length; i++) {
				System.out.println(Strawberry[i]);
			}	
		}
		
		public String toString() { //toString //overriding
			return ("Name = " + super.name + "\n pack = " + pack + "\n price :" + price + "each pack");
		}
		
		public double totalPrice() {				//overloading with no arg
			return this.price * this.pack;
		}
		
		public double totalPrice(double p) {		//overloading with 1 arg
			return p * this.pack;
		}
		
		public double totalPrice(double p, double pp) {	//overloading with 2 arg
			return p * pp;
		}
}

