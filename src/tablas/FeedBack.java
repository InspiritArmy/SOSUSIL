/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author Nivardo Jr
 */
public class FeedBack {
    
    public int IdFeedBack;
    public String Alias;
    public String comentario;
    public String mail;
    public int valoracion;

    public FeedBack(String Alias, String comentario, String mail, int valoracion) {
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
    public int getValoracion() {
        return valoracion;
    }
    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
    
    public String toString(){
        String cad="\n Alias: "+Alias+
                   "\n Mail: "+mail+
                   "\n Comentario: "+comentario+
                   "\n Valoración: "+valoracion;
        return cad;
    }
    
    
            
}
