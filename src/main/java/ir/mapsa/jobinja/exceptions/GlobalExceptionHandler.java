package ir.mapsa.jobinja.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<?> handleNotFoundException(NotFoundException exp){
        Map<String,String> exres = new HashMap<>();
        exres.put(ExpMessages.NOT_EXIST.toString(),exp.getMessage());
        return new ResponseEntity<>(exres,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = ConflictException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<?> handleConflictException(ConflictException exp){
        Map<String,String> exres = new HashMap<>();
        exres.put(ExpMessages.DUPLICATE_INPUT.toString(),exp.getMessage());
        return new ResponseEntity<>(exres,HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ResponseEntity<?> handleRuntimeException(RuntimeException exp){
        Map<String,String> exres = new HashMap<>();
        exres.put(ExpMessages.ID_NOT_EXIST.toString(),exp.getMessage());
        return new ResponseEntity<>(exres,HttpStatus.NOT_ACCEPTABLE);
    }

}
