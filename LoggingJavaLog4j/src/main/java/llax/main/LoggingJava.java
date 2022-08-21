package llax.main;

import java.time.LocalTime;
import llax.main.debug.DebugDemo;
import llax.main.error.ErrorDemo;
import llax.main.varargs.VarargsDemo;
import llax.main.warn.WarnDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingJava {
    
    private static final Logger log = LoggerFactory.getLogger(LoggingJava.class.getName());

    public static void main(String[] args) {
        log.info("Started application at {}",LocalTime.now());
        ErrorDemo error = new ErrorDemo();
        WarnDemo warn = new WarnDemo();
        DebugDemo debug = new DebugDemo(11,123);
        VarargsDemo varargs = new VarargsDemo();
    }
}
