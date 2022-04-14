public class Dados {

	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private long cpf;
	private static int total;
	private boolean status = true;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public static void getTotal() {
		System.out.println("O total de contas e: " + Dados.total);
    }
	
	public void getStatus() {
		if (this.status) {
			System.out.print("\nA conta esta ativa. Para revisar os dados use: usuario.todosDados();");
		}
		else {
			System.out.println("A conta esta inativa");
		}
    }
	
	public void todosDados() {
		System.out.println("\n" + nome + "\n" + telefone + "\n"+ email + "\n" + endereco + "\n" + cpf);
	}

}
