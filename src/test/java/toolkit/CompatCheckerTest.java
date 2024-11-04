package toolkit;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompatCheckerTest {
    @Test
    void requiredFieldRemovalBreaksCompatibility() {
        var oldSchema = new SchemaDef("s", List.of(new FieldDef("id", "string", true)));
        var newSchema = new SchemaDef("s", List.of());
        assertFalse(CompatChecker.isBackwardCompatible(oldSchema, newSchema));
    }
}
