package javanew72;

public class Main {
	public static void main(String[] args) {
		//		Employeeクラスのインスタンス生成
		Employee emp2 = new Employee();
		//		変数に値を代入
		emp2.employeeId = "E001";
		emp2.name = "佐藤太郎";

		//		showinfoメソッドを呼び出し
		emp2.showinfo();
	}

}
