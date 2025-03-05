package com.rays.junit;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestUserAdd {

	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(2);
		bean.setName("gourav");
		bean.setSalary(6000);

		UserModel model = new UserModel();

		model.add(bean);

		bean = model.findByPk(2);

		assertNotNull("record is not added", bean);

	}

}