package com.dream.cloud.provider_dept_8003.service;

import java.util.List;

import com.dream.cloud.api.entities.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
