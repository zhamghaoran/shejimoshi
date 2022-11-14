package org.example.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep clone = sheep.clone();
    }
}

@Data
@AllArgsConstructor
class Sheep implements Cloneable{
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
