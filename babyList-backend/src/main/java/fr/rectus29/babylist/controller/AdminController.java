package fr.rectus29.babylist.controller;

import fr.rectus29.babylist.model.ListRow;
import fr.rectus29.babylist.repository.ListRowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8029")
@RequestMapping("api/v1/admin")
public class AdminController {

}
