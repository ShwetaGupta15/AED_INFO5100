package ArrayElement;

import java.util.*;

public class TestCylinder {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method 
		Circle c = new Circle();
		c.setRadius(2.0);
		c.setColor("Yellow");
		// calling default constructor value from only Parent class
		System.out.println("Scenario 1: ");
		System.out.println("Radius of Circle : "+c.getRadius()+"\n"+"Base Area of Circle is : "+c.getArea() +"\n"+ "Color is : "+ c.getColor()); // Base of Circle using default constructor
		System.out.println("-----------------------------------------------------------");
			
		Cylinder cy= new Cylinder();		
		// Calling Default Constructor Value from child class
		System.out.println("Scenario 2: ");
	    System.out.println("Radius of Circle : "+cy.getRadius()+"\n"+"Height is : "+cy.getHeight()+"\n"+"Base Area of Circle is : "+cy.getArea() +"\n"+"Volume of Cylinder : "+cy.getVolume()+"\n"+ "Color is : "+cy.getColor());	
	    System.out.println("-----------------------------------------------------------");
	    
	    Cylinder cy1 = new Cylinder(5.0,2.0);
	    System.out.println("Scenario 3: ");
	    //System.out.println( cy1.getRadius()+" "+cy1.getHeight()+" "+cy1.getColor());
	    System.out.println("Radius of Circle : "+cy1.getRadius()+"\n"+"Height is : "+cy1.getHeight()+"\n"+"Base Area of Circle is : "+cy1.getArea() +"\n"+"Volume of Cylinder : "+cy1.getVolume()+"\n"+ "Color is : "+cy1.getColor());
	    System.out.println("-----------------------------------------------------------");
	    

	}

}
