package com.nttdata.assignment.repository;

import com.nttdata.assignment.entity.Assignment;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface IAssignmentRepository extends ReactiveMongoRepository<Assignment, String> {


}
