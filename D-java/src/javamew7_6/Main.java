package javamew7_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Billable> billables = new ArrayList<>();
		billables.add(new FullTimeEmployee("E001", "山田太郎"));
		billables.add(new ContractEmployee("E002", "田中花子"));
		billables.add(new ContractEmployee("E003", "田中克子"));
		billables.add(new FullTimeEmployee("E004", "山田門司"));
		billables.add(new ContractEmployee("E005", "溝口貞夫"));
		billables.add(new FullTimeEmployee("E006", "柴田咲枝"));

		for (Billable billable : billables) {
			System.out.println(billable.getId() + billable.getName() + billable.costForDay(9));
		}

	}

}
