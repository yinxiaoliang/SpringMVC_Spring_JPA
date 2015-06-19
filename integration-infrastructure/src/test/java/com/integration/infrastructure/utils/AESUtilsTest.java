package com.integration.infrastructure.utils;

import static org.junit.Assert.fail;

import org.junit.Test;

public class AESUtilsTest {
	@Test
	public void testEncryptString() {
		//lhnau1axCkZ1/QlL9QGNNmA1yUmdxI2pOS6MGoxHsDM=
		System.out.println(AESUtils.encrypt("com.mysql.jdbc.Driver"));
		System.out.println(AESUtils.encrypt("spring-data-jpa"));
		System.out.println(AESUtils.encrypt("jdbc:mysql://localhost:3306/${database.name}?useUnicode=true&amp;characterEncoding=UTF-8"));
		System.out.println(AESUtils.encrypt("root"));
		System.out.println(AESUtils.encrypt("123456"));
		System.out.println(AESUtils.encrypt("update"));
		System.out.println(AESUtils.encrypt("MYSQL"));
		System.out.println(AESUtils.encrypt("true"));
		
		
		System.out.println(AESUtils.encrypt("3"));
		System.out.println(AESUtils.encrypt("3"));
		System.out.println(AESUtils.encrypt("15"));
		System.out.println(AESUtils.encrypt("0"));
		System.out.println(AESUtils.encrypt("3"));
		System.out.println(AESUtils.encrypt("0"));
		System.out.println(AESUtils.encrypt("30"));
		System.out.println(AESUtils.encrypt("false"));
		System.out.println(AESUtils.encrypt("false"));
		System.out.println(AESUtils.encrypt("0"));
	}

	@Test
	public void testDecryptString() {
		System.out.println(AESUtils.decrypt("lhnau1axCkZ1/QlL9QGNNmA1yUmdxI2pOS6MGoxHsDM="));
	}

	@Test
	public void testEncryptStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDecryptStringString() {
		fail("Not yet implemented");
	}

}
