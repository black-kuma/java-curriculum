package javamew7_6;

public class ContractEmployee extends Employee  {
//	フィールド変数
//	時給
	final int workmon = 1000;
	
//	コンストラクタ
	public ContractEmployee(String id, String name) {
		super(id,name);
	}
//	日給計算
	@Override
	public int costForDay(int hoursWorked) {
		return hoursWorked * workmon;
	
	}
}
