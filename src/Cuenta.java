import org.graalvm.compiler.replacements.nodes.CStringConstant;

public class Cuenta {

    private String nombreCliente, numeroCuenta;
    private double tipoInteres;
    private double saldo;


    public Cuenta() {

    }

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {


        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    //getter y setter
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double gettipoInteres() {
        return tipoInteres;
    }

    public String getnombreCliente() {
        return nombreCliente;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
        public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public Cuenta(Cuenta cuenta) {
        this.nombreCliente = cuenta.getnombreCliente();
        this.numeroCuenta = cuenta.getNumeroCuenta();
        this.tipoInteres = cuenta.gettipoInteres();
        this.saldo = cuenta.getsaldo();
    }

    public boolean ingresar(double cantidad) {
        boolean realizado = false;
        if (cantidad > 0) {
            this.saldo += cantidad;
            realizado = true;
        }
        return realizado;

        public boolean reintegro ( double cantidad){
            boolean realizado = false;
            if (this.getsaldo() >= cantidad && cantidad > 0) {
                this.saldo -= cantidad;
                realizado = true;
            }
            return realizado;

        }

        public boolean transferencia (Cuenta cuentaDestino, double cantidad) {
        boolean realizado = false;
        if (cantidad <= this.getsaldo() && cantidad >0){

        }
        }

    }
}
