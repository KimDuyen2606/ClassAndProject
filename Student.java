package advance.dev;

public class Student {
	private String name;
	private int age;
	private String Address;
	private String PhoneNumber;
	private double dtb;
	
	public Student(String name, int age, String Address, String PhoneNumber, double dtb) {
		this.name = name;
		this.age = age;
		this.Address = Address;
		this.PhoneNumber = PhoneNumber;
		this.dtb = dtb;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(String name) {
		return this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge(int age) {
		return this.age = age;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getAddress(String Address) {
		return this.Address = Address;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public String getPhoneNumber(String PhoneNumber) {
		return this.PhoneNumber = PhoneNumber;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public double getDtb(double dtb) {
		return this.dtb = dtb;
	}
	public String toString() {
		return "name: "+name+"\nage: "+age+"\nAddress: "+Address+"\nPhoneNumber: "+PhoneNumber+"\ndtb: "+dtb;
	}
   public static void main(String[] args) {
	   Student student = new Student("Hậu", 18, "Quảng Trị", "09988476945496", 7.7);
	  System.out.println(student);
   }
}
