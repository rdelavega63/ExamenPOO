import java.util.*;
import java.io.*;

class PelotaComp implements Comparator<Double> {
public int compare(Double o1, Double o2) {
        int ret = 0;
        if (o2 > o1) {
                ret = 1;
        } else if (o2 == o1) {
                ret = 0;
        } else if (o2 < o1) {
                ret = -1;
        }
        return ret;
}
}
