/**
 *
 * @author Mick Campitelli
 */


package edu.sbcc.cs105;

public class Main {

	/**
	 * Creates multiple EraDate objects and tests there era edge cases.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EraDate era = new EraDate(1912, 7, 30); // Meiji edge case
		era.printJapaneseEraName();
		
		EraDate era2 = new EraDate(1913, 8, 1); // Taisho edge case
		era2.printJapaneseEraName();
		
		EraDate era3 = new EraDate(1926, 12, 26); // Showa edge case
		era3.printJapaneseEraName();
		
		EraDate era4 = new EraDate(1950, 6, 17); // Showa mid
		era4.printJapaneseEraName();
		
		EraDate era5 = new EraDate(1992, 6, 17); // my birthday
		era5.printJapaneseEraName();

	}

}
