package dev.humera.movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemindersService {

    @Autowired
    private RemindersRepository repository;

    @Autowired
    private CheckboxRepository checkbox;

    public List<Reminders> findAllReminders() {
        return repository.findAll();
    }

}
