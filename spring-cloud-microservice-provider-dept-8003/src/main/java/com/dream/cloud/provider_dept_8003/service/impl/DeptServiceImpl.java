package com.dream.cloud.provider_dept_8003.service.impl;

import java.util.List;

import com.dream.cloud.provider_dept_8003.mapper.DeptMapper;
import com.dream.cloud.provider_dept_8003.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.cloud.api.entities.Dept;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
