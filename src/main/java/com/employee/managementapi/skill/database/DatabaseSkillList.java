package com.employee.managementapi.skill.database;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 *データベーススキルリスト
 */
@Getter
public class DatabaseSkillList {
	@ApiModelProperty(value = "データベーススキルリスト")
	@NotBlank
	private final List<DatabaseSkill> databaseSkills;

	private static final int CONVERT_ONE_ORIGIN = 1;

	public DatabaseSkillList() {
		databaseSkills = new ArrayList<>();
	}

	/**
	 * ドメインコレクションをファーストクラスコレクションに変換する。ドメインコレクションはDBにアクセスした結果をマッピングするクラスとして使用するためにファーストクラスコレクションを使用していないので、このような実装とする。
	 * 
	 */
	public DatabaseSkillList(final List<DatabaseSkill> databaseSkills) {
		this.databaseSkills = databaseSkills;
	}

	/**
	 * ファーストクラスコレクションからドメインコレクションへの変換処理
	 */
	public List<DatabaseSkill> toDomainDatabaseSkills() {
		List<DatabaseSkill> databaseSkills = new ArrayList<>();
		for (int i = 0; i < this.databaseSkills.size(); i++) {
			DatabaseSkill databaseSkill = this.databaseSkills.get(i);
			databaseSkills.add(databaseSkill);
		}
		return databaseSkills;
	}

	public int size() {
		return databaseSkills.size();
	}

	public DatabaseSkill get(int index) {
		return databaseSkills.get(index);
	}

	public void add(DatabaseSkill databaseSkill) {
		databaseSkills.add(databaseSkill);
	}

	/**
	 * データベーススキルリストを等分割して取得する。
	 * @param splitSIze 分割数
	 * @param startIndex 習得開始インデックス
	 * @return データベーススキルリスト
	 */
	public DatabaseSkillList split(int splitSIze, int startIndex) {
		List<DatabaseSkill> databaseSkills = new ArrayList<>();
		while (true) {
			databaseSkills.add(this.databaseSkills.get(startIndex));
			if ((startIndex + CONVERT_ONE_ORIGIN)
					% (this.databaseSkills.size() / splitSIze) == 0) {
				//ループを抜ける前に一つ加算して、同じループに入るのを防ぐ
				startIndex++;
				break;
			}
			startIndex++;
		}
		return new DatabaseSkillList(databaseSkills);

	}
}
