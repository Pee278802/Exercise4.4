	class Fruit { 								//super class
		protected String name;
		public Fruit(String name) {
			this.name = name;
			System.out.println(this.name);
			System.out.println("Fruit constructor is invoked");
			System.out.println();
		}		
		public String getName() {
			return this.name;
		} 
}