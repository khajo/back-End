package at.nacs.chefrecipes.persistence.repository;

import at.nacs.chefrecipes.persistence.data.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}
