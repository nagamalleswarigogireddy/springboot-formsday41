package com.jobiak.mvcforms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mvcforms.models.User;

@Repository
	public interface UserRepository extends JpaRepository<User,Long> {
}

