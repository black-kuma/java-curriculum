package javanew7_4;

public class PartTimeEmployee extends Employee {
	public PartTimeEmployee(String employeeId, String name) {
		super(employeeId, name);
	}

	//時給
	private static final int HOURLY_RATE = 1000;
	
//	給料計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		//		日給計算に必要なもの:時給と時間

		return hoursWorked * HOURLY_RATE;
	}

}
