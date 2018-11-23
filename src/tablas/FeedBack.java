package tablas;

public class FeedBack {
    
    public int IdFeedBack;
    public String Alias;
    public String comentario;
    public String mail;
    //Cambie la valoracion a un String en vez de un int
    
    public String valoracion;

    public FeedBack(String Alias, String comentario, String mail, String valoracion) {
        this.IdFeedBack = 0;
        this.Alias = Alias;
        this.comentario = comentario;
        this.mail = mail;
        this.valoracion = valoracion;
    }

    public int getIdFeedBack() {
        return IdFeedBack;
    }
    public String getAlias() {
        return Alias;
    }
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }
 
    
    @Override
    public String toString(){
        String cad="\n Alias: "+Alias+
                   "\n Mail: "+mail+
                   "\n Comentario: "+comentario+
                   "\n Valoración: "+valoracion;
        return cad;
    }
    
    
            
}
