package javanew74;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String employeeId, String name) {
		super(employeeId, name);

	}
//	private/staticなどはクラスの中、メソッドの外でないと弾かれる

	private static final int HOURLY_RATE = 1200;
	int hoursWorked = 9;
	int overtime = (hoursWorked - 8);
	

	@Override
	public static int calculateDailyWage(int hoursWorked) {
		//		日給計算に必要な要素:時給、労働時間、定時、
		//		残業時間(労働時間-定時?)、残業代(残業時間*1.25)
		//		勤務した時間を受け取って、その時間から8を引く＝残業時間
		//		1200*9 +（9-8= a  1200* a *1.25）返却
		
		
		return (hoursWorked * HOURLY_RATE) + (int)(overtime * HOURLY_RATE * 1.25);
	}

}
