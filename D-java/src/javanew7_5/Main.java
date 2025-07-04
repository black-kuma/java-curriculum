package javanew7_5;

import java.util.ArrayList;
import java.util.List;

//	社員リストList<Employee> にFullTimeEmployee
//	ContractEmployeeを複数追加
//	for-eachループcalculateDailyWage()を呼び出し
//	各社員の給料を出力
//	サブクラスを明示的に扱わずに、共通のEmployee型で実装
public class Main {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();		
		
//		リスト数の追加時に動的に動いてくれるのか要検証
//		サブクラスの明示な扱いか
		employees.add(new FullTimeEmployee("E001", "山田太郎"));
		employees.add(new ContractEmployee("E002", "田中花子"));
		employees.add(new ContractEmployee("E003", "田中克子"));
		employees.add(new FullTimeEmployee("E004", "山田門司"));

		for (Employee employee : employees) {
			System.out.println(employee.id + ", " + employee.name + ", " + employee.calculateDailyWage(9));
			
			
		}

	}

}
