package com.spring.exception;

public class PostNaoEncontradoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PostNaoEncontradoException(String message) {
		super("Post Não encontrado");
	}

}
