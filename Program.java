package date;
class Date
{
    private int day,month,year;
    public Date()
    {}
    public Date(int d , int m , int y)
    {
        day=d;
        month=m;
        year=y;
    }
  
    public String toString()
    {
        return  day+"/"+month+"/"+year ;
    }
}
class Person
{
    private String name;
   public  Date dob;
  
    public Person()
    {}
    public Person(String name , int d , int m , int y )
    {
        this.name=name;
        this.dob=new Date(d,m,y);
    }
    public String toString()
    {
        return "Name: "+name+", "+"DOB:"+toString();
    }
}

public class Program{
	public static void main(String[] args)	{
		try		{
			if(args.length!=4)			{
				System.out.println("Invalid number of parameters.");
			}
			else{
				String str=args[0];
				int d=Integer.parseInt(args[1]);
				int m=Integer.parseInt(args[2]);
				int y=Integer.parseInt(args[3]);
				Person p1 = new Person(str,d,m,y);
				System.out.println(p1);
			}
		}
		catch(Exception ex){
		System.out.println("Error: "+ex.getMessage());
		}
	}
}