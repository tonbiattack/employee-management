package com.employee.managementapi.skill.framework;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * フレームワークスキルリスト
 */
@ApiModel(description = "フレームワークスキルリスト")
@Getter
public class FrameworkSkillList {
	@ApiModelProperty(value = "フレームワークスキルリスト")
	@NotBlank
	private final List<FrameworkSkill> frameworkSkills;

	private static final int CONVERT_ONE_ORIGIN = 1;

	public FrameworkSkillList() {
		frameworkSkills = new ArrayList<>();
	}

	/**
	 * ドメインコレクションをファーストクラスコレクションに変換する。ドメインコレクションはDBにアクセスした結果をマッピングするクラスとして使用するためにファーストクラスコレクションを使用していないので、このような実装とする。
	 * 
	 */
	public FrameworkSkillList(final List<FrameworkSkill> frameworkSkills) {
		this.frameworkSkills = frameworkSkills;
	}

	/**
	 * ファーストクラスコレクションからドメインコレクションへの変換処理
	 */
	public List<FrameworkSkill> toDomainFrameworkSkills() {
		List<FrameworkSkill> frameworkSkills = new ArrayList<>();
		for (FrameworkSkill frameworkSkill : this.frameworkSkills) {
			frameworkSkills.add(frameworkSkill);
		}
		return frameworkSkills;
	}

	public int size() {
		return frameworkSkills.size();
	}

	public FrameworkSkill get(int index) {
		return frameworkSkills.get(index);
	}

	/**
	 * フレームワークスキルリストを分割して取得する。
	 * @param splitSIze 分割数
	 * @param startIndex 習得開始インデックス
	 * @return フレームワークスキルリスト
	 */
	public FrameworkSkillList split(int splitSIze, int startIndex) {
		List<FrameworkSkill> frameworkSkills = new ArrayList<>();
		while (true) {
			frameworkSkills.add(this.frameworkSkills.get(startIndex));
			if ((startIndex + CONVERT_ONE_ORIGIN)
					% (this.frameworkSkills.size() / splitSIze) == 0) {
				//ループを抜ける前に一つ加算して、同じループに入るのを防ぐ
				startIndex++;
				break;
			}
			startIndex++;
		}
		return new FrameworkSkillList(frameworkSkills);

	}

}
