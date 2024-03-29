package alfacentauri.com.service.exception;

public class EmailApiException extends RuntimeException {

    public EmailApiException() {
        super("Error sending email...");
    }
}
