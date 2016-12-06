package com.exilant.day4;

abstract class  World{
	public abstract void air();
}

abstract class Asia extends World{
	public abstract void culture();
}


abstract class India extends Asia{
	@Override
	public void air() {
		// TODO Auto-generated method stub
		
	}
	
}

class Karnataka extends India{
	@Override
	public void culture() {
		// TODO Auto-generated method stub
		
	}
	
}
class Japan extends Asia{

	@Override
	public void culture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void air() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractTest {

}






