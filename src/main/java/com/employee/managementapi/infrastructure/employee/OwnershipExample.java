package com.employee.managementapi.infrastructure.employee;

import java.util.ArrayList;
import java.util.List;

public class OwnershipExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	public OwnershipExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
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

		public Criteria andOwnershipIdIsNull() {
			addCriterion("ownership_id is null");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdIsNotNull() {
			addCriterion("ownership_id is not null");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdEqualTo(Integer value) {
			addCriterion("ownership_id =", value, "ownershipId");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdNotEqualTo(Integer value) {
			addCriterion("ownership_id <>", value, "ownershipId");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdGreaterThan(Integer value) {
			addCriterion("ownership_id >", value, "ownershipId");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("ownership_id >=", value, "ownershipId");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdLessThan(Integer value) {
			addCriterion("ownership_id <", value, "ownershipId");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdLessThanOrEqualTo(Integer value) {
			addCriterion("ownership_id <=", value, "ownershipId");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdIn(List<Integer> values) {
			addCriterion("ownership_id in", values, "ownershipId");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdNotIn(List<Integer> values) {
			addCriterion("ownership_id not in", values, "ownershipId");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdBetween(Integer value1, Integer value2) {
			addCriterion("ownership_id between", value1, value2, "ownershipId");
			return (Criteria) this;
		}

		public Criteria andOwnershipIdNotBetween(Integer value1, Integer value2) {
			addCriterion("ownership_id not between", value1, value2, "ownershipId");
			return (Criteria) this;
		}

		public Criteria andPasswordIdIsNull() {
			addCriterion("password_id is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIdIsNotNull() {
			addCriterion("password_id is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordIdEqualTo(Integer value) {
			addCriterion("password_id =", value, "passwordId");
			return (Criteria) this;
		}

		public Criteria andPasswordIdNotEqualTo(Integer value) {
			addCriterion("password_id <>", value, "passwordId");
			return (Criteria) this;
		}

		public Criteria andPasswordIdGreaterThan(Integer value) {
			addCriterion("password_id >", value, "passwordId");
			return (Criteria) this;
		}

		public Criteria andPasswordIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("password_id >=", value, "passwordId");
			return (Criteria) this;
		}

		public Criteria andPasswordIdLessThan(Integer value) {
			addCriterion("password_id <", value, "passwordId");
			return (Criteria) this;
		}

		public Criteria andPasswordIdLessThanOrEqualTo(Integer value) {
			addCriterion("password_id <=", value, "passwordId");
			return (Criteria) this;
		}

		public Criteria andPasswordIdIn(List<Integer> values) {
			addCriterion("password_id in", values, "passwordId");
			return (Criteria) this;
		}

		public Criteria andPasswordIdNotIn(List<Integer> values) {
			addCriterion("password_id not in", values, "passwordId");
			return (Criteria) this;
		}

		public Criteria andPasswordIdBetween(Integer value1, Integer value2) {
			addCriterion("password_id between", value1, value2, "passwordId");
			return (Criteria) this;
		}

		public Criteria andPasswordIdNotBetween(Integer value1, Integer value2) {
			addCriterion("password_id not between", value1, value2, "passwordId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNull() {
			addCriterion("role_id is null");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNotNull() {
			addCriterion("role_id is not null");
			return (Criteria) this;
		}

		public Criteria andRoleIdEqualTo(Integer value) {
			addCriterion("role_id =", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotEqualTo(Integer value) {
			addCriterion("role_id <>", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThan(Integer value) {
			addCriterion("role_id >", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("role_id >=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThan(Integer value) {
			addCriterion("role_id <", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
			addCriterion("role_id <=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIn(List<Integer> values) {
			addCriterion("role_id in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotIn(List<Integer> values) {
			addCriterion("role_id not in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdBetween(Integer value1, Integer value2) {
			addCriterion("role_id between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("role_id not between", value1, value2, "roleId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.ownership
	 * @mbg.generated  Wed Mar 01 20:18:56 JST 2023
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
     * This class corresponds to the database table employee.ownership
     *
     * @mbg.generated do_not_delete_during_merge Wed Mar 01 19:54:07 JST 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}