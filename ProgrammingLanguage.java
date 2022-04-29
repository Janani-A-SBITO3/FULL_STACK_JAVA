

public class ProgrammingLanguage {
	String keywords; //has a
	
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
}

class C extends ProgrammingLanguage{ 
	
	Program writeProgram (String keywords) {
		return super.writeProgram(keywords);
	}
}

class Java extends ProgrammingLanguage{
	
	Program writeProgram (String keywords) {
		return super.writeProgram(keywords);
	}
}

class Program{
	
	
}

class Output{ 
	
}
