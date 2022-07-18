package br.com.rainbow_pi.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_links")
@Data
@NoArgsConstructor
public class LinksUteis implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_link")
	private Long id;
	
	@Column(name="conteudo_link")
	private String conteudo;
	
	@Column(name="url_link")
	private String url;

}
