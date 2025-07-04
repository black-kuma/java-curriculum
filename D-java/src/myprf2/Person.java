package myprf2;

public class Person {
	//	フィールド変数
	public String name;		 		// 名前	
	public int age; 				// 年齢
	public double height; 			// 身長	
	public double weight; 			// 体重	
	public static int count = 0;	// 人数を0で初期化

	//	コンストラクタ

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;

	}

	public double bmi() {
		//		BMI ＝ 体重kg ÷ (身長m)2
		return Math.floor(weight / (this.height * this.height));

	}

	public void print() {
		System.out.println("名前は" + this.name + "です。");
		System.out.println("年は" + this.age + "才です。");
	}

	public void printCount() {
		System.out.println("合計" + Person.count + "人です。");
	}
}
