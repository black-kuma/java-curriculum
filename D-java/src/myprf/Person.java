package myprf;

public class Person {
	//	フィールド変数
	String name;		// 名前
	int age;			// 年齢
	double height;		// 身長
	double weight;		// 体重

	//	コンストラクタ

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public double bmi() {
//		BMI ＝ 体重kg ÷ (身長m)2
		return Math.floor(weight / (this.height * this.height));

	}
	
	

	public void print() {
		System.out.println("名前は" + this.name + "です。");
		System.out.println("年は" + this.age + "才です。");
		System.out.println("BMIは" + bmi() + "です。\n");

	}
}
