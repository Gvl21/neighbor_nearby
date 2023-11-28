package com.morecommit.carrotEz.repository;

import com.morecommit.carrotEz.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    Article findByTitle(String title);
    //Article findAllById(String title);

    List<Article> findAll();

    List<Article> findByOrderByRegTimeDesc();
}
