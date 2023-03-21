package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PasswordMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	long countByExample(PasswordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	int deleteByExample(PasswordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	int deleteByPrimaryKey(Integer passwordId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	int insert(Password row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	int insertSelective(Password row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	List<Password> selectByExample(PasswordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	Password selectByPrimaryKey(Integer passwordId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	int updateByExampleSelective(@Param("row") Password row, @Param("example") PasswordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	int updateByExample(@Param("row") Password row, @Param("example") PasswordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	int updateByPrimaryKeySelective(Password row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.password
	 * @mbg.generated  Thu Mar 02 11:48:57 JST 2023
	 */
	int updateByPrimaryKey(Password row);

	String searchExistsEmailByEmail(String searchEmail);

	int selectInsert(Password password);

	int selectActiveEmployeeContactInformationIdByEmail(Password password);

	int selectNextval();

}