package Variables;

public class Exercose_7 {

	public static void main(String[] args) {

		System.out.println("Section 2: variables difinition");
		int circleRadius = 3;
		double pie = 3.14;
		int rectangle_Height = 4;
		int rectangle_Width = 2;
		
		System.out.println("Section 3: ");
		int sumRectangle= (rectangle_Height * rectangle_Width);
		System.out.println("The area of a rectangle is : " + sumRectangle + " Square meter");
		
		double sumCircle = (circleRadius * circleRadius) * pie ;
		System.out.println("The area of a rectangle is : " + sumCircle + " Square meter");
		
		System.out.println("Section 4: ");
		double sum = (sumRectangle + sumCircle);
		System.out.println("The area of the circle and the rectangle together is: " + sum + " Square meter");
	}

}
