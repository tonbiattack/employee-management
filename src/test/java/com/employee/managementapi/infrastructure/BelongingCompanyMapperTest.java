package com.employee.managementapi.infrastructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.jdbc.Sql;

import com.employee.managementapi.infrastructure.employee.BelongingCompanyMapper;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Sql("/init.sql")
@Sql("/employee_status.sql")
@Sql("/gender.sql")
@Sql("/employee.sql")
@Sql("/company.sql")
@Sql("/belonging_company.sql")
public class BelongingCompanyMapperTest {

    @Autowired
    private BelongingCompanyMapper belongingCompanyMapper;

    @DisplayName("SELECT TEST:シーケンスを取得できている")
    @Test
    void testsequence() {
        int actual = belongingCompanyMapper.selectNextval();
        // 既に6件のデータがインサートされているので
        assertEquals(7, actual);
    }
}
