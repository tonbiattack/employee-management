package com.employee.managementapi.infrastructure.employee;

import java.util.ArrayList;
import java.util.List;

public class ActiveEmployeeContactInformationExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public ActiveEmployeeContactInformationExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employee.active_employee_contact_information
	 * @mbg.generated  Mon Dec 26 23:16:33 JST 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.active_employee_contact_information
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

		public Criteria andActiveEmployeeContactInformationIdIsNull() {
			addCriterion("active_employee_contact_information_id is null");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdIsNotNull() {
			addCriterion("active_employee_contact_information_id is not null");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdEqualTo(Integer value) {
			addCriterion("active_employee_contact_information_id =", value, "activeEmployeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdNotEqualTo(Integer value) {
			addCriterion("active_employee_contact_information_id <>", value, "activeEmployeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdGreaterThan(Integer value) {
			addCriterion("active_employee_contact_information_id >", value, "activeEmployeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("active_employee_contact_information_id >=", value, "activeEmployeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdLessThan(Integer value) {
			addCriterion("active_employee_contact_information_id <", value, "activeEmployeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdLessThanOrEqualTo(Integer value) {
			addCriterion("active_employee_contact_information_id <=", value, "activeEmployeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdIn(List<Integer> values) {
			addCriterion("active_employee_contact_information_id in", values, "activeEmployeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdNotIn(List<Integer> values) {
			addCriterion("active_employee_contact_information_id not in", values, "activeEmployeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdBetween(Integer value1, Integer value2) {
			addCriterion("active_employee_contact_information_id between", value1, value2,
					"activeEmployeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andActiveEmployeeContactInformationIdNotBetween(Integer value1, Integer value2) {
			addCriterion("active_employee_contact_information_id not between", value1, value2,
					"activeEmployeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdIsNull() {
			addCriterion("employee_contact_information_id is null");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdIsNotNull() {
			addCriterion("employee_contact_information_id is not null");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdEqualTo(Integer value) {
			addCriterion("employee_contact_information_id =", value, "employeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdNotEqualTo(Integer value) {
			addCriterion("employee_contact_information_id <>", value, "employeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdGreaterThan(Integer value) {
			addCriterion("employee_contact_information_id >", value, "employeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("employee_contact_information_id >=", value, "employeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdLessThan(Integer value) {
			addCriterion("employee_contact_information_id <", value, "employeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdLessThanOrEqualTo(Integer value) {
			addCriterion("employee_contact_information_id <=", value, "employeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdIn(List<Integer> values) {
			addCriterion("employee_contact_information_id in", values, "employeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdNotIn(List<Integer> values) {
			addCriterion("employee_contact_information_id not in", values, "employeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdBetween(Integer value1, Integer value2) {
			addCriterion("employee_contact_information_id between", value1, value2, "employeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andEmployeeContactInformationIdNotBetween(Integer value1, Integer value2) {
			addCriterion("employee_contact_information_id not between", value1, value2, "employeeContactInformationId");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberIsNull() {
			addCriterion("company_phone_number is null");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberIsNotNull() {
			addCriterion("company_phone_number is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberEqualTo(String value) {
			addCriterion("company_phone_number =", value, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberNotEqualTo(String value) {
			addCriterion("company_phone_number <>", value, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberGreaterThan(String value) {
			addCriterion("company_phone_number >", value, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberGreaterThanOrEqualTo(String value) {
			addCriterion("company_phone_number >=", value, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberLessThan(String value) {
			addCriterion("company_phone_number <", value, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberLessThanOrEqualTo(String value) {
			addCriterion("company_phone_number <=", value, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberLike(String value) {
			addCriterion("company_phone_number like", value, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberNotLike(String value) {
			addCriterion("company_phone_number not like", value, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberIn(List<String> values) {
			addCriterion("company_phone_number in", values, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberNotIn(List<String> values) {
			addCriterion("company_phone_number not in", values, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberBetween(String value1, String value2) {
			addCriterion("company_phone_number between", value1, value2, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyPhoneNumberNotBetween(String value1, String value2) {
			addCriterion("company_phone_number not between", value1, value2, "companyPhoneNumber");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailIsNull() {
			addCriterion("company_email is null");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailIsNotNull() {
			addCriterion("company_email is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailEqualTo(String value) {
			addCriterion("company_email =", value, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailNotEqualTo(String value) {
			addCriterion("company_email <>", value, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailGreaterThan(String value) {
			addCriterion("company_email >", value, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailGreaterThanOrEqualTo(String value) {
			addCriterion("company_email >=", value, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailLessThan(String value) {
			addCriterion("company_email <", value, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailLessThanOrEqualTo(String value) {
			addCriterion("company_email <=", value, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailLike(String value) {
			addCriterion("company_email like", value, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailNotLike(String value) {
			addCriterion("company_email not like", value, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailIn(List<String> values) {
			addCriterion("company_email in", values, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailNotIn(List<String> values) {
			addCriterion("company_email not in", values, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailBetween(String value1, String value2) {
			addCriterion("company_email between", value1, value2, "companyEmail");
			return (Criteria) this;
		}

		public Criteria andCompanyEmailNotBetween(String value1, String value2) {
			addCriterion("company_email not between", value1, value2, "companyEmail");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table employee.active_employee_contact_information
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
     * This class corresponds to the database table employee.active_employee_contact_information
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 23 17:01:09 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}