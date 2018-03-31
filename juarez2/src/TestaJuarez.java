public class TestaJuarez {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Alexandre Vieira de Souza";
		pessoa.idade = 36;
		
		// Endereco endereco = new Endereco();
		// endereco.logradouro = "Miguel Felizardo";
		// endereco.bairro = "Santa Terezinha";
		// endereco.cidade = "São Gabriel da Palha";
		
		// associando objeto Endereco ao objeto Pessoa
		pessoa.endereco = new Endereco();
		pessoa.endereco.logradouro = "ZXY 123";
		
		// monstrando informações
		System.out.println("Nome da Pessoa: " + pessoa.nome);
		System.out.println("Idade da Pessoa: " + pessoa.idade);
		System.out.println("Logradouro:" + pessoa.endereco.logradouro);
		
	}

}
