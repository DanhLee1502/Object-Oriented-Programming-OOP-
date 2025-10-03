public class Main {
    public static void main(String[] args) {
        // Tạo mảng 5 phân số ngẫu nhiên
        MANG_PS ds = new MANG_PS(5);

        // In ra toàn bộ mảng
        System.out.println("Danh sach phan so:");
        System.out.println(ds.toString());

        // Tìm thử một phân số
        PHANSO psTim = new PHANSO(1, 2); // ví dụ tìm 1/2
        int vt = ds.timkiem(psTim);

        if (vt != -1) {
            System.out.println("Tim thay " + psTim + " o vi tri: " + vt);
        } else {
            System.out.println(psTim + " khong co trong mang.");
        }
    }
}
