package com.employee.managementapi.employee.company.assignment;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.employee.managementapi.infrastructure.employee.CompanyAssignment;
import com.employee.managementapi.infrastructure.employee.CompanyAssignmentMapper;

/**
 * 会社配属登録サービステスト
 */
public class EmployeeAssignmentCompanyUpdateServiceImplTest {

    @Mock
    private CompanyAssignmentMapper companyAssignmentMapper;

    @InjectMocks
    private EmployeeAssignmentCompanyUpdateServiceImpl employeeAssignmentCompanyUpdateServiceImpl;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @DisplayName("CREATE TEST: 配属会社が登録できているかどうか")
    @Test
    void testInsert() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse("1971/11/25");
        EmployeeAssignmentCompanyWithPrimaryKey employeeAssignmentCompanyWithPrimaryKey = new EmployeeAssignmentCompanyWithPrimaryKey(
                1, 1, 1, date);
        EmployeeAssignmentCompany employeeAssignmentCompany = new EmployeeAssignmentCompany(1, 1, date);

        when(companyAssignmentMapper.insert(Mockito.any(CompanyAssignment.class))).thenReturn(1);
        when(companyAssignmentMapper.selectNextval()).thenReturn(1);
        EmployeeAssignmentCompanyWithPrimaryKey actual = employeeAssignmentCompanyUpdateServiceImpl
                .insert(employeeAssignmentCompany);
        assertEquals(employeeAssignmentCompanyWithPrimaryKey.getCompanyAssignmentId(), actual.getCompanyAssignmentId());
        assertEquals(employeeAssignmentCompanyWithPrimaryKey.getCompanyId(), actual.getCompanyId());
        assertEquals(employeeAssignmentCompanyWithPrimaryKey.getEmployeeId(), actual.getEmployeeId());
        assertEquals(employeeAssignmentCompanyWithPrimaryKey.getCompanyAssignmentDate(),
                actual.getCompanyAssignmentDate());
        verify(companyAssignmentMapper, times(1)).insert(Mockito.any(CompanyAssignment.class));
    }

    @DisplayName("DELETE TEST: 削除対象のデータがあり、配属会社が削除出来ている")
    @Test
    void testDeleteNormal() {
        int companyAssignmentId = 1;
        when(companyAssignmentMapper.deleteByPrimaryKey(companyAssignmentId)).thenReturn(1);
        boolean actual = employeeAssignmentCompanyUpdateServiceImpl.delete(companyAssignmentId);
        assertTrue(actual);
        verify(companyAssignmentMapper, times(1)).deleteByPrimaryKey(companyAssignmentId);
    }

    @DisplayName("DELETE TEST: 削除対象のデータがない、falseを返す。")
    @Test
    void testDeleteAbnormal() {
        int companyAssignmentId = 1;
        when(companyAssignmentMapper.deleteByPrimaryKey(companyAssignmentId)).thenReturn(0);
        boolean actual = employeeAssignmentCompanyUpdateServiceImpl.delete(companyAssignmentId);
        assertFalse(actual);
        verify(companyAssignmentMapper, times(1)).deleteByPrimaryKey(companyAssignmentId);
    }
}
