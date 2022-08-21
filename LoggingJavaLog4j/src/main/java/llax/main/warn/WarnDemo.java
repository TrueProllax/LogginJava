
package llax.main.warn;

import java.lang.invoke.MethodHandles;
import llax.main.debug.DebugDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Deprecated
public class WarnDemo {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public WarnDemo() {
        log.info("{} object has been created", this.getClass().getSimpleName());
        log.warn("this class is deprecated, don't use it!");
        log.warn("please, use {} class instead of it", DebugDemo.class.getSimpleName());
    }

}