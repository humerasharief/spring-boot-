package dev.humera.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection ="reminders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reminders {
    @Id
    private ObjectId id;
    private String text;
    private String category;
    private String label;

}
