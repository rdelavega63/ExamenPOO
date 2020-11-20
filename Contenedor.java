import java.util.*;
import java.lang.*;

public class Contenedor {
HashSet<Double> cont;
public Contenedor() {
        cont = new HashSet<Double>();
}
public void agregar(double pelota) throws ExceptionOp {
        cont.add(pelota);
}
public void remover(double pelota) {
        Iterator<Double> it = cont.iterator();

        while (it.hasNext()) {
                if (it.next() == pelota) {
                        it.remove();
                }
        }
}
public double getCapacidad() {
        Iterator<Double> it = cont.iterator();
        double sum = 0;

        while (it.hasNext()) {
                sum+= it.next();
        }

        return sum;
}
public long totalPelotas() {
        return cont.size();
}
public void limpiar() {
        cont.clear();
}
public boolean contiene(double pelota) {
        Iterator<Double> it = cont.iterator();
        boolean here = false;

        while (it.hasNext()) {
                if (it.next() == pelota) {
                        here = true;
                }
        }

        return here;
}
}
