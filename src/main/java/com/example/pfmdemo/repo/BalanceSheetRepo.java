package com.example.pfmdemo.repo;

import com.example.pfmdemo.model.BalanceSheet;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BalanceSheetRepo extends MongoRepository<BalanceSheet,Integer> {

}