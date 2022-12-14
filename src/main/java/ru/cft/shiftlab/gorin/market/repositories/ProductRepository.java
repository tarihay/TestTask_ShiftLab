package ru.cft.shiftlab.gorin.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.cft.shiftlab.gorin.market.model.enums.ProductType;
import ru.cft.shiftlab.gorin.market.repositories.model.ProductEntity;

import java.util.List;

/**
 * Интерфейс-Репозиторий, работающий с сущностью товара. Наследуется от Jpa-репозитория. Имплементация не нужна
 * @see JpaRepository
 * @see ProductEntity
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findById(long id);

    List<ProductEntity> findAllByProductType(ProductType productType);

    void deleteById(long id);

    void deleteAll();
}
