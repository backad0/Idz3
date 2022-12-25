package Filter;

public class BeginStringFilter implements Filter {
    private String pattern;

    public BeginStringFilter(String pattern) {
        if (pattern == null) throw new IllegalArgumentException("Argument can`t be null");
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        if (str == null) throw new IllegalArgumentException("Argument can`t be null");
        return str.startsWith(pattern);
    }
}
