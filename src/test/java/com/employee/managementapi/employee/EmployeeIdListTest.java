package com.employee.managementapi.employee;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeIdListTest {

    @Test
    @DisplayName("社員IDの重複判定が判定できているかどうか、重複している社員IDを返すことが出来るか")
    void testDuplicate() {
        EmployeeId employeeId1 = new EmployeeId(1);
        EmployeeId employeeId2 = new EmployeeId(2);
        EmployeeId employeeId3 = new EmployeeId(3);
        EmployeeId employeeId4 = new EmployeeId(4);
        EmployeeId employeeId5 = new EmployeeId(5);
        EmployeeId employeeId6 = new EmployeeId(6);
        EmployeeId employeeId7 = new EmployeeId(7);
        EmployeeId employeeId8 = new EmployeeId(8);

        List<EmployeeId> inspectedEmployeeIds = new ArrayList<>();
        // 検査済みと検査対象が同じ
        inspectedEmployeeIds.add(employeeId1);
        inspectedEmployeeIds.add(employeeId2);
        // 異なる部分
        inspectedEmployeeIds.add(employeeId3);
        inspectedEmployeeIds.add(employeeId4);
        inspectedEmployeeIds.add(employeeId5);

        List<EmployeeId> inspectionEmployeeIds = new ArrayList<>();
        // 検査済みと検査対象が同じ
        inspectionEmployeeIds.add(employeeId1);
        inspectionEmployeeIds.add(employeeId2);
        // 異なる部分
        inspectionEmployeeIds.add(employeeId6);
        inspectionEmployeeIds.add(employeeId7);
        inspectionEmployeeIds.add(employeeId8);

        EmployeeIdList inspectedEmployeeIdList = new EmployeeIdList(inspectedEmployeeIds);
        EmployeeIdList inspectionEmployeeIdList = new EmployeeIdList(inspectionEmployeeIds);

        List<EmployeeId> expectedEmployeeIds = new ArrayList<>();
        expectedEmployeeIds.add(employeeId1);
        expectedEmployeeIds.add(employeeId2);

        EmployeeIdList actuals = inspectedEmployeeIdList.duplicateJudgment(inspectionEmployeeIdList);
        List<EmployeeId> actualEmployeeIds = actuals.getEmployeeIds();
        EmployeeId actualEmployeeId1 = actualEmployeeIds.get(0);
        EmployeeId actualEmployeeId2 = actualEmployeeIds.get(1);
        int actual1 = actualEmployeeId1.getEmployeeId();
        int actual2 = actualEmployeeId2.getEmployeeId();

        assertEquals(1, actual1);
        assertEquals(2, actual2);
    }

    @Test
    @DisplayName("社員IDの重複判定が判定できているかどうか、重複している社員IDの件数が2件取得することが出来ているか")
    void testDuplicateSize() {
        EmployeeId employeeId1 = new EmployeeId(1);
        EmployeeId employeeId2 = new EmployeeId(2);
        EmployeeId employeeId3 = new EmployeeId(3);
        EmployeeId employeeId4 = new EmployeeId(4);
        EmployeeId employeeId5 = new EmployeeId(5);
        EmployeeId employeeId6 = new EmployeeId(6);
        EmployeeId employeeId7 = new EmployeeId(7);
        EmployeeId employeeId8 = new EmployeeId(8);

        List<EmployeeId> inspectedEmployeeIds = new ArrayList<>();
        // 検査済みと検査対象が同じ
        inspectedEmployeeIds.add(employeeId1);
        inspectedEmployeeIds.add(employeeId2);
        // 異なる部分
        inspectedEmployeeIds.add(employeeId3);
        inspectedEmployeeIds.add(employeeId4);
        inspectedEmployeeIds.add(employeeId5);

        List<EmployeeId> inspectionEmployeeIds = new ArrayList<>();
        // 検査済みと検査対象が同じ
        inspectionEmployeeIds.add(employeeId1);
        inspectionEmployeeIds.add(employeeId2);
        // 異なる部分
        inspectionEmployeeIds.add(employeeId6);
        inspectionEmployeeIds.add(employeeId7);
        inspectionEmployeeIds.add(employeeId8);

        EmployeeIdList inspectedEmployeeIdList = new EmployeeIdList(inspectedEmployeeIds);
        EmployeeIdList inspectionEmployeeIdList = new EmployeeIdList(inspectionEmployeeIds);

        List<EmployeeId> expectedEmployeeIds = new ArrayList<>();
        expectedEmployeeIds.add(employeeId1);
        expectedEmployeeIds.add(employeeId2);

        EmployeeIdList actuals = inspectedEmployeeIdList.duplicateJudgment(inspectionEmployeeIdList);
        List<EmployeeId> actualEmployeeIds = actuals.getEmployeeIds();
        assertEquals(2, actualEmployeeIds.size());
    }
}
