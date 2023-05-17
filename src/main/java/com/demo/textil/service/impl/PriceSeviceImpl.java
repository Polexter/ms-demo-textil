package com.demo.textil.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.demo.textil.entity.PriceEntity;
import com.demo.textil.exception.NotFoundException;
import com.demo.textil.mapper.PriceMapper;
import com.demo.textil.repository.PriceRepository;
import com.demo.textil.responses.PriceResponseDto;
import com.demo.textil.service.PriceSevice;

@Service
public class PriceSeviceImpl implements PriceSevice {
	
	@Autowired
	private PriceRepository priceRepository;

	@Autowired
	private PriceMapper priceMapper;
	
	
	@Override
	public List<PriceResponseDto> listPrices(LocalDateTime applicationDate, Long productId, Long brandId) {
		List<PriceEntity> priceEntities = priceRepository.findPrices(applicationDate, productId, brandId);
		List<PriceResponseDto> priceResponseDtos = priceMapper.parsePriceResponseDtoList(priceEntities);
		if(CollectionUtils.isEmpty(priceResponseDtos)) {
			throw new NotFoundException();
		}
		return priceResponseDtos;
	}

}
