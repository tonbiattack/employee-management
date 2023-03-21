package com.employee.managementapi.skill.framework;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FrameworkSkillListTest {

	@Test
	@DisplayName("フレームワークスキルを分割して取得することが出来ているかどうか、想定の件数を取得することが出来ているか")
	public void testSplitSize() {
		// 前処理
		FrameworkSkill domainFrameworkSkill1 = new FrameworkSkill(3, "Angular", 3);
		FrameworkSkill domainFrameworkSkill2 = new FrameworkSkill(4, "Spring Boot", 8);
		FrameworkSkill domainFrameworkSkill3 = new FrameworkSkill(4, "Spring Boot", 5);
		FrameworkSkill domainFrameworkSkill4 = new FrameworkSkill(4, "Spring Boot", 5);
		List<FrameworkSkill> domainFrameworkSkills = new ArrayList<>();
		domainFrameworkSkills.add(domainFrameworkSkill1);
		domainFrameworkSkills.add(domainFrameworkSkill2);
		domainFrameworkSkills.add(domainFrameworkSkill3);
		domainFrameworkSkills.add(domainFrameworkSkill4);
		FrameworkSkillList frameworkSkillList = new FrameworkSkillList(
				domainFrameworkSkills);

		// 4件のデータを2分割にして最初の2件を取得する
		FrameworkSkillList actual1 = frameworkSkillList.split(2, 0);
		// 4件のデータを2分割にして最後の2件を取得する
		FrameworkSkillList actual2 = frameworkSkillList.split(2, 2);

		// 検証
		assertAll(
				() -> assertEquals(2, actual1.size()),
				() -> assertEquals(2, actual2.size()));
	}

	@Test
	@DisplayName("フレームワークスキルを分割して取得することが出来ているかどうか、正しい要素を習得することが出来ているか")
	public void testSplit() {
		// 前処理
		FrameworkSkill domainFrameworkSkill1 = new FrameworkSkill(3, "Angular", 3);
		FrameworkSkill domainFrameworkSkill2 = new FrameworkSkill(4, "Spring Boot", 8);
		FrameworkSkill domainFrameworkSkill3 = new FrameworkSkill(4, "Spring Boot", 5);
		FrameworkSkill domainFrameworkSkill4 = new FrameworkSkill(4, "Spring Boot", 5);
		List<FrameworkSkill> domainFrameworkSkills = new ArrayList<>();
		domainFrameworkSkills.add(domainFrameworkSkill1);
		domainFrameworkSkills.add(domainFrameworkSkill2);
		domainFrameworkSkills.add(domainFrameworkSkill3);
		domainFrameworkSkills.add(domainFrameworkSkill4);
		FrameworkSkillList frameworkSkillList = new FrameworkSkillList(
				domainFrameworkSkills);

		// 4件のデータを2分割にして最初の2件を取得する
		FrameworkSkillList _Actual1 = frameworkSkillList.split(2, 0);
		FrameworkSkill actual1 = _Actual1.get(0);
		FrameworkSkill actual2 = _Actual1.get(1);
		// 4件のデータを2分割にして最後の2件を取得する
		FrameworkSkillList _Actual2 = frameworkSkillList.split(2, 2);
		FrameworkSkill actual3 = _Actual2.get(0);
		FrameworkSkill actual4 = _Actual2.get(1);

		// 検証
		assertAll(
				() -> assertEquals(domainFrameworkSkill1.getFrameworkSkillId(),
						actual1.getFrameworkSkillId()),
				() -> assertEquals(domainFrameworkSkill1.getFrameworkSkillName(),
						actual1.getFrameworkSkillName()),
				() -> assertEquals(domainFrameworkSkill1.getSkillLevel(), actual1.getSkillLevel()),

				() -> assertEquals(domainFrameworkSkill2.getFrameworkSkillId(),
						actual2.getFrameworkSkillId()),
				() -> assertEquals(domainFrameworkSkill2.getFrameworkSkillName(),
						actual2.getFrameworkSkillName()),
				() -> assertEquals(domainFrameworkSkill2.getSkillLevel(), actual2.getSkillLevel()),

				() -> assertEquals(domainFrameworkSkill3.getFrameworkSkillId(),
						actual3.getFrameworkSkillId()),
				() -> assertEquals(domainFrameworkSkill3.getFrameworkSkillName(),
						actual3.getFrameworkSkillName()),
				() -> assertEquals(domainFrameworkSkill3.getSkillLevel(), actual3.getSkillLevel()),

				() -> assertEquals(domainFrameworkSkill4.getFrameworkSkillId(),
						actual4.getFrameworkSkillId()),
				() -> assertEquals(domainFrameworkSkill4.getFrameworkSkillName(),
						actual4.getFrameworkSkillName()),
				() -> assertEquals(domainFrameworkSkill4.getSkillLevel(), actual4.getSkillLevel()));
	}
}
