public class Aluno {

    private String nome;
    private double p1;
    private double p2;
    private double ado;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getAdo() {
        return ado;
    }

    public void setAdo(double ado) {
        this.ado = ado;
    }

    public double getMedia() {
        return this.media = (getP1() + getP2() + getAdo()) / 3;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
