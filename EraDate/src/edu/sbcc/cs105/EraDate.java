/**
 *
 * @author Mick Campitelli
 */

package edu.sbcc.cs105;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class EraDate {
	private int year = 0;
	private int month = 0;
	private int day = 0;
	Calendar cal = Calendar.getInstance(); // Creates current date calendar for later setting.

	public EraDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**
	 * Creates SimpleDateFormat and returns the formatted string
	 * 
	 * @return formatted String
	 */
	public String getIso8601Date() {
		this.cal.set(this.year, this.month - 1, this.day);
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String formatted = f.format(this.cal.getTime());
		return formatted;

	}

	/**
	 * Creates Calendar objects for each era and compares this EraDate against
	 * them  using getTimeInMillis() method. Prints Japanese era to console.
	 * 
	 */
	public void printJapaneseEraName() {
		this.cal.set(this.year, this.month, this.day);
		Calendar meijiStart = Calendar.getInstance();
		meijiStart.set(1868, 1, 25);

		Calendar meijiEnd = Calendar.getInstance();
		meijiEnd.set(1912, 7, 30);

		Calendar taishoStart = Calendar.getInstance();
		taishoStart.set(1912, 8, 1);

		Calendar taishoEnd = Calendar.getInstance();
		taishoEnd.set(1926, 12, 25);

		Calendar showaStart = Calendar.getInstance();
		showaStart.set(1926, 12, 26);

		Calendar showaEnd = Calendar.getInstance();
		showaEnd.set(1989, 1, 7);

		Calendar heisei = Calendar.getInstance();
		heisei.set(1989, 1, 8);

		if (this.cal.getTimeInMillis() >= meijiStart.getTimeInMillis()
				&& this.cal.getTimeInMillis() <= meijiEnd.getTimeInMillis()) {
			System.out.println("Meiji");
		}

		if (this.cal.getTimeInMillis() >= taishoStart.getTimeInMillis()
				&& this.cal.getTimeInMillis() <= taishoEnd.getTimeInMillis()) {
			System.out.println("Taisho");
		}

		if (this.cal.getTimeInMillis() >= showaStart.getTimeInMillis()
				&& this.cal.getTimeInMillis() <= showaEnd.getTimeInMillis()) {
			System.out.println("Showa");
		}

		if (this.cal.getTimeInMillis() >= heisei.getTimeInMillis()) {
			System.out.println("Heisei");
		}

	}
}
