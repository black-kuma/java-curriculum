package javanew7_4;

public class FullTimeEmployee extends Employee {

	//定時
	private static final int WORKTIME = 8;

	//時給
	private static final int HOURLY_RATE = 1200;

	//	コンストラクタ
	public FullTimeEmployee(String employeeId, String name) {
		super(employeeId, name);

	}

	//	給料計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		//		勤務した時間を受け取って、その時間から8を引く＝残業時間
		//		1200*8 +（9-8= a  1200* a *1.25）返却
		//		(定時*時給) + (残業時間 * 時給 * 1.25)
		int overtime = hoursWorked - WORKTIME;

		return (WORKTIME * HOURLY_RATE) + (int) (overtime * HOURLY_RATE * 1.25);
	}

}
