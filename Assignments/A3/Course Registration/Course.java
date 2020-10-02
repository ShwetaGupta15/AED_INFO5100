import java.util.*;

public class Course
{

	String crsName;
	int numberOfStudent;
	List<Student> listStd = new ArrayList<Student>();
	
	
	// Course constructor addition
	
	public Course(String courseName, int stdNum, ArrayList list )  
	{
		this.crsName = courseName;
		this.numberOfStudent = stdNum;
		this.listStd = list;
	}
	
	public String getCrsName() {
		return crsName;
	}
	public void setCrsName(String crsName) {
		this.crsName = crsName;
	}
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
	public List<Student> getListStd() {
		return listStd;
	}
	public void setListStd(List<Student> listStd) {
		this.listStd = listStd;
	}
	public static List<Student> getStudent(Course crs)
	{
		return crs.getListStd();
		
	}
	public static boolean isFull(Course crs)
	{
		int maxNum = crs.getNumberOfStudent();
		if (maxNum > crs.getListStd().size())
		{
			return false;
		}
		else 
		{
			return true;
		}
		
	}
	
	public static String registerStudent(Student std, Course crs)
	{
		boolean a = isFull(crs);
		if (a)
			return "Course is Full";
		else
			crs.getListStd().add(std);
			return "Student added";
	}
	
	
	
	
	 
	
}
