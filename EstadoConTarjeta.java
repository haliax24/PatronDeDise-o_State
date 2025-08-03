public class EstadoConTarjeta implements EstadoCajero{
    private CajeroAutomatico cajero;
    public EstadoConTarjeta(CajeroAutomatico cajero){
        this.cajero=cajero;
    }

    @Override
    public void insertarTarjeta() {
        System.out.println("Ya hay una tarjeta insertada");
    }

    @Override
    public void expulsarTarjeta(){
        System.out.println("Tarjeta expulsada");
        cajero.setEstado(new EstadoSinTarjeta(cajero));
    }

    @Override
    public void ingresarPin(int pin) {
        if (pin==1234){
            System.out.println("Autenticado");
            cajero.setEstado(new EstadoAutenticado(cajero));
        }else {
            System.out.println("PIN incorrecto");
            System.out.println("Tarjeta expulsada por seguridad");
            cajero.setEstado(new EstadoSinTarjeta(cajero));
        }
    }
    public void retirarDinero(int monto){
        System.out.println("Debe ingresar el pin antes de retirar");
    }
}

