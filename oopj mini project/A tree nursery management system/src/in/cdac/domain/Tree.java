package in.cdac.domain;

public class Tree {
	private String species;
	private int age;
	private double height;
	private double price;

	public Tree() {

	}

	public Tree(String species, int age, double height, double price) {
		this.species = species;
		this.age = age;
		this.height = height;
		this.price = price;
	}

	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tree [species=" + species + ", age=" + age + ", height=" + height + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	

}
