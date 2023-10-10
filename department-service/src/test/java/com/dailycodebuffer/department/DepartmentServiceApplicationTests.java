package com.dailycodebuffer.department;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DepartmentServiceApplicationTests {

	private DepartmentService departmentService;

	@Test
	void contextLoads() {
	}

	@Test
	Department CheckDepartmentLoaded(){
		departmentService.findDepartmentById(123456789012345L);

		return null;
	}

}
