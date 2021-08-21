package Guia_8_REL_Ejercicio_01_Extra_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void menuPets() {
        HashSet<Person> clients = new HashSet();
        HashSet<Pet> pets = new HashSet();
        String op;
        do {
            System.out.println("1. Add new client.\n2. Add new pet.\n3. Adopt pet.\n4. Show list of pets.\n5. Show adopted pets.\n6. Delete client.\n7. Delete pet.\n0. Exit");
            op = sc.next();
            switch (op) {
                case "1":
                    addClient(clients);
                    break;
                case "2":
                    addPet(pets);
                    break;
                case "3":
                    adoptPet(clients, pets);
                    break;
                case "4":
                    showPets(pets);
                    break;
                case "5":
                    showPetsAdopted(clients);
                    break;
                case "6":
                    deletePet(clients, pets);
                    break;
                case "7":
                    deleteClient(clients);
                    break;
                case "0":
                    System.out.println("Thanks for using our services!");
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        } while (!op.equals("0"));
    }

    private void addClient(HashSet<Person> clients) {
        String op = "y";
        do {
            switch (op) {
                case "y":
                    Person p = new Person();
                    System.out.println("Name of the client:");
                    p.setName(sc.next());
                    System.out.println("Surname:");
                    p.setSurname(sc.next());
                    System.out.println("Document:");
                    p.setDocument(sc.nextLong());
                    System.out.println("Age:");
                    p.setAge(sc.nextInt());
                    clients.add(p);
                    System.out.println("Add new client? (y/n)");
                    op = sc.next();
                    break;
                case "n":
                    break;
                default:
                    System.out.println("Wrong option!");
                    System.out.println("Add new client? (y/n)");
                    op = sc.next();
                    break;
            }
        } while (!op.equals("n"));
    }

    private void addPet(HashSet<Pet> pets) {
        do {
            Pet p = new Pet();
            System.out.println("Name of the pet"
                    + ":");
            p.setName(sc.next());
            System.out.println("Race:");
            p.setRace(sc.next());
            System.out.println("Age:");
            p.setAge(sc.nextInt());
            System.out.println("Size(kg):");
            p.setSize(sc.nextDouble());
            pets.add(p);
            System.out.println("Add new pet? y/n");
            if (sc.next().equals("n")) {
                break;
            }
        } while (true);
    }

    private void adoptPet(HashSet<Person> clients, HashSet<Pet> pets) {
        String op = "y";
        if (clients.isEmpty()) {
            System.out.println("No clients yet!");
            addClient(clients);
        } else {
            System.out.println("Name of the client:");
            String aux = sc.next();
            Boolean found = false;
            for (Person client : clients) {
                if (client.getName().equals(aux)) {
                    found = true;
                    do {
                        switch (op) {
                            case "y":
                                showPets(pets);
                                System.out.println("Name of the pet:");
                                aux = sc.next();
                                for (Pet pet : pets) {
                                    if (pet.getName().equals(aux)) {
                                        if (!pet.getAdopted()) {
                                            client.getPets().add(pet);
                                            break;
                                        } else {
                                            System.out.println("The pet was already adopted");
                                            break;
                                        }
                                    }
                                }
                                System.out.println("Adopt new pet? (y/n)");
                                op = sc.next();
                                break;
                            case "n":
                                break;
                            default:
                                System.out.println("Wrong option!");
                                System.out.println("Adopt new pet? (y/n)");
                                op = sc.next();
                                break;
                        }
                    } while (!op.equals("n"));
                    break;
                }
            }
            if (!found) {
                System.out.println("Client not found!");
            }
        }
    }

    private void showPets(HashSet<Pet> pets) {
        pets.forEach((pet) -> {
            System.out.println("Pets in the store:\n" + "Name: " + pet.getName() + " Race: " + pet.getRace() + " Age: " + pet.getAge() + " Size: " + pet.getSize() + " Adopted: " + pet.getAdopted());
        });
    }

    private void deletePet(HashSet<Person> clients, HashSet<Pet> pets) {
        if (clients.isEmpty()) {
            System.out.println("No clients yet!");
        } else {
            System.out.println("Name of the client:");
            String aux = sc.next();
            Boolean found = false;
            for (Person client : clients) {
                if (client.getName().equals(aux)) {
                    found = true;
                    if (client.getPets().isEmpty()) {
                        System.out.println("This client has no pets yet!");
                    }
                    showPetsAdopted(clients);
                    System.out.println("Name of the pet to delete:");
                    String pet = sc.next();
                    Iterator<Pet> it = client.getPets().iterator();
                    while (it.hasNext()) {
                        if (it.next().getName().equals(pet)) {
                            it.remove();
                            for (Pet pet1 : pets) {
                                if (pet1.getName().equals(pet)) {
                                    pet1.setAdopted(false);
                                    break;
                                }
                            }
                            System.out.println("Pet deleted!");
                        }
                    }
                }
            }
            if (!found) {
                System.out.println("Client not found!");
            }
        }
    }

    private void deleteClient(HashSet<Person> clients) {
        if (clients.isEmpty()) {
            System.out.println("No clients yet!");
        } else {
            System.out.println("Name of the client:");
            String aux = sc.next();
            Boolean found = false;
            Iterator<Person> it = clients.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equals(aux)) {
                    found = true;
                    it.remove();
                    System.out.println("Client deleted!");
                }
            }
            if (!found) {
                System.out.println("Client not found!");
            }
        }
    }

    private void showPetsAdopted(HashSet<Person> clients) {
        if (clients.isEmpty()) {
            System.out.println("No clients yet!");
        } else {
            System.out.println("Name of the client:");
            String aux = sc.next();
            Boolean found = false;
            for (Person client : clients) {
                if (client.getName().equals(aux)) {
                    found = true;
                    if (client.getPets().isEmpty()) {
                        System.out.println("This client has no pets yet!");
                    }
                    client.getPets().forEach((pet) -> {
                        System.out.println("Name: " + pet.getName());
                    });
                }
            }
            if (!found) {
                System.out.println("Client not found!");
            }
        }
    }

}
