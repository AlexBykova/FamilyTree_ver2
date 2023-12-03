package model.writer;

import java.io.Serializable;

public interface Writable extends Serializable {
    void save(Serializable serializable, String filePath);
    Object read(String filePath);

}
