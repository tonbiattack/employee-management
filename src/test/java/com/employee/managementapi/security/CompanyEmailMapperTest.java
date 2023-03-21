package com.employee.managementapi.security;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.jdbc.Sql;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Sql("/init.sql")
@Sql("/employee_status.sql")
@Sql("/gender.sql")
@Sql("/employee.sql")
@Sql("/employee_contact_information.sql")
@Sql("/active_employee_contact_information.sql")
@Sql("/password.sql")
public class CompanyEmailMapperTest {

	@Autowired
	private CompanyEmailMapper companyEmailMapper;

	@DisplayName("SELECT TEST:パスワードに登録されているメールアドレスを検索することができる、登録されているメールアドレスの件数を返すことが出来ている")
	@Test
	void testCountByCompanyEmail() {
		//メールアドレスが存在しない場合
		CompanyEmail companyEmailNone = new CompanyEmail("false@example.co.jp");
		int actualZero = companyEmailMapper.countByCompanyEmailAsPassword(companyEmailNone);
		//メールアドレスが1件存在する場合
		CompanyEmail companyEmailExists = new CompanyEmail("hayamamasahiro@example.co.jp");
		int actualOne = companyEmailMapper.countByCompanyEmailAsPassword(companyEmailExists);

		assertAll(
				//メールアドレスが登録されていない場合
				() -> assertEquals(0, actualZero),
				//メールアドレスが既に登録されている場合
				() -> assertEquals(1, actualOne));
	}

	@DisplayName("SELECT TEST:社用メールアドレスに紐づく現役社員連絡先IDを取得することができる")
	@Test
	void testSelectActiveEmployeeContactInformationIdByEmail() {
		//メールアドレスが1件存在する場合
		CompanyEmail companyEmail = new CompanyEmail("hayamamasahiro@example.co.jp");
		int actual = companyEmailMapper.selectActiveEmployeeContactInformationIdByEmail(companyEmail);
		assertEquals(1, actual);
	}
}
