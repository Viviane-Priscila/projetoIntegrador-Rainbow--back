package br.com.rainbow_pi.domain.vo.v1;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

import com.github.dozermapper.core.Mapping;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfissionalVO extends RepresentationModel<ProfissionalVO> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Mapping("id")
	private Long key;
	private String nome;
	private String email;
	private String cpf;
	private String profissao;
	private String registroProfissional;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(email, key, nome, cpf, profissao, registroProfissional);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfissionalVO other = (ProfissionalVO) obj;
		return Objects.equals(email, other.email) && Objects.equals(key, other.key) && Objects.equals(nome, other.nome)&& Objects.equals(cpf, other.cpf) && Objects.equals(profissao, other.profissao)&& Objects.equals(registroProfissional, other.registroProfissional);
	}

}
