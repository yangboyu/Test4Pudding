package family.annotations;

import java.lang.annotation.*;

/**
 * Created by yangboyu on 17/3/27.
 */
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface TestRetention {
    String name() default "Retention Name.";
    String documentDescption() default "descption is null";
}
