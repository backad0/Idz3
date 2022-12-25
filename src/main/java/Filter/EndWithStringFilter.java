package Filter;

public class EndWithStringFilter implements Filter {
    private String pattern;

    public EndWithStringFilter(String pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("EndFilter constructor: argument is null");
        }
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        if (str == null) {
            throw new IllegalArgumentException("EndFilter apply: argument is null");
        }
        return str.endsWith(pattern);
    }
}
