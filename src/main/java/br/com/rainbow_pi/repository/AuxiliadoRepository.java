package br.com.rainbow_pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rainbow_pi.domain.entity.Auxiliado;

@Repository
public interface AuxiliadoRepository extends JpaRepository<Auxiliado, Long>{


}
