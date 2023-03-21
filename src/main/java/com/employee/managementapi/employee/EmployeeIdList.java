package com.employee.managementapi.employee;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ファーストコレクション社員ID
 */
@AllArgsConstructor
@Getter
public class EmployeeIdList {
	private final List<EmployeeId> employeeIds;

	/**
	 * 社員IDリストの重複判定をする。
	 * 
	 * @param receiveEmployeeIdList 社員IDリスト
	 * @return 社員IDリスト
	 */
	public EmployeeIdList duplicateJudgment(EmployeeIdList receiveEmployeeIdList) {
		List<EmployeeId> duplicateEmployeeIds = new ArrayList<>();
		for (EmployeeId employeeId : employeeIds) {
			int inspectedEmployeeId = employeeId.getEmployeeId();
			for (int j = 0; j < receiveEmployeeIdList.size(); j++) {
				List<EmployeeId> employeeIds = receiveEmployeeIdList.getEmployeeIds();
				EmployeeId _employeeId = employeeIds.get(j);
				int inspectionEmployeeId = _employeeId.getEmployeeId();
				// 社員IDはソートされているので、検査対象が検査済みの対象よりも大きくなるとそのあとの判定は不要である。
				if (inspectedEmployeeId < inspectionEmployeeId) {
					break;

				}
				// 重複判定
				if (inspectedEmployeeId == inspectionEmployeeId) {
					duplicateEmployeeIds.add(new EmployeeId(inspectionEmployeeId));
				}
			}
		}
		return new EmployeeIdList(duplicateEmployeeIds);
	}

	public int size() {
		return employeeIds.size();
	}

	public void remove(int wantToRemoveId) {
		employeeIds.remove(wantToRemoveId);
	}

	public List<EmployeeId> toEmployeeIds() {
		List<EmployeeId> employeeIds = new ArrayList<>();
		for (EmployeeId employeeId : this.employeeIds) {
			employeeIds.add(employeeId);
		}
		return employeeIds;
	}

}
