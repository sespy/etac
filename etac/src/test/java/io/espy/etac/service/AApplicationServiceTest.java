package io.espy.etac.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/test-ctx.xml" })
public class AApplicationServiceTest {

	@Autowired
	AApplicationService aApplicationService;

	@Test
	public void testEquals() {

		System.out.println(aApplicationService.findAll());

		assertTrue(true);
	}
}
