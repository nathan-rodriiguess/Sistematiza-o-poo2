package br.ceub.contacts;

public class Node {
	// Declare duas variáveis: uma para armazenar um objeto Contact e outra para o próximo nó na lista encadeada.
	
	private Contact contact ;
    private Node next;

    // Implemente um construtor que receba um objeto Contact e inicialize a variável "next" como null.

    public Node(Contact contact) {
        this.contact = contact;
        this.next = null ;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact ;
    }

    public Node getNext() {
        return next ;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}

