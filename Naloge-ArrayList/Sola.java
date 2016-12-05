class Sola{
  private String sola;
  private String ekipa;

  public Sola() {
  }

  public Sola(String sola, String ekipa) {
    this.sola = sola;
    this.ekipa = ekipa;
  }

  public String getSola() {
    return sola;
  }

  public void setSola(String sola) {
    this.sola = sola;
  }

  public String getEkipa() {
    return ekipa;
  }

  public void setEkipa(String ekipa) {
    this.ekipa = ekipa;
  }

  public String toString() {
    return "## sola : "+this.sola+", ekipa : "+this.ekipa;
  }
}