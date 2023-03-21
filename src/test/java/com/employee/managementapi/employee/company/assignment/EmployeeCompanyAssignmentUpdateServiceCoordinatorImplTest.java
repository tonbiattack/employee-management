package com.employee.managementapi.employee.company.assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import com.employee.managementapi.exception.NotFoundException;

/**
 * 社員会社配属登録サービステスト
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeCompanyAssignmentUpdateServiceCoordinatorImplTest {

	@Autowired
	private EmployeeCompanyAssignmentUpdateServiceCoordinator employeeCompanyAssignmentUpdateServiceCoordinator;

	@DisplayName("CREATE TEST:所属会社と会社配属にそれぞれ登録できているかどうか")
	@Test
	@Sql("/init.sql")
	@Sql("/employee_status.sql")
	@Sql("/gender.sql")
	@Sql("/employee.sql")
	@Sql("/company.sql")
	public void testInsert() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse("1971/11/25");
		EmployeeCompanyAssignment employeeCompanyAssignment = new EmployeeCompanyAssignment(1, 1, date);
		EmployeeCompanyAssignmentWithPrimaryKey employeeCompanyAssignmentWithPrimaryKey = new EmployeeCompanyAssignmentWithPrimaryKey(
				1,
				1,
				1, 1,
				date);
		EmployeeCompanyAssignmentWithPrimaryKey actual = employeeCompanyAssignmentUpdateServiceCoordinator
				.assignment(employeeCompanyAssignment);
		assertAll(
				() -> assertEquals(employeeCompanyAssignmentWithPrimaryKey.getBelongingCompanyId(),
						actual.getBelongingCompanyId()),
				() -> assertEquals(employeeCompanyAssignmentWithPrimaryKey.getCompanyId(),
						actual.getCompanyId()),
				() -> assertEquals(employeeCompanyAssignmentWithPrimaryKey.getEmployeeId(),
						actual.getEmployeeId()),
				() -> assertEquals(employeeCompanyAssignmentWithPrimaryKey.getCompanyAssignmentDate(),
						actual.getCompanyAssignmentDate()));
	}

	@Sql("/init.sql")
	@Sql("/employee_status.sql")
	@Sql("/gender.sql")
	@Sql("/employee.sql")
	@Sql("/company.sql")
	@Sql("/belonging_company.sql")
	@DisplayName("UPDATE TEST:所属会社を更新、会社配属に登録できているかどうか")
	@Test
	public void testUpdates() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse("1971/11/25");
		EmployeeCompanyAssignmentWithPrimaryKey employeeCompanyAssignmentWithPrimaryKey = new EmployeeCompanyAssignmentWithPrimaryKey(
				1,
				1,
				1, 1,
				date);
		EmployeeCompanyAssignmentWithPrimaryKey actual = employeeCompanyAssignmentUpdateServiceCoordinator
				.jobAssignmentSystem(employeeCompanyAssignmentWithPrimaryKey);
		assertAll(
				() -> assertEquals(employeeCompanyAssignmentWithPrimaryKey.getBelongingCompanyId(),
						actual.getBelongingCompanyId()),
				() -> assertEquals(employeeCompanyAssignmentWithPrimaryKey.getCompanyId(),
						actual.getCompanyId()),
				() -> assertEquals(employeeCompanyAssignmentWithPrimaryKey.getEmployeeId(),
						actual.getEmployeeId()),
				() -> assertEquals(employeeCompanyAssignmentWithPrimaryKey.getCompanyAssignmentDate(),
						actual.getCompanyAssignmentDate()));
	}

	@Sql("/init.sql")
	@Sql("/employee_status.sql")
	@Sql("/gender.sql")
	@Sql("/employee.sql")
	@Sql("/company.sql")
	@Sql("/company_assignment.sql")
	@Sql("/belonging_company.sql")
	// 異常系(Exception)のテストしかしないのは、戻り値がvoidのため。
	@DisplayName("DELETE TEST: 所属会社と会社配属を削除するときにリソースが存在しない場合、ResponseStatusExceptionをthrowする")
	@Test
	void testDelete() {
		// テストデータに存在しない異常データ
		int errorCompanyAssignmentId = 6001;
		int errorBelongingCompanyId = 6001;

		// テストデータに存在する正常データ
		int companyAssignmentId = 1;
		int belongingCompanyId = 1;

		assertAll(
				// 両方エラーデータのケース
				() -> assertThrows(NotFoundException.class,
						() -> employeeCompanyAssignmentUpdateServiceCoordinator.delete(
								errorCompanyAssignmentId,
								errorBelongingCompanyId)),
				// 配属会社がエラーデータ、所属会社が正常データのケース
				() -> assertThrows(NotFoundException.class,
						() -> employeeCompanyAssignmentUpdateServiceCoordinator.delete(
								errorCompanyAssignmentId,
								belongingCompanyId)),
				// 配属会社が正常データ、所属会社がエラーデータのケース
				() -> assertThrows(NotFoundException.class,
						() -> employeeCompanyAssignmentUpdateServiceCoordinator.delete(
								companyAssignmentId,
								errorBelongingCompanyId)));
	}
}
