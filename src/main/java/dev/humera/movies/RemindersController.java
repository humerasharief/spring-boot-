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
@RequestMapping("/api/v1/reminders")
public class RemindersController {

    @Autowired
    private RemindersService service;

    @GetMapping
    public ResponseEntity<List<Reminders>> getMovies() {
        return new ResponseEntity<List<Reminders>>(service.findAllReminders(), HttpStatus.OK);
    }

    @GetMapping("/checkboxes")
    public ResponseEntity<List<Reminders>> getcheckboxes() {
        return new ResponseEntity<List<Reminders>>(service.findAllReminders(), HttpStatus.OK);
    }
}
