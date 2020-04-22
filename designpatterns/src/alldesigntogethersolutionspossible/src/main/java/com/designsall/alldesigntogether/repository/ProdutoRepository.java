package com.designsall.alldesigntogether.repository;

import com.designsall.alldesigntogether.entity.Produto;
import com.designsall.alldesigntogether.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByDescricaoContains(String descricao);

}
