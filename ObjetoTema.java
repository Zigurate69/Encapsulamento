package Encapsulamento;

public class ObjetoTema {

	public static void main(String[] args) {
		
		Tema tema1 = new Tema();
		Tema tema2 = new Tema(2,"Corinthians",500,"Preto e Branco");
		
		tema1.setId(1);
		tema1.setNome("Fulano do Objeto");
		tema1.setValorAluguel(700.00);
		tema1.setCorToalha("Azul e Vermelho");
		
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());
		
		System.out.println("///////////////////////////////////////////////////////////////");
		
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCorToalha());
	}
}