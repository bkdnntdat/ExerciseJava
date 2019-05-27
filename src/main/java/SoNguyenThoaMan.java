public class SoNguyenThoaMan {

    int timSoMu(int a, int dem) {

        if (a % Math.pow(10, dem) == 0) dem++;

        return dem;
    }

    int tinhKq(int a, int dem) {

        int kq = 0;
        while (a > 0) {
            int x = a % 10;
            a /= 10;
            kq += Math.pow(x, dem);
        }

        return kq;
    }

    public String find() {

        String s = "";
        int dem = 2;

        for (int i = 10; i < 100000; i++) {
            dem = timSoMu(i, dem);
            if (tinhKq(i, dem) == i) s += i + " ";

        }

        return s.trim();
    }
}
