public class EstadoAutenticado implements EstadoCajero{
    private CajeroAutomatico cajero;
    public EstadoAutenticado(CajeroAutomatico cajero){
        this.cajero=cajero;
    }

    @Override
    public void insertarTarjeta() {
        System.out.println("Ya hay una tarjeta insertada");
    }

    @Override
    public void expulsarTarjeta() {
        System.out.println("Tarjeta expulsada");
        cajero.setEstado(new EstadoSinTarjeta(cajero));
    }

    @Override
    public void ingresarPin(int pin) {
        System.out.println("Ya se ingresò el pin correctamente");
    }

    @Override
    public void retirarDinero(int monto) {
        if (monto<= cajero.getSaldo()){
            System.out.println("Retirando $"+monto);
            cajero.setSaldo(cajero.getSaldo()-monto);
            System.out.println("Nuevo saldo "+ cajero.getSaldo());
            System.out.println("Tarjeta expulsada");
            cajero.setEstado(new EstadoSinTarjeta(cajero));
        }else {
            System.out.println("Fondos insuficientes");
            System.out.println("Tarjeta expulsada");
            cajero.setEstado(new EstadoSinTarjeta(cajero));
        }
    }
}
