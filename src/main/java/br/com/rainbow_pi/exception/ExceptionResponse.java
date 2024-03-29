package br.com.rainbow_pi.exception;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse implements Serializable{

	private static final long serialVersionUID = 1L;

	private Date timestamp;
	private String mensagem;
	private String descricao;
	
}
