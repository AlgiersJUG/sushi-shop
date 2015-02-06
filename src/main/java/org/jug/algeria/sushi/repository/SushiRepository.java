package org.jug.algeria.sushi.repository;

import org.jug.algeria.sushi.domain.Sushi;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SushiRepository extends MongoRepository<Sushi, Long>{

    public Sushi findByName(String name);

}
