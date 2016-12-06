package com.exilant.day7;

import java.util.HashSet;
import java.util.Set;

class Mobile{
	private int mobId;
	private String mobName;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mobId;
		result = prime * result + ((mobName == null) ? 0 : mobName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		if (mobId != other.mobId)
			return false;
		if (mobName == null) {
			if (other.mobName != null)
				return false;
		} else if (!mobName.equals(other.mobName))
			return false;
		return true;
	}
	public Mobile(int mobId, String mobName) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
	}
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	
	
}


public class CollectionCustomSetEx8 {
	public static void main(String[] args) {
		Set<Mobile> set = new HashSet<Mobile>();
		
		System.out.println(set.add(new Mobile(101, "Apple")));
		System.out.println(set.add(new Mobile(101, "Apple")));
		System.out.println(set.add(new Mobile(101, "Apple")));
		System.out.println(set.add(new Mobile(101, "Apple")));
		System.out.println(set.add(new Mobile(74, "LG")));
		System.out.println(set.add(new Mobile(46, "Samsung")));
		System.out.println("----------------------------------");
		for(Mobile temp : set){
			System.out.println(temp.getMobId() +", " + temp.getMobName() +", " + 
					temp.hashCode());
		}
		
	}
}


























