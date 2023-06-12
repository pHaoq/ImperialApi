package com.example.imperialapi;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialAPIController {

    @RequestMapping("/")
    public String homepage(){
        return "You can convert Inch to Centimeter in /InchToCentimeter" + "<br>" +
                "You can convert Yard to Meter in /YardToMeter";
    }


    @RequestMapping("/InchToCentimeter")
    public int itc(@RequestParam int i){
        return i/10;
    }



}
