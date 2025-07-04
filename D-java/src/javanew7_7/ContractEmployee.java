package javanew7_7;

public class ContractEmployee extends Employee {
	//	フィールド変数
	private final int HOURS_RATE = 1000;

	//	 コンストラクタ
	public ContractEmployee(String type, String name, int hours) {
		super(type, name, hours);
	}

	@Override // 給与算出(時間 * HOURS_RATE)
	public int calculateSalary() {
		return HOURS_RATE * getHours();
	}

}
