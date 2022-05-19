package main;

import cls.MyClass;
import cls.YouClass;
import single.SingletonClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mycls=new MyClass();
		YouClass youcls=new YouClass();
		
//		youcls.setCount(mycls.getNumber());
		
		mycls.method();
		youcls.func();
		
		System.out.println(youcls.toString());
		
		

	}

}
