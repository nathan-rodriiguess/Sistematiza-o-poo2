package br.ceub.contacts;

import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);  
        ContactList contactList = new ContactList(); 

        boolean running = true; 

        while (running) {
            
            System.out.println("Escolha uma opção:");
            System.out.println("1- Adicionar Contato");
            System.out.println("2- Buscar Contato");
            System.out.println("3- Remover Contato");
            System.out.println("4- Listar Contatos");
            

            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    
                    System.out.println(" Nome do contato:");
                    String name = scanner.nextLine();
                    System.out.println("Telefone do contato:");
                    String phone = scanner.nextLine();
                    System.out.println(" E-mail do contato:");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(name, phone, email);
                    contactList.addContact(contact);
                    System.out.println("Contato adicionado!");
                    break;

                case 2:
                  
                    System.out.println("Digite o nome ou número de telefone do contato para buscar:");
                    String searchQuery = scanner.nextLine();
                    Contact foundContact = contactList.searchContact(searchQuery);
                    if (foundContact != null) {
                        System.out.println("Contato encontrado: " + foundContact);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    
                    System.out.println("Digite o nome ou número de telefone do contato para remover:");
                    String removeQuery = scanner.nextLine();
                    boolean removed = contactList.removeContact(removeQuery);
                    if (removed) {
                        System.out.println("Contato foi removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    
                    System.out.println("Lista de Contatos:");
                    contactList.listContacts(); 
                    break;

               

                default:
                    
                    System.out.println("Tente novamente.");
            }
        }

        scanner.close(); 
    }
}

