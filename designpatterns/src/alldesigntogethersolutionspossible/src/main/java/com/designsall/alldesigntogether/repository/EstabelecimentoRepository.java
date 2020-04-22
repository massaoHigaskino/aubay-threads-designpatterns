package com.designsall.alldesigntogether.repository;

import com.designsall.alldesigntogether.entity.Estabelecimento;
import com.designsall.alldesigntogether.entity.Produto;
import com.designsall.alldesigntogether.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {

    Estabelecimento findByResponsavel(String responsavel);

}
