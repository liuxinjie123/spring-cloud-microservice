package com.dream.cloud.provider_dept_8003.mapper;

import java.util.List;

import com.dream.cloud.api.entities.Dept;

public interface DeptMapper {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
