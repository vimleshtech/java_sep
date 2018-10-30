package example;

import java.util.Scanner;

public class Caller {

	public static void main(String[] args) {
		
		J5 j[] =new J5[10];

		
		for(int i=0; i<10;i++)
		{
			j[i] =new J5();
			j[i].Input();
		}
		
		for(int i=0;i<10;i++)
		{
			for(int c=i+1;c<10;c++)
			{
				if(j[i].Retroll()>j[c].Retroll())
				{
					J5 obj = j[i];
					j[i] = j[c];
					j[c] = obj;
				}
			}
		}
		Scanner sc =new Scanner(System.in);
		System.out.println("enter rollno to search :");
		int rno = sc.nextInt();
		
		for(int i=0;i<10;i++)
		{
			if(j[i].Retroll() == rno)
			{
					j[i].Dispdata();
			}
		}
		/*
		for(int i=0; i<10;i++)
		{
			j[i].Dispdata();
		}
		*/
	}

}
