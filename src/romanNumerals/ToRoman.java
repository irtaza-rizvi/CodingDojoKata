package romanNumerals;

public class ToRoman {

	public static String convert(int input) {
		StringBuilder roman = new StringBuilder();
		int level = 7;
		recurse(input, level, roman);
		return roman.toString();
	}

	public static void recurse(int input, int level, StringBuilder roman) {
		String rom = null;
		String sub = null;
		int num = 0;
		int base = 0;
		int a, b, c;

		switch (level) {
		case 1:
			num = 1;
			rom = "I";
			break;
		case 2:
			num = 5;
			rom = "V";
			base = 1;
			sub = "I";
			break;
		case 3:
			num = 10;
			rom = "X";
			base = 1;
			sub = "I";
			break;
		case 4:
			num = 50;
			rom = "L";
			base = 10;
			sub = "X";
			break;
		case 5:
			num = 100;
			rom = "C";
			base = 10;
			sub = "X";
			break;
		case 6:
			num = 500;
			rom = "D";
			base = 100;
			sub = "C";
			break;
		case 7:
			num = 1000;
			rom = "M";
			base = 100;
			sub = "C";
			break;
		}

		a = input / num;
		b = input % num;
		c = b / (num - base);

		if (a > 0) {
			for (int i = 0; i < a; i++) {
				roman.append(rom);
			}
		}

		if (b != 0 && level != 1) {
			level--;
			if (c == 1) {
				roman.append(sub);
				roman.append(rom);
				recurse(b - (num - base), level, roman);
			} else {
				recurse(b, level, roman);
			}
		}
	}
}
