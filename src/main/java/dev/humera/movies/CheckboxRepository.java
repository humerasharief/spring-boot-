package dev.humera.movies;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;

@Repository
public interface CheckboxRepository extends MongoRepository<Checkboxes, ObjectId> {
}