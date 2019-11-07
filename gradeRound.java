import java.util.*;

class gradeRound{

	public static void main(String[] args){

		int count = 4;
		int[] grades = {73, 67, 38, 33};
		System.out.println("Welcome to Java");
		int[] result = new int[grades.length];
		int i = 0;
		while (count > 0) {

			int temp_grade = 5 * ((grades[i] / 5) + 1);
			System.out.println(temp_grade);
			
			if ((temp_grade - grades[i]) < 3 && temp_grade >= 40) {
				result[i] = temp_grade;
			} else {
				result[i] = grades[i];
			}
			i++;
			count--;
			
		}

		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(grades));
	}

}