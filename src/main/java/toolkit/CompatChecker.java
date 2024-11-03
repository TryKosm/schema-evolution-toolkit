package toolkit;

public class CompatChecker {
    public static boolean isBackwardCompatible(SchemaDef oldSchema, SchemaDef newSchema) {
        return oldSchema.fields().stream()
            .filter(FieldDef::required)
            .allMatch(f -> newSchema.fields().stream().anyMatch(n -> n.name().equals(f.name())));
    }
}
