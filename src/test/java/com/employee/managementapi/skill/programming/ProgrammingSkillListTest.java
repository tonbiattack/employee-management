package com.employee.managementapi.skill.programming;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgrammingSkillListTest {

	@Test
	@DisplayName("プログラミングスキルを分割して取得することが出来ているかどうか、想定の件数を取得することが出来ているか")
	public void testSplitSize() {
		// 前処理
		ProgrammingSkill domainProgrammingSkill1 = new ProgrammingSkill(4, "C#", 4);
		ProgrammingSkill domainProgrammingSkill2 = new ProgrammingSkill(3, "C言語", 4);
		ProgrammingSkill domainProgrammingSkill3 = new ProgrammingSkill(9, "C#", 9);
		ProgrammingSkill domainProgrammingSkill4 = new ProgrammingSkill(4, "C#", 8);
		List<ProgrammingSkill> domainProgrammingSkills = new ArrayList<>();
		domainProgrammingSkills.add(domainProgrammingSkill1);
		domainProgrammingSkills.add(domainProgrammingSkill2);
		domainProgrammingSkills.add(domainProgrammingSkill3);
		domainProgrammingSkills.add(domainProgrammingSkill4);
		ProgrammingSkillList programmingSkillList = new ProgrammingSkillList(
				domainProgrammingSkills);

		// 4件のデータを2分割にして最初の2件を取得する
		ProgrammingSkillList actual1 = programmingSkillList.split(2, 0);
		// 4件のデータを2分割にして最後の2件を取得する
		ProgrammingSkillList actual2 = programmingSkillList.split(2, 2);

		// 検証
		assertAll(
				() -> assertEquals(2, actual1.size()),
				() -> assertEquals(2, actual2.size()));
	}

	@Test
	@DisplayName("プログラミングスキルを分割して取得することが出来ているかどうか、正しい要素を習得することが出来ているか")
	public void testSplit() {
		// 前処理
		ProgrammingSkill domainProgrammingSkill1 = new ProgrammingSkill(4, "C#", 4);
		ProgrammingSkill domainProgrammingSkill2 = new ProgrammingSkill(3, "C言語", 4);
		ProgrammingSkill domainProgrammingSkill3 = new ProgrammingSkill(9, "C#", 9);
		ProgrammingSkill domainProgrammingSkill4 = new ProgrammingSkill(4, "C#", 8);
		List<ProgrammingSkill> domainProgrammingSkills = new ArrayList<>();
		domainProgrammingSkills.add(domainProgrammingSkill1);
		domainProgrammingSkills.add(domainProgrammingSkill2);
		domainProgrammingSkills.add(domainProgrammingSkill3);
		domainProgrammingSkills.add(domainProgrammingSkill4);
		ProgrammingSkillList programmingSkillList = new ProgrammingSkillList(
				domainProgrammingSkills);

		// 4件のデータを2分割にして最初の2件を取得する
		ProgrammingSkillList _Actual1 = programmingSkillList.split(2, 0);
		ProgrammingSkill actual1 = _Actual1.get(0);
		ProgrammingSkill actual2 = _Actual1.get(1);
		// 4件のデータを2分割にして最後の2件を取得する
		ProgrammingSkillList _Actual2 = programmingSkillList.split(2, 2);
		ProgrammingSkill actual3 = _Actual2.get(0);
		ProgrammingSkill actual4 = _Actual2.get(1);

		// 検証
		assertAll(
				() -> assertEquals(domainProgrammingSkill1.getProgrammingSkillId(),
						actual1.getProgrammingSkillId()),
				() -> assertEquals(domainProgrammingSkill1.getProgrammingSkillName(),
						actual1.getProgrammingSkillName()),
				() -> assertEquals(domainProgrammingSkill1.getSkillLevel(), actual1.getSkillLevel()),

				() -> assertEquals(domainProgrammingSkill2.getProgrammingSkillId(),
						actual2.getProgrammingSkillId()),
				() -> assertEquals(domainProgrammingSkill2.getProgrammingSkillName(),
						actual2.getProgrammingSkillName()),
				() -> assertEquals(domainProgrammingSkill2.getSkillLevel(), actual2.getSkillLevel()),

				() -> assertEquals(domainProgrammingSkill3.getProgrammingSkillId(),
						actual3.getProgrammingSkillId()),
				() -> assertEquals(domainProgrammingSkill3.getProgrammingSkillName(),
						actual3.getProgrammingSkillName()),
				() -> assertEquals(domainProgrammingSkill3.getSkillLevel(), actual3.getSkillLevel()),

				() -> assertEquals(domainProgrammingSkill4.getProgrammingSkillId(),
						actual4.getProgrammingSkillId()),
				() -> assertEquals(domainProgrammingSkill4.getProgrammingSkillName(),
						actual4.getProgrammingSkillName()),
				() -> assertEquals(domainProgrammingSkill4.getSkillLevel(), actual4.getSkillLevel()));
	}
}
