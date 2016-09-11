
package Model;

import java.util.List;


public class Livro {
String isbn;
String nome;

//GET
private String getisbn(){
    return isbn;
}
//
private String getnome(){
    return nome;
}

private void setisbn(String isbn){
    this.isbn=isbn;
}
private void setnome(String nome){
    this.nome=nome;
}

//lista simples encadeada;
private List<Autor> Autores;
}
