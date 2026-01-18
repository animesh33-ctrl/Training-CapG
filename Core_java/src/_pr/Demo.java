package _pr;

public class Demo {
	int id;
	String name;
	
//	public Demo() {}
	
	public Demo(int id,String name) {
		this.id = id;
		this.name = name;
	}
}

class Demo2 extends Demo{
	 
	int ss;
	
	public Demo2(int id,String name,int ss) {
		super(id,name);
//		this.id = id;
//		this.name = name;
		this.ss = ss;
	}
}