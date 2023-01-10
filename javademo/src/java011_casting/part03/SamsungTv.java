package java011_casting.part03;

public class SamsungTv {
	String maker;

	public SamsungTv() {

	}

	public SamsungTv(String maker) {
		this.maker = maker;
	}
	
	public void tutnOn() {
		System.out.printf("%s Tv - 전원을 켠다\n", maker);
	}
	public void tutnOff() {
		System.out.printf("%s Tv - 전원을 끈다\n", maker);
	}
	public void soundup() {
		System.out.printf("%s Tv - 소리를 높인다\n", maker);
	}
	public void sounduDown() {
		System.out.printf("%s Tv - 소리를 줄인다\n", maker);
	}
	
	public void move() {
		System.out.println("Sanmsung move");
	}

}
