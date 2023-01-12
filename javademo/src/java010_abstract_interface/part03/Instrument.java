package java010_abstract_interface.part03;

// 피아노를 연주하다. => 손
// 플롯을 연주하다. => 입
abstract public class Instrument {
	String name;
	
	public Instrument() {
		// TODO Auto-generated constructor stub
	}
	
	public Instrument(String name) {
		this.name = name;
	}
	
	abstract public void play();

}
