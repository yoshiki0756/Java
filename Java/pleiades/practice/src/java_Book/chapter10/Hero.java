package java_Book.chapter10;

import java_Book.chapter8.Matango;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

}
