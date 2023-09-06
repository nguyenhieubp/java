public class MyMath {
    public int a;
    public int b;


    public int timMin(int a,int b){
        return Math.min(a, b);
    }

    public  double timMin(double a,double b){
        return Math.min(a, b);
    }

    public double timTong(double a,double b){
        return a+b;
    }


    public double timTong(double[] arr){
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum;
    }

}
