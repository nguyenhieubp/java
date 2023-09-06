package Hinh;

public class HinhTron extends  Hinh{
    public double r;
    public HinhTron(double r) {
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return (Math.PI * (r*r));
    }
}
