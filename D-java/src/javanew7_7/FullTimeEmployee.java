package javanew7_7;

//SOLIDの原則に基づき加筆修正を行う。

//やりたいこと(仮)
//雇用条件によって給与計算を切り替えて表示したい。

public class FullTimeEmployee extends Employee {
	//	フィールド変数
	private final int HOURS_RATE = 1200;

	// コンストラクタ
	public FullTimeEmployee(String type, String name, int hours) {
		super(type, name, hours);

	}

	@Override // 給与算出(時間 * HOURS_RATE)
	public int calculateSalary() {
		return HOURS_RATE * getHours();

	}

}
