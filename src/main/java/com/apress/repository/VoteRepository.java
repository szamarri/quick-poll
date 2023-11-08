package com.apress.repository;

import org.springframework.data.repository.CrudRepository;

import com.apress.domain.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {
    
}
