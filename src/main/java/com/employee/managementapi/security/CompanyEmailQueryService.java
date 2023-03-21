package com.employee.managementapi.security;

/**
 * 会社メールアドレス参照サービス
 *
 */
public interface CompanyEmailQueryService {

	/**
	 * 既に会社メールアドレスがパスワードととして登録されているのかどうか確認します。
	 * @param checkEmail 確認したいメールアドレス
	 * @return true メールアドレスが登録されていない false メールアドレスが登録されていない
	 */
	boolean checkAlreadyExistsEmailAsPassword(final CompanyEmail checkEmail);

	/**
	 * 現役社員の連絡先IDを取得します。
	 * @param companyEmail 会社メールアドレス
	 * @return 現役社員連絡先ID
	 */
	int getActiveEmployeeContactInformationId(final CompanyEmail companyEmail);

	/**
	 * 既に会社メールアドレスが登録されているのかどうか確認します。
	 * @param checkEmail 確認したいメールアドレス
	 * @return true メールアドレスが登録されていない false メールアドレスが登録されていない
	 */
	boolean checkAlreadyExistsCompanyEmailAsCompanyEmail(final CompanyEmail checkEmail);
}
