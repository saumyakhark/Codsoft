import java.util.Scanner;
public class grade{
	public static void main(String args[]){
		int marks[] = new int[6];
		int i;
		float total = 0, avg;
		Scanner scanner = new Scanner(System.in);

		for(i = 0; i < 6; i++){
			System.out.println("Enter Marks of Subject" +(i+1)+ ":");
			marks[i] = scanner.nextInt();
			total = total + marks[i];
		}
		scanner.close();
		avg = total/6;
		System.out.println("The student Grade is: ");
		if(avg >= 80){
			System.out.println("Grade is A");
			System.out.println("Percentage is " +avg +"%"); 
		}
		else if(avg >= 60 && avg < 80){
			System.out.println("Grade is B");
			System.out.println("Percentage is " +avg +"%");
		}
		else if (avg >= 40 && avg < 60){
			System.out.println("Grade is C");
			System.out.println("Percentage is " +avg +"%");
		}
		else if(avg >= 40 && avg < 30 ){
			System.out.println("Grade is D");
			System.out.println("Percentage is " +avg +"%");
		}
		else{
			System.out.println("Grade is F");
			System.out.println("Percentage is " +avg +"%");
		}
	}
}

