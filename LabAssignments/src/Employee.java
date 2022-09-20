import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;


public class Employee {
	String firstName ;
	String lastName;
	int i,x;
	String a,b,c;
	 
	public Employee(String firstName, String lastName) {
		this.firstName =firstName ;
		this.lastName =lastName;
	}
	public String fname(){
		a = firstName;
		System.out.println(a);
		return a;
		
	}
	public String lname(){
		b = lastName;
		System.out.println(b);
		return b;
		
	}
	 public void department() {
		
		
		 System.out.println("Please enter the department from following :-");
		 System.out.println("1.Technical");
		 System.out.println("2.Admin");
		 System.out.println("3.Human Resource");
		 System.out.println("4.Legal");
	 }

	public static void main(String[] args) {
		Employee obj = new Employee("harshit","choudary");
		obj.department();
		
		Scanner in = new Scanner(System.in);  
        System.out.print(" please select Employee Department : ");  
        String name = in.nextLine(); 
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Company Name : " );
        String company = sc.nextLine();
       
        
        sc.close();
        in.close();
		
		System.out.println("Dear " +  obj.fname() + " your generated credentials are found");
		System.out.println("Email: " + obj.fname() + " "+ obj.lname() + "@"+name+"." + company +"."+"com");
		HashSet<String> set=new HashSet<>();  
        set.add("1");    
        set.add("2");    
        set.add("3");   
        set.add("4");  
        set.add("5");  
        set.add("6");
        set.add("a");
        set.add("b");
        set.add("@");
        set.add("%");
        set.add("d");
        
       Iterator<String> x=set.iterator();  
       
        System.out.println("Password:"+ x);  
        
		
	}

	
}



