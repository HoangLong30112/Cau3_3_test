package working_company.Cau3_3_test.OOP;

class Cau2_3{
    public static void main(String[] args) {
        QuanLyCongTy quanlyCongTy = new QuanLyCongTy();

        PhongBan pb1 = new PhongBan("PB01", "Kế toán");
        PhongBan pb2 = new PhongBan("PB02", "Nhân sự");
        PhongBan pb3 = new PhongBan("PB03", "IT");

        NhanVien nv1 = new NhanVien("KH001", "Hoàng Thị Thu Trang", 500, pb2);
        NhanVien nv2 = new NhanVien("KH002", "Hoàng Khánh Linh", 450, pb1);
        NhanVien nv3 = new NhanVien("KH003", "Hoàng Tuấn Long", 400, pb3);

        quanlyCongTy.themPhongBan(pb1);
        quanlyCongTy.themPhongBan(pb2);
        quanlyCongTy.themPhongBan(pb3);
        quanlyCongTy.hienthiDanhSachPhongBan();

        quanlyCongTy.themNhanhVien(nv1);
        quanlyCongTy.themNhanhVien(nv2);
        quanlyCongTy.themNhanhVien(nv3);

        System.out.println("");
        quanlyCongTy.tinhLuongThucNhan();

        System.out.println("");
        quanlyCongTy.hienthiDanhSachNhanVien();

        System.out.println("");
        quanlyCongTy.xoaNhanVien("KH001");
        quanlyCongTy.xoaPhongBan("PdB02");

        System.out.println("");
        quanlyCongTy.hienthiDanhSachNhanVien();
        quanlyCongTy.hienthiDanhSachPhongBan();
    }
}