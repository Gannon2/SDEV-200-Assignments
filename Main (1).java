// Gannon Stephens
// 8/25/2023
// Program prompts the user to enter the three points for point 0, point 1, and point 2 and displays whether point 2 is on the left side of the line from point 0 to point 1, right side, the same line, or on the line segment.
// 
import java.util.Scanner;
// ^ Imports the Java scanner tool to allow for user inputs.
public class Main {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creates the scanner
  
		// Gets the user to input 3 points. EX: 1 1 2 2 1.5 1.5
		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
    // x0's input
		double y0 = input.nextDouble();
    // y0's input
		double x1 = input.nextDouble();
    // x1's input
		double y1 = input.nextDouble();
    // y1's input
		double x2 = input.nextDouble();
    // x2's input
		double y2 = input.nextDouble();
    // y2's input
    // ^ Lines 14 through 19 declare x0, y0, x1, y1, x2, and y2 to be double variables.
		// Tests and shows which points are where on the line segment.
		System.out.print("(" + x2 + ", " + y2 + ") is on the ");
		if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
			System.out.print("line segment ");
    // Left of the line
		else if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
			System.out.print("left side of the line ");
    // On the same line
		else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
			System.out.print("same line ");
    // Right of the line
		else 
			System.out.print("right side of the line");
		// Prints each of the user-inputted points.
    System.out.println(
			"from " + "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
	}

	/** Return true if point (x2, y2) is on the left side of the
	* directed line from (x0, y0) to (x1, y1) */
	public static boolean leftOfTheLine(double x0, double y0,
	double x1, double y1, double x2, double y2){
		return userPoint(x0, y0, x1, y1, x2, y2) > 0;
	}

	
  
  /** Return true if point (x2, y2) is on the same
	* line from (x0, y0) to (x1, y1) */
	public static boolean onTheSameLine(double x0, double y0,
	double x1, double y1, double x2, double y2){
		return userPoint(x0, y0, x1, y1, x2, y2) == 0;
	}

	
  
  /** Return true if point (x2, y2) is on the
	* line segment from (x0, y0) to (x1, y1) */
	public static boolean onTheLineSegment(double x0, double y0,
	double x1, double y1, double x2, double y2) {
		return (userPoint(x0, y0, x1, y1, x2, y2) == 0 &&
				 (x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1));
	}

  /** Returns the points that the user inputted */
	public static double userPoint(double x0, double y0,
	double x1, double y1, double x2, double y2) {
	// Calculates the user's point position
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

    
	}
}