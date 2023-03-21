package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BelongingDivisionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(BelongingDivisionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(BelongingDivisionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer belongingDivisionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(BelongingDivision row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(BelongingDivision row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<BelongingDivision> selectByExample(BelongingDivisionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	BelongingDivision selectByPrimaryKey(Integer belongingDivisionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") BelongingDivision row,
			@Param("example") BelongingDivisionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") BelongingDivision row, @Param("example") BelongingDivisionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(BelongingDivision row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_division
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(BelongingDivision row);
}