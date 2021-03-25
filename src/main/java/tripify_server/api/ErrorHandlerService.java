package tripify_server.api;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import tripify_server.exception.ApplicationError;
import tripify_server.exception.TestNotFoundException;

@ControllerAdvice
@RestController
public class ErrorHandlerService extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TestNotFoundException.class)
    public ResponseEntity<ApplicationError> handleTestNotFoundException(TestNotFoundException exception,
                                                                        WebRequest webRequest){
        ApplicationError error = new ApplicationError();
        error.setCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(TestNotFoundException.EXCEPTION_MESSAGE);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}
