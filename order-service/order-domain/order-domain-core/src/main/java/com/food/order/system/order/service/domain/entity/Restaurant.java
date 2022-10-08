package com.food.order.system.order.service.domain.entity;

import com.food.order.system.domain.entity.AggregateRoot;
import com.food.order.system.domain.valueobject.RestaurantId;

import java.util.List;

public class Restaurant extends AggregateRoot<RestaurantId> {
    private final List<Product> products;
    private boolean activate;

    private Restaurant(Builder builder) {
        super.setId(builder.restaurantId);
        products = builder.products;
        activate = builder.activate;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public List<Product> getProducts() {
        return products;
    }

    public boolean isActivate() {
        return activate;
    }

    public static final class Builder {
        private RestaurantId restaurantId;
        private List<Product> products;
        private boolean activate;

        private Builder() {
        }

        public Builder restaurantId(RestaurantId val) {
            restaurantId = val;
            return this;
        }

        public Builder products(List<Product> val) {
            products = val;
            return this;
        }

        public Builder activate(boolean val) {
            activate = val;
            return this;
        }

        public Restaurant build() {
            return new Restaurant(this);
        }
    }
}
