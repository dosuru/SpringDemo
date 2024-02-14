package com.Tulasi.Project.SpringJdbc.engineer.dao;

import com.Tulasi.Project.SpringJdbc.engineer.dto.Engineer;

public interface EngineerDao {
	void create(Engineer engineer);
	void update(Engineer engineer);
	void delete(int id);

}
