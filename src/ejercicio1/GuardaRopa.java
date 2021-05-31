package ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GuardaRopa {

    private Integer id;
    private HashMap<Integer, List<Prenda>> ropero;

    public GuardaRopa() {
        this.id = null;
        this.ropero = new HashMap<>();
    }

    public GuardaRopa(Integer id, HashMap<Integer, List<Prenda>> ropero) {
        this.id = id;
        this.ropero = ropero;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        Integer identificador = ropero.size()+1;
        ropero.put(identificador, listaDePrenda);
        return identificador;
    }

    public void mostrarPrendas() {
        ropero.forEach((K,V) -> System.out.println("ID: " + K + " - Prendas: " + V.toString()));
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        List<Prenda> ldp = ropero.get(numero);
        ropero.remove(numero);
        return ldp;
    }

    public static void main(String[] args) {

        GuardaRopa guardaRopa = new GuardaRopa();

        Prenda p1 = new Prenda("nike", "botines");
        Prenda p2 = new Prenda("adidas", "remera");
        List<Prenda> ldp1 = new ArrayList<>();
        ldp1.add(p1);
        ldp1.add(p2);

        Prenda p3 = new Prenda("kappa", "camiseta de racing");
        Prenda p4 = new Prenda("puma", "pantalon");
        List<Prenda> ldp2 = new ArrayList<>();
        ldp2.add(p3);
        ldp2.add(p4);

        System.out.println("Guarda dos prendas y recibe el codigo (key)");//Punto6
        Integer miCodigo = guardaRopa.guardarPrendas(ldp1);
        System.out.println(miCodigo);

        System.out.println("Devuelve prendas");
        System.out.println(guardaRopa.devolverPrendas(miCodigo));

        /*HashMap<Integer, List<Prenda>> hm = new HashMap<>();
        hm.put(1, ldr); //En el key1 del hashmap, ingresamos la lista ldr
        hm.put(2, ldr); //En el key2 del hashmap, ingresamos la lista ldr de nuevo

        GuardaRopa gr = new GuardaRopa(1, hm);

        System.out.println("Mostrar prendas");
        gr.mostrarPrendas();
        System.out.println("Guardar prendas");
        ldr.add(p4);
        hm.put(3,ldr);
        gr.guardarPrendas(ldr);
        System.out.println("Devolver prendas");
        System.out.println(gr.devolverPrendas(3));*/

    }

    // Getters y setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {//
        this.id = id;
    }

    public HashMap<Integer, List<Prenda>> getRopero() {
        return ropero;
    }

    public void setRopero(HashMap<Integer, List<Prenda>> ropero) {
        this.ropero = ropero;
    }

}
