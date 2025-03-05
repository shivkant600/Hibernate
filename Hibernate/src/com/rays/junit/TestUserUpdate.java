package com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserUpdate {

	@Test
	public void update() throws Exception {

		UserBean bean = UserModel.findByPk(2);

		bean.setName("amit");

		UserModel.update(bean);

		bean = UserModel.findByPk(2);

		assertEquals("amit", bean.getName());

	}
}