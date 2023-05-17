package com.demo.textil.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.textil.entity.PriceEntity;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {
	
	@Query("select p from PriceEntity p where ((:applicationDate BETWEEN p.startDate and p.endDate) or :applicationDate is null) "
			+ "and (:productId = p.productId or :productId is null) "
			+ "and (:brandId = p.brandEntity.id or :brandId is null)")
	List<PriceEntity> findPrices(@Param("applicationDate") LocalDateTime applicationDate,
								 @Param("productId") Long productId,
								 @Param("brandId") Long brandId);
}
