package sesion01;

public class Cuenta {

	private String numeroCuenta;
	private String titular;
	private double saldo;

	public Cuenta(String numeroCuenta, String titular) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		//this.saldo = 0;
	}

	public Cuenta(String numeroCuenta, String titular, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	public void deposito(double monto) {
		saldo +=monto;
	}
	
	public void retiro(double monto) {
		saldo-=monto-5.0;
	}
	
}
