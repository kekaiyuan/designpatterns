package com.kky.dp.prototype.v3;

import java.io.*;

/**
 * 通过序列化和反序列化克隆对象
 */
public class CloneUtil {

    public static <T extends Serializable> T clone(T object) {
        T result = null;

        try (ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
             ObjectOutputStream objectOutput = new ObjectOutputStream(byteOutput)) {
            objectOutput.writeObject(object);
            try (ByteArrayInputStream byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
                 ObjectInputStream objectInput = new ObjectInputStream(byteInput);
            ) {
                result = (T) objectInput.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

}
