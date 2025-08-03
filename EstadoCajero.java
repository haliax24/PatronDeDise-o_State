public interface EstadoCajero {
    void insertarTarjeta();
    void expulsarTarjeta();
    void ingresarPin(int pin);
    void retirarDinero(int monto);
}
