package myprf;

public class Person {
	//	 インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;

	//	コンストラクタを定義し、インスタンスフィールドに値をセット

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public double bmi() {
		return this.weight;

	}

	public void print() {
		System.out.println("名前は" + this.name + "です。");
		System.out.println("年は" + this.age + "才です。");
		System.out.println("BMIは" + this.weight + "です。\n");

	}
}
