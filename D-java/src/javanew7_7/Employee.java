package javanew7_7;

//SOLIDの原則に基づき加筆修正を行う。
// 変更前の原文は最下部にてコメントアウト

//やりたいこと(仮)
//雇用条件によって給与計算を切り替えて表示したい。

public abstract class Employee implements Payable {

	//	フィールド変数
	private String name;
	private String type;
	private int hours;

	// コンストラクタ
	public Employee(String type, String name, int hours) {
		this.type = type; 	// id
		this.name = name; 	// 名前
		this.hours = hours; // 時間
	}

	// 値の取得
	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getHours() {
		return hours;
	}

	//	給与算出メソッド
	public abstract int calculateSalary();
}

//class Employee {
//	private String name;
//	private String type;
//	private int hours;
//
//	public Employee(String name, String type, int hours) {
//		this.name = name;
//		this.type = type;
//		this.hours = hours;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public int getHours() {
//		return hours;
//	}
//}
