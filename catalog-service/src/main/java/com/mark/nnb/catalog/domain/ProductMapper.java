package com.mark.nnb.catalog.domain;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

class ProductMapper {

    @Contract("_ -> new")
    static @NotNull Product toProduct(@NotNull ProductEntity productEntity) {
        return new Product(
                productEntity.getCode(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getImageUrl(),
                productEntity.getPrice());
    }
}
