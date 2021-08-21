package com.spring.codeblog.repository;

import com.spring.codeblog.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {




}
