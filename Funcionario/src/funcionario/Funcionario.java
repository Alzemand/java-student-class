
package funcionario;


public class Funcionario {
//atributos da classe funcionario;
  String nome;
  int idade;
  int cpf;
  //método construtor;
  Funcionario(){
      //super();
      this.nome= "victor";
      this.cpf= 155;
      this.idade= 21;
  }
  
  Funcionario(String NovoNome,int NovaIdade,int Novocpf){
  
      this.nome=NovoNome;
      this.idade=NovaIdade;
      this.cpf=Novocpf;
  }
  
  Funcionario (String Novoname){
      this.cpf=123;
      this.nome=Novoname;
      this.idade=24;
  }
}
