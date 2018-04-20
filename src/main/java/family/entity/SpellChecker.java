package family.entity;

import org.springframework.stereotype.Service;


/**
 * Created by yangboyu on 17/3/23.
 */
@Service(value = "SpellChecker")
public class SpellChecker {
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor." );
    }
    public void checkSpelling(){
        System.out.println("Inside checkSpelling." );
    }

}
