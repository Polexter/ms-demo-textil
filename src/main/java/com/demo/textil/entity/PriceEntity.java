package com.demo.textil.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_PRICES")
@Data
@NoArgsConstructor
public class PriceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NU_ID")
	private Long id;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NU_BRAND_ID")
	private BrandEntity brandEntity;
    
    @Column(name = "DT_START_DATE")
    private LocalDateTime startDate;
    
    @Column(name = "DT_END_DATE")
    private LocalDateTime endDate;
    
    @Column(name = "NU_PRICE_LIST")
    private Long priceList;
    
    @Column(name = "NU_PRODUCT_ID")
    private Long productId;
    
    @Column(name = "NU_PRIORITY")
    private Integer priority;
    
    @Column(name = "NU_PRICE")
    private Double price;
    
    @Column(name = "TX_CURRENCY")
    private String currency;
    
}
