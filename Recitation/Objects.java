//object: something that has a state(fields) and a behavior(methods)
public class Objects{
	public static void main(String [] args){
	String name;
	String school;
	
	public void setName(String s){
		name = s;
	}
	
	public void setSchool(String s){
		school = s;
	}

	Student s1 = new Student();
	Student s2 = new Student();
	s1.setName("Bob");
	s2.setName("Alice");
	s1.setSchool("Rutgers");
	s2.setSchool("NYU");
	}
}

}