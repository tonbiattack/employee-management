package com.employee.managementapi.infrastructure.employee;

import java.util.ArrayList;
import java.util.List;

public class EvaluationExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public EvaluationExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.evaluation
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.evaluation
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

		public Criteria andEvaluationIdIsNull() {
			addCriterion("evaluation_id is null");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdIsNotNull() {
			addCriterion("evaluation_id is not null");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdEqualTo(Integer value) {
			addCriterion("evaluation_id =", value, "evaluationId");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdNotEqualTo(Integer value) {
			addCriterion("evaluation_id <>", value, "evaluationId");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdGreaterThan(Integer value) {
			addCriterion("evaluation_id >", value, "evaluationId");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("evaluation_id >=", value, "evaluationId");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdLessThan(Integer value) {
			addCriterion("evaluation_id <", value, "evaluationId");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdLessThanOrEqualTo(Integer value) {
			addCriterion("evaluation_id <=", value, "evaluationId");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdIn(List<Integer> values) {
			addCriterion("evaluation_id in", values, "evaluationId");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdNotIn(List<Integer> values) {
			addCriterion("evaluation_id not in", values, "evaluationId");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdBetween(Integer value1, Integer value2) {
			addCriterion("evaluation_id between", value1, value2, "evaluationId");
			return (Criteria) this;
		}

		public Criteria andEvaluationIdNotBetween(Integer value1, Integer value2) {
			addCriterion("evaluation_id not between", value1, value2, "evaluationId");
			return (Criteria) this;
		}

		public Criteria andYearIsNull() {
			addCriterion("year is null");
			return (Criteria) this;
		}

		public Criteria andYearIsNotNull() {
			addCriterion("year is not null");
			return (Criteria) this;
		}

		public Criteria andYearEqualTo(Integer value) {
			addCriterion("year =", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotEqualTo(Integer value) {
			addCriterion("year <>", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearGreaterThan(Integer value) {
			addCriterion("year >", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearGreaterThanOrEqualTo(Integer value) {
			addCriterion("year >=", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearLessThan(Integer value) {
			addCriterion("year <", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearLessThanOrEqualTo(Integer value) {
			addCriterion("year <=", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearIn(List<Integer> values) {
			addCriterion("year in", values, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotIn(List<Integer> values) {
			addCriterion("year not in", values, "year");
			return (Criteria) this;
		}

		public Criteria andYearBetween(Integer value1, Integer value2) {
			addCriterion("year between", value1, value2, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotBetween(Integer value1, Integer value2) {
			addCriterion("year not between", value1, value2, "year");
			return (Criteria) this;
		}

		public Criteria andQuarterIsNull() {
			addCriterion("quarter is null");
			return (Criteria) this;
		}

		public Criteria andQuarterIsNotNull() {
			addCriterion("quarter is not null");
			return (Criteria) this;
		}

		public Criteria andQuarterEqualTo(Integer value) {
			addCriterion("quarter =", value, "quarter");
			return (Criteria) this;
		}

		public Criteria andQuarterNotEqualTo(Integer value) {
			addCriterion("quarter <>", value, "quarter");
			return (Criteria) this;
		}

		public Criteria andQuarterGreaterThan(Integer value) {
			addCriterion("quarter >", value, "quarter");
			return (Criteria) this;
		}

		public Criteria andQuarterGreaterThanOrEqualTo(Integer value) {
			addCriterion("quarter >=", value, "quarter");
			return (Criteria) this;
		}

		public Criteria andQuarterLessThan(Integer value) {
			addCriterion("quarter <", value, "quarter");
			return (Criteria) this;
		}

		public Criteria andQuarterLessThanOrEqualTo(Integer value) {
			addCriterion("quarter <=", value, "quarter");
			return (Criteria) this;
		}

		public Criteria andQuarterIn(List<Integer> values) {
			addCriterion("quarter in", values, "quarter");
			return (Criteria) this;
		}

		public Criteria andQuarterNotIn(List<Integer> values) {
			addCriterion("quarter not in", values, "quarter");
			return (Criteria) this;
		}

		public Criteria andQuarterBetween(Integer value1, Integer value2) {
			addCriterion("quarter between", value1, value2, "quarter");
			return (Criteria) this;
		}

		public Criteria andQuarterNotBetween(Integer value1, Integer value2) {
			addCriterion("quarter not between", value1, value2, "quarter");
			return (Criteria) this;
		}

		public Criteria andCommentIsNull() {
			addCriterion("comment is null");
			return (Criteria) this;
		}

		public Criteria andCommentIsNotNull() {
			addCriterion("comment is not null");
			return (Criteria) this;
		}

		public Criteria andCommentEqualTo(String value) {
			addCriterion("comment =", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotEqualTo(String value) {
			addCriterion("comment <>", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentGreaterThan(String value) {
			addCriterion("comment >", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentGreaterThanOrEqualTo(String value) {
			addCriterion("comment >=", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLessThan(String value) {
			addCriterion("comment <", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLessThanOrEqualTo(String value) {
			addCriterion("comment <=", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLike(String value) {
			addCriterion("comment like", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotLike(String value) {
			addCriterion("comment not like", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentIn(List<String> values) {
			addCriterion("comment in", values, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotIn(List<String> values) {
			addCriterion("comment not in", values, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentBetween(String value1, String value2) {
			addCriterion("comment between", value1, value2, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotBetween(String value1, String value2) {
			addCriterion("comment not between", value1, value2, "comment");
			return (Criteria) this;
		}

		public Criteria andEvaluationIsNull() {
			addCriterion("evaluation is null");
			return (Criteria) this;
		}

		public Criteria andEvaluationIsNotNull() {
			addCriterion("evaluation is not null");
			return (Criteria) this;
		}

		public Criteria andEvaluationEqualTo(Integer value) {
			addCriterion("evaluation =", value, "evaluation");
			return (Criteria) this;
		}

		public Criteria andEvaluationNotEqualTo(Integer value) {
			addCriterion("evaluation <>", value, "evaluation");
			return (Criteria) this;
		}

		public Criteria andEvaluationGreaterThan(Integer value) {
			addCriterion("evaluation >", value, "evaluation");
			return (Criteria) this;
		}

		public Criteria andEvaluationGreaterThanOrEqualTo(Integer value) {
			addCriterion("evaluation >=", value, "evaluation");
			return (Criteria) this;
		}

		public Criteria andEvaluationLessThan(Integer value) {
			addCriterion("evaluation <", value, "evaluation");
			return (Criteria) this;
		}

		public Criteria andEvaluationLessThanOrEqualTo(Integer value) {
			addCriterion("evaluation <=", value, "evaluation");
			return (Criteria) this;
		}

		public Criteria andEvaluationIn(List<Integer> values) {
			addCriterion("evaluation in", values, "evaluation");
			return (Criteria) this;
		}

		public Criteria andEvaluationNotIn(List<Integer> values) {
			addCriterion("evaluation not in", values, "evaluation");
			return (Criteria) this;
		}

		public Criteria andEvaluationBetween(Integer value1, Integer value2) {
			addCriterion("evaluation between", value1, value2, "evaluation");
			return (Criteria) this;
		}

		public Criteria andEvaluationNotBetween(Integer value1, Integer value2) {
			addCriterion("evaluation not between", value1, value2, "evaluation");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.evaluation
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
     * This class corresponds to the database table employee.evaluation
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 23 17:01:09 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}