package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DatabaseSkillMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(DatabaseSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(DatabaseSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer databaseSkillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(DatabaseSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(DatabaseSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<DatabaseSkill> selectByExample(DatabaseSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	DatabaseSkill selectByPrimaryKey(Integer databaseSkillId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") DatabaseSkill row, @Param("example") DatabaseSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") DatabaseSkill row, @Param("example") DatabaseSkillExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(DatabaseSkill row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.database_skill
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(DatabaseSkill row);

	int selectNextval();
}