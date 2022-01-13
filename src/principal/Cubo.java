package principal;

public class Cubo {

        private String material, color;
        boolean asa;
        private double capacidadMaxima;
        private double contenidoActual;

        public Cubo() {
            this.material="plastico";
            this.asa=false;
            this.color="negro";
            this.capacidadMaxima=10;
            this.contenidoActual=0;

        }
        public Cubo (String material, boolean asa, String color, double capacidadMaxima, double contenidoActual) {

            this.material=material;
            this.asa=asa;
            this.color=color;
            this.capacidadMaxima=capacidadMaxima;
            this.contenidoActual=contenidoActual;
        }
        //getter y setter
        public String getMaterial(){
            return material;
        }

        public boolean isAsa(){
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

        public void setMaterial (String material) {
            this.material=material;
        }

        public void setAsa (boolean asa){
            this.asa=asa;
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

        public Cubo (Cubo cubo) {
            this.material=cubo.getMaterial();
            this.asa=cubo.isAsa();
            this.color=cubo.getColor();
            this.capacidadMaxima=cubo.getCapacidadMaxima();
            this.contenidoActual=cubo.getContenidoActual();
        }
  //métodos

    /**
     * método que comprueba que el contenido actual no será mayor a la capacidad máxima y si no lo es, la sumará.
     * precondición: litro > 0
     * @param litros
     */

    public void llenarCubo (int litros) {
         if ( litros > capacidadMaxima - contenidoActual){
             System.out.println("El cubo está lleno");
        }
         else if (capacidadMaxima < contenidoActual) {
            System.out.println("Aun queda espacio en el cubo");
        }
    }
}