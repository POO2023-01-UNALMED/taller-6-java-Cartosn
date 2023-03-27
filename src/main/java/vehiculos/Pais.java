package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    static Map<Pais, Integer> ventasPorPais = new HashMap<>();

    public static Pais paisMasVendedor(){
        int valorMax = -1;
        Pais paisMasVendedor = null;

        for (Map.Entry<Pais, Integer> entry : ventasPorPais.entrySet()){
            final int valorActual = entry.getValue();

            if (valorActual > valorMax){
                valorMax = valorActual;
                paisMasVendedor = entry.getKey();
            }
        }
        return paisMasVendedor;
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
}