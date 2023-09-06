import Game.Game;
import Hinh.HinhChuNhat;
import Hinh.HinhTron;
import Hinh.ToaDo;
import Nguoi.Profiles;
import Nguoi.Student;
import Game.GameDto;
import Game.Mario;

public class Hieu {
    public static void main(String[] args) {
//        //Khai bao toa do
//        ToaDo toaDo = new ToaDo(1,2);
//
//        HinhTron hinhTron = new HinhTron(2);
//
//        //Hinh chu nhat
//        HinhChuNhat hinhChuNhat = new HinhChuNhat(toaDo.getX(), toaDo.getY());
//
//        System.out.println("Dien tinh hinh tron: "+hinhTron.tinhDienTich());
//        System.out.println("Dien tinh hinh chu nhat: "+hinhChuNhat.tinhDienTich());


//        Profiles profiles = new Profiles("john");
//        Student john = new Student();
//        john.sayHi(profiles.getName());

          GameDto gameDto = new GameDto("mario");
          Mario mario = new Mario();
          mario.sayNameGame(gameDto.getNameGame());
    }
}
