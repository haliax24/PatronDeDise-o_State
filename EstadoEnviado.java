public class EstadoEnviado implements EstadoOrden{
    private OrdenCompra estado;
    public EstadoEnviado(OrdenCompra estado){
        this.estado=estado;
    }

    @Override
    public void entregar() {
        System.out.println("Orden entregada");
    }

    @Override
    public void nueva() {
        System.out.println("Iniciando nueva orden");
        estado.setEstadoOrden(new EstadoNueva(estado));
    }

    @Override
    public void procesar() {
        System.out.println("Debe iniciar una nueva orden");
    }

    @Override
    public void cancelar() {
        System.out.println("La orden ya fue entregada y no se puede cancelar");
    }

    @Override
    public void enviar() {
        System.out.println("Debe iniciar una nueva orden");
    }
}
