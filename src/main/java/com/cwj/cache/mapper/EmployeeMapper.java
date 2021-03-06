package com.cwj.cache.mapper;

import com.cwj.cache.bean.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {
    @Select("SELECT * FROM employee WHERE id=#{id}")
    public Employee getEmpById(Integer id);

    /**
     * private Integer id;
     *     private String lastName;
     *     private String email;
     *     private Integer gender; //1男 0女
     *     private Integer dId;
     * @param employee
     */
    @Update("UPDATE employee SET lastName=#{lastName},email=#{email},gender=#{gender},dId=#{dId} WHERE id=#{id}")
    public void updateEmp(Employee employee);

    @Delete("DELETE FROM employee WHERE id=#{id}")
    public void deleteEmpById(Integer id);

    @Insert("INSERT INTO employee(lastName,email,gender,d_id) VALUES(#{lastName},#{email},#{gender},#{dId})")
    public void insertEmployee(Employee employee);

    @Select("SELECT * FROM employee WHERE lastName = #{lastname}")
    public Employee getEmpByLastName(String lastName);
}
