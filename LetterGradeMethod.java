/**
 * Using a method, this class assigns a letter grade to a set of test scores
 * @author kathleen malone
 *
 */
public class LetterGradeMethod {
	
	/**
	 * Returns a letter grade based on an average
	 * @param avg - average test score
	 * @return corresponding letter grade
	 */
	public static char letterGrade(int avg) {
		char l;
		
		if (avg >= 90) {
			l = 'A';
		} else if (avg >= 80) {
			l = 'B';
		} else if (avg >= 70) {
			l = 'C';
		} else if (avg >= 60) {
			l = 'D';
		} else {
			l = 'F';
		}
		return l;
	}
	
	public static void main(String[] args) {
		int test1 = 90;
		int test2 = 95;
		int test3 = 85;
		int test4 = 92;
		int average = test1 + test2 + test3 + test4 / 4;
		char letter;
		
		//call method and assign return value to letter
		letter = letterGrade(average);
	}
}
