public class String16 {
    public String tinhTong(String a, String b) {
        String kq = "";
        if (b.length() > a.length()) {
            return tinhTong(b, a);
        }
        while (a.length() > b.length()) b = '0' + b;

        int nho = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            int themso = nho + a.charAt(i) + b.charAt(i) - 2 * '0';

            if (themso / 10 > 0) {
                nho = themso / 10;
                themso %= 10;
            } else nho = 0;

            kq = themso + kq;
        }

        if (nho > 0) kq = nho + kq;

        return kq;
    }
}
