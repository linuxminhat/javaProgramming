package collections;

public class Student {
	private String name;
	private int id;
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setID(int id) {
		this.id=id;
	}
	public int getID() {
		return id;
	}
	//Ham toString duoc ghi de 
	public String toString() {
		return id + "" + name;
	}

}
