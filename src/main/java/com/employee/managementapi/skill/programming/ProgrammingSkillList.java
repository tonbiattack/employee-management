package com.employee.managementapi.skill.programming;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class ProgrammingSkillList {
	@ApiModelProperty(value = "プログラミングスキルリスト")
	@NotBlank
	private final List<ProgrammingSkill> programmingSkills;

	private static final int CONVERT_ONE_ORIGIN = 1;

	public ProgrammingSkillList() {
		programmingSkills = new ArrayList<>();
	}

	/**
	 * ドメインコレクションをファーストクラスコレクションに変換する。ドメインコレクションはDBにアクセスした結果をマッピングするクラスとして使用するためにファーストクラスコレクションを使用していないので、このような実装とする。
	 * 
	 */
	public ProgrammingSkillList(final List<ProgrammingSkill> programmingSkills) {
		this.programmingSkills = programmingSkills;
	}

	/**
	 * ファーストクラスコレクションからドメインコレクションへの変換処理
	 */
	public List<ProgrammingSkill> toDomainProgrammingSkills() {
		List<ProgrammingSkill> programmingSkills = new ArrayList<>();
		for (ProgrammingSkill programmingSkill : this.programmingSkills) {
			programmingSkills.add(programmingSkill);
		}
		return programmingSkills;
	}

	public int size() {
		return programmingSkills.size();
	}

	public ProgrammingSkill get(int index) {
		return programmingSkills.get(index);
	}

	/**
	 *プログラミングスキルリストを等分割して取得する。
	 * @param splitSIze 分割数
	 * @param startIndex 習得開始インデックス
	 * @returnプログラミングスキルリスト
	 */
	public ProgrammingSkillList split(int splitSIze, int startIndex) {
		List<ProgrammingSkill> programmingSkills = new ArrayList<>();
		while (true) {
			programmingSkills.add(this.programmingSkills.get(startIndex));
			if ((startIndex + CONVERT_ONE_ORIGIN)
					% (this.programmingSkills.size() / splitSIze) == 0) {
				//ループを抜ける前に一つ加算して、同じループに入るのを防ぐ
				startIndex++;
				break;
			}
			startIndex++;
		}
		return new ProgrammingSkillList(programmingSkills);

	}

}
