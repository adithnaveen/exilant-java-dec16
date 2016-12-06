package packageb;

import packagea.DefineChild;
import packagea.DefineNotChild;

public class Client {
	public static void main(String[] args) {
		DefineChild dc = new DefineChild();
		System.out.println("****************************");
		DefineNotChild dnc = new DefineNotChild();
		System.out.println("****************************");
		DefineOthPackInh dopi = new DefineOthPackInh();
		System.out.println("****************************");
		DefineOthPackNonInh dopni = new DefineOthPackNonInh();
	}
}
