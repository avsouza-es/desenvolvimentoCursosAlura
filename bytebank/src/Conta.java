public class Conta {
	double saldo;
	int agencia;
	int numero;
	Titular titular;
	
	// criacao do metodo deposita
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	// criação do método saca
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;	
	}
	
	// criacao do método transfere
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}	