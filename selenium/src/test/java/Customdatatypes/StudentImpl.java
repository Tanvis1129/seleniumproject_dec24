package Customdatatypes;

public class StudentImpl {

	public static void main(String[] args) {
		
		Student st=new Student("tanvi", "I13", "London");
		
		/*
		 * st.name="tanvi"; st.rollno="a123"; st.Address="london";
		 */
		
		System.out.println(st);
		
	 
	

	  
	   st.setAddress("usa");
	   System.out.println(st);

	   System.out.println(st.getAddress());

	}

}
