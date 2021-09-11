package javaPrograms;

public class Salary {

	public static void main(String[] args) {
		double salary = 40000;
		double taxableAmount=0;
				if(salary>30000) {
					taxableAmount = salary - 30000;
					System.out.println(taxableAmount);
					 float taxAmount = (float)(15%taxableAmount);
					 System.out.println(taxAmount);

				}
				
	}

}
