//Diego villarroel
//karen quisbert
//Mauricio Valdivieso
//Mauricio Valdiviesod
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Veterinary veterinary = new Veterinary();
        //Pet cat = new Cat("Cat", "Black", "2");
        menu();
    }
    public static void menu(){
        Veterinary veterinary = new Veterinary();
        int option = 0;
        System.out.println("Bien venido a la veterianaria");
        do {
            System.out.println("Ingrese la opcion ");
            System.out.println("1 .Ingresar ");
            System.out.println("2 .Mostrar ");
            System.out.println("3 .Eliminar ");
            System.out.println("4 .Mostrar todo");
            System.out.println("5 .Salir");
            //
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option) {
                case 1:

                    break;
                case 2:
                    String type=null, color=null, name=null, choice;
                    int age=-1;
                    System.out.println("Update pets\n");
                    System.out.println("Enter an id to update your animal data");
                    int id = sc.nextInt();

                    Pet updatedPet = veterinary.search(id);
                    if(updatedPet == null){
                        System.out.println("The pet with id: " + id + "has not been found");
                        System.out.println("Enter a key to continue...");
                        sc.nextLine();
                        showPrincipalMenu();
                    }

                    System.out.println("Your current pet data is showed below: \n");
                    System.out.println(updatedPet);

                    System.out.println("Do you want to change your pet name?");
                    System.out.println("Y / N");

                    choice = sc.nextLine();
                    while(choice.equals("Y") || choice.equals("N")){
                        System.out.println("Invalid option...");
                    }
                    if(choice.equals("Y")){
                        System.out.println("Enter a new name:");
                        name = sc.nextLine();
                    }

                    System.out.println("Do you want to change your pet color?");
                    System.out.println("Y / N");

                    choice = sc.nextLine();
                    while(choice.equals("Y") || choice.equals("N")){
                        System.out.println("Invalid option...");
                    }
                    if(choice.equals("Y")){
                        System.out.println("Enter a new color:");
                        color = sc.nextLine();
                    }

                    System.out.println("Do you want to change your pet age?");
                    System.out.println("Y / N");

                    choice = sc.nextLine();
                    while(choice.equals("Y") || choice.equals("N")){
                        System.out.println("Invalid option...");
                    }
                    if(choice.equals("Y")){
                        System.out.println("Enter a new color:");
                        age = sc.nextInt();
                    }

                    switch (updatedPet.getTipo()){
                        case "Cat":
                            veterinary.updatePet(id, new Cat(updatedPet.getTipo(), color, age, name));
                            break;
                        case "Dog":
                            veterinary.updatePet(id, new Dog(updatedPet.getTipo(), color, age, name));
                        case "Parrot":
                            veterinary.updatePet(id, new Parrot(updatedPet.getTipo(), color, age, name));
                    }

                    System.out.println("Your animal has been successfully saved!");
                    System.out.println("Enter a key to continue...");
                    sc.nextLine();
                    showPrincipalMenu();
                    break;
                case 3:

                    break;
                case 4:

                    break;

                default:
                    option = 0;
                    break;

            }
        }while (option != 0 );
        System.out.println("Bien venido a la veterianaria");
        System.out.println("ADD Pets");


}

    private static void showPrincipalMenu() {
    }
}
