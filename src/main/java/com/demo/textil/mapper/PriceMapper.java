package com.demo.textil.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.demo.textil.entity.PriceEntity;
import com.demo.textil.responses.PriceResponseDto;

@Mapper
public interface PriceMapper {
	
	@Mapping(target = "brandId", source = "brandEntity.id")
	@Mapping(target = "priceListId", source = "priceList")
	PriceResponseDto parsePriceResponseDto(PriceEntity priceEntity);
	
	List<PriceResponseDto> parsePriceResponseDtoList(List<PriceEntity> priceEntityList);

}
