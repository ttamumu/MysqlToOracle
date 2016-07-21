package com.isoft.mto.test;

import com.isoft.mto.dao.DaoFromM;
import com.isoft.mto.dao.DaoToO;

public class Test {

	public static void main(String[]args){
		
//		System.out.println(new DaoFromM().DaoFromCountry());
//		new DaoToO().creatTable();
		new DaoToO().DaoToCountry(new DaoFromM().DaoFromCountry());
		
	
	}
	
	
}
