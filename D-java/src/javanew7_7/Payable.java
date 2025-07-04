package javanew7_7;
// 社員の給与を計算し、レポート出力するクラス

// SOLIDの原則に基づき加筆修正を行う。
// 変更前原文は最下部にてコメントアウト

//やりたいこと(仮)
//雇用条件によって給与計算を切り替えて表示したい。
// 今回残業代の請求はない。(時間 * 時給で統一)

public interface Payable {
	// このクラスの役割(計算機)
	//	interfaceクラスのメソッド(給与算出)
	int calculateSalary();

	//	各種値の取得
	String getName();

	String getType();

	int getHours();

	//	public void calculateSalary(Employee e) {
	//
	//		//		社員タイプごとにifで分岐
	//		if (e.getType().equal("FullTime")) {
	//			System.out.println(e.getName() + "の給料は" + (e.getHours() * 1200) + "円");
	//		} else if (e.getType().equal("Contract")) {
	//			System.out.println(e.getName() + "の給料は" + (e.getHours() * 1000) + "円");
	//		}
	//	}
}
