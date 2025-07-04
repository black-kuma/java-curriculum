package javanew7_7;

import java.util.ArrayList;
import java.util.List;

// Listに名簿を追加し拡張for文で各々の詳細を表示

public class Main {
	public static void main(String[] args) {

		List<Payable> SCL = new ArrayList<>();
		SCL.add(new FullTimeEmployee("E001", "山田太郎", 8));
		SCL.add(new ContractEmployee("E002", "田中花子", 9));
		SCL.add(new ContractEmployee("E003", "山田克子", 12));
		SCL.add(new FullTimeEmployee("E004", "山田門司", 8));
		SCL.add(new ContractEmployee("E005", "溝口貞夫", 10));
		SCL.add(new FullTimeEmployee("E006", "柴田咲枝", 8));
		SCL.add(new FullTimeEmployee("E007", "園田太一", 8));
		SCL.add(new ContractEmployee("E008", "池田美央", 4));

		for (Payable scl : SCL) {
			System.out.println(scl.getType() + ":" + scl.getName() + "の給料は" + scl.calculateSalary() + "円です。");
		}

	}

}