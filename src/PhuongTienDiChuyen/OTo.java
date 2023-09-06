package PhuongTienDiChuyen;

public class OTo extends PhuongTienDiChuyen {
    String loaiNhienLieu;

    public OTo(String tenHangSanXuat, String tenQuocGia, String loaiNhienLieu) {
        super(tenHangSanXuat, tenQuocGia);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 200;
    }
}
