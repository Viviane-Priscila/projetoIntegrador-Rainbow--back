package br.com.rainbow_pi.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="tb_profissional")
@NoArgsConstructor
@Getter
@Setter
public class Profissional extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	@Column(name="id_profissional")
	private Long idProfissional;
	
	@Column(name="profissao_profissional")
	private String profissao;
	
	@Column(name="registro_profissional")
	private String registroProfissional;

}
