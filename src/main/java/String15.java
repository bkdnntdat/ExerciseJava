public class String15 {
    public int findVerifyNumber(String a) {
        int test = 0;

        int chan = 0;
        int le = 0;
        for (int i = 0; i < a.length()-1; i += 2) {
            le += a.charAt(i) - '0';
        }

        for (int i = 1; i < a.length(); i += 2) {
            chan += a.charAt(i) - '0';
        }

        while (true) {
            if ((le + test + 3*chan)%10==0) break;
            test++;
        }

        return test;
    }
}
