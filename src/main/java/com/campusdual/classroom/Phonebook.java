package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    Map<String,Contact> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public Map<String, Contact> getData() {
        return book;
    }
    public void addContact (Contact contacto){
        book.put(contacto.codigo,contacto);
    }
    public void deleteContact (String codigo){
        book.remove(codigo);
    }
    public void showPhonebook(){
        for(Contact contact: book.values()){
            System.out.println("Nombre: " + contact.nombre);
            System.out.println("Apellidos: " + contact.apellidos);
            System.out.println("Numero: " + contact.numero);
            System.out.println("Codigo: " + contact.codigo);
            System.out.println();
        }
    }
}
