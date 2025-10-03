import java.util.Random;

public class MANG_PS {
    PHANSO[] mang = new PHANSO[100]; //chưa phải là đối tượng
    int n;

    public MANG_PS(int length) {
        n = length;
        mang = new PHANSO[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int t = r.nextInt(10);   // tử số
            int m = r.nextInt(10) + 1;      // mẫu số khác 0 (muốn xài nextIn thì phải có hàm Random)
                                                // muốn xài hàm Random phải import thư viện
            mang[i] = new PHANSO(t, m);     //Lúc này bắt đầu mới là đối tượng
        }
    }
//Tìm kiếm trả về có hay không có, có thì trả về vị trí đầu tiên trong mảng
    public int timkiem(PHANSO ps) {
        for (int i = 0; i < n; i++) {
            if (mang[i].sosanh(ps) == 0)    //Phương thức so sánh là phương thức của lớp PHANSO
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {      //Phương thức toString là phương thức cha của mọi lớp (toString của MANG_PS)
        String temp = "";
        for (int i = 0; i < n; i++) {
            temp += mang[i].toString() + " ";   //toString của PHANSO
        }
        return temp;
    }
}