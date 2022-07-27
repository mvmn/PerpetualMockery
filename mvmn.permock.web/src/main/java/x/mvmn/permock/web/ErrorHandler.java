package x.mvmn.permock.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import x.mvmn.permock.exception.BadRequest;
import x.mvmn.permock.exception.NotFound;
import x.mvmn.permock.exception.ParseException;
import x.mvmn.permock.model.dto.ErrorResponseDto;

@RestControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(ParseException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ErrorResponseDto handle(ParseException e) {
		return ErrorResponseDto.builder().error("Rule parsing failed with parse errors").build();
	}

	@ExceptionHandler(BadRequest.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ErrorResponseDto handle(BadRequest e) {
		return ErrorResponseDto.builder().error(e.getMessage()).build();
	}

	@ExceptionHandler(NotFound.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorResponseDto handle(NotFound e) {
		return ErrorResponseDto.builder().error(e.getMessage()).build();
	}
}
