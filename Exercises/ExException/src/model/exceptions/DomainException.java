package model.exceptions;

// Com extensão de Runtime, o programa não reclama obrigatoriamente a respeito do tratamento de exceções
// Mesmo assim, é recomendado trata-las.
public class DomainException extends RuntimeException {
	// Versão do serial
	private static final long serialVersionUID = 1L;
	
	// Permite que a exceção personalizada seja instanciada com uma mensagem personalizada
	public DomainException(String msg) {
		super(msg);
	}
	
}
