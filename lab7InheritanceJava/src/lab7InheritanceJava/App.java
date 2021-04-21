package lab7InheritanceJava;

public class App {

	public static void main(String[] args) {
		
		SwimmingPoll lpnlPoll = new SwimmingPoll();
		System.out.println(lpnlPoll);
		
		SwimmingPoll nulpPoll = new SwimmingPoll(18,"Stryiskyi park",40000,10);
		System.out.println(nulpPoll);
		
		SwimmingPoll DunamoPoll = new SwimmingPoll(23,"Vygovskogo st.",45000,12,25,2,100,5,150);
		System.out.println(DunamoPoll);
	
		SwimmingPoll.printStaticHoursOpened();
	}

}
