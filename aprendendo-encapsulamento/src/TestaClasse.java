public class TestaClasse {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setMatricula("001");
		pessoa.setNome("Alexandre Vieira de Souza");
		
		// apresentando os dados cadastrados
		System.out.print(pessoa.getMatricula());
		System.out.println(" - " +pessoa.getNome());
		
		
	}
}
