package Variables;

public class Exercise_1 {

	public static void main(String[] args) {
	
		
		int myAge = 36;
		double mySalary = 18000.5;
		String myAdress = "Kibutz Maagan Michael";
		String myName = "Tzach Cohen";
		double myHeight = 181.3;

		System.out.println("My name is " + myName);
		System.out.println("My age is " + myAge + " and my height is " + myHeight);
		System.out.println("I'm living in " + myAdress);
		System.out.println("This is my salary : " + mySalary);
		mySalary = 20000;
		System.out.println("I worked hard and now my new salary is : " + mySalary);
		myAge = 37;
		myHeight = 180.1;
		System.out.println("It made me shorter and now my height is: " + myHeight);
		System.out.println("Next year i will be " + myAge + " years old ");

	}

}
