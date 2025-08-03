public class EstadoCancelado implements EstadoOrden{
    private OrdenCompra estado;
    public EstadoCancelado(OrdenCompra estado){
        this.estado=estado;
    }

    @Override
    public void enviar() {
        System.out.println("No se puede enviar porque ya se cancelò la orden");
    }

    @Override
    public void cancelar() {
        System.out.println("Ya se encuentra cancelado");
    }

    @Override
    public void procesar() {
        System.out.println("Debe iniciar una nueva orden");
    }

    @Override
    public void nueva() {
        System.out.println("Iniciando nueva orden");
        estado.setEstadoOrden(new EstadoNueva(estado));
    }

    @Override
    public void entregar() {
        System.out.println("Se ha cancelado la orden");
    }
}
