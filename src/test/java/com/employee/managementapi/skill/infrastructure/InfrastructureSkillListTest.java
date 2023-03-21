package com.employee.managementapi.skill.infrastructure;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InfrastructureSkillListTest {

	@Test
	@DisplayName("インフラスキルを分割して取得することが出来ているかどうか、想定の件数を取得することが出来ているか")
	public void testSplitSize() {
		// 前処理
		InfrastructureSkill domainInfrastructureSkill1 = new InfrastructureSkill(3, "AWS", 3);
		InfrastructureSkill domainInfrastructureSkill2 = new InfrastructureSkill(4, "Debian", 4);
		InfrastructureSkill domainInfrastructureSkill3 = new InfrastructureSkill(4, "Debian", 6);
		InfrastructureSkill domainInfrastructureSkill4 = new InfrastructureSkill(4, "Debian", 6);
		List<InfrastructureSkill> infrastructureSkills = new ArrayList<>();
		infrastructureSkills.add(domainInfrastructureSkill1);
		infrastructureSkills.add(domainInfrastructureSkill2);
		infrastructureSkills.add(domainInfrastructureSkill3);
		infrastructureSkills.add(domainInfrastructureSkill4);
		InfrastructureSkillList infrastructureSkillList = new InfrastructureSkillList(
				infrastructureSkills);

		// 4件のデータを2分割にして最初の2件を取得する
		InfrastructureSkillList actual1 = infrastructureSkillList.split(2, 0);
		// 4件のデータを2分割にして最後の2件を取得する
		InfrastructureSkillList actual2 = infrastructureSkillList.split(2, 2);

		// 検証
		assertAll(
				() -> assertEquals(2, actual1.size()),
				() -> assertEquals(2, actual2.size()));
	}

	@Test
	@DisplayName("インフラスキルを分割して取得することが出来ているかどうか、正しい要素を習得することが出来ているか")
	public void testSplit() {
		// 前処理
		InfrastructureSkill domainInfrastructureSkill1 = new InfrastructureSkill(3, "AWS", 3);
		InfrastructureSkill domainInfrastructureSkill2 = new InfrastructureSkill(4, "Debian", 4);
		InfrastructureSkill domainInfrastructureSkill3 = new InfrastructureSkill(4, "Debian", 6);
		InfrastructureSkill domainInfrastructureSkill4 = new InfrastructureSkill(4, "Debian", 6);
		List<InfrastructureSkill> infrastructureSkills = new ArrayList<>();
		infrastructureSkills.add(domainInfrastructureSkill1);
		infrastructureSkills.add(domainInfrastructureSkill2);
		infrastructureSkills.add(domainInfrastructureSkill3);
		infrastructureSkills.add(domainInfrastructureSkill4);
		InfrastructureSkillList infrastructureSkillList = new InfrastructureSkillList(
				infrastructureSkills);

		// 4件のデータを2分割にして最初の2件を取得する
		InfrastructureSkillList _Actual1 = infrastructureSkillList.split(2, 0);
		InfrastructureSkill actual1 = _Actual1.get(0);
		InfrastructureSkill actual2 = _Actual1.get(1);
		// 4件のデータを2分割にして最後の2件を取得する
		InfrastructureSkillList _Actual2 = infrastructureSkillList.split(2, 2);
		InfrastructureSkill actual3 = _Actual2.get(0);
		InfrastructureSkill actual4 = _Actual2.get(1);

		// 検証
		assertAll(
				() -> assertEquals(domainInfrastructureSkill1.getInfrastructureSkillId(),
						actual1.getInfrastructureSkillId()),
				() -> assertEquals(domainInfrastructureSkill1.getInfrastructureSkillName(),
						actual1.getInfrastructureSkillName()),
				() -> assertEquals(domainInfrastructureSkill1.getSkillLevel(), actual1.getSkillLevel()),

				() -> assertEquals(domainInfrastructureSkill2.getInfrastructureSkillId(),
						actual2.getInfrastructureSkillId()),
				() -> assertEquals(domainInfrastructureSkill2.getInfrastructureSkillName(),
						actual2.getInfrastructureSkillName()),
				() -> assertEquals(domainInfrastructureSkill2.getSkillLevel(), actual2.getSkillLevel()),

				() -> assertEquals(domainInfrastructureSkill3.getInfrastructureSkillId(),
						actual3.getInfrastructureSkillId()),
				() -> assertEquals(domainInfrastructureSkill3.getInfrastructureSkillName(),
						actual3.getInfrastructureSkillName()),
				() -> assertEquals(domainInfrastructureSkill3.getSkillLevel(), actual3.getSkillLevel()),

				() -> assertEquals(domainInfrastructureSkill4.getInfrastructureSkillId(),
						actual4.getInfrastructureSkillId()),
				() -> assertEquals(domainInfrastructureSkill4.getInfrastructureSkillName(),
						actual4.getInfrastructureSkillName()),
				() -> assertEquals(domainInfrastructureSkill4.getSkillLevel(), actual4.getSkillLevel()));
	}
}
