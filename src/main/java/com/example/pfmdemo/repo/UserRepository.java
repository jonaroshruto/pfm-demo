package com.example.pfmdemo.repo;

import com.example.pfmdemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends MongoRepository<User,Long> {

    @Query("{emailAddress:'?0'}")
    User findByEmailAddress(String emailAddress);
    //@Query(fields = "{firstName; 1}")
    //List<User> findAll();

    public long count();



}
