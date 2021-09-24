package com.example.demohightchart.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class GraphController {

    @GetMapping("/")
    public ModelAndView getIndex() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

    @GetMapping("/barChart")
    public ModelAndView barChart(Model model) {
        ModelAndView mav = new ModelAndView("barChart");
        //tạo data
        Map<String, Integer> data = new LinkedHashMap<>();
        data.put("Chó", 30);
        data.put("Mèo", 50);
        data.put("Gấu", 70);
        data.put("Hổ", 90);
//        data.put("Chuột", 25);
//        data.put("Chó 2", 30);
//        data.put("Mèo 2", 50);
//        data.put("Gấu 2", 70);
//        data.put("Hổ 2", 90);
//        data.put("Chuột 2", 25);
        model.addAttribute("keySet", data.keySet());
        model.addAttribute("values", data.values());

        return mav;
    }

    @GetMapping("/pieChart")
    public ModelAndView pieChart(Model model) {
        ModelAndView mav = new ModelAndView("pieChart");

        model.addAttribute("pass", 70);
        model.addAttribute("fail", 30);
        model.addAttribute("other", 20);
        return mav;

    }
}
