package javanew74;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String employeeId, String name) {
		super(employeeId, name);
		
	}

		private static final int HOURLY_RATE = 1200;
	@Override
	public int calculateDailyWage(int hoursWorked) {
		//		日給計算に必要な要素:時給、労働時間、定時、
		//		残業時間(労働時間-定時?)、残業代(残業時間*1.25)
//		勤務した時間を受け取って、その時間から8を引く＝残業時間
//		1200*9 +（9-8= a  1200* a *1.25）返却
		
		int time = 9;

		return hoursWorked * HOURLY_RATE;
	}

}
