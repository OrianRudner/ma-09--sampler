package parsers;

import java.util.List;

public interface Parse<T> {
    List<T> parse(List<T> list);
}
