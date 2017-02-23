package hashcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.naming.InterruptedNamingException;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc;
		
		int cacheMemory=0;
		int nbVideo=0;
		int nbCache=0;
		int endPoint=0;
		int nbRqt=0;
		
		
		
		
		
		try {
			sc = new Scanner(new File("me_at_the_zoo.in"));
			
			String line=sc.nextLine();
			String table[]=line.split(" ");
			
			nbVideo=Integer.valueOf(table[0]);	endPoint=Integer.valueOf(table[1]);
			nbRqt=Integer.valueOf(table[2]);	nbCache=Integer.valueOf(table[3]);	
			cacheMemory=Integer.valueOf(table[4]);
			
			while(sc.hasNext())
			{
				sc.nextLine();
			}
			
			sc.close();
			
			
			/*System.out.println("nbVideo:"+nbVideo);
			System.out.println("endPoint:"+endPoint);
			System.out.println("nbRqt:"+nbRqt);
			System.out.println("nbCache:"+nbCache);
			System.out.println("cacheMemory:"+cacheMemory);*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//sc.nextLine();
		//sc.next();
		
		
	}
}

