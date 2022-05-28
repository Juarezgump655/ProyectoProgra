

package modelo;

/**
 *
 * @author ajuar
 */
public class Recursos {
     private String codigo, nombre, organizacion, requiereAprobacion, usuarioAprobacion, requiereConfirmacion, usuarioRecepcion, usuarioEntrega, tiempoMaximoUso; 
     private String costo;

    public Recursos(String codigo, String nombre, String organizacion, String requiereAprobacion, String usuarioAprobacion, String requiereConfirmacion, 
            String usuarioRecepcion, String usuarioEntrega, String tiempoMaximoUso, String costo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.organizacion = organizacion;
        this.requiereAprobacion = requiereAprobacion;
        this.usuarioAprobacion = usuarioAprobacion;
        this.requiereConfirmacion = requiereConfirmacion;
        this.usuarioRecepcion = usuarioRecepcion;
        this.usuarioEntrega = usuarioEntrega;
        this.tiempoMaximoUso = tiempoMaximoUso;
        this.costo = costo;
    }

     
     
    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
    

     
     
     
    public String getUsuarioRecepcion() {
        return usuarioRecepcion;
    }

    public void setUsuarioRecepcion(String usuarioRecepcion) {
        this.usuarioRecepcion = usuarioRecepcion;
    }

    public String getUsuarioEntrega() {
        return usuarioEntrega;
    }

    public void setUsuarioEntrega(String usuarioEntrega) {
        this.usuarioEntrega = usuarioEntrega;
    }

    

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRequiereAprobacion() {
        return requiereAprobacion;
    }

    public void setRequiereAprobacion(String requiereAprobacion) {
        this.requiereAprobacion = requiereAprobacion;
    }

    public String getUsuarioAprobacion() {
        return usuarioAprobacion;
    }

    public void setUsuarioAprobacion(String usuarioAprobacion) {
        this.usuarioAprobacion = usuarioAprobacion;
    }

    public String getRequiereConfirmacion() {
        return requiereConfirmacion;
    }

    public void setRequiereConfirmacion(String requiereConfirmacion) {
        this.requiereConfirmacion = requiereConfirmacion;
    }

    public String getTiempoMaximoUso() {
        return tiempoMaximoUso;
    }

    public void setTiempoMaximoUso(String tiempoMaximoUso) {
        this.tiempoMaximoUso = tiempoMaximoUso;
    }

    
   
     
     
     
}
