import java.util.*;

public class Registration 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//1. Create a Student
		Student std = new Student("Shweta", 101);
		Student std1 = new Student("pratt", 456);
		
		
		
		//2. Create a Course
		Course c = new Course("AED",10,new ArrayList<Student>());
				
		
		//3. Register Course method call
		String res = c.registerStudent(std, c);
		String res1 = c.registerStudent(std1, c);
		
		System.out.println(res);
		System.out.println(res1);
		
		
		//4. Is Full course
		Boolean isF = c.isFull(c);
		if (isF)
			System.out.println("Course is Full");
		else
			System.out.println("Course has space left");
		
		//5. Get students registered to the course
		List<Student> sL = c.getStudent(c);
		for(int i = 0;i<=sL.size()-1;i++)
		{
			Student s = sL.get(i);
			System.out.println("-------------------------------------");
			System.out.println("Student Details");
			System.out.println("Student Name : "+s.getStuName()+ " 		Student Id : "+s.getStuId());
			
		}
			
			
		
	}

}
