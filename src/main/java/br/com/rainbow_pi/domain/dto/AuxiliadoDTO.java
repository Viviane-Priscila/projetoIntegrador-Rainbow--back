package br.com.rainbow_pi.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rainbow_pi.domain.entity.Auxiliado;
import lombok.Data;

@Data
public class AuxiliadoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private String tipoDeAjuda;
	private Date dataNasc;
	
	public AuxiliadoDTO(Auxiliado auxiliado) {
		this.id = auxiliado.getId();
		this.nome = auxiliado.getNome();
		this.email = auxiliado.getEmail();
		this.cpf = auxiliado.getCpf();
		this.tipoDeAjuda = auxiliado.getTipoDeAjuda();
		this.dataNasc = auxiliado.getDataNasc();
	}
	
	public static List<AuxiliadoDTO> converterLista(java.util.List<Auxiliado> auxiliados){
		return auxiliados.stream().map(AuxiliadoDTO::new).collect(Collectors.toList());
	}
}
