package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Any {
    private List<String> mesos = new ArrayList<>();

    public List<String> getMesos() {
        return mesos;
    }

    protected void populateMonths()
    {
        mesos.add("Enero");
        mesos.add("Febrero");
        mesos.add("Marzo");
        mesos.add("Abril");
        mesos.add("Mayo");
        mesos.add("Junio");
        mesos.add("Julio");
        mesos.add("Agosto");
        mesos.add("Septiembre");
        mesos.add("Octubre");
        mesos.add("Noviembre");
        mesos.add("Diciembre");
    }
}
