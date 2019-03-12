/**
 * Pablo Ahava Pizarro paah4127
 */

public class Dog {
	
	private String name;
	private String breed;
	private int age;
	private double weight;
	
	public Dog(String n, String b, int a, double w) {
		this.name = n;
		this.breed = b;
		this.age = a;
		this.weight = w;
	}
	    public String toString() {
        return "Name: " + name + " Breed: " + breed + " Age: " + age + " Weight: "+ weight + " Taillength: " + getTailLength();
    }
    
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int increaseAge() {
		return ++age;
			
	}
	public double getTailLength() {
		breed = breed.toLowerCase();
		
		if (breed.equals("tax") || breed.equals("dachshund")) {
			return 3.7;
		}
		else {
			double tailLength = (age * weight) / 10.0;
			return tailLength;
		}
	}

}
