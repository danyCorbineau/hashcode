package hashcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("me_at_the_zoo.in"));
			
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//sc.nextLine();
		//sc.next();
		
		
	}

}

