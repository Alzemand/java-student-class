
package Model;


public abstract class Aluno extends Cliente {
    Integer matricula;
    
    private Integer getmatricula(){
        return matricula;
    }
    
    private void setmatricula(Integer matricula){
        this.matricula=matricula;
    }
}
