package java_Book.chapter9;

public class Hero {
	String name;
	int hp;
	
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

}
