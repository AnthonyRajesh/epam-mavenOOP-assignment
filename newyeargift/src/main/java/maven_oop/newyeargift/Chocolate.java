package maven_oop.newyeargift;

public class Chocolate implements Sweet{
	double weight;
	double cost;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost() {
		this.cost += this.weight*100.0;
	}
}
