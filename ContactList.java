package br.ceub.contacts;

public class ContactList {
	 // Declare uma variável para representar o primeiro nó (head) da lista encadeada.
	
	private Node head;
	
	public ContactList() {
        this.head = null;
    }
	
    // Implemente o método addContact(Contact contact) para adicionar um novo contato ao final da lista.

	 public void addContact(Contact contact) {
	        Node newNode = new Node(contact); 
	       
	        if (head == null) {
	            head = newNode ; 
	       
	        } else {
	            Node current = head;
	            while (current.getNext() != null) {
	                current = current.getNext(); 
	            }
	                current.setNext(newNode) ; 
	        }
	    }
    // Implemente o método searchContact(String nameOrPhone) para buscar um contato pelo nome ou número de telefone.
	 
	 
	 public Contact searchContact(String nameOrPhone) {
	        Node current = head;
	        while (current != null) {
	            
	        	Contact contact = current.getContact();
	            
	        	if (contact.getName().equalsIgnoreCase(nameOrPhone) || contact.getPhoneNumber().equals(nameOrPhone)) {
	                return contact ;
	            }
	            current = current.getNext() ; 
	        }
	        return null; 
	    }

    // Implemente o método removeContact(String nameOrPhone) para remover um contato pelo nome ou número de telefone.

	 
	 public boolean removeContact(String nameOrPhone) {
	        Node current = head;
	        Node previous = null;

	        while (current != null) {
	        	
	            Contact contact = current.getContact();
	            
	            if (contact.getName().equalsIgnoreCase(nameOrPhone) || contact.getPhoneNumber().equals(nameOrPhone)) {
	                if (previous == null) {
	                    head = current.getNext() ; 
	                    
	                } else {
	                    previous.setNext(current.getNext()); 
	                }
	                return true; 
	            }
	            previous = current;
	            current = current.getNext(); 
	        }
	        return false ; 
	    }
    // Implemente o método listContacts() para exibir todos os contatos armazenados na lista.
	 
	 public void listContacts() {
	        Node current = head;
	        
	        if (current == null) {
	            System.out.println("Não encontramos o contato.") ;
	            return;
	        }
	        while (current != null) {
	            System.out.println(current.getContact());
	            current = current.getNext();
	        }
	    }
	
}
