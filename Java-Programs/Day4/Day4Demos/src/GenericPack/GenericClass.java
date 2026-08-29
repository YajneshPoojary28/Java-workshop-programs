package GenericPack;
class Student<T>
{
	String stuName;
	int regNo;
	T stuMarks;
	
	Student(String name , int reg , T marks)
	{
		stuName = name;
		regNo=reg;
		stuMarks= marks;
	}
	public String toString()
	{
		return stuName+" "+regNo+" "+stuMarks;
	}
}
public class GenericClass {
	public static void main(String[] args) {
		Student<Integer> s = new Student<Integer>("Shobha",1,88);
		System.out.println(s);
		
		Student<Double> s1 = new Student<Double>("Sheela",2,88.5);
		System.out.println(s1);
	}

}











