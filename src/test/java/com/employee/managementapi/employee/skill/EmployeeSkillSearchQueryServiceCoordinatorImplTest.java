package com.employee.managementapi.employee.skill;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import com.employee.managementapi.employee.EmployeeBasicProfile;
import com.employee.managementapi.skill.database.DatabaseSkill;
import com.employee.managementapi.skill.database.DatabaseSkillList;
import com.employee.managementapi.skill.framework.FrameworkSkill;
import com.employee.managementapi.skill.framework.FrameworkSkillList;
import com.employee.managementapi.skill.infrastructure.InfrastructureSkill;
import com.employee.managementapi.skill.infrastructure.InfrastructureSkillList;
import com.employee.managementapi.skill.programming.ProgrammingSkill;
import com.employee.managementapi.skill.programming.ProgrammingSkillList;

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Sql("/init.sql")
@Sql("/employee_status.sql")
@Sql("/gender.sql")
@Sql("/employee.sql")
@Sql("/database_skill.sql")
@Sql("/employee_database_skill.sql")
@Sql("/framework_skill.sql")
@Sql("/employee_framework_skill.sql")
@Sql("/infrastructure_skill.sql")
@Sql("/employee_infrastructure_skill.sql")
@Sql("/programming_skill.sql")
@Sql("/employee_programming_skill.sql")
public class EmployeeSkillSearchQueryServiceCoordinatorImplTest {

	@Autowired
	private EmployeeSkillSearchQueryServiceCoordinator employeeSkillSearchQueryServiceCoordinator;

	@DisplayName("SELECT TEST:スキル名とスキルレベルで検索することが出来る、正しい要素を取得することが出来ている")
	@Test
	public void testSearchBySkillLevelAndSkillName() {
		// 前処理
		ProgrammingSkill domainProgrammingSkill1 = new ProgrammingSkill(3, "C言語", 3);
		ProgrammingSkill domainProgrammingSkill2 = new ProgrammingSkill(4, "C#", 3);
		List<ProgrammingSkill> programmingSkills = new ArrayList<>();
		programmingSkills.add(domainProgrammingSkill1);
		programmingSkills.add(domainProgrammingSkill2);
		ProgrammingSkillList programmingSkillList = new ProgrammingSkillList(
				programmingSkills);

		InfrastructureSkill domainInfrastructureSkill1 = new InfrastructureSkill(3, "AWS", 3);
		InfrastructureSkill domainInfrastructureSkill2 = new InfrastructureSkill(4, "Debian", 3);
		List<InfrastructureSkill> infrastructureSkills = new ArrayList<>();
		infrastructureSkills.add(domainInfrastructureSkill1);
		infrastructureSkills.add(domainInfrastructureSkill2);
		InfrastructureSkillList infrastructureSkillList = new InfrastructureSkillList(
				infrastructureSkills);

		FrameworkSkill domainFrameworkSkill1 = new FrameworkSkill(3, "Angular", 3);
		FrameworkSkill domainFrameworkSkill2 = new FrameworkSkill(4, "Spring Boot", 3);
		List<FrameworkSkill> frameworkSkills = new ArrayList<>();
		frameworkSkills.add(domainFrameworkSkill1);
		frameworkSkills.add(domainFrameworkSkill2);
		FrameworkSkillList frameworkSkillList = new FrameworkSkillList(
				frameworkSkills);

		DatabaseSkill domainDatabaseSkill1 = new DatabaseSkill(3, "DynamoDB", 3);
		DatabaseSkill domainDatabaseSkill2 = new DatabaseSkill(4, "MongoDB", 3);
		List<DatabaseSkill> databaseSkills = new ArrayList<>();
		databaseSkills.add(domainDatabaseSkill1);
		databaseSkills.add(domainDatabaseSkill2);
		DatabaseSkillList databaseSkillList = new DatabaseSkillList(databaseSkills);

		EmployeeSkill employeeSkill = new EmployeeSkill(programmingSkillList, frameworkSkillList,
				databaseSkillList, infrastructureSkillList);

		// 実行
		EmployeeSkillSearchList actual = employeeSkillSearchQueryServiceCoordinator.multiSkillFilter(employeeSkill);

		// 実行結果のデータ抽出
		List<EmployeeSkillSearch> actualEmployeeSkillSearchs = actual.getEmployeeSkillSearchs();

		/**
		 * 社員一人目
		 */
		EmployeeSkillSearch actualEmployeeSkillSearch1 = actualEmployeeSkillSearchs.get(0);

		// 社員基本情報
		EmployeeBasicProfile actualEmployeeBasicProfile1 = actualEmployeeSkillSearch1.getEmployeeBasicProfile();

		// プログラミングスキル
		ProgrammingSkillList actualDomainProgrammingSkillList1 = actualEmployeeSkillSearch1
				.getProgrammingSkillList();
		ProgrammingSkill actualDomainProgrammingSkill1 = actualDomainProgrammingSkillList1.get(0);
		ProgrammingSkill actualDomainProgrammingSkill2 = actualDomainProgrammingSkillList1.get(1);

		// インフラスキル
		InfrastructureSkillList actualDomainInfrastructureSkillList1 = actualEmployeeSkillSearch1
				.getInfrastructureSkillList();
		InfrastructureSkill actualDomainInfrastructureSkill1 = actualDomainInfrastructureSkillList1.get(0);
		InfrastructureSkill actualDomainInfrastructureSkill2 = actualDomainInfrastructureSkillList1.get(1);

		// フレームワークスキル
		FrameworkSkillList actualDomainFrameworkSkillList1 = actualEmployeeSkillSearch1
				.getFrameworkSkillList();
		FrameworkSkill actualDomainFrameworkSkill1 = actualDomainFrameworkSkillList1.get(0);
		FrameworkSkill actualDomainFrameworkSkill2 = actualDomainFrameworkSkillList1.get(1);

		// データベーススキル
		DatabaseSkillList actualDomainDatabaseSkillList1 = actualEmployeeSkillSearch1
				.getDatabaseSkillList();
		DatabaseSkill actualDomainDatabaseSkill1 = actualDomainDatabaseSkillList1.get(0);
		DatabaseSkill actualDomainDatabaseSkill2 = actualDomainDatabaseSkillList1.get(1);

		/**
		 * 社員二人目
		 */
		EmployeeSkillSearch actualEmployeeSkillSearch2 = actualEmployeeSkillSearchs.get(1);

		// 社員基本情報
		EmployeeBasicProfile actualEmployeeBasicProfile2 = actualEmployeeSkillSearch2.getEmployeeBasicProfile();

		// プログラミングスキル
		ProgrammingSkillList actualDomainProgrammingSkillList2 = actualEmployeeSkillSearch2
				.getProgrammingSkillList();
		ProgrammingSkill actualDomainProgrammingSkill3 = actualDomainProgrammingSkillList2.get(0);
		ProgrammingSkill actualDomainProgrammingSkill4 = actualDomainProgrammingSkillList2.get(1);

		// インフラスキル
		InfrastructureSkillList actualDomainInfrastructureSkillList2 = actualEmployeeSkillSearch2
				.getInfrastructureSkillList();
		InfrastructureSkill actualDomainInfrastructureSkill3 = actualDomainInfrastructureSkillList2.get(0);
		InfrastructureSkill actualDomainInfrastructureSkill4 = actualDomainInfrastructureSkillList2.get(1);

		// フレームワークスキル
		FrameworkSkillList actualDomainFrameworkSkillList2 = actualEmployeeSkillSearch2
				.getFrameworkSkillList();
		FrameworkSkill actualDomainFrameworkSkill3 = actualDomainFrameworkSkillList2.get(0);
		FrameworkSkill actualDomainFrameworkSkill4 = actualDomainFrameworkSkillList2.get(1);

		// データベーススキル
		DatabaseSkillList actualDomainDatabaseSkillList2 = actualEmployeeSkillSearch2
				.getDatabaseSkillList();
		DatabaseSkill actualDomainDatabaseSkill3 = actualDomainDatabaseSkillList2.get(0);
		DatabaseSkill actualDomainDatabaseSkill4 = actualDomainDatabaseSkillList2.get(1);

		assertAll(
				// 社員基本情報部分の評価
				() -> assertEquals(1, actualEmployeeBasicProfile1.getEmployeeId()),
				() -> assertEquals("26", actualEmployeeBasicProfile1.getEmployeeCode()),
				() -> assertEquals("田嶋", actualEmployeeBasicProfile1.getFamilyName()),
				() -> assertEquals("研人", actualEmployeeBasicProfile1.getLastName()),
				() -> assertEquals("タジマ", actualEmployeeBasicProfile1.getFamilyNameFurigana()),
				() -> assertEquals("ケント", actualEmployeeBasicProfile1.getLastNameFurigana()),
				() -> assertEquals(2, actualEmployeeBasicProfile2.getEmployeeId()),
				() -> assertEquals("27", actualEmployeeBasicProfile2.getEmployeeCode()),
				() -> assertEquals("中田", actualEmployeeBasicProfile2.getFamilyName()),
				() -> assertEquals("あやか", actualEmployeeBasicProfile2.getLastName()),
				() -> assertEquals("ナカタ", actualEmployeeBasicProfile2.getFamilyNameFurigana()),
				() -> assertEquals("アヤカ", actualEmployeeBasicProfile2.getLastNameFurigana()),
				// プログラミングスキルの評価
				() -> assertEquals(3, actualDomainProgrammingSkill1.getProgrammingSkillId()),
				() -> assertEquals("C言語", actualDomainProgrammingSkill1.getProgrammingSkillName()),
				() -> assertEquals(9, actualDomainProgrammingSkill1.getSkillLevel()),
				() -> assertEquals(4, actualDomainProgrammingSkill2.getProgrammingSkillId()),
				() -> assertEquals("C#", actualDomainProgrammingSkill2.getProgrammingSkillName()),
				() -> assertEquals(8, actualDomainProgrammingSkill2.getSkillLevel()),
				() -> assertEquals(3, actualDomainProgrammingSkill3.getProgrammingSkillId()),
				() -> assertEquals("C言語", actualDomainProgrammingSkill3.getProgrammingSkillName()),
				() -> assertEquals(4, actualDomainProgrammingSkill3.getSkillLevel()),
				() -> assertEquals(4, actualDomainProgrammingSkill4.getProgrammingSkillId()),
				() -> assertEquals("C#", actualDomainProgrammingSkill4.getProgrammingSkillName()),
				() -> assertEquals(4, actualDomainProgrammingSkill4.getSkillLevel()),
				// インフラスキルの評価
				() -> assertEquals(3, actualDomainInfrastructureSkill1.getInfrastructureSkillId()),
				() -> assertEquals("AWS", actualDomainInfrastructureSkill1.getInfrastructureSkillName()),
				() -> assertEquals(6, actualDomainInfrastructureSkill1.getSkillLevel()),
				() -> assertEquals(4, actualDomainInfrastructureSkill2.getInfrastructureSkillId()),
				() -> assertEquals("Debian", actualDomainInfrastructureSkill2.getInfrastructureSkillName()),
				() -> assertEquals(6, actualDomainInfrastructureSkill2.getSkillLevel()),
				() -> assertEquals(3, actualDomainInfrastructureSkill3.getInfrastructureSkillId()),
				() -> assertEquals("AWS", actualDomainInfrastructureSkill3.getInfrastructureSkillName()),
				() -> assertEquals(3, actualDomainInfrastructureSkill3.getSkillLevel()),
				() -> assertEquals(4, actualDomainInfrastructureSkill4.getInfrastructureSkillId()),
				() -> assertEquals("Debian", actualDomainInfrastructureSkill4.getInfrastructureSkillName()),
				() -> assertEquals(4, actualDomainInfrastructureSkill4.getSkillLevel()),
				// フレームワークスキルの評価
				() -> assertEquals(3, actualDomainFrameworkSkill1.getFrameworkSkillId()),
				() -> assertEquals("Angular", actualDomainFrameworkSkill1.getFrameworkSkillName()),
				() -> assertEquals(5, actualDomainFrameworkSkill1.getSkillLevel()),
				() -> assertEquals(4, actualDomainFrameworkSkill2.getFrameworkSkillId()),
				() -> assertEquals("Spring Boot", actualDomainFrameworkSkill2.getFrameworkSkillName()),
				() -> assertEquals(5, actualDomainFrameworkSkill2.getSkillLevel()),
				() -> assertEquals(3, actualDomainFrameworkSkill3.getFrameworkSkillId()),
				() -> assertEquals("Angular", actualDomainFrameworkSkill3.getFrameworkSkillName()),
				() -> assertEquals(3, actualDomainFrameworkSkill3.getSkillLevel()),
				() -> assertEquals(4, actualDomainFrameworkSkill4.getFrameworkSkillId()),
				() -> assertEquals("Spring Boot", actualDomainFrameworkSkill4.getFrameworkSkillName()),
				() -> assertEquals(8, actualDomainFrameworkSkill4.getSkillLevel()),
				// データベーススキルの評価
				() -> assertEquals(3, actualDomainDatabaseSkill1.getDatabaseSkillId()),
				() -> assertEquals("DynamoDB", actualDomainDatabaseSkill1.getDatabaseSkillName()),
				() -> assertEquals(10, actualDomainDatabaseSkill1.getSkillLevel()),
				() -> assertEquals(4, actualDomainDatabaseSkill2.getDatabaseSkillId()),
				() -> assertEquals("MongoDB", actualDomainDatabaseSkill2.getDatabaseSkillName()),
				() -> assertEquals(5, actualDomainDatabaseSkill2.getSkillLevel()),
				() -> assertEquals(3, actualDomainDatabaseSkill3.getDatabaseSkillId()),
				() -> assertEquals("DynamoDB", actualDomainDatabaseSkill3.getDatabaseSkillName()),
				() -> assertEquals(5, actualDomainDatabaseSkill3.getSkillLevel()),
				() -> assertEquals(4, actualDomainDatabaseSkill4.getDatabaseSkillId()),
				() -> assertEquals("MongoDB", actualDomainDatabaseSkill4.getDatabaseSkillName()),
				() -> assertEquals(4, actualDomainDatabaseSkill4.getSkillLevel()));
	}
}
