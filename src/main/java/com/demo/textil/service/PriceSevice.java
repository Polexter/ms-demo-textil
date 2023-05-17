package com.demo.textil.service;

import java.time.LocalDateTime;
import java.util.List;

import com.demo.textil.responses.PriceResponseDto;

public interface PriceSevice {
	
	List<PriceResponseDto> listPrices(LocalDateTime applicationDate, Long productId, Long brandId);

}
