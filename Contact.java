package br.ceub.contacts;

public class Contact {
    // Declare as variáveis para armazenar o nome, telefone e email do contato.
	
	    private String name;
	    private String phoneNumber;
	    private String email;

    // Implemente um construtor para inicializar as variáveis com os valores passados como parâmetros.
	    public Contact(String name, String phoneNumber, String email) {
	    	
	        this.name = name;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	    }

    // Adicione métodos "getter" para acessar o valor de cada variável (nome, telefone e email).
	    public String getName() {
	        return name;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public String getEmail() {
	        return email;
	    }

    // Crie o método toString() para retornar uma string formatada com as informações do contato.


	    public String toString() {
	        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
	    }
	}




