package com.isoft.mto.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.isoft.mto.util.Ocon;
import com.isoft.mto.vo.Country;

public class DaoToO {
	
	private Ocon ocon=new Ocon();
	private PreparedStatement pre=null;
	
	
	public void creatTable(){
		
		ocon.getConnection();
		String sql="create table country(country_id int,country varchar(50))";
		try {
			pre=ocon.getCon().prepareStatement(sql);
			pre.execute();
			System.out.println("Oracle数据库创建成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ocon.close(ocon.getCon(), pre, null);
		
		
		
	}
	
	
	
	public void DaoToCountry(List<Country> list){
		
		this.creatTable();
		ocon.getConnection();
		
		
		for(Country cou:list){
			
			System.out.println("准备导入");
			
			System.out.println(cou.toString());
			
			String sql="insert into country values(?,?)";
			
			try {
				pre=ocon.getCon().prepareStatement(sql);
				pre.setInt(1, cou.getCountry_id());
				pre.setString(2, cou.getCountry());
				
				pre.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		ocon.close(ocon.getCon(), pre, null);
		
	}

}
