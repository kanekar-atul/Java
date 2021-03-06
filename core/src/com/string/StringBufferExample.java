package com.string;

public class StringBufferExample {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
		
		
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints HJavalo  
		
		sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  
		
		
		sb.reverse();  
		System.out.println(sb);//prints olleH  \
		
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
		
		
	}
}