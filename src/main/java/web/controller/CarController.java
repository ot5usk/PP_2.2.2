package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;
import java.util.List;


@Controller
public class CarController {

    private final CarService carService = new CarServiceImp();

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
