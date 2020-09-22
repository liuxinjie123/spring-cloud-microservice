package com.dream.cloud.provider_dept_8001.mapper;

import com.dream.cloud.api.entities.Dept;
import java.util.List;

public interface DeptMapper {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
