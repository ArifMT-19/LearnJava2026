class Barang {

  private int harga;

  public void setHarga(int harga) {
    if (harga > 0) {
      this.harga = harga;
    } else {
      System.out.println("Harga tidak valid!");
    }
  }

  public int getHarga() {
    return harga;
  }
}