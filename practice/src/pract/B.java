package pract;

public class B {
	student  show()
	{
		student s = new student();
		s.setRollNo(10);
		s.setName("kamlesh");
		s.setLoc("Pune");
		s.setDep("IT");
		return s;
	}
	
	String getstudent()
	{
		B a =new B();
		student ss = a.show();
		String name =ss.getName();
		return name;
		
	}
	public static void main(String[] args) {
		B a = new B();
		a.getstudent();
	}
	
	

}
