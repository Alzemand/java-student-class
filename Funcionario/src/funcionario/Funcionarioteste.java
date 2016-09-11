
package funcionario;


public class Funcionarioteste {
    public static void main(String[] args){
    
    Funcionario victor = new Funcionario();
    System.out.println(victor.cpf);
    System.out.println(victor.idade);
    System.out.println(victor.nome);
    Funcionario Ricardo = new Funcionario("Ricardo", 22,1234);
    System.out.println(Ricardo.nome);
    System.out.println(Ricardo.idade);
    System.out.println(Ricardo.cpf);
    Funcionario Thais = new Funcionario("Thais");
    System.out.println(Thais.nome);
    System.out.println(Thais.idade);
    System.out.println(Thais.cpf);
    }
    
}
