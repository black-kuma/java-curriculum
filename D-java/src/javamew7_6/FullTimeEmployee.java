package javamew7_6;

public class FullTimeEmployee extends Employee  {
	//	フィールド変数
	//	時給
	final int workmon = 1250;

	//定時
	int regularHours = 8;

	//コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	//給料計算
	@Override
	public int costForDay(int hoursWorked) {

		int overtime = Math.max(0, hoursWorked - 8);

		return regularHours * workmon + (int) (overtime * workmon * 1.25);
	}

}
