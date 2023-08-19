package dev.humera.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="checkboxes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Checkboxes {
    @Id
    private ObjectId id;
    private Boolean checked;
    private String category;
    private String label;
}
