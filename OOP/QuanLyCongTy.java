package working_company.Cau3_3_test.OOP;

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
    public void xoaNhanVien(String maNhanVien){
        for(NhanVien nhanvien : dsNhanVien){
            if (nhanvien.getMaNhanVien().equals(maNhanVien)){
                dsNhanVien.remove(nhanvien);
                System.out.println("XÓA NHÂN VIÊN VỚI MÃ " + maNhanVien + " THÀNH CÔNG");
                return;
            }
        }
        System.out.println("XÓA NHÂN VIÊN VỚI MÃ " + maNhanVien + " KHÔNG THÀNH CÔNG");
    }

    //Them chuc nang xoa phong ban
    public void xoaPhongBan(String maPhongBan){
        for (PhongBan phongBan : dsPhongBan) {
            if (phongBan.getMaPhong().equals(maPhongBan)) {
                dsPhongBan.remove(phongBan);
                System.out.println("XÓA PHÒNG BAN VỚI MÃ " + maPhongBan + " THÀNH CÔNG");
                return;
            }
        }
        System.out.println("XÓA PHÒNG BAN VỚI MÃ "+ maPhongBan +" KHÔNG THÀNH CÔNG");
        System.out.println("Sua doan code nay de test");
    }

    //Them chuc nang xoa phong ban

    //Khong co gi ca commit choi

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
