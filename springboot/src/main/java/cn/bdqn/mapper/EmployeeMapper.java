package cn.bdqn.mapper;

import cn.bdqn.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeMapper {
    public List<Employee> selectAll();
}
