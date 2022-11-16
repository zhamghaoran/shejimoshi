package org.example.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException {
        DeepProtoType1 p = new DeepProtoType1();
        p.setName("123");
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","小牛");
//        DeepProtoType p2 = (DeepProtoType) p.clone();
        DeepProtoType1 p2 = (DeepProtoType1) p.deepClone();
        System.out.println("p.name = " + p.getName() + " p.deepcloneTargetName = " + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name = " + p2.getName() + " p2.deepcloneTargetName = " + p2.deepCloneableTarget.hashCode());
    }
}

@Data
@AllArgsConstructor
class Sheep implements Cloneable {
    private String name;
    private Integer age;
    private String color;

    @Override
    public Sheep clone() {
        try {
            Sheep clone = (Sheep) super.clone();
            // TODO: 复制此处的可变状态，这样此克隆就不能更改初始克隆的内部项
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class DeepCloneableTarget implements Serializable, Cloneable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;
    public DeepCloneableTarget(String cloneName,String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}