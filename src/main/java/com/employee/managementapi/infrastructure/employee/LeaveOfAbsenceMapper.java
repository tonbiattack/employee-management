package com.employee.managementapi.infrastructure.employee;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveOfAbsenceMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	long countByExample(LeaveOfAbsenceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByExample(LeaveOfAbsenceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int deleteByPrimaryKey(Integer leaveOfAbsenceId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insert(LeaveOfAbsence row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int insertSelective(LeaveOfAbsence row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	List<LeaveOfAbsence> selectByExample(LeaveOfAbsenceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	LeaveOfAbsence selectByPrimaryKey(Integer leaveOfAbsenceId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExampleSelective(@Param("row") LeaveOfAbsence row, @Param("example") LeaveOfAbsenceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByExample(@Param("row") LeaveOfAbsence row, @Param("example") LeaveOfAbsenceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKeySelective(LeaveOfAbsence row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee.leave_of_absence
	 * 
	 * @mbg.generated Mon Dec 26 23:16:33 JST 2022
	 */
	int updateByPrimaryKey(LeaveOfAbsence row);
}