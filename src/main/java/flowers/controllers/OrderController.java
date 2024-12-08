package flowers.controllers;

import flowers.entities.*;
import flowers.services.OrderService;
import flowers.services.impl.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//@AllArgsConstructor
@Controller
@RequestMapping("/main")
public class OrderController {

    private OrderService orderService;
    private PriceService priceService;
    private ReasonService reasonService;
    private SexService sexService;
    private StyleService styleService;
    private NameOfFlowerService nameOfFlowerService;

    @Autowired
    public OrderController(OrderService orderService, PriceService priceService
            , ReasonService reasonService, SexService sexService
            , StyleService styleService, NameOfFlowerService nameOfFlowerService) {
        this.orderService = orderService;
        this.priceService = priceService;
        this.reasonService = reasonService;
        this.sexService = sexService;
        this.styleService = styleService;
        this.nameOfFlowerService = nameOfFlowerService;
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

    @ModelAttribute(name = "name_of_flowers")
    public List<NameOfFlower> getNameOfFlower() {
        return nameOfFlowerService.findAll();
    }

    @GetMapping
    public String main(Model model) {
        model.addAttribute("order", new Order());
        return "index";
    }

    @PostMapping
    public String getOrder(@ModelAttribute(name = "order") Order order) {
        orderService.save(order);
        System.out.println(order.toString());
        return "redirect:/main";
    }
}
