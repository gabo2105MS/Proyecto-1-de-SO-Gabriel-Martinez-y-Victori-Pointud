/**
 * Clase ProductorCPU que extiende Trabajador y produce CPUs en el almacén.
 */
class ProductorCPU extends Trabajador {

    /**
     * Constructor que inicializa el ProductorCPU con parámetros específicos.
     * @param sueldoPorHora
     * @param tiempoProduccion 
     * @param almacen
     * @param rendimiento
     */
    public ProductorCPU(int sueldoPorHora, int tiempoProduccion, Almacen almacen, double rendimiento) {
        super(sueldoPorHora, tiempoProduccion, almacen, rendimiento);  
    }

    /**
     * Método que realiza la producción de un CPU y lo agrega al almacén.
     */
    @Override
    public void producir() {
        almacen.agregar("cpu");
        System.out.println("Producido un CPU");
    }
}
