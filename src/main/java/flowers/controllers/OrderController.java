package flowers.controllers;

import flowers.entities.*;
import flowers.services.OrderService;
import flowers.services.impl.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/main")
public class OrderController {

    private NameOfFlowerService nameOfFlowerService;
    private OrderService orderService;
    private PriceService priceService;
    private ReasonService reasonService;
    private SexService sexService;
    private StyleService styleService;

    @ModelAttribute(name = "name_of_flowers")
    public List<NameOfFlower> getNameOfFlower() {
        return nameOfFlowerService.findAll();
    }

    @ModelAttribute(name = "prices")
    public List<Price> getPrices() {
        return priceService.findAll();
    }

    @ModelAttribute(name = "reasons")
    public List<Reason> getReasons() {
        return reasonService.findAll();
    }

    @ModelAttribute(name = "sexs")
    public List<Sex> getSexs() {
        return sexService.findAll();
    }

    @ModelAttribute(name = "styles")
    public List<Style> getStyles() {
        return styleService.findAll();
    }

    @GetMapping
    public String main(Model model) {
        model.addAttribute("order", new Order());
        return "index";
    }

    @PostMapping
    public String getOrder(@ModelAttribute(name = "order") Order order) {
        System.out.println("!!!!!!!!!!!!!" + order);
        return "redirect:/main";
    }
}
