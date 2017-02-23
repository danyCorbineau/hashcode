package hashcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	static Scanner sc;
	
	static int cacheMemory=0;
	static int nbVideo=0;
	static int nbCache=0;
	static int endPoint=0;
	static int nbRqt=0;
	
	static Video v[];
	static Endpoint ep[];

	public static void main(String[] args) {
		
		
		
		
		try {
			sc = new Scanner(new File("me_at_the_zoo.in"));
			
			/*
			 * 1er ligne
			 */
			String line=sc.nextLine();
			String table[]=line.split(" ");
			
			nbVideo=Integer.valueOf(table[0]);	endPoint=Integer.valueOf(table[1]);
			nbRqt=Integer.valueOf(table[2]);	nbCache=Integer.valueOf(table[3]);	
			cacheMemory=Integer.valueOf(table[4]);
			
			
			v=new Video[nbVideo];
			ep=new Endpoint[endPoint];
			
			/*
			 * 2ème ligne
			 */
			line=sc.nextLine();
			table=line.split(" ");
			for(int j=0;j<table.length&&j<nbVideo;j++)
				v[j]=new Video(table[j]);
			
			/*
			 * endpoint
			 */
			for(int j=0;j<nbCache;j++)
			{
				// 1 er ligne
				String fLine=sc.nextLine();
				String[] tabLine=fLine.split(" ");
				ep[j]=new Endpoint(j,Integer.valueOf(tabLine[0]), Integer.valueOf(tabLine[1]));
				
				for(int k=0;k<ep[j].getCacheConnected();k++)
					ep[j].ajouter(sc.nextLine());
			}
			
			/*
			 * rqt
			 */
			for(int j=0;j<nbRqt;j++)
			{
				line=sc.nextLine();
				table=line.split(" ");
				//ep[Integer.valueOf(table[1])].addline(Integer.valueOf(table[0]),Integer.valueOf(table[2]));
			}
			
			sc.close();
			
			write();
			
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
	
	public static void write()
	{
		ArrayList<Cache> c=new ArrayList<>();
		
		
		try{
		    PrintWriter writer = new PrintWriter("return.txt", "ASCII");
		    writer.println("The first line");
		    writer.println("The second line");
		    writer.close();
		} catch (IOException e) {
		   // do something
		}
		
	}
}


