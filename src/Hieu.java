import Hinh.HinhChuNhat;
import Hinh.HinhTron;
import Hinh.ToaDo;
import PhuongTienDiChuyen.PhuongTienDiChuyen;
import PhuongTienDiChuyen.*;
public class Hieu {
    public static void main(String[] args) {

        System.out.println("Bai MyMath");
        //MYMATH
        double arrays[] = {1.1,5.5,9.9};
        MyMath myMath = new MyMath();
        System.out.println(myMath.timMin(1,2));
        System.out.println(myMath.timTong(arrays));

        System.out.println("=============================");

        System.out.println("Bai Hinh");
        ToaDo toaDo = new ToaDo(1,2);
        HinhTron hinhTron = new HinhTron(2);
        HinhChuNhat hinhChuNhat = new HinhChuNhat(toaDo.getX(), toaDo.getY());
        System.out.println("Dien tinh hinh tron: "+hinhTron.tinhDienTich());
        System.out.println("Dien tinh hinh chu nhat: "+hinhChuNhat.tinhDienTich());

        System.out.println("===============================");

        System.out.println("Loai phuong tien di chuyen");
        PhuongTienDiChuyen phuongTienDiChuyen = new PhuongTienDiChuyen("test","VietNam") {
            @Override
            public double layVanToc() {
                return 10;
            }
        };

        MayBay mayBay = new MayBay("vietnamairline","vietnam","xang");
        System.out.println("May bay: "+mayBay.layVanToc()+" km/h");

        OTo oTo = new OTo("VFS","vietnam","dien");
        System.out.println("oto: "+oTo.layVanToc()+" km/h");

        XeDap xeDap = new XeDap("TienPhong","vietnam");
        System.out.println("xe dap: "+xeDap.layVanToc()+" km/h");




    }
}
