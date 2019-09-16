package com.hr.service;

import com.hr.entity.Dept;

import java.util.List;

/**
 * @author 李佳林
 * @date 2019-09-05 9:55
 * @desc
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
