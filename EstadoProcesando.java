public class EstadoProcesando implements EstadoOrden{
    private OrdenCompra estado;
    public EstadoProcesando(OrdenCompra estado){
        this.estado=estado;
    }

    @Override
    public void nueva() {
        System.out.println("Ya se esta procesando una orden");
    }
    public void enviar(){
        System.out.println("Enviando orden");
        estado.setEstadoOrden(new EstadoEnviado(estado));
    }

    @Override
    public void entregar() {
        System.out.println("La orden se esta enviando");
    }
    public void procesar(){
        System.out.println("Ya hay una orden en proceso");
    }
    public void cancelar(){
        System.out.println("Cancelando la orden");
        estado.setEstadoOrden(new EstadoCancelado(estado));
    }
}
