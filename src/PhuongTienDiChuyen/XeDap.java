package PhuongTienDiChuyen;

public class XeDap  extends PhuongTienDiChuyen{
    public XeDap(String tenHangSanXuat, String tenQuocGia) {
        super(tenHangSanXuat, tenQuocGia);
    }

    @Override
    public double layVanToc() {
        return 20;
    }
}
