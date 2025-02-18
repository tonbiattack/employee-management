package com.employee.managementapi.infrastructure.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectCompletionReportExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public ProjectCompletionReportExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.project_completion_report
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.project_completion_report
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

		public Criteria andProjectCompletionReportIdIsNull() {
			addCriterion("project_completion_report_id is null");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdIsNotNull() {
			addCriterion("project_completion_report_id is not null");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdEqualTo(Integer value) {
			addCriterion("project_completion_report_id =", value, "projectCompletionReportId");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdNotEqualTo(Integer value) {
			addCriterion("project_completion_report_id <>", value, "projectCompletionReportId");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdGreaterThan(Integer value) {
			addCriterion("project_completion_report_id >", value, "projectCompletionReportId");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("project_completion_report_id >=", value, "projectCompletionReportId");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdLessThan(Integer value) {
			addCriterion("project_completion_report_id <", value, "projectCompletionReportId");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdLessThanOrEqualTo(Integer value) {
			addCriterion("project_completion_report_id <=", value, "projectCompletionReportId");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdIn(List<Integer> values) {
			addCriterion("project_completion_report_id in", values, "projectCompletionReportId");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdNotIn(List<Integer> values) {
			addCriterion("project_completion_report_id not in", values, "projectCompletionReportId");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdBetween(Integer value1, Integer value2) {
			addCriterion("project_completion_report_id between", value1, value2, "projectCompletionReportId");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionReportIdNotBetween(Integer value1, Integer value2) {
			addCriterion("project_completion_report_id not between", value1, value2, "projectCompletionReportId");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateIsNull() {
			addCriterion("project_completion_date is null");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateIsNotNull() {
			addCriterion("project_completion_date is not null");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateEqualTo(Date value) {
			addCriterionForJDBCDate("project_completion_date =", value, "projectCompletionDate");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("project_completion_date <>", value, "projectCompletionDate");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateGreaterThan(Date value) {
			addCriterionForJDBCDate("project_completion_date >", value, "projectCompletionDate");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("project_completion_date >=", value, "projectCompletionDate");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateLessThan(Date value) {
			addCriterionForJDBCDate("project_completion_date <", value, "projectCompletionDate");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("project_completion_date <=", value, "projectCompletionDate");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateIn(List<Date> values) {
			addCriterionForJDBCDate("project_completion_date in", values, "projectCompletionDate");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("project_completion_date not in", values, "projectCompletionDate");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("project_completion_date between", value1, value2, "projectCompletionDate");
			return (Criteria) this;
		}

		public Criteria andProjectCompletionDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("project_completion_date not between", value1, value2, "projectCompletionDate");
			return (Criteria) this;
		}

		public Criteria andProjectIdIsNull() {
			addCriterion("project_id is null");
			return (Criteria) this;
		}

		public Criteria andProjectIdIsNotNull() {
			addCriterion("project_id is not null");
			return (Criteria) this;
		}

		public Criteria andProjectIdEqualTo(Integer value) {
			addCriterion("project_id =", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotEqualTo(Integer value) {
			addCriterion("project_id <>", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdGreaterThan(Integer value) {
			addCriterion("project_id >", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("project_id >=", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdLessThan(Integer value) {
			addCriterion("project_id <", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
			addCriterion("project_id <=", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdIn(List<Integer> values) {
			addCriterion("project_id in", values, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotIn(List<Integer> values) {
			addCriterion("project_id not in", values, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdBetween(Integer value1, Integer value2) {
			addCriterion("project_id between", value1, value2, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
			addCriterion("project_id not between", value1, value2, "projectId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.project_completion_report
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
     * This class corresponds to the database table employee.project_completion_report
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 23 17:01:09 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}