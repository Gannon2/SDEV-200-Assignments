// Gannon Stephens
// 8/25/2023
// Program write a test program that prompts the user to enter two 3 by 3 arrays of integers and displays whether the two are identical.
import java.util.Scanner;
// ^ Imports Java's scanner to allow for user inputs
public class Main {
	/** Main method */
	public static void main(String[] args) {
		// Prompts the user to enter two 3 by 3 arrays
		System.out.print("Enter list1: ");
		int[][] list1 = UserArray();
		System.out.print("Enter list2: ");
		int[][] list2 = UserArray();
		// Lets the user know if the two arrays they entered are identical or not
		System.out.println("These two arrays are" + 
			(equals(list1, list2) ? " " : " not ") + "identical");
	}
	// Creates the format in which the user must input their array. 
	public static int[][] UserArray() {
  // Only takes integers
		Scanner input = new Scanner(System.in);
		final int ROWS = 3;
		final int COLUMNS = 3;
		int[][] m = new int[ROWS][COLUMNS];
  // Initializes the integer labels
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextInt();
			}
		}
		return m;
	}
	// It will return and display true if the two user-inputted arrays are identical.
	public static boolean equals(int[][] m1, int[][] m2) {
		int[] list1 = sort(m1);
		int[] list2 = sort(m2);
  // NOTE* variable "m" is one of the two lists that the user is promted to enter
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}
  //
	// This will display the list after the user has inputted their arrays
	public static int[] mArray(int[][] m) {
		int[] list = new int[m.length * m[0].length];
		int k = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				list[k] = m[i][j];
				k++;
			}
		}
		return list;
	}
	// Works out the arrays and checks them in order
	public static int[] sort(int[][] m) {
		int [] list = mArray(m);
		for (int i = 0; i < 3; i++) {
			// Finds the minimum number in the first collumn, as defined on line 24
			int min = list[i];
			int minIndex = i;
			for (int j = i + 1; j < 3; j++) {
				if (min > list[j]) {
					min = list[j];
					minIndex = j;
				}
			}
			// Same thing on line 60, but it does it for the rows
			if (minIndex != i) {
				list[minIndex] = list[i];
				list[i] = min;
			}
		}
		return list;
	}
}