package com.employee.managementapi.infrastructure.employee;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectCompletionReportMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(ProjectCompletionReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(ProjectCompletionReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer projectCompletionReportId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(ProjectCompletionReport row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(ProjectCompletionReport row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<ProjectCompletionReport> selectByExample(ProjectCompletionReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	ProjectCompletionReport selectByPrimaryKey(Integer projectCompletionReportId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") ProjectCompletionReport row,
			@Param("example") ProjectCompletionReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") ProjectCompletionReport row,
			@Param("example") ProjectCompletionReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(ProjectCompletionReport row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.project_completion_report
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(ProjectCompletionReport row);
}