public class ReverseString 
{


	public static void main(String[] args) 
	{
		String str = "I went  for   shopping today";
		String myStrRef = str.replaceAll("\\s+", " "); // removes extra spaces
		String[] myStrArr = myStrRef.split(" ");
		String revStr = "";
		for (int i=myStrArr.length-1;i>=0;i-- ) {
			if (i == myStrArr.length-1)
				revStr = revStr + myStrArr[i];
			else
				revStr = revStr + " " + myStrArr[i];
		}
		System.out.println(revStr);
		
		
	}


}
