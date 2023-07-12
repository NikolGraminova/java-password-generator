/*Consegna:
Create un nuovo progetto java chiamato java-password-generator
Aggiungete un package org.lessons.java.security
Aggiungete una classe PasswordGenerator che contiene un metodo main
Il programma deve fare quanto segue:
salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno (in numero)
generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere
Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta La sua password sarà Pinco-Pallo-magenta-2011
BONUS: utilizzare la classe java.util.Scanner per leggere i dati dell’utente da tastiera*/

package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {

        //variables
        String userName = "Pinco";
        String userSurname = "Pallo";
        String userColor = "magenta";
        int birthDay = 12;
        int birthMonth = 5;
        int birthYear = 1994;
        int userDate = birthDay + birthMonth + birthYear;
        String generatedPassword = userName + "-" + userSurname + "-" + userColor + "-" + userDate;

        //print
        System.out.println(generatedPassword);

    }
}
