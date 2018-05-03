package runAndGo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mainClass {
	
	public static mediaZilnica weekrun = new mediaZilnica();
	private static int ziua1;
	private static int ziua5;
	private static int ziua4;
	private static int ziua7;
	private static int ziua3;
	private static int ziua6;
	private static int ziua2;
	private static int RunOnWeek;
	private static File file = new File("ThisWeek.txt");
	private static Scanner csn = new Scanner(System.in);
	private static PrintWriter pw;
	public static void main(String[] args) {
		
		
		System.out.println("Enter how many miles you run on Monday : ");
		ziua1 = csn.nextInt();
		System.out.println("Enter how many miles you run on Tuesday : ");
		ziua2 = csn.nextInt();
		System.out.println("Enter how many miles you run on Wednesday : ");
		ziua3 = csn.nextInt();
		System.out.println("Enter how many miles you run on Thursday	 : ");
		ziua4 = csn.nextInt();
		System.out.println("Enter how many miles you run on Fridey : ");
		ziua5 = csn.nextInt();
		System.out.println("Enter how many miles you run on Saturday : ");
		ziua6 = csn.nextInt();
		System.out.println("Enter how many miles you run on Sunday : ");
		ziua7 = csn.nextInt();
		RunOnWeek = weekrun.alergatulSaptamanal(ziua1, ziua2, ziua3, ziua4, ziua5, ziua6, ziua7);
		System.out.println("The weekly average was : " + RunOnWeek + " miles");
		writeOnFile(RunOnWeek);
	}
	private static void writeOnFile(int medie) {
		
		if(file.exists()) {
			try {
				pw = new PrintWriter(file);
				for (int i = 0; i < 1; i++) {
					pw.write("The weekly average was : " + medie + "miles");
					pw.println();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			pw.close();
		}
		else {
			try {
				if(file.createNewFile()) {
					if(file.exists()) {

						if(file.canWrite() == true) {

							
						}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!");
				System.exit(0);
			}
		}
		
	}
	
}
