package Uni;

import java.util.Scanner;

public class teachers {
	
	// main info
	
	String name;
	String pas;
	int id;
	String lastname;
	String birthday;
	int age;
	double salary;
	int lengthname;
	int lengthlast;
	int IDlength;
	String space = " ";
	String space01 = " ";
	String space02 = " ";
	
	
	
	
	teachers(String name, String pas, int id, String lastname, String birthday, int age, double salary)
	{
		this.name = name;
		this.pas = pas;
		this.id = id;
		this.lastname = lastname;
		this.birthday = birthday;
		this.age = age;
		this.salary = salary;
		
		if(id > 10)
		{IDlength = 4;}
	else
		{IDlength = 5;}
	
	lengthname = name.length();
	lengthlast = lastname.length();
	space02 = space02.repeat(IDlength);
	space01 = space01.repeat(14- lengthlast);
	space = space.repeat(13 - lengthname);
	
	}
	public String toString() {
		 return id + space02 + name + space + lastname + space01 + birthday + "     " + age + "    " + salary;
	}
	
}