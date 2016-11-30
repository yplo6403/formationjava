package com.orange.formationjava;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReadResourceTest {
	
	ReadResource mReadResource;
	
	@Before  
    public void setUp()  {
		mReadResource = new ReadResource();
    }

	@Test
	public void testOpenAndDisplayFileNormalCase() {
		assertTrue(mReadResource.openAndDisplayFile("Application.properties"));
	}
	
	@Test
	public void testOpenAndDisplayFileInvalidFileName() {
		assertFalse(mReadResource.openAndDisplayFile("Invalid.filename"));
	}


}
