public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
public class Main {
  public static void main(String[] args) {

    Mahasiswa m1 = new Mahasiswa("Arif");

    System.out.println(m1.getNama());

    m1.setNama("Budi");

    System.out.println(m1.getNama());
  }
}