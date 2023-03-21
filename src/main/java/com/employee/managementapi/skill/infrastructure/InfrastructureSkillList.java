package com.employee.managementapi.skill.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * インフラスキルリスト
 */
@Getter
public class InfrastructureSkillList {
	@ApiModelProperty(value = "インフラスキルリスト")
	@NotBlank
	private final List<InfrastructureSkill> infrastructureSkills;

	private static final int CONVERT_ONE_ORIGIN = 1;

	public InfrastructureSkillList() {
		infrastructureSkills = new ArrayList<>();
	}

	/**
	 * ドメインコレクションをファーストクラスコレクションに変換する。ドメインコレクションはDBにアクセスした結果をマッピングするクラスとして使用するためにファーストクラスコレクションを使用していないので、このような実装とする。
	 * 
	 */
	public InfrastructureSkillList(final List<InfrastructureSkill> infrastructureSkills) {
		this.infrastructureSkills = infrastructureSkills;
	}

	/**
	 * ファーストクラスコレクションからドメインコレクションへの変換処理
	 */
	public List<InfrastructureSkill> toInfrastructureSkills() {
		List<InfrastructureSkill> infrastructureSkills = new ArrayList<>();
		for (InfrastructureSkill infrastructureSkill : this.infrastructureSkills) {
			infrastructureSkills.add(infrastructureSkill);
		}
		return Collections.unmodifiableList(infrastructureSkills);
	}

	public int size() {
		return infrastructureSkills.size();
	}

	public InfrastructureSkill get(int index) {
		return infrastructureSkills.get(index);
	}

	/**
	 * インフラスキルリストを等分割して取得する。
	 * @param splitSIze 分割数
	 * @param startIndex 習得開始インデックス
	 * @return インフラスキルリスト
	 */
	public InfrastructureSkillList split(final int splitSIze, int startIndex) {
		List<InfrastructureSkill> infrastructureSkills = new ArrayList<>();
		while (true) {
			infrastructureSkills.add(this.infrastructureSkills.get(startIndex));
			if ((startIndex + CONVERT_ONE_ORIGIN)
					% (this.infrastructureSkills.size() / splitSIze) == 0) {
				//ループを抜ける前に一つ加算して、同じループに入るのを防ぐ
				startIndex++;
				break;
			}
			startIndex++;
		}
		return new InfrastructureSkillList(infrastructureSkills);

	}

}
