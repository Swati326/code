package com.practice.Code;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeApplicationTests {

	@Test
	void contextLoads() {
	}

}

/*employe                                  Department

id , name, salary  , deprt_id          id, name

find avg salary of each department

select avg(e.salary) from employee e innner join department d on e.dept_id=d.id group by d.name;
//
*
 */