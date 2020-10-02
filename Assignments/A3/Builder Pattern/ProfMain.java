
public class ProfMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Professor p = Professor.getBuilder("Emma","Gautam",357).build();
		System.out.println("Professor Name : "+ p.getFirstName()+" "+p.getLastName());						
		System.out.println("Professor Id   : "+p.getId());
	}

}
