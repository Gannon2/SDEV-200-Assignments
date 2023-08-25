
// Gannon Stephens
// 8/24/2023
// Program displays the table as shown in assignment 6.9
public class Main {
  /** Main Method */
  public static void main(String[] args) {

    // Adds the table
    System.out.println(
        "\nFeet     Meters     |     Meters     Feet\n" +
            "---------------------------------------------");
    // Creates the top part of the table, so that it looks just like the table shown in the Liang reading.
    for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
      // Line 13 applies the conversion formula that was shown in the Liang reading, also shown below:
      // The formula for the conversions are:
      // meter = 0.305 * foot
      // foot = 3.279 * meter
      System.out.printf("%4.1f     ", feet);
      System.out.printf("%6.3f", footTOMeter(feet));
      // ^ Returns the integers that are defined from lines 29 to 34
      System.out.print("     |     ");
      // ^ Places the middle line on the table, it only goes down because of the "/n"
      System.out.printf("%-11.1f", meters);
      System.out.printf("%7.3f\n", meterTOFoot(meters));
      // ^ Returns the integers that are defined from lines 29 to 34

    }
  }

  /** Converts f to m */
  public static double footTOMeter(double foot) {
    return 0.305 * foot;
  }

  /** Converts m to f */
  public static double meterTOFoot(double meter) {
    return 3.279 * meter;
  }
}