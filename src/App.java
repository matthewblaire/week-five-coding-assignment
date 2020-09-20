
public class App {

	public static void main(String[] args) {
		AsteriskLogger testAL = new AsteriskLogger(); //make test object for the AsteriskLogger
		SpacedLogger testSL = new SpacedLogger(); //make test object for the SpacedLogger
		
		System.out.println("AsteriskLogger log method:"); //formatting
		testAL.log("I'm making pizza rolls"); //testing log method on AsteriskLogger
		
		System.out.println("\nAsteriskLogger error method:"); //formatting
		testAL.error("pizza rolls left cooking too long"); //testing error method on AsteriskLogger
		
		
		System.out.println("\nSpacedLogger log method:"); //formatting
		
		testSL.log("I can only eat two cookies"); //testing log method on SpacedLogger
		
		System.out.println("\nSpacedLogger error method:"); //formatting
		testSL.error("I ate six cookies"); //testing error method on SpacedLogger
		

	}

}
