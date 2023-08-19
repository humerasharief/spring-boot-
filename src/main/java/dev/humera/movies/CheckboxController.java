package dev.humera.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v1/checkboxes")
public class CheckboxController {

    @Autowired
    private CheckboxService service;

    @GetMapping
    public ResponseEntity<List<Checkboxes>> getcheckboxes() {
        return new ResponseEntity<List<Checkboxes>>(service.Checkboxes(), HttpStatus.OK);
    }
}
