package org.example.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
public class DeepProtoType1 implements Serializable, Cloneable {
    private String name;
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProtoType1 () {
        super();
    }
    @Override
    public DeepProtoType1 clone() {
        try {
            return (DeepProtoType1) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    public Object deepClone() throws IOException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois =  new ObjectInputStream(bis);
            DeepProtoType1 copyObj = (DeepProtoType1) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
