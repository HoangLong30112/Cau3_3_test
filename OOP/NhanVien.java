public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private double luongCoBan;
    private PhongBan phongBan;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, double luongCoBan, PhongBan phongBan) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.phongBan = phongBan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public double getLuongThucNhan(){
        if(phongBan.getTenPhong().trim().equalsIgnoreCase("IT")){
            return luongCoBan + (luongCoBan * 0.1);
        }
        return luongCoBan;
    }


    @Override
    public String toString() {
        return String.format(
                "NhanVien{maNhanVien='%s', tenNhanVien='%s', luongThucNhan=%.2f, phongBan='%s'}",
                maNhanVien, tenNhanVien, getLuongThucNhan(), phongBan.getTenPhong()
        );
    }
}
