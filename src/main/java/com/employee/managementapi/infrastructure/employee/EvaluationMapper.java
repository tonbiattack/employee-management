package com.employee.managementapi.infrastructure.employee;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EvaluationMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(EvaluationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(EvaluationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer evaluationId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(Evaluation row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(Evaluation row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<Evaluation> selectByExample(EvaluationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	Evaluation selectByPrimaryKey(Integer evaluationId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") Evaluation row, @Param("example") EvaluationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") Evaluation row, @Param("example") EvaluationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(Evaluation row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.evaluation
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(Evaluation row);
}