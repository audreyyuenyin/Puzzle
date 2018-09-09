import java.util.Scanner;

public class Puzzle	{
	
	public static void main(String[] args)	{
		System.out.print("Hello! I am Audrey who wrote this program. I am a Math and Accounting student from University of Waterloo. \nIt is not a double degree, but a degree with a dual major. \nUnlike most of the accounting degrees that are either Art or Commerce, this program is unique and extremely helpful. \n");
		System.out.print("Do you want to know why? (Yaa/Nah)");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();
		char ans = answer.charAt(0);	
		while (ans != 'N' && ans != 'Y' && ans != 'n' && ans != 'y')	{
			System.out.print("Sorry, no fancy word please. Simply just 'Yaa' or 'Nah' ");
			answer = scan.next();
			ans = answer.charAt(0);
		}	if (ans == 'Y' || ans == 'y') {
				System.out.print("It is unique because it blends in both mathematics and accounting. \nStudents in this program are undoubtedly intellegent. \nThey acquired strong mathmatical, computer and statistical skills while building up the core accounting competencies. \nOn one hand, they try hard to go networking, be social and active as other art accounting students, but at the same time, they also have to try hard to manage the over-workload from their math courses. \nThat's all about me. Hey, what is your name?\n");
		}	else  {
				System.out.print("Sure. I would have probably just regurgitated from this site anyways -> https://uwaterloo.ca/math/future-undergraduates/programs/mathematicschartered-professional-accountancy-mathcpa \nAnyways, what's your name?\n");
		}
			answer = scan.next();
			System.out.println("Oh, Hello " + answer + "! Nice to meet you. I have been waiting for you. \nThanks for opening this file.");
	}
}