package lab_allocation;

import java.util.Scanner;

public class Lab_allocation_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int lab1=scanner.nextInt();
		int lab2=scanner.nextInt();
		int lab3=scanner.nextInt();
		int No_of_students=scanner.nextInt();
		int lab_to_be_allocated=0;
		String lab_name="";
		if(lab1>=No_of_students)
		{
			lab_to_be_allocated=lab1;
			lab_name="L1";
		}
		if(lab2>=No_of_students && lab2<lab_to_be_allocated)
		{
			lab_to_be_allocated=lab2;
			lab_name="L2";
		}
		if(lab3>=No_of_students && lab3<lab_to_be_allocated)
		{
			lab_to_be_allocated=lab3;
			lab_name="L3";
		}
		System.out.println(lab_name);
	}

}