import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String name = sc.next();
        System.out.print("Vida inicial: ");
        int life = sc.nextInt();
        sc.nextLine();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        sc.nextLine();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        sc.nextLine();

        Champion champion1 = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        name = sc.next();
        System.out.print("Vida inicial: ");
        life = sc.nextInt();
        sc.nextLine();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        sc.nextLine();
        System.out.print("Armadura: ");
        armor = sc.nextInt();
        sc.nextLine();

        Champion champion2 = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        int turn = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i = 0; i < turn; i++) {
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);
            System.out.printf("Resultado do turno %d:%n", i+1);
            System.out.println(champion1.status());
            System.out.println(champion2.status());
            System.out.println();

            if(champion1.getLife() <= 0 || champion2.getLife() <= 0) {
                break;
            }
        }

        System.out.println("FIM DO COMBATE");
        sc.close();
    }
}
