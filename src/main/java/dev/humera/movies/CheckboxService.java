
package dev.humera.movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckboxService {
    @Autowired
    private CheckboxRepository checkbox;

    public List<Checkboxes> Checkboxes() {
        return checkbox.findAll();
    }
}
