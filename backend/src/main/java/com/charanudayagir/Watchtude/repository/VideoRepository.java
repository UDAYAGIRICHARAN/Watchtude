package com.charanudayagir.Watchtude.repository;

import com.charanudayagir.Watchtude.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {
}
