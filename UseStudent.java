package HashMapChecking;

public class UseStudent {
	public static void main(String[] args) {
		
		Student s1 = new Student("Pugazh", 20, "Male",123,91,"BCA");
		Student s2 = new Student("Pugazh", 20, "Male",123,91,"BCA");
		
		if(s1.equals(s2)) {
			System.out.println("Both the objects are same");
		} else {
			System.out.println("Both the objects are different");
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
}
