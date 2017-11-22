package ejemploherdanza;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Persoa {
    private String nome,apelido;
    private int edade;
    
    public Persoa(){}//constructor por defecto.
    
    public Persoa(String nome,String apelido,int edade){//constructor con parametros
        this.nome=nome;
        this.apelido=apelido;
        this.edade=edade;
    }

    public String getNome() {//da nombre
        return nome;
    }

    public void setNome(String nome) {//añadir nombre
        this.nome = nome;
    }

    public String getApelido() {//da apellido
        return apelido;
    }

    public void setApelido(String apelido) {//añade apellido
        this.apelido = apelido;
    }

    public int getEdade() {//da edade
        return edade;
    }

    public void setEdade(int edade) {//añade edade
        this.edade = edade;
    }
    
    
    

}
