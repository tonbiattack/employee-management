package com.employee.managementapi.security;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyEmailMapper {
	/**
	 * メールアドレスがパスワードとして登録されているのかどうか確認します。
	 * 
	 * @param searchEmail 検索したい会社メールアドレス
	 * @return 検索結果に該当するメールアドレス の件数 0件 or 1件
	 */
	int countByCompanyEmailAsPassword(CompanyEmail checkEmail);

	/**
	 * 会社メールアドレスに紐づく現役社員連絡先IDを取得する。
	 * @param companyEmail 会社メールアドレス
	 * @return 現役社員連絡先ID
	 */
	int selectActiveEmployeeContactInformationIdByEmail(CompanyEmail companyEmail);

	/**
	 * メールアドレスが会社メールアドレスとして登録されているのかどうか確認します。
	 * 
	 * @param searchEmail 検索したい会社メールアドレス
	 * @return 検索結果に該当するメールアドレス の件数 0件 or 1件
	 */
	int countByCompanyEmailAsActiveEmployeeCompanyEmail(CompanyEmail checkEmail);

}
