package one.innovation.digital;

import java.util.Comparator;
import java.util.function.ToIntFunction;

public class CarroOrdemAnoReversaComparator implements Comparator<Carro> {

    @Override
    public int compare(Carro o1, Carro o2) {
        return o2.getAno() - o1.getAno();
    }

    @Override
    public Comparator<Carro> thenComparingInt(ToIntFunction<? super Carro> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }
}
