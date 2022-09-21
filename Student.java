package HashMapChecking;

import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	private String gender;
	private int id;
	private int percent;
	private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	public Student(String name, int age, String gender, int id, int percent, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id = id;
		this.percent = percent;
		this.dept = dept;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", id=" + id + ", percent=" + percent
				+ ", dept=" + dept + "]";
	}
	
	
	//===========GENERATING HASHCODE AND EQUALS METHODS=====================
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, dept, gender, id, name, percent);
//	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		
		if (obj == null)
			return false;
		
		
		if (getClass() != obj.getClass())
			return false;
		
		
		Student other = (Student) obj;
		return age == other.age && Objects.equals(dept, other.dept) && Objects.equals(gender, other.gender)
				&& id == other.id && Objects.equals(name, other.name) && percent == other.percent;
	}
	
	
	
	
	
	
	
}
