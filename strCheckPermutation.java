import java.util.*;

public class strCheckPermutation{
	public static void main(String[] args){
		String str1 = "kashfia";
		String str2 = "aifhsak";
		if(str1.isEmpty() == true && str2.isEmpty() == true){
			System.out.println("Both strings are empty");
			return;
		}		

		if(str1.isEmpty() == true || str2.isEmpty() == true){
			System.out.println("One of the String is empty");
			return;
		}

		else{
			char[] ar1 = str1.toCharArray();
			char[] ar2 = str2.toCharArray();
			Arrays.sort(ar1);
			Arrays.sort(ar2);

			str1 = String.valueOf(ar1);
			str2 = String.valueOf(ar2);

			if(str1.equals(str2))
			{
				System.out.println("Match found")
				
			}
		}
	}
}