package labass8;
class circle
{
	private double pi;
	private int r;
	
	public int getR() //getter method
	{
		return r;
	}
	public void setR(int r) //setter method
	{
		this.r = r;
	}
	public circle(int r)//parameterized construtor
	{
		super();
		this.r=r;
	}
	public void area()
	{
		double pi=3.14;
		double area=pi*r*r;  //calculate area of circle
		System.out.println("Area of circle is :"+area);
	}
	
}
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle(4);  // parameter pass
		c.area();
		circle c1=new circle(20);  // parameter pass
		c1.area();
	}

}
