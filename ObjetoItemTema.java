package Encapsulamento;

public class ObjetoItemTema {

	public static void main(String[] args) {
		
		ItemTema it1 = new ItemTema();
		ItemTema it2 = new ItemTema(2,"João Pedro","Negro");
		
		it1.setId(1);
		it1.setNome("Samuel Freitas");
		it1.setDescricao("Branco");
		
		System.out.println(it1.getId());
		System.out.println(it1.getNome());
		System.out.println(it1.getDescricao());
		
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println(it2.getId());
		System.out.println(it2.getNome());
		System.out.println(it2.getDescricao());
	}
}