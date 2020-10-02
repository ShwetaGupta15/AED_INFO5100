
public class Professor 
{
	private String firstName;
	private String lastName;
	private int id;
	
	public static class Builder
	{
		private String firstName;
		private String lastName;
		private int id;
        
        
        public Builder(String firstName, String lastName, int id)
        {
        	this.firstName = firstName;
        	this.lastName = lastName;
        	this.id = id;
        }
        public Builder setFirstName(String firstName)
        {
        	this.firstName = firstName;
        	return this;
        }
        public Builder setLastName(String lastName)
        {
        	this.lastName  = lastName;
        	return this;
        }
        public Builder setId(int id)
        {
        	this.id = id;
        	return this;
        }
        public Professor build()
        {
        	Professor prof = new Professor(firstName,lastName,id);
        	return prof;
        	
        }
	}
	
	public static Builder getBuilder(String firstName, String lastName, int id)
	{
		return new Builder(firstName, lastName, id);
	}
	
	public Professor(String firstName, String lastName, int id)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
	}
	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
		
}

