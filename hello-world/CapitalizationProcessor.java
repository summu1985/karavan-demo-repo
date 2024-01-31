import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@Configuration
@BindToRegistry("CapitalizationProcessor")
public class CapitalizationProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        String inputMessage = exchange.getIn().getBody(String.class);
        String outputMessage = inputMessage.toUpperCase();
        exchange.getIn().setBody(outputMessage, String.class);
    }
}