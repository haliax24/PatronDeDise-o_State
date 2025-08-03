public interface EstadoOrden {
    void nueva();
    void procesar();
    void enviar();
    void entregar();
    void cancelar();
}
