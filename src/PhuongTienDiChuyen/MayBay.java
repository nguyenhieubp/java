package PhuongTienDiChuyen;

public class MayBay extends PhuongTienDiChuyen {
    String loaiNhienLieu;

    public MayBay(String tenHangSanXuat, String tenQuocGia, String loaiNhienLieu) {
        super(tenHangSanXuat, tenQuocGia);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public MayBay(String tenHangSanXuat, String tenQuocGia) {
        super(tenHangSanXuat, tenQuocGia);
    }

    public void catCanh(){
        System.out.println("Cat canh");
    }

    public void haCanh(){
        System.out.println("Ha canh");
    }
    @Override
    public double layVanToc() {
        return 900;
    }
}
