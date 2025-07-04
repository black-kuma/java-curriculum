package javanew7_4;

public abstract class Employee {

	//フィールド宣言
	String employeeId;
	String name;

	//コンストラクタ
	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public String getName() {
		return this.name;
	}

	//	calculatedailywage = 日給の意
	//	日給計算
	/**
	 * 
	 * @param hoursWorked 働いた時間
	 * @return
	 */
	public abstract int calculateDailyWage(int hoursWorked);

}
