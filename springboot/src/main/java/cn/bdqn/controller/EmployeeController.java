package cn.bdqn.controller;

import cn.bdqn.domain.Employee;
import cn.bdqn.service.EmployeeService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "员工模块")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "员工模块", notes = "查询全部员工",response = List.class)
    @ApiImplicitParams(
                    {@ApiImplicitParam(name="name", value="用户名", dataTypeClass = String.class),
                     @ApiImplicitParam(name="password", value="密码",dataTypeClass = String.class)
                    })
    @ApiResponses({
            @ApiResponse(code = 200 ,message = "查询成功"),
            @ApiResponse(code = 404 , message = "没有找到")})
    @RequestMapping("/queryAll")
    public List<Employee> queryAll(String name , String password){
        return employeeService.queryAll();
    }
}
