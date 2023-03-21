package com.employee.managementapi.employee.company.belonging;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.employee.managementapi.infrastructure.employee.BelongingCompany;
import com.employee.managementapi.infrastructure.employee.BelongingCompanyMapper;

/**
 * 所属会社登録サービステスト
 */
public class EmployeeBelongingCompanyUpdateServiceImplTest {

    @Mock
    private BelongingCompanyMapper belongingCompanyMapper;

    @InjectMocks
    private EmployeeBelongingCompanyUpdateServiceImpl employeeBelongingCompanyUpdateServiceImpl;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @DisplayName("CREATE TEST: 所属会社が登録できているかどうか")
    @Test
    void testInsert() {
        EmployeeBelongingCompany employeeBelongingCompany = new EmployeeBelongingCompany(1, 1);
        EmployeeBelongingCompanyWithPrimaryKey employeeBelongingCompanyWithPrimaryKey = new EmployeeBelongingCompanyWithPrimaryKey(
                1, 1, 1);
        when(belongingCompanyMapper.insert(Mockito.any(BelongingCompany.class))).thenReturn(1);
        when(belongingCompanyMapper.selectNextval()).thenReturn(1);
        EmployeeBelongingCompanyWithPrimaryKey actual = employeeBelongingCompanyUpdateServiceImpl
                .insert(employeeBelongingCompany);
        assertEquals(employeeBelongingCompanyWithPrimaryKey.getBelongingCompanyId(), actual.getBelongingCompanyId());
        assertEquals(employeeBelongingCompanyWithPrimaryKey.getCompanyId(), actual.getCompanyId());
        assertEquals(employeeBelongingCompanyWithPrimaryKey.getEmployeeId(), actual.getEmployeeId());
        verify(belongingCompanyMapper, times(1)).insert(Mockito.any(BelongingCompany.class));
    }

    @DisplayName("UPDATE TEST:所属会社が更新されているかどうか")
    @Test
    public void testUpdate() {
        EmployeeBelongingCompanyWithPrimaryKey employeeBelongingCompanyWithPrimaryKey = new EmployeeBelongingCompanyWithPrimaryKey(
                1, 1, 1);
        when(belongingCompanyMapper.updateByPrimaryKey(any(BelongingCompany.class))).thenReturn(1);
        EmployeeBelongingCompanyWithPrimaryKey actual = employeeBelongingCompanyUpdateServiceImpl
                .update(employeeBelongingCompanyWithPrimaryKey);
        assertEquals(employeeBelongingCompanyWithPrimaryKey, actual);
        verify(belongingCompanyMapper, times(1)).updateByPrimaryKey(any(BelongingCompany.class));
    }

    @DisplayName("DELETE TEST: 削除対象のデータがあり、所属会社が削除出来ている")
    @Test
    void testDeleteNormal() {
        int belongingCompanyId = 1;
        when(belongingCompanyMapper.deleteByPrimaryKey(belongingCompanyId)).thenReturn(1);
        boolean actual = employeeBelongingCompanyUpdateServiceImpl.delete(belongingCompanyId);
        assertTrue(actual);
        verify(belongingCompanyMapper, times(1)).deleteByPrimaryKey(belongingCompanyId);
    }

    @DisplayName("DELETE TEST: 削除対象のデータがない、falseを返す。")
    @Test
    void testDeleteAbnormal() {
        int belongingCompanyId = 1;
        when(belongingCompanyMapper.deleteByPrimaryKey(belongingCompanyId)).thenReturn(0);
        boolean actual = employeeBelongingCompanyUpdateServiceImpl.delete(belongingCompanyId);
        assertFalse(actual);
        verify(belongingCompanyMapper, times(1)).deleteByPrimaryKey(belongingCompanyId);
    }
}
