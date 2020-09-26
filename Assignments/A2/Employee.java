
public class Employee
{
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) 
    {
      //write your code here

      this.name = name;
      this.age = age;
      this.gender = gender;
      this.salary = salary;

    }
    // Getter for `name`. Return the current `name` data
    public String getName() 
    {
        //write your code here
        return name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) 
    {
        //write your code here
        this.name=name;

    }

    public Double getSalary() 
    {
        //write your code here
        return salary;
    }

    // Setter for `name`. Set `name` data
    public void setSalary(Double salary) 
    {
        //write your code here
        this.salary=salary;

    }
}


enum Gender {
    MALE,
    FEMALE;
}
