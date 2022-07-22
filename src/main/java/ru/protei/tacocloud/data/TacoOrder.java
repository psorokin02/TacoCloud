package ru.protei.tacocloud.data;

import lombok.Data;

import java.util.List;

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryCity;

    private List<Taco> tacos;

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
}
