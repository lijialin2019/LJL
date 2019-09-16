package com.hr.controller;

import com.hr.entity.Dept;
import com.hr.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 李佳林
 * @date 2019-09-05 10:01
 * @desc
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService service;

    // @RequestBody:它是作用在形参列表上，
    // 用于将前台发送过来固定格式的数据【xml 格式或者 json等】封装为对应的 JavaBean 对象
    @RequestMapping(value="/dept/add",method= RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    //@PathVariable 获得页面请求url的动态参数的值
    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = this.service.get(id);
        if(dept == null){
            throw new RuntimeException("该"+id+"没有对应的信息");
        }
        return dept;
    }

    @RequestMapping(value="/dept/list",method= RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        Dept errorObj = new Dept();
        errorObj.setDeptno(id);
        errorObj.setDname("该"+id+"没有对应的信息");
        errorObj.setDb_source("no this database in MySql");
        return errorObj;

    }

}
