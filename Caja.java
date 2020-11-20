import java.util.*;
import java.lang.*;
import java.text.*;

public class Caja extends Contenedor {
DecimalFormat formatter = new DecimalFormat("\t\t\t####.##cm^3\n");
double max;
public Caja(double max) {
        cont = new HashSet<Double>();
        this.max = max;
}
public void agregar(double pelota) throws ExceptionOp {
        if ((getCapacidad()+pelota) > this.max) {
                throw new ExceptionOp("Excede la capacidad");
        } else {
                cont.add(pelota);
        }
}
public void listarPelotas() {
        List<Double> list = new ArrayList<Double>(cont);
        Collections.sort(list, new PelotaComp());

        Iterator<Double> it = list.iterator();
        boolean here = false;

        while (it.hasNext()) {
                System.out.println(formatter.format(it.next()));
        }
}
}
