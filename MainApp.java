package advance.dev;
import java.util.Scanner;
public class MainApp {
	private String name;
	private int age;
	private String Address;
	private String PhoneNumber;
	private double dtb;
	
	public MainApp(String name, int age, String Address, String PhoneNumber, double dtb) {
		this.name = name;
		this.age = age;
		this.Address = Address;
		this.PhoneNumber = PhoneNumber;
		this.dtb = dtb;
	}
	public void getName(String name) {
		this.name = name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public void getAge(int age) {
		this.age = age;
	}
	public int setAge(int age) {
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
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Nhập vào số lượng sinh viên: ");
    	 int n = sc.nextInt();
    	 MainApp[] student = new MainApp[n];
    	 input(student);
    	 for(int i = 0; i < student.length; i++) {
    		 System.out.println("Sinh viên thứ "+(i + 1)+student[i]);
    	 }
     }
     public static void input(MainApp[]student) {
    	 Scanner sc = new Scanner(System.in);
    	 for(int i = 0; i < student.length; i++) {
    		 System.out.print("Nhập vào số sinh viên "+(i + 1)+":");
    		 System.out.print("Enter name: ");
    		 String name = sc.nextLine();
    		 System.out.print("Enter age: ");
    		 int age = sc.nextInt();
    		 System.out.print("Enter Address: ");
    		 String Address = sc.nextLine();
    		 System.out.print("Enter PhoneNumber: ");
    		 String PhoneNumber = sc.nextLine();
    		 System.out.print("Enter dtb: ");
    		 double dtb = sc.nextDouble();
    		 student[i] = new MainApp(name, age, Address, PhoneNumber, dtb);
    	 }
    	 sc.close();
     }
}
