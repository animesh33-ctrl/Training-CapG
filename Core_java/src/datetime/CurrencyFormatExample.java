package datetime;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		double amount = 123456.789;

		// India
		NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

		System.out.println("India: " + indiaFormat.format(amount));

		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

		System.out.println("US: " + usFormat.format(amount));

		// Japan

		NumberFormat japanFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);

		System.out.println("Japan: " + japanFormat.format(amount));
	}
}

