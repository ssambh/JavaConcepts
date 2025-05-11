package runtimeException;

public class NullPointerException {
    int id;
    public static void main(String[] args) {
        npe1();
    }

    public void setId(int id) {
        this.id = id;
    }

    //Throws null pointer Exception as the object is null
    public static void npe1() {
        NullPointerException np = null;
        np.setId(12);
    }
}
