package org.example.prototype;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProtoType() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)  deepCloneableTarget.clone();
        return deepProtoType;
    }
}
