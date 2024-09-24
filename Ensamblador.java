/**
 * Clase Ensamblador que implementa Runnable, responsable de ensamblar computadoras a partir de componentes.
 */
class Ensamblador implements Runnable {
    private int sueldoPorHora;
    private int tiempoEnsamblaje;
    private Almacen almacen;
    private Empresa empresa;
    private double rendimiento;
    private int computadorasEnsambladas = 0;

    /**
     * Constructor para inicializar el ensamblador con parámetros específicos.
     * @param sueldoPorHora
     * @param tiempoEnsamblaje 
     * @param almacen 
     * @param empresa 
     * @param rendimiento 
     */
    public Ensamblador(int sueldoPorHora, int tiempoEnsamblaje, Almacen almacen, Empresa empresa, double rendimiento) {
        this.sueldoPorHora = sueldoPorHora;
        this.tiempoEnsamblaje = tiempoEnsamblaje;
        this.almacen = almacen;
        this.empresa = empresa;
        this.rendimiento = rendimiento;
    }

    /**
     * Calcula el salario basado en el sueldo por hora y las horas trabajadas.
     * @param horasTrabajadas Número de horas trabajadas.
     * @return El salario calculado.
     */
    public int calcularSalario(int horasTrabajadas) {
        return sueldoPorHora * horasTrabajadas;
    }

    /**
     * Método run que ejecuta el proceso de ensamblaje en un hilo. 
     * Extrae componentes del almacén y ensambla computadoras.
     */
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep((int) (tiempoEnsamblaje * 1000 * rendimiento)); 
                if (almacen.retirar("placas_base") && almacen.retirar("cpu") && almacen.retirar("ram") && almacen.retirar("fuente")) {
                    computadorasEnsambladas++;
                    empresa.incrementarComputadorasEnsambladas();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Error en el ensamblador: " + e.getMessage());
            Thread.currentThread().interrupt();  
        }
    }
}
