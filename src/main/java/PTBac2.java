public class PTBac2 {
    public String giaiphuongtrinh(double a, double b, double c){
        String s="";
        double delta = b*b -4*a*c;

        if (delta < 0){
            s="Phương trình vô nghiệm";
        }
        else{
            if (delta==0){
                double x= -b/2/a;
                s= "x1=x2= " + x;
            }
            else {
                double x1 = (-b + Math.sqrt(delta)) / 2 / a;
                double x2 = (-b - Math.sqrt(delta)) / 2 / a;
                s = "x1= " + x1 + ", x2= " + x2;
            }
        }

        return s;
    }
}
