package br.com.rainbow_pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rainbow_pi.domain.entity.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {

}
