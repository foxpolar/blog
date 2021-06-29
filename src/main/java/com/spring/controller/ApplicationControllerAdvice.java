package com.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.exception.PostNaoEncontradoException;


@RestControllerAdvice
public class ApplicationControllerAdvice {

	@ExceptionHandler(PostNaoEncontradoException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ApiErrors handleRegraNegociosException(PostNaoEncontradoException ex) {
		String menssagemErro = ex.getMessage();
		return new ApiErrors(menssagemErro);
	}
}
