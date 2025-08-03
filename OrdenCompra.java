public class OrdenCompra {
    private EstadoOrden estadoOrden;
    public OrdenCompra(){
        System.out.println("Orden de compra iniciada");
    }

    public void setEstadoOrden(EstadoOrden estado) {
        this.estadoOrden = estado;
    }
    public void enviarOrden(){
        estadoOrden.enviar();
    }
    public void procesarOrden(){
        estadoOrden.procesar();
    }
    public void cancelarOden(){
        estadoOrden.cancelar();
    }
    public void entregadaOrden(){
        estadoOrden.entregar();
    }
    public void nuevaOrden(){
        estadoOrden.nueva();
    }
}
