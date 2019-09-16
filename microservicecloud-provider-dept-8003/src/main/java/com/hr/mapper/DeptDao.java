package com.hr.mapper;

import com.hr.entity.Dept;

import java.util.List;

/**
 * @author 李佳林
 * @date 2019-09-05 9:45
 * @desc
 */

public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
