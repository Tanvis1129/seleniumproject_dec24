package Customdatatypes;

public class Student {

	String name;
	String rollno;
	String Address;

	public Student(String name, String rollno, String Address)

	{
		this.name = name;
		this.rollno = rollno;
		this.Address = Address;

	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", Address=" + Address + "]";
	}

}
