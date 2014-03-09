package io.espy.etac.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import io.espy.etac.model.AAccount;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/test-ctx.xml" })
public class AAccountServiceTest {

	@Autowired
	AAccountService aAccountService;

	@Test
	public void testFindAll() {
		System.out.println(aAccountService.findAll());
		assertTrue(true);
	}

	@Test
	public void testEquals() {

		AAccount a = new AAccount();
		a.setAdUserName("my user name");
		assertNotNull(aAccountService.insert(a));
	}

}
