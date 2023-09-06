package PhuongTienDiChuyen;

public abstract class PhuongTienDiChuyen extends HangSanXuat {
    protected  String loaiPhuongTien;

    public PhuongTienDiChuyen(String tenHangSanXuat, String tenQuocGia) {
        super(tenHangSanXuat, tenQuocGia);
    }

    public String layTenHangSanXuat(){
          return this.getTenHangSanXuat();
    };

    public void batDau(){
        System.out.println("Bat Dau");
    }

    public void tangToc(){
        System.out.println("Tang Toc");
    }

    public void dungLai(){
        System.out.println("Dung lai");
    }

    public abstract double layVanToc();


}
