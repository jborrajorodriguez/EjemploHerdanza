package ejemploherdanza;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Estudante extends Persoa{//herda de persoa
    private String codigo;
    private int notaFinal;
    
    public Estudante(){}
    
    public Estudante(String nome,String apelido,int edade,String codigo,int notaFinal){
        super(nome,apelido,edade);
        this.codigo=codigo;
        this.notaFinal=notaFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void amosar(){
        System.out.println("Nome:"+getNome()+"  Apelido:"+getApelido()+"  Edade:"+getEdade()+"  Codigo:"+codigo+"  Nota Final:"+notaFinal);
    }
    
    
    
    
    

}
