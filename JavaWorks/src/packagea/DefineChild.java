package packagea;

public class DefineChild extends Define{

	public void publicMethod() {
		System.out.println("Define Child - hey you called public method");
	}

	protected void protectedMethod() {
		System.out.println("Define Child - hey you called protected method");
	}

	void defaultMethod() {
		System.out.println("Define Child - hey you called default method");
	}

	public DefineChild() {
		super.publicMethod();
		super.protectedMethod();
		super.defaultMethod();
		
		this.publicMethod();
		this.defaultMethod();
		this.protectedMethod();
	}
}
