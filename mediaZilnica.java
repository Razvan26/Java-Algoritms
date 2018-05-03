package runAndGo;

public class mediaZilnica {
	
	private static int WeeklyRun;
	
	public static int alergatulSaptamanal(int ziua1,int ziua2,int ziua3, int ziua4, int ziua5,int ziua6, int ziua7) {
		
		WeeklyRun = (ziua1 + ziua2 + ziua3+ ziua4 + ziua5 + ziua6 + ziua7) / 7;
		
		return WeeklyRun;
	}
	
	
	
}
