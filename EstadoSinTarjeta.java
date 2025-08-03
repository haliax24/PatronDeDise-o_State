public class EstadoSinTarjeta implements EstadoCajero{
    private CajeroAutomatico cajero;
    public EstadoSinTarjeta(CajeroAutomatico cajero){
        this.cajero=cajero;
    }

    @Override
    public void insertarTarjeta() {
        System.out.println("Tarjeta ingresada");
        cajero.setEstado(new EstadoConTarjeta(cajero));
    }

    @Override
    public void expulsarTarjeta() {
        System.out.println("No hay tarjeta para expulsar");
    }

    @Override
    public void retirarDinero(int monto) {
        System.out.println("Primero inserte tarjera");
    }

    @Override
    public void ingresarPin(int pin) {
        System.out.println("Primero inserte tarjeta");
    }
}
