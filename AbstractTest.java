
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
				abstract class MedicalInstrument extends Instrument {
					abstract void diagnose();
				}
				abstract class StringBasedMusicalInstrument extends MusicalInstrument {
					abstract void tuneStrings();
				}
				abstract class AirBasedMusicalInstrument extends MusicalInstrument {
					abstract void blowAir();
				}
				abstract class SurgicalMedicalInstrument extends MedicalInstrument{
					abstract void sterilize();
				}
				abstract class PathologicalMedicalInstrument extends MedicalInstrument{
					abstract void read();
					abstract void electricitySupply();
					abstract void scan();
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
				
				class Flute extends AirBasedMusicalInstrument{

					@Override
					void blowAir() {
						System.out.println("Playing the Flute....");
					}

					@Override
					void play() {
						System.out.println("Playing the Flute....");
					}

					@Override
					void utilize() {
						System.out.println("Utilizing the Flute....");
					}
				}
				
				class SaxoPhone extends AirBasedMusicalInstrument {

					@Override
					void blowAir() {
						System.out.println("SaxoPhone is blowing air....");
						
					}

					@Override
					void play() {
						System.out.println("Saxophone is playing");
					}

					@Override
					void utilize() {
						System.out.println("Saxophone is utilized....");
					}
					
				}
				
				class BagPipe extends AirBasedMusicalInstrument{

					@Override
					void blowAir() {
						System.out.println("BagPipe is blowing ar in and out....");
					}

					@Override
					void play() {
						System.out.println("BagPipe is playing.....");
						
					}

					@Override
					void utilize() {
						System.out.println();
						
					}
					
				}
				
				class Needle extends SurgicalMedicalInstrument{

					@Override
					void sterilize() {
						System.out.println("Strilizing the needle....");
						
					}

					@Override
					void diagnose() {
						System.out.println("Diagnozing using the needle...");
						
					}

					@Override
					void utilize() {
						System.out.println("Utilizing the needle.....");
						
					}
					
				}
				class Glucometer extends PathologicalMedicalInstrument{

					@Override
					void read() {
						// TODO Auto-generated method stub
						
					}

					@Override
					void electricitySupply() {
						// TODO Auto-generated method stub
						
					}

					@Override
					void scan() {
						// TODO Auto-generated method stub
						
					}

					@Override
					void diagnose() {
						// TODO Auto-generated method stub
						
					}

					@Override
					void utilize() {
						// TODO Auto-generated method stub
						
					}
					
				}
				
				
				

			

		
