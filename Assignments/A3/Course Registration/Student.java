
public class Student 
{
	String stuName;
	int stuId;
	
	//Student constructor addition
	public Student(String stdName, int stdId)
	{
		this.stuName = stdName;
		this.stuId = stdId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

}
