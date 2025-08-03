public class CajeroAutomatico {
    private EstadoCajero estadoCajero;
    private int saldo;
    public CajeroAutomatico(int saldoInicial){
        this.saldo=saldoInicial;
        System.out.println("Cajero iniciado en estado sin tarjeta");
        this.estadoCajero= new EstadoSinTarjeta(this);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setEstado(EstadoCajero estado){
        this.estadoCajero= estado;
    }
    public void insertarTarjeta(){
        estadoCajero.insertarTarjeta();
    }
    public void expulsarTarjeta(){
        estadoCajero.expulsarTarjeta();
    }
    public void ingresarPin(int pin){
        estadoCajero.ingresarPin(pin);
    }
    public void retirarDinero(int monto){
        estadoCajero.retirarDinero(monto);
    }
}
