package com.suivi_rendezvous.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suivi_rendezvous.models.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer>{
	Optional<Article> findByCodeArticle(String codeArticle);
	List<Article> findAllByCategoriyArticle(Integer id);

}
