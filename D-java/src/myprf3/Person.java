package myprf3;

public class Person {
//	フィールド変数
	public static int count = 0;		// 人数(0で初期化)
	public String firstName;			// "姓"
	public String lastName;				// "名"
	public int age;						// 年齢
	public double height,weight;		// 身長、体重
	
//	コンストラクタ
	Person(String firstName,String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age= age;
		this.height = height;
		this.weight = weight;
		Person.count++;
		
	}
	
	public String fullName() {
		return this.firstName + this.lastName;
		
	}
	
	public void print() {
		System.out.println("名前は" + this.fullName() + "です。");
		System.out.println("年は"+ this.age + "です。");
		
	}
	public double bmi() {
//		BMI ＝ 体重kg ÷ (身長m)2
		return Math.floor(weight / (this.height * this.height));

	}
	
	public static void printCount() {
		System.out.println("合計"+ Person.count + "人です。");
	}

}
