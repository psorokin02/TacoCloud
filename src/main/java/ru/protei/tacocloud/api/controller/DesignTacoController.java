package ru.protei.tacocloud.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.protei.tacocloud.data.Ingredient;
import ru.protei.tacocloud.data.Ingredient.IngredientType;
import ru.protei.tacocloud.data.Taco;
import ru.protei.tacocloud.data.TacoOrder;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("design")
@SessionAttributes("tacoOrder")
public class DesignTacoController {

    @ModelAttribute
    public void addIngredients(Model model) {
        model.addAttribute(
                IngredientType.Protein.name().toLowerCase(),
                List.of(
                        new Ingredient("pr", "fish", IngredientType.Protein),
                        new Ingredient("pr", "meat", IngredientType.Protein)
                ));

        model.addAttribute(IngredientType.WRAP.name().toLowerCase(),
                List.of(
                    new Ingredient("wr", "bread", IngredientType.WRAP)
                ));

        model.addAttribute(IngredientType.SAUCE.name().toLowerCase(),
                List.of(
                    new Ingredient("sc", "cesar", IngredientType.SAUCE),
                    new Ingredient("sc", "ketchup", IngredientType.SAUCE)
                ));

    }

    @ModelAttribute(name = "tacoOrder")
    public TacoOrder tacoOrder() {
        return new TacoOrder();
    }

    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }

    @GetMapping
    public String showDesign() {
        return "design";
    }
}
