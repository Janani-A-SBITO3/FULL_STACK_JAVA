class Kite
{
	private String kiteColor;
	private String kiteOwner;
	private int length;
	private static int kiteCount;//class's data - it's never an object data
	
	public Kite(String kiteColor, String kiteOwner, int length) {
		super();
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.length = length;
	}
	
	@Override
	public String toString() {
		return "Kite [kiteColor=" + kiteColor + ", kiteOwner=" + kiteOwner + ", length=" + length + "]";
	}
	
	
}
public class StaticTest {
	public static void main(String[] args) {
		Kite k1 = new Kite("Red","Jack",50);
	}
}
