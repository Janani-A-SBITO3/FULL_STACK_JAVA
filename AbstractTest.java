
public class AbstractTest {

	public static void main(String[] args) {
				
				Guitar g = new Guitar();
				g.utilize();
				g.play();
				g.tuneStrings();
				g.pluck();
				
				Violin v = new Violin();
				v.utilize();
				v.play();
				v.tuneStrings();
				v.play();
	}
}
	
				abstract class Instrument {
					abstract void utilize();
				}
				abstract class MusicalInstrument extends Instrument {
					abstract void play();
				}
				abstract class StringBasedMusicalInstrument extends MusicalInstrument {
					abstract void tuneStrings();
				}
				class Guitar extends StringBasedMusicalInstrument {

					@Override
					void tuneStrings() {
						System.out.println("Tuning the Guitar strings");
					}

					@Override
					void play() {
						System.out.println("Playing the guitar...");
					}

					@Override
					void utilize() {
						System.out.println("Utilizing the guitar....");
					}

					void pluck() {
						System.out.println("Plucking the guitar....");
					}
				}

				class ElectronicGuitar extends Guitar {

				}
				
				class Violin extends StringBasedMusicalInstrument{
					
					String bow; //has A
					
					@Override
					void tuneStrings() {
						System.out.println("Tuning the Violin strings");
						
					}

					@Override
					void play() {
						System.out.println("Playing the Violin...");
						
					}

					@Override
					void utilize() {
						System.out.println("Utilizing the violin....");
						
					}
										
				}
				
				class Cello extends Violin {
					
				}
				
				
				class Sitar extends StringBasedMusicalInstrument{

					@Override
					void tuneStrings() {
						System.out.println("Tuning the Sitar strings");
						
					}

					@Override
					void play() {
						System.out.println("Playing the Sitar...");
						
					}

					@Override
					void utilize() {
						System.out.println("Utilizing the Sitar....");
						
					}
					
				}
				

			

		
