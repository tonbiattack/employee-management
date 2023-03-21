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
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 社員会社配属コントローラーテスト
 */
public class EmployeeCompanyAssignmentControllerTest {

        private MockMvc mvc;

        @Mock
        private EmployeeCompanyAssignmentUpdateServiceCoordinator employeeCompanyAssignmentUpdateServiceCoordinator;

        @InjectMocks
        private EmployeeCompanyAssignmentController employeeCompanyAssignmentController;

        @BeforeEach
        public void setup() {
                MockitoAnnotations.openMocks(this);
                mvc = MockMvcBuilders.standaloneSetup(employeeCompanyAssignmentController).build();

        }

        @DisplayName("CREATE TEST:所属会社と会社配属テーブルに登録することが出来ているか、登録した内容を返すことが出来ているか")
        @Test
        void testInsert() throws ParseException {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Date date = sdf.parse("1971/11/25");

                EmployeeCompanyAssignment employeeCompanyAssignment = new EmployeeCompanyAssignment(1, 1, date);
                EmployeeCompanyAssignmentWithPrimaryKey employeeCompanyAssignmentWithPrimaryKey = new EmployeeCompanyAssignmentWithPrimaryKey(
                                1,
                                1,
                                1, 1, date);
                when(employeeCompanyAssignmentUpdateServiceCoordinator.assignment(employeeCompanyAssignment))
                                .thenReturn(employeeCompanyAssignmentWithPrimaryKey);
                EmployeeCompanyAssignmentWithPrimaryKey response = employeeCompanyAssignmentController
                                .assignment(employeeCompanyAssignment);
                assertEquals(employeeCompanyAssignmentWithPrimaryKey, response);
        }

        @DisplayName("UPDATE TEST:所属会社を更新、会社配属に登録できているかどうか、更新、登録した内容を複合したドメインオブジェクトを返すことが出来ている")
        @Test
        void testUpdate() throws ParseException {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Date date = sdf.parse("1971/11/25");

                EmployeeCompanyAssignmentWithPrimaryKey employeeCompanyAssignmentWithPrimaryKey = new EmployeeCompanyAssignmentWithPrimaryKey(
                                1,
                                1,
                                1, 1, date);
                when(employeeCompanyAssignmentUpdateServiceCoordinator
                                .jobAssignmentSystem(employeeCompanyAssignmentWithPrimaryKey))
                                .thenReturn(employeeCompanyAssignmentWithPrimaryKey);
                EmployeeCompanyAssignmentWithPrimaryKey response = employeeCompanyAssignmentController
                                .jobAssignmentSystem(employeeCompanyAssignmentWithPrimaryKey);
                assertEquals(employeeCompanyAssignmentWithPrimaryKey, response);
        }

        @DisplayName("DELETE TEST: 所属会社と会社配属を削除することが出来ているかどうか、複合サービスが一度呼ばれているか")
        @Test
        public void testDelete() throws Exception {
                int companyAssignmentId = 1;
                int belongingCompanyId = 1;
                employeeCompanyAssignmentController.delete(companyAssignmentId, belongingCompanyId);
                verify(employeeCompanyAssignmentUpdateServiceCoordinator, times(1)).delete(companyAssignmentId,
                                belongingCompanyId);
        }

        @DisplayName("API TEST:APIが適切なステータスコードを返すのかテスト")
        @Test
        void testApi() throws Exception {
                // 共通処理
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Date date = sdf.parse("1971/11/25");
                String baseUrl = "/api/v1/employees/companys/assignments";
                // POST http://localhost:8080/api/v1/companys/assignments

                EmployeeCompanyAssignment employeeCompanyAssignment = new EmployeeCompanyAssignment(1, 1, date);
                ObjectMapper objectMapper = new ObjectMapper();
                mvc.perform(MockMvcRequestBuilders.post(baseUrl)
                                .content(objectMapper.writeValueAsString(employeeCompanyAssignment))
                                .contentType(MediaType.APPLICATION_JSON_VALUE))
                                .andExpect(MockMvcResultMatchers.status().isCreated());

                // PATCH http://localhost:8080/api/v1/companys/assignments
                EmployeeCompanyAssignmentWithPrimaryKey employeeCompanyAssignmentWithPrimaryKey = new EmployeeCompanyAssignmentWithPrimaryKey(
                                1, 1, 1, 1, date);
                mvc.perform(MockMvcRequestBuilders.patch(baseUrl)
                                .content(objectMapper.writeValueAsString(employeeCompanyAssignmentWithPrimaryKey))
                                .contentType(MediaType.APPLICATION_JSON_VALUE))
                                .andExpect(MockMvcResultMatchers.status().isOk());

                // DELETE http://localhost:8080/api/v1/companys/assignments/1/1
                mvc.perform(MockMvcRequestBuilders.delete(baseUrl + "/1/1"))
                                .andExpect(MockMvcResultMatchers.status().isNoContent());
        }

}
