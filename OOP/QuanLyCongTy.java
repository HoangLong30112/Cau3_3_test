import java.util.ArrayList;
import java.util.List;

//    Thiết kế các lớp tương ứng.
//    Viết phương thức tính lương thực nhận (lương cơ bản + phụ cấp 10% nếu thuộc phòng “IT”).
//    Tạo một danh sách nhân viên và in thông tin từng người, bao gồm phòng và lương thực nhận.

public class QuanLyCongTy {
    private List<PhongBan> dsPhongBan;
    private List<NhanVien> dsNhanVien;

    public QuanLyCongTy() {
        this.dsPhongBan = new ArrayList<>();
        this.dsNhanVien = new ArrayList<>();
    }

    public void themNhanhVien(NhanVien nhanvien){
        dsNhanVien.add(nhanvien);
    }

    public void themPhongBan(PhongBan phongBan){
        dsPhongBan.add(phongBan);
    }

    public void tinhLuongThucNhan(){
        System.out.println("======DANH SÁCH MỨC LƯƠNG THỰC NHẬN======");
        for(NhanVien nhanvien : dsNhanVien){
            double luongcoban = nhanvien.getLuongCoBan();
            double luongthucnhan = 0;

            if (nhanvien.getPhongBan().getTenPhong().equals("IT")) {
                luongthucnhan = luongcoban + (luongcoban * 0.1);
                System.out.println(String.format("Mã nhân viên: %s - Lương cơ bản: %.2f → Lương thực nhận: %.2f (+10%% IT)",nhanvien.getMaNhanVien(), luongcoban, luongthucnhan));
            } else {
                luongthucnhan = luongcoban;
                System.out.println(String.format("Mã nhân viên: %s - Lương cơ bản: %.2f → Lương thực nhận: %.2f",nhanvien.getMaNhanVien(), luongcoban, luongthucnhan));
            }
        }
    }

    //Them chuc nang xoa nhan vien

    //Them chuc nang xoa phong ban

    public void hienthiDanhSachPhongBan(){
        System.out.println("======DANH SÁCH PHÒNG BAN======");
        for(PhongBan pb : dsPhongBan){
            System.out.println(pb.toString());
        }
    }

    public void hienthiDanhSachNhanVien(){
        System.out.println("======DANH SÁCH NHÂN VIÊN======");
        for (NhanVien nv: dsNhanVien){
            System.out.println(nv.toString());
        }
    }
}
