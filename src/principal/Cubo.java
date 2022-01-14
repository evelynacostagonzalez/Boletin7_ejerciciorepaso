package principal;

public class Cubo {

    private final String MATERIAL;
    private String color;
    boolean asa;
    private double capacidadMaxima;
    private double contenidoActual;

    public Cubo() {
        this.MATERIAL = "plastico";
        this.asa = false;
        this.color = "negro";
        this.capacidadMaxima = 10;
        this.contenidoActual = 0;

    }

    public Cubo(String material, boolean asa, String color, double capacidadMaxima, double contenidoActual) {

        this.MATERIAL = material;
        this.asa = asa;
        this.color = color;
        this.capacidadMaxima = capacidadMaxima;
        this.contenidoActual = contenidoActual;
    }

    //getter y setter
    public String getMaterial() {
        return MATERIAL;
    }

    public boolean isAsa() {
        return asa;
    }

    public String getColor() {
        return color;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getContenidoActual() {
        return capacidadMaxima;
    }

    public void setAsa(boolean asa) {
        this.asa = asa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setContenidoActual(double contenidoActual) {
        this.contenidoActual = contenidoActual;
    }

    public Cubo(Cubo cubo) {
        this.MATERIAL = cubo.getMaterial();
        this.asa = cubo.isAsa();
        this.color = cubo.getColor();
        this.capacidadMaxima = cubo.getCapacidadMaxima();
        this.contenidoActual = cubo.getContenidoActual();
    }
    //métodos

    /**
     * método que comprueba que el contenido actual no será mayor a la capacidad máxima y si no lo es, la sumará.
     * precondición: litro > 0
     *
     * @param litros
     */

    public double llenarCubo(double litros) {
        double resultado = 0;

        if (litros > this.capacidadMaxima - this.contenidoActual) {
            this.llenarCubo();
            resultado = litros - this.capacidadMaxima;
        } else {
            this.contenidoActual = this.capacidadMaxima;
            resultado = 0;
        }
        return resultado;

    }

    public void llenarCubo() {
        this.contenidoActual = this.capacidadMaxima;
    }
    public void vaciarCubo(){
        this.contenidoActual=0;
    }

    public void vaciarCubo(int litros) {
        if (litros <= this.contenidoActual) {
            this.contenidoActual = this.contenidoActual - litros;
        } else {
            System.out.println("la cantidad de litros no es válida");
        }
    }

    /**
     * se vuelca el contenido actual del cubo origen al cubo destino.
     * comprobar la capacidad del cuboDestino por si no caben los litros del cuboOrigen. en caso de que no quepan, se llenarán
     * solo los litros que quepan.
     *
     * @param cuboDestino
     */
    public void volcarCubo(Cubo cuboDestino) {
        double resultado;
        resultado=cuboDestino.llenarCubo(this.contenidoActual);
        if (resultado==0) {
            this.vaciarCubo();
        }
        else{
            this.vaciarCubo();
            this.llenarCubo(resultado);
        }
    }
}