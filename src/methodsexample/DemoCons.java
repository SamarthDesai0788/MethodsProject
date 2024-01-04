package methodsexample;

public class DemoCons {
 DemoCons(){
	System.out.println("I am COnstructor");
}
	public static void main(String[] args) {
		System.out.println("Main Method");
		new DemoCons();
	}

}
