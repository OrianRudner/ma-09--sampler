package transform;

import java.util.List;

public interface Transform<T> {
    void transformData(List<T> objects);

}
