package com.employee.managementapi.employee.cycle.joining;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * 入社
 */
@Getter
@Builder
@AllArgsConstructor
public class JoiningTheCompanyWithPrimaryKey {
    private final int joiningTheCompanyId;
    private final int employeeId;
    private final Date joiningTheCompanyDate;
}
