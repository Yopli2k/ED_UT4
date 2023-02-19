package cuentas;

/**
 * Class for managing a bank account.
 *
 * @author Desarrollo Aplicaciones Web
 * @version 1.0
 */
public class CCuenta {

    /** nombre: name of the account holder */
    private String nombre;

    /** cuenta: account number */
    private String cuenta;

    /** saldo: account balance */
    private double saldo;

    /** tipoInterés: type of interest */
    private double tipoInterés;

    /**
     * Generic class constructor.
     */
    public CCuenta()
    {
    }

    /**
     * Specific class constructor.
     *
     * @param nom name of the account holder
     * @param cue account number
     * @param sal account balance
     * @param tipo type of interest
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Get account balance.
     *
     * @return double
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Make a deposit of the indicated amount.
     * Throws an exception if the indicated quantity is less than zero.
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Make a refund of the indicated amount.
     * Throws an exception if the indicated quantity is less than zero.
     * Throws an exception if the indicated amount is greater than the account balance.
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Get the name of the account holder.
     *
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the name of the account holder to set.
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the account number.
     *
     * @return String
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Set the account number to set.
     *
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Get the account balance.
     *
     * @return double
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Set the account balance.
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Get the type of interest.
     *
     * @return double
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Set the type of interest to set.
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
