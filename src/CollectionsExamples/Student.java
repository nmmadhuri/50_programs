package CollectionsExamples;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	public  Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[] args) {
		Student s1= new Student(100,"Madhuri");
		Student s2= new Student(101,"Mallik");
		Student s3= new Student(102,"kaushik");
		Student s4= new Student(103,"Kruthi");
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		
		for(Student s : list1){
			System.out.println("id "+s.id +", Name:"+s.name);
		}
		
		
		
		
	}

}
