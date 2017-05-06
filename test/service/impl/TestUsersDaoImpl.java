package service.impl;

import org.junit.Test;

import junit.framework.Assert;
import service.UserDao;

public class TestUsersDaoImpl {
	@Test
	public void testUsersLogin()
	{
		UserDao userDao= new UserDaoImpl();
		boolean result=userDao.usersLogin("wxx", "123");
		System.out.println("test end result: "+result);
		Assert.assertEquals(true, result);
	}
	
}
