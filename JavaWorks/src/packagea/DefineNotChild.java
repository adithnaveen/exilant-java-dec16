package packagea;

public class DefineNotChild {
	Define define = new Define();

	public DefineNotChild(){
		System.out.println("-------- Called from Define Not Child -------------");
		define.defaultMethod();
		define.protectedMethod();
		define.publicMethod();
		System.out.println("-----------------------------------------------------");
	}
}
