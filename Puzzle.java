import java.util.Scanner;

public class Puzzle	{
	
	public static void main(String[] args)	{
		System.out.print("Hello! I am Audrey who wrote this program. I am a Math and Accounting student from University of Waterloo. \nIt is not a double degree, but a degree with a dual major. \nUnlike most of the accounting degrees that are either Art or Commerce, this program is unique and extremely helpful. \n");
		System.out.print("Do you want to know why? (Yaa/Nah) \n--> ");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();
		String user;
		char ans = answer.charAt(0);	
		while (ans != 'N' && ans != 'Y' && ans != 'n' && ans != 'y')	{
			System.out.print("Sorry, no fancy word please. Simply just 'Yaa' or 'Nah' ");
			answer = scan.next();
			ans = answer.charAt(0);
		}	if (ans == 'Y' || ans == 'y') {
				System.out.print("==========\nIt is unique because it blends in both mathematics and accounting. \nStudents in this program are undoubtedly intellegent. \nThey acquired strong mathmatical, computer and statistical skills while building up the core accounting competencies. \nOn one hand, they try hard to go networking, be social and active as other art accounting students, but at the same time, they also have to try hard to manage the over-workload from their math courses. \nBefore we continue, hey, what is your name? \n--> ");
		}	else  {
				System.out.print("==========\nSure. I would have probably just regurgitated from this site anyways -> https://uwaterloo.ca/math/future-undergraduates/programs/mathematicschartered-professional-accountancy-mathcpa \nAnyways, what's your name? \n--> ");
		}
		answer = scan.next();
		user = answer;
		System.out.print("==========\nOh, Hello " + user + "! Nice to meet you. Thanks for trying to know me. \nIt is easy. Simply enter 'A' 'B' 'C' of your choice when time comes. \nYou can always end our conversation by entering 'E'. \nLet's try it now. Do you understand how this works? \nA. Yes! \nB. No... \nC. Whatever. \n--> ");
		answer = scan.next();
		ans = answer.charAt(0);
		if (ans == 'A')	{
			System.out.println("==========\nAmazing! Let's begin.");
		}	else if (ans == 'a') {
			System.out.println("==========\nGood! But I hope you could use CAPITAL letter next time.");
		}	else if (ans == 'b' || ans == 'B')	{
			System.out.println("==========\nWell I mean, you did it! At least you didn't hang me to dry.");
		}	else if (ans == 'E') {
			System.out.println("==========\nOkay. Nice talking with you, " + user + ".");
			System.exit(0);
		}	else  {
			System.out.println("==========\nAw don't be so bored already. I have so much more to tell you!");
		}	
		System.out.print("Do you still want to know about me and my program? \nA. Yes! \nB. No, tell me something else. \nC. No, we are done here. \n--> ");
		answer = scan.next();
		ans = answer.charAt(0);
		while (ans != 'a' && ans != 'A' && ans != 'b' && ans != 'B' && ans != 'c' && ans != 'C')	{
			if (ans == 'E')	{
				System.out.println("==========\nOkay. Nice talking with you, " + user + ".");
				System.exit(0);
			}
			System.out.print(user + ". Just type A, B, C please! \n--> ");
			answer = scan.next();
			ans = answer.charAt(0);
		}	if (ans == 'B' || ans == 'b')	{
			System.out.println("==========\nOk. Let me tell you why I chose this program.");
		}	else if (ans == 'C' || ans == 'c') {
			System.out.println("==========\nWhat a sad news :( I still wanna show you more. \nFarewell " + user + ".");
			System.exit(0);
		}
		System.out.print("I chose this program because, aside from what is mentioned above, I really want to learn as much as possible. \nWhen I was in high school, I saw how my brother wowed my world with his coding. \nI did not have any knowledge in coding and before that, I just wanted to get into UW's Accounting and Financial Management program. \nTherefore, when I see this program offered by UW, I believe it would be the best fit as coding is not a priority in this program, plus I can continue to learn more about accounting. \nA. How did you find your first CS course at UW? \nB. Is accounting what you love? \nC. Did you get an internship at the tech industry? \n--> ");
		answer = scan.next();
		ans = answer.charAt(0);
		while (ans != 'a' && ans != 'A' && ans != 'b' && ans != 'B' && ans != 'c' && ans != 'C')	{
			if (ans == 'E')	{
				System.out.println("==========\nOkay. Nice talking with you, " + user + ".");
				System.exit(0);
			}
			System.out.print(user + ". Just type A, B, C please! \n--> ");
			answer = scan.next();
			ans = answer.charAt(0);
		}//'How did you find your first CS course?'
		if (ans == 'A' || ans == 'a')	{
			System.out.print("==========\nThe struggle was real. \nMy peers crushed the course because most of them majored in CS. \nHence, this course smothered me. \nI spent literally everyday in doing the assignments while others just spent a couple hours. \nThe tutorial center was one of my most common places I stayed on campus. \nHey, that's not how I imagined my uni-life would be like! \nI guess, that IS the life you get for being a student at UW. \nA. Oh, how so? \nB. So, you don't have a social life, eh? \nC. I am sorry to hear that. \n--> ");
			answer = scan.next();
			ans = answer.charAt(0);
			while (ans != 'a' && ans != 'A' && ans != 'b' && ans != 'B' && ans != 'c' && ans != 'C')	{
				if (ans == 'E')	{
				System.out.println("==========\nOkay. Nice talking with you, " + user + ".");
				System.exit(0);
			}
			System.out.print(user + ". Just type A, B, C please! \n--> ");
			answer = scan.next();
			ans = answer.charAt(0);
		} //'Oh, how so? 
			if (ans == 'A' || ans == 'a')	{
				System.out.print("==========\nEveryone is so smart, and I just don't want to be the one who is below average. \nMy normal day goes like this: Class (Study) -> Tutorial Center (Assignments) -> Dorm (Sleep). \nI found my life sad. \nI swear I will not take anymore programming course at school anymore. \nA. So you don't want to code anymore? \nB. So you want to be an auditor? \nC. So you are lost. \n--> ");
				answer = scan.next();
				ans = answer.charAt(0);
				while (ans != 'a' && ans != 'A' && ans != 'b' && ans != 'B' && ans != 'c' && ans != 'C')	{
					if (ans == 'E')	{
					System.out.println("==========\nOkay. Nice talking with you, " + user + ".");
					System.exit(0);
				}
				System.out.print(user + ". Just type A, B, C please! \n--> ");
				answer = scan.next();
				ans = answer.charAt(0);
				} // So you don't want to code anymore? 
				if (ans == 'A' || ans == 'a')	{
					System.out.print("==========\nI didn't, but I still wanted to be in the tech industry. \nTherefore, I wanted to learn about UI/UX design. \n");
				} //So you want to be an auditor? 
				else if (ans == 'B' || ans == 'b')	{
					System.out.print("==========\nI don't. I just don't see myself siting all day and night, auditing. \nI thought UI/UX design would be a cool thing, so ");
				} //So you are lost
				else  {
					System.out.print("==========\nNot really. I want to code something. Frankly, there are so many resources available. \nI may not be good at writing academic tests, but that does not mean I learned nothing. \nI heard about UI/UX design, and I thought it would be a cool thing to learn. \n");
				}
				System.out.print("I joined the UI/UX club at school, attended workshops and hackathons and learned about design. \nBut I soon noticed that I wanted to code. \nUntil now, I still haven't taken anymore coding courses at school. \n");
			}//So, you don't have a social life, eh? & I am sorry to hear that.
			else  {
				System.out.print("==========\nWell, but as a potential accountant, I have to have a social life.\nAnd to be honest, it is how LIFE works. \nNetworking and stuff. \nBut I am greedy. \nI still want to code and contribute something useful to the world. \nA. How? \nB. To the accounting industry? \nC. Everyone says that, but they ended up contributing nothing. \n--> ");
				answer = scan.next();
				ans = answer.charAt(0);
				while (ans != 'a' && ans != 'A' && ans != 'b' && ans != 'B' && ans != 'c' && ans != 'C')	{
					if (ans == 'E')	{
					System.out.println("==========\nOkay. Nice talking with you, " + user + ".");
					System.exit(0);
				}
				System.out.print(user + ". Just type A, B, C please! \n--> ");
				answer = scan.next();
				ans = answer.charAt(0);
				} //How? && To the accounting industry?
				if (ans == 'A' || ans == 'a' || ans == 'b' || ans == 'B')	{
					System.out.print("==========\nHmm. I remember I wrote 'I want to make an impact in the accounting industry' in my university application. \nBut I gradually realize it is technology that is going to make an impact. \nSo, in the beginning, I wanted to be a UI/UX designer because I got the PTSD from my first and second coding courses at school. \nI went to a few workshops and hackathons as a designer and learned about UI/UX. \nBut it is not coding afterall. \nAfter two years, I guess I still want to be a programmer. \n");
				} //Everyone says that, but they ended up contributing nothing.
				else {
					System.out.print("==========\nYou are partially right. MOST people fail. \nBut I tell myself, there are a lot of things that I did not accomplish in my life, and I want to do at least one thing right. \nAnd that is coding. \n");
				}
			}
			System.out.print("I started learning Java from my brother, my friends, and YouTube. \nNow, here I am. Talking to you in Java. \nI will definitely continue coding! \nA. I am so happy for you, Audrey! \nB. You still have a long way to go. This is just basics. \nC. Java is useless, you should use python. \n--> ");
			answer = scan.next();
			ans = answer.charAt(0);
			while (ans != 'a' && ans != 'A' && ans != 'b' && ans != 'B' && ans != 'c' && ans != 'C')	{
				System.out.print(user + ". Just type A, B, C please! \n--> ");
				answer = scan.next();
				ans = answer.charAt(0);
			}
			if (ans == 'A' || ans == 'a') {
				System.out.println("==========\nAww thanks for having faith in me. It means so much to me.");
			}	else if (ans == 'B' || ans == 'b')	{
				System.out.println("==========\nYe, you are right. I am trying to learn how to code a game in java.");
			}	else  {
				System.out.println("==========\nHaha! Probably, but tbh Java is good for beginners like me. Python is definitely on my to-learn list after I master Java.");
			}
			System.out.println("Anyways, " + user + ", thank you for listening to my story! Bye for now. \n==========\n[This is the end of the file.]");
			System.exit(0);
		}//'Is accounting what you love?' & 'Did you get an internship at the tech industry?'
			else  {
				System.out.print("==========\nI thought I loved accounting, that was why I ended up being an assurance associate at one of the Big4s, PricewaterhouseCoopers. \nBack then I also had two other choices, which were Quality Assurance at UW, or Data Scientist at Statistic Canada. \nI met great people at PwC HK. They are friendly and helpful. \nHowever, when I compare the life at a tech company, I just don't feel like putting so many hours at work (We work from 9am till 3am during the busiest week!) \nA. Therefore, you want to code. \nB. Therefore, you want to do tax. \nC. Therefore, you are lost. \n--> ");
				answer = scan.next();
				ans = answer.charAt(0);
				while (ans != 'a' && ans != 'A' && ans != 'b' && ans != 'B' && ans != 'c' && ans != 'C')	{
					if (ans == 'E')	{
					System.out.println("==========\nOkay. Nice talking with you, " + user + ".");
					System.exit(0);
				}
				System.out.print(user + ". Just type A, B, C please! \n--> ");
				answer = scan.next();
				ans = answer.charAt(0);
				} //Therefore, you want to code.
				if (ans == 'A' || ans == 'a')	{
					System.out.print("==========\nI didn't, at the beginning, because I spent so many hours for a single question on assignments, and I did poorly on exams. \n");
				} //Therefore, you want to do tax.
				else if (ans == 'B' || ans == 'b')	{
					System.out.print("==========\nHmm, not really. Tax is just like audit during the peak season. \n");
				} //Therefore, you are lost.
				else  {
					System.out.print("==========\nNo actually, I want to CODE something. Frankly, there are so many resources available. \nI may not be good at writing academic tests, but that does not mean I learned nothing. \n");
				}
				System.out.print("I heard about UI/UX design. \nI joined the UI/UX club at school, attended workshops and hackathons and learned about design. \nBut I soon noticed that I wanted to code. \nUntil now, I still haven't taken anymore coding courses at school. \n");
			}
			System.out.print("I started learning Java from my brother, my friends, and YouTube. \nNow, here I am. Talking to you in Java. \nI will definitely continue coding! \nA. I am so happy for you, Audrey! \nB. You still have a long way to go. This is just basics. \nC. Java is useless, you should use python. \n--> ");
			answer = scan.next();
			ans = answer.charAt(0);
			while (ans != 'a' && ans != 'A' && ans != 'b' && ans != 'B' && ans != 'c' && ans != 'C')	{
				System.out.print(user + ". Just type A, B, C please! \n--> ");
				answer = scan.next();
				ans = answer.charAt(0);
			}
			if (ans == 'A' || ans == 'a') {
				System.out.println("==========\nAww thanks for having faith in me. It means so much to me.");
			}	else if (ans == 'B' || ans == 'b')	{
				System.out.println("==========\nYe, you are right. I am trying to learn how to code a game in java.");
			}	else  {
				System.out.println("==========\nHaha! Probably, but tbh Java is good for beginners like me. Python is definitely on my to-learn list after I master Java.");
			}
			System.out.println("Anyways, " + user + ", thank you for listening to my story! Bye for now. \n==========\n[This is the end of the file.]");	
	}
}
