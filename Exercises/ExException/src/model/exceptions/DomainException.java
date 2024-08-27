package model.exceptions;

public class DomainException extends RuntimeException {
	// Versão do serial
	private static final long serialVersionUID = 1L;
	
	// Permite que a exceção personalizada seja instanciada com uma mensagem personalizada
	public DomainException(String msg) {
		super(msg);
	}
	
}
