package wordWrap;

public class Wrapper {
	public static String wrap(String input, int col) {

		StringBuilder line = new StringBuilder();
		line.append(input);
		int i = 0;

		while (i < line.length() - col) {
			i = line.lastIndexOf(" ", i + col);

			if (i != -1) {
				line.setCharAt(i, '\n');
			} 
			else {
				return "Error! column number is too small.";
			}
		}

		return line.toString();
	}
}
