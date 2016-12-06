package packageb;

import packagea.Define;

public class DefineOthPackInh extends Define {
	public DefineOthPackInh() {
		System.out.println("------- In Define Oth Pack Inh -------");
		super.protectedMethod();
		super.publicMethod();
		System.out.println("------------------------------------");
	}

	
}
