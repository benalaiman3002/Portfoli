/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class Ejercicio7 {

    public static final int trabajadores = 3;
    public static final int departamentos = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        classDepEmp treballadors[] = new classDepEmp[trabajadores];
        classDepartament departaments[] = new classDepartament[departamentos];

        emplenaEmpleats(treballadors);
        emplenaDepartaments(departaments);

        System.out.println("Intro departaments:");
        String dep = in.nextLine();
        cercaDadesDepartament(departaments, treballadors, dep);

        // canviar telefon treballador 
        System.out.println("Nou telefon: ");
        telefon(treballadors);

    }

    public static void emplenaEmpleats(classDepEmp[] treballadors) {
        treballadors[0] = new classDepEmp("Pep", 25, "123456789", "Vendes");
        treballadors[1] = new classDepEmp("Marta", 25, "123456789", "Contabilidad");
        treballadors[2] = new classDepEmp("Jose", 25, "123456789", "Administracion ");
    }

    public static void emplenaDepartaments(classDepartament[] departaments) {
        departaments[0] = new classDepartament(32, 40.5, 1, "Administracion");
        departaments[1] = new classDepartament(34, 45.0, 2, "Contabilidad");
        departaments[2] = new classDepartament(36, 50.5, 3, "Vendes");
    }

    public static void cercaDadesDepartament(classDepartament[] deps, classDepEmp[] emp, String dep) {
        int horas = 0;
        double sueldo = 0;
        for (int i = 0; i < deps.length; i++) {
            if (deps[i].getNombre().equals(dep)) {
                horas = deps[i].getHoras();
                sueldo = deps[i].getSueldo();

            }
            break;
        }
        int treballador = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDepartament().equals(dep)) {
                treballador++;
            }
        }
        System.out.println("Departament: " + dep);
        System.out.println("Treballadors: " + treballador);
        System.out.println("Sous: " + (sueldo * treballador));
        System.out.println("Hores: " + (horas * treballador));
    }

    public static void telefon(classDepEmp[] emp) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nou telefon: ");
        String nouTelefon = in.nextLine();
        if (nouTelefon.contains("-") || nouTelefon.contains(".") || nouTelefon.contains(" ")) {
            System.out.println("Numero no valido, intentalo de nuevo");
            nouTelefon = nouTelefon.replaceAll("-", "");
            nouTelefon = nouTelefon.replaceAll(".", "");
            nouTelefon = nouTelefon.replaceAll(" ", "");
            System.out.println(nouTelefon);
        };
        if (nouTelefon.length() != 9) {
            System.out.println("Numero no valido");
        } else {
            System.out.println("Numero valido");
            emp[0].setTelefon(nouTelefon);
        }
    }

    public void UsuarioDepartamento(String dep) {
        Scanner in = new Scanner(System.in);
        while (!checkDepartament(dep)) {
            System.out.println("Intro dep:");
            String departament = in.nextLine();
        }
        this.UsuarioDepartamento(dep);
    }

    public boolean checkDepartament(String dep) {
        for (int i = 0; i < dep.length(); i++) {
            if (dep[i].getNombre().equals(dep)) {
                
            }
        }
        return false;

    }
}
