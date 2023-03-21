package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProgrammingSkillMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(ProgrammingSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(ProgrammingSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer programmingSkillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(ProgrammingSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(ProgrammingSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<ProgrammingSkill> selectByExample(ProgrammingSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	ProgrammingSkill selectByPrimaryKey(Integer programmingSkillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") ProgrammingSkill row, @Param("example") ProgrammingSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") ProgrammingSkill row, @Param("example") ProgrammingSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(ProgrammingSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.programming_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(ProgrammingSkill row);
}