package top.ixfosa.prototype.deep;

import java.io.Serializable;

/**
 * Created by ixfosa on 2021/7/15 21:06
 */
public class Heart implements Serializable {
    private String color;

    public Heart() {
    }

    public Heart(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
