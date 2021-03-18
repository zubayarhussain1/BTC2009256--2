package com.bit.test;

import org.junit.Test;

import pages.Homepage;
import pages.JeansPage;

public class SmokeTest extends BaseTest{
	Homepage p;
	JeansPage o;
	@Test
	public void test1() {
		
		p = new Homepage(dr);
		
		p.clickonmanpage();
		o = p.clickonmanjeans();
		o.skinnyjeans();
		
		
		
	}

}
