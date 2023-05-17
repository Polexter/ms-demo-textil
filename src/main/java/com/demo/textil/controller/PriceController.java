package com.demo.textil.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.textil.responses.ApiDataResponse;
import com.demo.textil.responses.PriceResponseDto;
import com.demo.textil.service.PriceSevice;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Price Service")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(PriceController.BASE_PATH)
public class PriceController {

	static final String BASE_PATH = "/price";
	
	@Autowired
	private PriceSevice priceService;
	

    @Operation(summary = "Prices", description = "This operation returned the prices")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "404", description = "Price no fount", content = {
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ApiDataResponse.class))
            })
    })
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
	public ResponseEntity<ApiDataResponse<List<PriceResponseDto>>> listPrice(
			@Parameter(example = "yyyy-MM-dd'T'HH:mm:ss")
			@RequestParam(value = "applicationDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime applicationDate,
			@RequestParam(value = "productId", required = false) Long productId,
			@RequestParam(value = "brandId", required = false) Long brandId) {
    	List<PriceResponseDto> priceResponseDtos = priceService.listPrices(applicationDate, productId, brandId);
    	return ResponseEntity.ok(ApiDataResponse.<List<PriceResponseDto>>builder()
    			.code(HttpStatus.OK.value())
    			.data(priceResponseDtos)
    			.build());
		
	}
}
