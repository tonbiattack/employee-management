package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	long countByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	int deleteByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	int deleteByPrimaryKey(Integer roleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	int insert(Role row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	int insertSelective(Role row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	List<Role> selectByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	Role selectByPrimaryKey(Integer roleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	int updateByExampleSelective(@Param("row") Role row, @Param("example") RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	int updateByExample(@Param("row") Role row, @Param("example") RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	int updateByPrimaryKeySelective(Role row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.role
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	int updateByPrimaryKey(Role row);

}