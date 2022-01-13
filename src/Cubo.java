public class Cubo {

        private String material, asa, color;
        private double capacidadMaxima;
        private double contenidoActual;

        public Cubo() {

        }
        public Cubo (String material, String asa, String color, double capacidadMaxima, double contenidoActual) {

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

        public String getAsa(){
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

        public void setAsa (String asa){
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
            this.asa=cubo.getAsa();
            this.color=cubo.getColor();
            this.capacidadMaxima=cubo.getCapacidadMaxima();
            this.contenidoActual=cubo.getContenidoActual();
        }

    }
