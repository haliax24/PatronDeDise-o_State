public class EstadoNueva implements EstadoOrden{
private OrdenCompra estado;
public EstadoNueva(OrdenCompra estado){
    this.estado=estado;
}

    @Override
    public void nueva() {
        System.out.println("Ya hay una orden ingresada");
    }

    @Override
    public void procesar() {
        System.out.println("Procesando la orden");
        estado.setEstadoOrden(new EstadoProcesando(estado));
    }
    public void enviar(){
        System.out.println("La orden aun no se puede enviar porque no ha sido procesada");
    }
    public void cancelar(){
        System.out.println("Cancelando la orden");
        estado.setEstadoOrden(new EstadoCancelado(estado));
    }

    @Override
    public void entregar() {
        System.out.println("No se puede entregar una orden que no ha sido procesada");
    }
}
