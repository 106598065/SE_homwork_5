import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestLetterGrade {
	
	
	@Test
	void test() {
		assertEquals('A',letterGrade(95));
		assertEquals('B',letterGrade(85));
		assertEquals('C',letterGrade(75));
		assertEquals('D',letterGrade(65));
		assertEquals('F',letterGrade(55));
		assertEquals('X',letterGrade(-5));
		assertEquals('X',letterGrade(105));
	}
	
	public static char letterGrade(int score) { 
		char grade;
		
		
		if (score>=90 && score<=100) {
			grade = 'A';
		}
		else if (score>=80 && score < 90) {
			grade = 'B';
		}
		else if (score>=70 && score < 80) {
			grade = 'C';
		}
		else if (score>=60 && score < 70) {
			grade = 'D';
		}
		else if (score <0 || score > 100) {
			grade = 'X';
		}
		else {
			grade ='F'; 
		}
		
		return grade;
	}


}
