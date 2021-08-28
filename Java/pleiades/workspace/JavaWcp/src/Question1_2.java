//課題1-2）　2から100までの偶数のみを全て足す計算プログラムを作成してください

public class Question1_2 {
	public static void main(String[] args) {
		
		int number = 100;
		int sum = 0;
		
		for(int i = 2; i <= number; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("2から100までの偶数のみを全て足した和は" + sum);
	}

}

//奇数のみを全て算出する場合は、if文を(i % 2 != 0)で作成可能