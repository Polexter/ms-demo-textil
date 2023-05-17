package com.demo.textil;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(
  webEnvironment = SpringBootTest.WebEnvironment.MOCK,
  classes = MsDemoTextilApplication.class)
@AutoConfigureMockMvc
class MsDemoTextilApplicationTests {

	
	 @Autowired
	 private MockMvc mvc;
	 
	@Test
	void listPriceTest01() throws Exception {
		String appDate = "2020-06-14T10:00:00";
		String productId = "35455";
		String brandId = "1";
		
		listMethod(appDate, productId, brandId);
	}

	@Test
	void listPriceTest02() throws Exception {
		String appDate = "2020-06-14T16:00:00";
		String productId = "35455";
		String brandId = "1";
		
		listMethod(appDate, productId, brandId);
	}
	
	@Test
	void listPriceTest03() throws Exception {
		String appDate = "2020-06-14T21:00:00";
		String productId = "35455";
		String brandId = "1";
		
		listMethod(appDate, productId, brandId);
	}
	
	@Test
	void listPriceTest04() throws Exception {
		String appDate = "2020-06-15T10:00:00";
		String productId = "35455";
		String brandId = "1";
		
		listMethod(appDate, productId, brandId);
	}
	
	@Test
	void listPriceTest05() throws Exception {
		String appDate = "2020-06-16T21:00:00";
		String productId = "35455";
		String brandId = "1";
		
		listMethod(appDate, productId, brandId);
	}
	
	 
	 private void listMethod(String appDate, String productId, String brandId) throws Exception {
		 StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("/price?");
			stringBuilder.append("applicationDate=");
			stringBuilder.append(appDate);
			stringBuilder.append("&productId=");
			stringBuilder.append(productId);
			stringBuilder.append("&brandId=");
			stringBuilder.append(brandId);
			
			mvc.perform(get(stringBuilder.toString())
				      .contentType(MediaType.APPLICATION_JSON))
				      .andExpect(status().isOk());
	 }
	
	
}
