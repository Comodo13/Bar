package dmitri.prague.bar.bar.domain.exception;

import dmitri.prague.bar.bar.domain.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.text.MessageFormat;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class CustomerAlreadyHasOrderException extends RuntimeException {

    public CustomerAlreadyHasOrderException(final Integer id) {
        super(MessageFormat.format("Customer with No {id} already has assigned order", id));
    }
}
