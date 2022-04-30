
public class MainClass {
	
	public static void main(String[] args) {
		
		C objC = new C();

		//Association example - C object uses keywords to produce a program
		Program p = objC.writeProgram("C Object");
               
                // Association example - C object uses a program to produce an output
		Output o = objC.executeProgram(p);
		
		Java objJava= new Java();
		
                //Association example - Java object uses keywords to produce a program
		Program p1 = objJava.writeProgram("Java Object");
		
                //Association example - Java object uses keywords to produce a program
                Output o1 = objJava.executeProgram(p);
		
                
		ProgrammingLanguage pl1 = new ProgrammingLanguage();
		pl1.updatePatch();. //Pl1 -static version is 1
		
		ProgrammingLanguage pl2 = new ProgrammingLanguage();
		pl2.updatePatch(); //pl2 - version will be 2 independent of object pl1
		
	}

}
