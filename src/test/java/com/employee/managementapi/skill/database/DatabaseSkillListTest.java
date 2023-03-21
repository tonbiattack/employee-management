package com.employee.managementapi.skill.database;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DatabaseSkillListTest {

	@Test
	@DisplayName("データベーススキルを分割して取得することが出来ているかどうか、想定の件数を取得することが出来ているか")
	public void testSplitSize() {
		// 前処理
		DatabaseSkill domainDatabaseSkill1 = new DatabaseSkill(4, "MongoDB", 10);
		DatabaseSkill domainDatabaseSkill2 = new DatabaseSkill(4, "MongoDB", 5);
		DatabaseSkill domainDatabaseSkill3 = new DatabaseSkill(3, "DynamoDB", 5);
		DatabaseSkill domainDatabaseSkill4 = new DatabaseSkill(4, "MongoDB", 4);
		List<DatabaseSkill> domainDatabaseSkills = new ArrayList<>();
		domainDatabaseSkills.add(domainDatabaseSkill1);
		domainDatabaseSkills.add(domainDatabaseSkill2);
		domainDatabaseSkills.add(domainDatabaseSkill3);
		domainDatabaseSkills.add(domainDatabaseSkill4);
		DatabaseSkillList databaseSkillList = new DatabaseSkillList(domainDatabaseSkills);

		// 4件のデータを2分割にして最初の2件を取得する
		DatabaseSkillList actual1 = databaseSkillList.split(2, 0);
		// 4件のデータを2分割にして最後の2件を取得する
		DatabaseSkillList actual2 = databaseSkillList.split(2, 2);

		// 検証
		assertAll(
				() -> assertEquals(2, actual1.size()),
				() -> assertEquals(2, actual2.size()));
	}

	@Test
	@DisplayName("データベーススキルを分割して取得することが出来ているかどうか、正しい要素を習得することが出来ているか")
	public void testSplit() {
		// 前処理
		DatabaseSkill domainDatabaseSkill1 = new DatabaseSkill(4, "MongoDB", 10);
		DatabaseSkill domainDatabaseSkill2 = new DatabaseSkill(4, "MongoDB", 5);
		DatabaseSkill domainDatabaseSkill3 = new DatabaseSkill(3, "DynamoDB", 5);
		DatabaseSkill domainDatabaseSkill4 = new DatabaseSkill(4, "MongoDB", 4);
		List<DatabaseSkill> domainDatabaseSkills = new ArrayList<>();
		domainDatabaseSkills.add(domainDatabaseSkill1);
		domainDatabaseSkills.add(domainDatabaseSkill2);
		domainDatabaseSkills.add(domainDatabaseSkill3);
		domainDatabaseSkills.add(domainDatabaseSkill4);
		DatabaseSkillList databaseSkillList = new DatabaseSkillList(domainDatabaseSkills);

		// 4件のデータを2分割にして最初の2件を取得する
		DatabaseSkillList _Actual1 = databaseSkillList.split(2, 0);
		DatabaseSkill actual1 = _Actual1.get(0);
		DatabaseSkill actual2 = _Actual1.get(1);
		// 4件のデータを2分割にして最後の2件を取得する
		DatabaseSkillList _Actual2 = databaseSkillList.split(2, 2);
		DatabaseSkill actual3 = _Actual2.get(0);
		DatabaseSkill actual4 = _Actual2.get(1);

		// 検証
		assertAll(
				() -> assertEquals(domainDatabaseSkill1.getDatabaseSkillId(),
						actual1.getDatabaseSkillId()),
				() -> assertEquals(domainDatabaseSkill1.getDatabaseSkillName(), actual1.getDatabaseSkillName()),
				() -> assertEquals(domainDatabaseSkill1.getSkillLevel(), actual1.getSkillLevel()),

				() -> assertEquals(domainDatabaseSkill2.getDatabaseSkillId(),
						actual2.getDatabaseSkillId()),
				() -> assertEquals(domainDatabaseSkill2.getDatabaseSkillName(), actual2.getDatabaseSkillName()),
				() -> assertEquals(domainDatabaseSkill2.getSkillLevel(), actual2.getSkillLevel()),

				() -> assertEquals(domainDatabaseSkill3.getDatabaseSkillId(),
						actual3.getDatabaseSkillId()),
				() -> assertEquals(domainDatabaseSkill3.getDatabaseSkillName(), actual3.getDatabaseSkillName()),
				() -> assertEquals(domainDatabaseSkill3.getSkillLevel(), actual3.getSkillLevel()),

				() -> assertEquals(domainDatabaseSkill4.getDatabaseSkillId(),
						actual4.getDatabaseSkillId()),
				() -> assertEquals(domainDatabaseSkill4.getDatabaseSkillName(), actual4.getDatabaseSkillName()),
				() -> assertEquals(domainDatabaseSkill4.getSkillLevel(), actual4.getSkillLevel()));
	}
}
