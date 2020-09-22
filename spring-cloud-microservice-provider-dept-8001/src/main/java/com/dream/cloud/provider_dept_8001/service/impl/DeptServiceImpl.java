package com.dream.cloud.provider_dept_8001.service.impl;

import com.dream.cloud.provider_dept_8001.mapper.DeptMapper;
import com.dream.cloud.api.entities.Dept;
import com.dream.cloud.provider_dept_8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

}
