	class Strawberry extends Fruit{						//subclass of fruit
		double price;
		String colour;
		int pack;
		public Strawberry(String name, double price, int pack) {
			super(name);
			this.pack = pack;
			this.price = price;
			System.out.println();
		}
		public void type(){	//overriding
			String [] Strawberry = {"Pineberry", "Strasberry", "Alexandria", "Sonata"};
			System.out.println("Types of Orange:");
			for (int i = 0; i < Strawberry.length; i++) {
				System.out.println(Strawberry[i]);
			}		System.out.println();
		}
		
		public String toString() { //toString //overriding
			return ("Name = " + super.name + "\n pack = " + pack + "\n price :" + price + "each pack");
		}
}

