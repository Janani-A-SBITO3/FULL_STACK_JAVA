
public class ProgrammingLanguage {
	String keywords; //has a
	static int version; //has a
	Program writeProgram (String k) {
		Program p =new Program();
		System.out.println("Program written...."+k);
		return p;
		
	}
	Output executeProgram(Program p) {
		Output o = new Output();
		System.out.println("Program executed....");
		return o;
		
	}
	
	static void updatePatch() {
		version++;
		System.out.println("Current Version..."+version);
	}
}

class C extends ProgrammingLanguage{ 
	
        String author;//has a 

	Program writeProgram (String keywords) {
		return super.writeProgram(keywords);
	}
}

class Java extends ProgrammingLanguage{
	
        String author; //has a

	Program writeProgram (String keywords) {
		return super.writeProgram(keywords);
	}
}

class Program{
	String logic; //has a
	
	
}

class Output{
      
         Resultset rs;

	
}

Class Resultset {


}
