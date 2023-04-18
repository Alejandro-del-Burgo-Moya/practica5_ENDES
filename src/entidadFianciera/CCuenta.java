/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFianciera;

public class CCuenta {

    private final String ERRORCANTIDADNEGATIVA
            = "No se puede ingresar una cantidad negativa";

    /**
     * Get the value of ERRORCANTIDADNEGATIVA
     *
     * @return the value of ERRORCANTIDADNEGATIVA
     */
    public String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    /**
     * Constructor de CCuenta
     *
     * @param nom nombre del titular de la cuenta
     * @param cue número de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Función para retornar el saldo de una cuenta
     *
     * @return saldo de la cuenta
     */
    public double estado() {
        return this.saldo;
    }

    /**
     * Función para ingresar dinero en una cuenta
     *
     * @param cantidad cantidad de dinero que se va a ingresar
     * @throws Exception No se puede ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Función para retirar dinero de una cuenta
     *
     * @param cantidad cantidad de dinero que se va a retirar
     * @throws Exception No se puede retirar una cantidad negativa, ni retirar
     * una cantidad mayor que el saldo actual
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Función que devuelve el nombre del titular de la cuenta
     *
     * @return nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Procedimiento para asignar un valor al nombre del titular de la cuenta
     *
     * @param nombre nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Función que devuelve el número de cuenta
     *
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Procedimiento para asignar un valor al número de cuenta
     *
     * @param cuenta número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Función que devuelve el saldo de una cuenta
     *
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Procedimiento para asignar un valor al saldo de una cuenta
     *
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Función que devuelve el tipo de interés
     *
     * @return tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Procedimiento para asignar un valor al tipo de interés
     *
     * @param tipoInterés tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
