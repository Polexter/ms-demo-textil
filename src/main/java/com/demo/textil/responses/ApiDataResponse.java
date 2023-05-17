package com.demo.textil.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiDataResponse<T> {

	private Integer code;
	private T data;
}
