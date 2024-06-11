package dev.saidul.EcomProductService.repository;

import dev.saidul.EcomProductService.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CartRepository extends JpaRepository<Cart, UUID> {
}
