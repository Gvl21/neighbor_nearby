package com.morecommit.carrotEz.service;

import com.morecommit.carrotEz.dto.ArticleDto;
import com.morecommit.carrotEz.entity.Article;
import com.morecommit.carrotEz.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class ArticleService {
    private final ArticleRepository articleRepository;

    public void saveArticle(ArticleDto articleDto) {
        Article article = articleDto.createArticle();
        articleRepository.save(article);
    }
}