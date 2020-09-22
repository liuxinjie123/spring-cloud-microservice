package com.dream.cloud.provider_dept_hystrix_8001.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dream.cloud.api.entities.Dept;

@Mapper
public interface DeptMapper {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
