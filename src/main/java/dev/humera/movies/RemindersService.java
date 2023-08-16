package dev.humera.movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class RemindersService {

    @Autowired
    private RemindersRepository repository;

    public List<Reminders> findAllReminders() {
        return repository.findAll();
    }
}
