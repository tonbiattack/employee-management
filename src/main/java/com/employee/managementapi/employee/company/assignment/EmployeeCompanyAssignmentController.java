package com.employee.managementapi.employee.company.assignment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

/**
 * 社員会社配属コントローラー
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "会社配属")
@RequestMapping("api/v1/employees/companys/assignments")
public class EmployeeCompanyAssignmentController {
	private final EmployeeCompanyAssignmentUpdateServiceCoordinator employeeCompanyAssignmentUpdateServiceCoordinator;

	/**
	 * 社員を会社に配属します。
	 * 
	 * @param employeeCompanyAssignment 社員会社配属
	 * @return  各主キー付きの社員会社配属
	 */
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	@ApiOperation(value = "社員を会社に配属します。")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "登録したデータ"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 400, message = "Bad Request")  })
	public EmployeeCompanyAssignmentWithPrimaryKey assignment(
			@ApiParam(value = "社員会社配属") @RequestBody final EmployeeCompanyAssignment employeeCompanyAssignment) {
		return employeeCompanyAssignmentUpdateServiceCoordinator.assignment(employeeCompanyAssignment);
	}

	/**
	 * 出向を行います。
	 * 
	 * @param employeeCompanyAssignmentWithPrimaryKey 主キー付き社員会社配属
	 * @return 各主キー付きの社員会社配属
	 */
	@PatchMapping()
	@ResponseStatus(code = HttpStatus.OK)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "更新したデータ"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 400, message = "Bad Request")  })
	@ApiOperation(value = "社員の会社配置転換を行います。")
	public EmployeeCompanyAssignmentWithPrimaryKey jobAssignmentSystem(
			@ApiParam(value = "社員会社配属主キー付き") @RequestBody final EmployeeCompanyAssignmentWithPrimaryKey employeeCompanyAssignmentWithPrimaryKey) {

		return employeeCompanyAssignmentUpdateServiceCoordinator
				.jobAssignmentSystem(employeeCompanyAssignmentWithPrimaryKey);
	}

	/**
	 * 社員が会社に配属された事実を削除します。
	 * この機能は誤って社員を会社に所属するように登録してしまったときの削除処理に使います。
	 * 
	 * 
	 * @param companyAssignmentId 会社配属ID
	 * @param belongingCompanyId  所属会社ID
	 */
	@DeleteMapping("/{companyAssignmentId}/{belongingCompanyId}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@ApiResponses(value = { @ApiResponse(code = 204, message = "削除完了"),
			@ApiResponse(code = 403, message = "権限がない"),
			@ApiResponse(code = 404, message = "削除対象がない"),
			@ApiResponse(code = 400, message = "Bad Request")  })
	@ApiOperation(value = "社員が会社に配属された事実を削除します。", notes = "この機能を使うのは誤って登録してしまった時だけにしてください。")
	public void delete(@ApiParam(value = "会社配属ID", example = "1") @PathVariable final int companyAssignmentId,
			@ApiParam(value = "所属会社ID", example = "1") @PathVariable final int belongingCompanyId) {
		employeeCompanyAssignmentUpdateServiceCoordinator.delete(companyAssignmentId, belongingCompanyId);

	}
}
