package one.innovation.digital;

public class Carro implements Comparable<Carro>{
    private final String carro;
    private final Integer ano;

    public Carro (String carro, Integer ano) {
        this.carro = carro;
        this.ano = ano;
    }

    public String getCarro() { return carro; }

    public Integer getAno() { return ano; }

    @Override
    public String toString() { return carro + " - " + ano; }

    @Override
    public int compareTo(Carro o) {
        return  this.getAno() - o.getAno();
    }
}
