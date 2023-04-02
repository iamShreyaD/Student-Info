
/*
 * --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Shreya B Deshpande
 * This project represents a class StudentMain.java which prints out the grades and the names of the students in the class.
 * --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */

public class StudentMain 
{
	public static void main(String[] args)
	{
		// declaring the Student object
		Student Abby = new Student(83.9, "Abby");
		Student Brady = new Student(75.5, "Brady");
		
		// printing out the results of the objects with toString method 
		System.out.println(Abby.toString());
		System.out.println(Brady.toString());
	}
}

class Student
{
	private double grade;         // declaring double grades
	private String name;          // declaring String name
	
	public Student()
	{
		grade = 0;                
		name = "";               
	}
	
	public Student(double grade, String name)
	// constructor sets grade and name
	{
		this.grade = grade;
		this.name = name;
	}
	
	public double getGrade()
	{
	// return grade in double data type
		return grade;
	}
	
	public void setGrade(double grade)
	// the grade is assigned to the correct parameter
	{
		
		this.grade = grade;
	}
	
	public String name()
	{
	// returns name in String data type
		return name;
	}
	
	public void setName(String name)
	// the name is assigned to the correct parameter
	{
		this.name = name;
	}
	
	public String toString()
	// return the results in the String format
	{
		return ("Name: " + name + ", Grade: " + grade);
	}
}


