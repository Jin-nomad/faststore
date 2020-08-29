package com.fastcampus.faststore.type;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiscountType {
    AMOUNT(0),
    PERCENT(3000);

    private int discount_rate;
}
