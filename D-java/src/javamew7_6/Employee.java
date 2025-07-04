package javamew7_6;

abstract class Employee implements Billable{
	//	フィールド変数
	String id;
	String name;

	//	コンストラクタ
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	
//	costForDayメソッド
	
	
	public abstract int costForDay(int hoursWorked);


}
