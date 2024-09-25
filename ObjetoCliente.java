package Encapsulamento;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente(2,"Dimas","2","2","2");
		
		cliente1.setId(1);
		cliente1.setNome("SFreitas");
		cliente1.setTelefone("98189-7434");
		cliente1.setCpf("479.506.388-50");
		cliente1.setRg("1");
		
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		System.out.println("////////////////////////////////////////////////////");
		
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
	}
}