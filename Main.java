package shape;



class shape {
	
	public void print()
	{
		System.out.println("shape");
	}
}

class shape2d extends shape
{
	public void print()
	{
		System.out.println("\nshape2d");
	}
}

class shape3d extends shape
{
	public void print()
	{
		System.out.println("\nshape3d");
	}
}

class quar extends shape2d
{
	public void print()
	{
		System.out.println("\nshape2d quardrilateral ");
	}
}

class tri extends shape2d
{
	public void print()
	{
		System.out.println("\nshape2d trianguler");
	}
}

class sphere extends shape3d
{
	public void print()
	{
		System.out.println("sphere");
	}
	public void sup_print()
	 {
		  super.print();
	 }
	public double area(double x)
	{
		//sup_print();
		//print();
		return 4/3*3.1416*x*x;
	}
}

class cube extends shape3d
{
	public void print()
	{
		System.out.println("cube");
	}
	public void sup_print()
	 {
		  super.print();
	 }
	public double area(double... x)
	{
		double a=0;
	    for (double i : x) {
	    	a=i*i+a;
	    }
	    return a;
	}
}

class rec extends quar
{
	public void print()
	{
		System.out.println("rectanguler");
	}
	public void sup_print()
	 {
		  super.print();
	 }
	public double area(double... x)
	{
		double a=1;
	    for (double i : x) {
	    	a=a*i;
	    }
	    return a;
	}
}

class squre extends quar
{
	public void print()
	{
		System.out.println("squre");
	}
	public void sup_print()
	 {
		  super.print();
	 }
	public double area(double ... x)
	{
		double a=1;
		int c=0;
	    for (double i : x) {
	    	a=a*i;
	    	++c;
	    }
		try
		{
			if(c==1) return a;
			System.out.println("Input not correct");
			//return 0;
		}
		catch (Exception e )
		{
			System.out.println("exception");
			return a;
		}
		
		return 0;
	}
}

class right_tri extends tri
{
	public void print()
	{
		System.out.println("right trianguler");
	}
	public void sup_print()
	 {
		  super.print();
	 }
	public double area(double... x)
	{
		double a=1;
	    for (double i : x) {
	    	a=a*i;
	    }
	    return 0.5*a;
		//return 0.5*x*y;
	}
}


public  class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape first=new shape();
		//System.out.println("shape");
		
		
		rec rc=new rec();
		rc.sup_print();
		rc.print();
		System.out.println("area= "+rc.area(2.0, 3.1));
		
		squre sq=new squre();
		sq.sup_print();
		sq.print();
		System.out.println("area= "+sq.area(2,5));
		
		right_tri rt=new right_tri();
		rt.sup_print();
		rt.print();
		System.out.println("area= "+rt.area(5,2));

		sphere sp=new sphere();
		sp.sup_print();
		sp.print();
		System.out.println("area= "+sp.area(2.0));
		
		cube cb=new cube();
		cb.sup_print();
		cb.print();
		System.out.println("area= "+cb.area(2,3,1));
	}

}
