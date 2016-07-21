package com.isoft.mto.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.isoft.mto.util.Mcon;
import com.isoft.mto.vo.Country;

public class DaoFromM {

	private Mcon mcon=new Mcon();
	private PreparedStatement pre=null;
	private ResultSet resultSet=null;
	private List<Country> list=new ArrayList<Country>();
	
	public List<Country>  DaoFromCountry(){
		
		mcon.getConnection();
		try {
			String sql="select * from country";
			pre=mcon.getCon().prepareStatement(sql);
			
			resultSet=pre.executeQuery();
			while(resultSet.next()){
				
//				Country cou=new Country();
//				cou.setCountry(resultSet.getString("country"));
//				cou.setCountry_id(resultSet.getInt("country_id"));
//				list.add(cou);
				System.out.println(new Country(resultSet.getInt("country_id"),resultSet.getString("country")).toString());
				list.add(new Country(resultSet.getInt("country_id"),resultSet.getString("country")));
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mcon.close(mcon.getCon(), pre, resultSet);
			return list;
			
	}
	
}
