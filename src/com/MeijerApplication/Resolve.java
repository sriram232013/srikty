package com.MeijerApplication;

public class Resolve implements BOGOInterface{
	private   String name;
	int c=1;
	int d=1;
	static int a=1;
	static int b=1;
	
	static 
	
	{
		System.out.println("hi static..");
	}
	
	
	Resolve(String name)
	{
		
				
		
		this .name = name;
		System.out.println("ob"+ c++);
		System.out.println(d++);
		System.out.println("------");
		System.out.println("class"+a++);
		System.out.println(b++);
		
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name !=  null)
		{
		
		
		this.name = name;
		}
	}

	public Tidewash getObj() {
		return obj;
	}

	public void setObj(Tidewash obj) {
		this.obj = obj;
	}

	private Tidewash obj;
	
	
	


	@Override
	public void photo() {
		 String name;
		System.out.println("Resolve photo is uploaded");
		
		
	}

	@Override
	public void Priceisreducedtohalf()  {
		try
		{
		System.out.println("hi"+name.length());
		System.out.println("hi price is reduce to half");
		}
		catch(NullPointerException e)
		{
			System.out.println("pleaase dont give null values");
		   //e.printStackTrace();
		}
	}
		
		public static void ccalculate()
		{
			a=50;
			b=70;
			
			int c = a+b;
			System.out.println(c);
			
			
			
		}
		
		
			
		
		
			
		
		
		
	

	
	
}
