import java.util.Scanner;

public class letterGradeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4, num5, num6;
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        num5 = scanner.nextInt();
        num6 = scanner.nextInt();
        System.out.println("您輸入第一個數字為：" + letterGrade(num1) );
        System.out.println("您輸入第二個數字為：" + letterGrade(num2) );
        System.out.println("您輸入第三個數字為：" + letterGrade(num3) );
        System.out.println("您輸入第三個數字為：" + letterGrade(num4) );
        System.out.println("您輸入第三個數字為：" + letterGrade(num5) );
        System.out.println("您輸入第三個數字為：" + letterGrade(num6) );

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
