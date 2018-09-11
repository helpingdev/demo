package com.ca.devtest.lisabank.demo.sv.http;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ca.devtest.lisabank.demo.LisaBankClientApplication;
import com.ca.devtest.sv.devtools.annotation.DevTestVirtualServer;


/**
 * @author gaspa03
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LisaBankClientApplication.class)
@DevTestVirtualServer()
public class NewTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
