package fr.rectus29.babylist.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@CrossOrigin(origins = "http://localhost:8029")
@RequestMapping("api/v1/babylist")
public class BabyListController{


}
