package packageb;

import packagea.Define;

public class DefineOthPackNonInh {
	public DefineOthPackNonInh() {
		Define define = new Define();
		System.out.println("------------ in Define Oth Pack Non inhe-------");
		define.publicMethod();
		System.out.println("-----------------------------------------------");
	}
}
