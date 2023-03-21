package com.employee.managementapi.infrastructure.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AssumptionOfPositionExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public AssumptionOfPositionExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andAssumptionOfPositionIdIsNull() {
			addCriterion("assumption_of_position_id is null");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdIsNotNull() {
			addCriterion("assumption_of_position_id is not null");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdEqualTo(Integer value) {
			addCriterion("assumption_of_position_id =", value, "assumptionOfPositionId");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdNotEqualTo(Integer value) {
			addCriterion("assumption_of_position_id <>", value, "assumptionOfPositionId");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdGreaterThan(Integer value) {
			addCriterion("assumption_of_position_id >", value, "assumptionOfPositionId");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("assumption_of_position_id >=", value, "assumptionOfPositionId");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdLessThan(Integer value) {
			addCriterion("assumption_of_position_id <", value, "assumptionOfPositionId");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdLessThanOrEqualTo(Integer value) {
			addCriterion("assumption_of_position_id <=", value, "assumptionOfPositionId");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdIn(List<Integer> values) {
			addCriterion("assumption_of_position_id in", values, "assumptionOfPositionId");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdNotIn(List<Integer> values) {
			addCriterion("assumption_of_position_id not in", values, "assumptionOfPositionId");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdBetween(Integer value1, Integer value2) {
			addCriterion("assumption_of_position_id between", value1, value2, "assumptionOfPositionId");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionIdNotBetween(Integer value1, Integer value2) {
			addCriterion("assumption_of_position_id not between", value1, value2, "assumptionOfPositionId");
			return (Criteria) this;
		}

		public Criteria andPositionIdIsNull() {
			addCriterion("position_id is null");
			return (Criteria) this;
		}

		public Criteria andPositionIdIsNotNull() {
			addCriterion("position_id is not null");
			return (Criteria) this;
		}

		public Criteria andPositionIdEqualTo(Integer value) {
			addCriterion("position_id =", value, "positionId");
			return (Criteria) this;
		}

		public Criteria andPositionIdNotEqualTo(Integer value) {
			addCriterion("position_id <>", value, "positionId");
			return (Criteria) this;
		}

		public Criteria andPositionIdGreaterThan(Integer value) {
			addCriterion("position_id >", value, "positionId");
			return (Criteria) this;
		}

		public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("position_id >=", value, "positionId");
			return (Criteria) this;
		}

		public Criteria andPositionIdLessThan(Integer value) {
			addCriterion("position_id <", value, "positionId");
			return (Criteria) this;
		}

		public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
			addCriterion("position_id <=", value, "positionId");
			return (Criteria) this;
		}

		public Criteria andPositionIdIn(List<Integer> values) {
			addCriterion("position_id in", values, "positionId");
			return (Criteria) this;
		}

		public Criteria andPositionIdNotIn(List<Integer> values) {
			addCriterion("position_id not in", values, "positionId");
			return (Criteria) this;
		}

		public Criteria andPositionIdBetween(Integer value1, Integer value2) {
			addCriterion("position_id between", value1, value2, "positionId");
			return (Criteria) this;
		}

		public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
			addCriterion("position_id not between", value1, value2, "positionId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdIsNull() {
			addCriterion("employee_id is null");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdIsNotNull() {
			addCriterion("employee_id is not null");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdEqualTo(Integer value) {
			addCriterion("employee_id =", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdNotEqualTo(Integer value) {
			addCriterion("employee_id <>", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdGreaterThan(Integer value) {
			addCriterion("employee_id >", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("employee_id >=", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdLessThan(Integer value) {
			addCriterion("employee_id <", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
			addCriterion("employee_id <=", value, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdIn(List<Integer> values) {
			addCriterion("employee_id in", values, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdNotIn(List<Integer> values) {
			addCriterion("employee_id not in", values, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
			addCriterion("employee_id between", value1, value2, "employeeId");
			return (Criteria) this;
		}

		public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
			addCriterion("employee_id not between", value1, value2, "employeeId");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateIsNull() {
			addCriterion("assumption_of_position_date is null");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateIsNotNull() {
			addCriterion("assumption_of_position_date is not null");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateEqualTo(Date value) {
			addCriterionForJDBCDate("assumption_of_position_date =", value, "assumptionOfPositionDate");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("assumption_of_position_date <>", value, "assumptionOfPositionDate");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateGreaterThan(Date value) {
			addCriterionForJDBCDate("assumption_of_position_date >", value, "assumptionOfPositionDate");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("assumption_of_position_date >=", value, "assumptionOfPositionDate");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateLessThan(Date value) {
			addCriterionForJDBCDate("assumption_of_position_date <", value, "assumptionOfPositionDate");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("assumption_of_position_date <=", value, "assumptionOfPositionDate");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateIn(List<Date> values) {
			addCriterionForJDBCDate("assumption_of_position_date in", values, "assumptionOfPositionDate");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("assumption_of_position_date not in", values, "assumptionOfPositionDate");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("assumption_of_position_date between", value1, value2, "assumptionOfPositionDate");
			return (Criteria) this;
		}

		public Criteria andAssumptionOfPositionDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("assumption_of_position_date not between", value1, value2,
					"assumptionOfPositionDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.assumption_of_position
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table employee.assumption_of_position
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 23 17:01:09 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}