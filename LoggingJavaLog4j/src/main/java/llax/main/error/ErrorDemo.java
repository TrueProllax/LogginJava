
package llax.main.error;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ErrorDemo {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public ErrorDemo() {
        log.error("Something went wrong... {}", "That's life =\\");
        log.error("Mistake of compile {}", "ErrorDemo");
    }

}
