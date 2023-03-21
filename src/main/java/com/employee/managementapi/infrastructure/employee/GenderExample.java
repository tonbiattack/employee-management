package com.employee.managementapi.infrastructure.employee;

import java.util.ArrayList;
import java.util.List;

public class GenderExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public GenderExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.gender
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.gender
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

		public Criteria andGenderIdIsNull() {
			addCriterion("gender_id is null");
			return (Criteria) this;
		}

		public Criteria andGenderIdIsNotNull() {
			addCriterion("gender_id is not null");
			return (Criteria) this;
		}

		public Criteria andGenderIdEqualTo(Integer value) {
			addCriterion("gender_id =", value, "genderId");
			return (Criteria) this;
		}

		public Criteria andGenderIdNotEqualTo(Integer value) {
			addCriterion("gender_id <>", value, "genderId");
			return (Criteria) this;
		}

		public Criteria andGenderIdGreaterThan(Integer value) {
			addCriterion("gender_id >", value, "genderId");
			return (Criteria) this;
		}

		public Criteria andGenderIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("gender_id >=", value, "genderId");
			return (Criteria) this;
		}

		public Criteria andGenderIdLessThan(Integer value) {
			addCriterion("gender_id <", value, "genderId");
			return (Criteria) this;
		}

		public Criteria andGenderIdLessThanOrEqualTo(Integer value) {
			addCriterion("gender_id <=", value, "genderId");
			return (Criteria) this;
		}

		public Criteria andGenderIdIn(List<Integer> values) {
			addCriterion("gender_id in", values, "genderId");
			return (Criteria) this;
		}

		public Criteria andGenderIdNotIn(List<Integer> values) {
			addCriterion("gender_id not in", values, "genderId");
			return (Criteria) this;
		}

		public Criteria andGenderIdBetween(Integer value1, Integer value2) {
			addCriterion("gender_id between", value1, value2, "genderId");
			return (Criteria) this;
		}

		public Criteria andGenderIdNotBetween(Integer value1, Integer value2) {
			addCriterion("gender_id not between", value1, value2, "genderId");
			return (Criteria) this;
		}

		public Criteria andGenderCodeIsNull() {
			addCriterion("gender_code is null");
			return (Criteria) this;
		}

		public Criteria andGenderCodeIsNotNull() {
			addCriterion("gender_code is not null");
			return (Criteria) this;
		}

		public Criteria andGenderCodeEqualTo(String value) {
			addCriterion("gender_code =", value, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeNotEqualTo(String value) {
			addCriterion("gender_code <>", value, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeGreaterThan(String value) {
			addCriterion("gender_code >", value, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeGreaterThanOrEqualTo(String value) {
			addCriterion("gender_code >=", value, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeLessThan(String value) {
			addCriterion("gender_code <", value, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeLessThanOrEqualTo(String value) {
			addCriterion("gender_code <=", value, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeLike(String value) {
			addCriterion("gender_code like", value, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeNotLike(String value) {
			addCriterion("gender_code not like", value, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeIn(List<String> values) {
			addCriterion("gender_code in", values, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeNotIn(List<String> values) {
			addCriterion("gender_code not in", values, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeBetween(String value1, String value2) {
			addCriterion("gender_code between", value1, value2, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderCodeNotBetween(String value1, String value2) {
			addCriterion("gender_code not between", value1, value2, "genderCode");
			return (Criteria) this;
		}

		public Criteria andGenderNameIsNull() {
			addCriterion("gender_name is null");
			return (Criteria) this;
		}

		public Criteria andGenderNameIsNotNull() {
			addCriterion("gender_name is not null");
			return (Criteria) this;
		}

		public Criteria andGenderNameEqualTo(String value) {
			addCriterion("gender_name =", value, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameNotEqualTo(String value) {
			addCriterion("gender_name <>", value, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameGreaterThan(String value) {
			addCriterion("gender_name >", value, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameGreaterThanOrEqualTo(String value) {
			addCriterion("gender_name >=", value, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameLessThan(String value) {
			addCriterion("gender_name <", value, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameLessThanOrEqualTo(String value) {
			addCriterion("gender_name <=", value, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameLike(String value) {
			addCriterion("gender_name like", value, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameNotLike(String value) {
			addCriterion("gender_name not like", value, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameIn(List<String> values) {
			addCriterion("gender_name in", values, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameNotIn(List<String> values) {
			addCriterion("gender_name not in", values, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameBetween(String value1, String value2) {
			addCriterion("gender_name between", value1, value2, "genderName");
			return (Criteria) this;
		}

		public Criteria andGenderNameNotBetween(String value1, String value2) {
			addCriterion("gender_name not between", value1, value2, "genderName");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.gender
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
     * This class corresponds to the database table employee.gender
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 23 17:01:09 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}