package org.example.utils;

public class DependecyInversion {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose(changHong);
        openAndClose.open(changHong);

    }
}

// 方式1.通过接口传递实现依赖
// 开关的接口
interface IOpenAndClose {
    public void open(ITV itv);
}

interface ITV {
    public void play();
}
class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视打开");
    }
}
class OpenAndClose implements IOpenAndClose {
    private ITV itv;
    public OpenAndClose(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open(ITV itv) {
        this.itv.play();
    }

    public void setItv(ITV itv) {
        this.itv = itv;
    }
}
