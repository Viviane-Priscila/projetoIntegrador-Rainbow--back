package br.com.rainbow_pi.domain.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rainbow_pi.domain.entity.Profissional;
import lombok.Data;

@Data
public class ProfissionalDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private String profissao;
	private String registroProfissional;
	
	public ProfissionalDTO(Profissional profissional) {
		this.id = profissional.getId();
		this.nome = profissional.getNome();
		this.email = profissional.getEmail();
		this.cpf = profissional.getCpf();
		this.profissao = profissional.getProfissao();
		this.registroProfissional = profissional.getRegistroProfissional();
	}
	
	public static List<ProfissionalDTO> converterLista(java.util.List<Profissional> profissionais){
		return profissionais.stream().map(ProfissionalDTO::new).collect(Collectors.toList());
	}
}
