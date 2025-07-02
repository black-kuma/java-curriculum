package javanew74;

public abstract class Employee {

	//フィールド宣言
	public String employeeId;
	public String name;

	//メソッドの設定
	public String getEmployeeId() {
		return this.employeeId;
	}

	public String getName() {
		return this.name;
	}

	//	calculatedailywage = 日給の意
	public abstract int calculateDailyWage(int hoursWorked);

	//コンストラクタの定義
	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

}
