package family.entity;

import family.annotations.TestRetention;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by yangboyu on 17/3/23.
 */
@Service
@TestRetention(name = "in textEditor.")
public class TextEditor {
    @Resource
    private SpellChecker spellChecker;
    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }
    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
