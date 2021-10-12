package Guia_06_POO.Ejercicio_05;

public class Cuenta {
    private Integer numeroCuenta;
    private Long DNI;
    private Double saldo;

    public Cuenta() {
    }

    public Cuenta(Integer numeroCuenta, Long DNI, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
}
