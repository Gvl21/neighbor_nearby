package com.morecommit.carrotEz.dto.request.article;

import com.morecommit.carrotEz.dto.response.article.ArticleResponseDto;
import com.morecommit.carrotEz.entity.Article;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ArticleRequestDto {
    @NotBlank(message = "필수 입력 값 입니다.")
    private String title;

    @NotBlank(message = "필수 입력 값 입니다.")
    private String content;

    private String category;

    private String area;


    private List<MultipartFile> articleImageList = new ArrayList<>();




    // 게시글 생성 메서드 Dto -> entity 두 객체간 매핑
    public static Article createArticle(ArticleRequestDto dto) {
        Article article = new Article();
        article.setTitle(dto.getTitle());
        article.setContent(dto.getContent());
        article.setArea(dto.getArea());
        article.setCategory(dto.getCategory());
        article.setArticleStatus(true);
        return article;
    }

    // 게시글 수정 시에 사용할 메서드 entity -> Dto
//    public ArticleRequestDto of(Article article) {return modelMapper.map(article, ArticleRequestDto.class);}




}
