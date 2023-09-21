package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class FirstController {

    private final CalculatorService calculatorService;

    public FirstController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showHelloCalculator() {
        return "Добро пожаловать в мой калькулятор";
    }

    @GetMapping("/plus")
    public String sumCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int sum = calculatorService.sumNumbers(num1, num2);
        return String.format("%d + %d = %d", num1, num2, num1 + num2);
    }

    @GetMapping("/minus")
    public String minCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int sum = calculatorService.minNumbers(num1, num2);
        return String.format("%d - %d = %d", num1, num2, num1 - num2);
    }

    @GetMapping("/multiply")
    public String multiCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int sum = calculatorService.multiNumbers(num1, num2);
        return String.format("%d * %d = %d", num1, num2, num1 * num2);
    }

    @GetMapping("/divide")
    public String divideCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int sum = calculatorService.divideNumbers(num1, num2);
        return String.format("%d / %d = %d", num1, num2, num1 / num2);
    }

}
