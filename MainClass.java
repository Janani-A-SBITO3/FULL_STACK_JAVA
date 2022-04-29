
public class MainClass {
	
	public static void main(String[] args) {
		
		C objC = new C();
		
		Program p = objC.writeProgram("C Object");
		Output o = objC.executeProgram(p);
		
		Java objJava= new Java();
		
		Program p1 = objJava.writeProgram("Java Object");
		Output o1 = objJava.executeProgram(p);
		
		ProgrammingLanguage pl1 = new ProgrammingLanguage();
		pl1.updatePatch();
		
		ProgrammingLanguage pl2 = new ProgrammingLanguage();
		pl2.updatePatch();
		
	}

}
