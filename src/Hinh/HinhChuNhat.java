package Hinh;

public class HinhChuNhat extends Hinh {
    public double a,b;

    public HinhChuNhat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double tinhDienTich() {
        return this.a * this.b;
    }


}
