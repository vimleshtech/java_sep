package example;

import java.util.Scanner;

public class J5 {

		int rollno,search;
		String name;
		String address;
		String city;	
		String country;
		
		void Input( ) {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("enter rollno");
			rollno = sc.nextInt();
			
			System.out.println("enter name");
			name = sc.next();
			
			System.out.println("enter address");
			address = sc.next();
			
			System.out.println("enter city");
			city = sc.next();
			
			System.out.println("enter country");
			country = sc.next();
			System.out.println("enter country");
			search = sc.nextInt();
		}
		int Retroll( )
		{
			
			return rollno;
		}
		void Dispdata( ){
				System.out.println("Details ");
				System.out.println(rollno+"\t"+name+"\t"+address+"\t"+city+"\t"+country);
		}

}

