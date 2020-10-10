package ArrayElement;

public class Cylinder extends Circle
{
   public double height;
   public Cylinder()
   {
	   super();	   
	   height = 1.0;	   
   }
   
   
   public Cylinder(double height)
   {
	   this.height=height;
   }
   
   public Cylinder(double height, double radius)
   {
	   super.setRadius(radius);
	   this.height = height;	   
   }
   public Cylinder(double height, double radius,String color)
   {
	   super(radius,color);
	   this.height = height;	   
   }
   public double getHeight() 
   {
	   return height;
   }
   public void setHeight(double height) 
   {
	   this.height = height;
   }
  
   @Override
   public double getArea()
   {
	   double area = 2*pi*getRadius()*(getRadius() + this.height);
	   return area;
	   
   }
   
   public double getVolume()
   {
	   double volume = super.getArea()*this.height;
	   return volume;
	   
   }
}
