package cn.bdqn.service.impl;

import cn.bdqn.domain.Employee;
import cn.bdqn.mapper.EmployeeMapper;
import cn.bdqn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Transactional(readOnly = true,propagation = Propagation.NOT_SUPPORTED)
    public List<Employee> queryAll() {
        return employeeMapper.selectAll();
    }
}
