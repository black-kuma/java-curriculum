package javanew7_5;

abstract class Employee {
	//	フィールド宣言
	protected String id;
	
	protected String name;

//	コンストラクタ
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}

	
	//	calculateDailyWageメソッド
	public abstract int calculateDailyWage(int hoursWorked);


}
