package com.Tulasi.Project.SpringJdbc.engineer.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Tulasi.Project.SpringJdbc.engineer.dao.EngineerDao;
import com.Tulasi.Project.SpringJdbc.engineer.dto.Engineer;

public class EngineerDaoImpl implements EngineerDao {

	private JdbcTemplate jdbcTemplate;

	public void create(Engineer engineer) {
		String sql = "insert into engineer values(?,?,?)";
		int result = jdbcTemplate.update(sql, engineer.getId(), engineer.getFirstname(), engineer.getLastname());
		System.out.println(result);
	}

	public void update(Engineer engineer) {
		String sql = "update engineer set firstname=?,lastname=? where id = ?";
		int result = jdbcTemplate.update(sql,  engineer.getFirstname(), engineer.getLastname(),engineer.getId());
		System.out.println(result);
 
	}
	public void delete(int id) {
		String sql = "delete from engineer where id = ?";
		int result = jdbcTemplate.update(sql,id);
		System.out.println(result);
		
	}
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	


	

}
