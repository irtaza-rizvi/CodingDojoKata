package romanNumerals;

public class ToNumber {

	public static int convert(String input) {
		int num = 0;
		char[] chars = input.toCharArray();
		int[] ints = new int[chars.length];

		for (int i = 0; i < chars.length; i++) {
			switch (chars[i]) {
			case 'I':
				ints[i] = 1;
				break;
			case 'V':
				ints[i] = 5;
				break;
			case 'X':
				ints[i] = 10;
				break;
			case 'L':
				ints[i] = 50;
				break;
			case 'C':
				ints[i] = 100;
				break;
			case 'D':
				ints[i] = 500;
				break;
			case 'M':
				ints[i] = 1000;
				break;
			}
		}

		for (int i = 0; i < ints.length; i++) {
			if (i + 1 != ints.length && ints[i] < ints[i + 1]) {
				num -= ints[i];
			} else {
				num += ints[i];
			}
		}

		return num;
	}
}
