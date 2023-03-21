package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BelongingTeamMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(BelongingTeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(BelongingTeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer belongingTeamId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(BelongingTeam row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(BelongingTeam row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<BelongingTeam> selectByExample(BelongingTeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	BelongingTeam selectByPrimaryKey(Integer belongingTeamId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") BelongingTeam row, @Param("example") BelongingTeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") BelongingTeam row, @Param("example") BelongingTeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(BelongingTeam row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.belonging_team
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(BelongingTeam row);
}