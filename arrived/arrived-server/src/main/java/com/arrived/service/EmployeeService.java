package com.arrived.service;

import com.arrived.dto.EmployeeDTO;
import com.arrived.dto.EmployeeLoginDTO;
import com.arrived.dto.EmployeePageQueryDTO;
import com.arrived.entity.Employee;
import com.arrived.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     *
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     *
     * @param employeeDTO
     * @return
     */
    void save(EmployeeDTO employeeDTO);


    /**
     * 员工分页查询
     *
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 用禁用员工账号
     * @param id
     * @param status
     * @return
     */
    void startOrStop(Integer status, Long id);


    /**
     * 根据id查询员工信息
     *
     * @param id
     * @return
     */
    Employee getById(Long id);

    /**
     * 更新员工信息
     *
     * @param employeeDTO
     * @return
     */
    void update(EmployeeDTO employeeDTO);
}
