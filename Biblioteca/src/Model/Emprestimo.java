package Model;

import java.util.Calendar;
import java.util.List;


public class Emprestimo {
    Calendar data;
    Calendar previstadevolucao;
    Calendar datadevolucao;
//GET    
private Calendar getdata(){
    return data;
}
private Calendar getprevistadevolucao(){
    return previstadevolucao;
}
    
private Calendar getdatadevolucao(){
    return datadevolucao;
}

//SET
private void setdata(Calendar data){
    this.data=data;
}
private void setprevistadevolucao(Calendar previstadevolucao){
    this.previstadevolucao=previstadevolucao;
}
private void setdatadevolucao(Calendar datadevolucaoo){
    this.datadevolucao=datadevolucao;
}
//lista simples encadeada;

private List<Livro> livros;
}
