package Encapsulamento;

public class ObjetoEndereco {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco();
		Endereco endereco2 = new Endereco(2,"Logradouro2",2,"Complemento2","Bairro2","Cidade2","Cep2","Uf2");

		endereco1.setId(1);
		endereco1.setLogradouro("Logradouro1");
		endereco1.setNumero(1);
		endereco1.setComplemento("Complemento1");
		endereco1.setBairro("Bairro1");
		endereco1.setCidade("Cidade1");
		endereco1.setCep("Cep1");
		endereco1.setUf("Uf1");

		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());

		System.out.println("//////////////////////////////////////////////////////////");

		System.out.println(endereco2.getId());
		System.out.println(endereco2.getLogradouro());
		System.out.println(endereco2.getNumero());
		System.out.println(endereco2.getComplemento());
		System.out.println(endereco2.getBairro());
		System.out.println(endereco2.getCidade());
		System.out.println(endereco2.getCep());
		System.out.println(endereco2.getUf());
	}
}