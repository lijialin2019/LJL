package com.hr.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 李佳林
 * @date 2019-09-04 17:20
 * @desc
 */
//取消一些编译器产生的警告
@SuppressWarnings("serial")
//无参构造
@NoArgsConstructor
//get,set方法
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }

}


