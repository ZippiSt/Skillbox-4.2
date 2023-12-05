public class Arithmetic {
    private int q;
    private int w;

    public Arithmetic(int q,int w){
        this.q= q;
        this.w=w;
    }
    public int sum(){
        return q+w;
    }
    public int Ymn(){
        return q*w;
    }
    // MaMi = MaxMin, т.е сокращение.
    public String MaMi(){
        if (q > w)
            return "Число " + q + " > " + "числа " + w;
        else if (q < w)
            return "Число " + w + " < " + "числа " + w;
        else
            return "Числа равны";
    }
    public int gQ() {
        return q;
    }
    public void sQ(int w) {
        this.q = q;
    }
    public int gW() {
        return w;
    }
    public void sW(int w) {
        this.w = w;
    }
}
