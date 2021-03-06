<%-- 
    Document   : catGastos_ajax
    Created on : 18/09/2015, 09:51:38 AM
    Author     : HpPyme
--%>

<%@page import="com.tsp.sct.dao.jdbc.CatalogoGastosDaoImpl"%>
<%@page import="com.tsp.sct.dao.dto.CatalogoGastos"%>
<%@page import="com.tsp.sct.bo.CatalogoGastosBO"%>
<%@page import="com.tsp.sct.util.GenericValidator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="session" class="com.tsp.sct.bo.UsuarioBO"/>
<%
    String mode = "";
    
    int idEmpresa = user.getUser().getIdEmpresa();
    
    /*
    * Parámetros
    */
    int idCatalogoGastos = -1;
    String nombreGastos ="";
    String descripcion ="";  
    int estatus = 2;//deshabilitado
    
    /*
    * Recepción de valores
    */
    mode = request.getParameter("mode")!=null?request.getParameter("mode"):"";
    try{
        idCatalogoGastos = Integer.parseInt(request.getParameter("idCatalogoGastos"));
    }catch(NumberFormatException ex){}
    nombreGastos = request.getParameter("nombreGasto")!=null?new String(request.getParameter("nombreGasto").getBytes("ISO-8859-1"),"UTF-8"):"";
    descripcion = request.getParameter("descripcion")!=null?new String(request.getParameter("descripcion").getBytes("ISO-8859-1"),"UTF-8"):"";    
    try{
        estatus = Integer.parseInt(request.getParameter("estatus"));
    }catch(NumberFormatException ex){}   
    
    /*
    * Validaciones del servidor
    */
    String msgError = "";
    GenericValidator gc = new GenericValidator();    
    if(!gc.isValidString(nombreGastos, 1, 100))
        msgError += "<ul>El dato 'nombre' es requerido.";
    if(!gc.isValidString(descripcion, 1, 100))
        msgError += "<ul>El dato 'descripción' es requerido";   
    if(idCatalogoGastos <= 0 && (!mode.equals("")))
        msgError += "<ul>El dato ID 'gasto' es requerido";
    /*
    if(idVendedor<=0)
        msgError += "<ul>El dato 'Vendedor' es requerido";
 * */

    if(msgError.equals("")){
        if(idCatalogoGastos>0){
            if (mode.equals("1")){
            /*
            * Editar
            */
                CatalogoGastosBO catalogoGastosBO = new CatalogoGastosBO(idCatalogoGastos,user.getConn());                
                CatalogoGastos catalogoGastosDto = catalogoGastosBO.getCatalogoGastos();
                
                catalogoGastosDto.setIdEstatus(estatus);
                catalogoGastosDto.setNombre(nombreGastos);
                catalogoGastosDto.setDescripcion(descripcion);
               
                
                try{
                    new CatalogoGastosDaoImpl(user.getConn()).update(catalogoGastosDto.createPk(), catalogoGastosDto);

                    out.print("<!--EXITO-->Registro actualizado satisfactoriamente");
                }catch(Exception ex){
                    out.print("<!--ERROR-->No se pudo actualizar el registro. Informe del error al administrador del sistema: " + ex.toString());
                    ex.printStackTrace();
                }
                
            }else{
                out.print("<!--ERROR-->Acción no válida.");
            }
        }else{
            /*
            *  Nuevo
            */
            
            try {                
                
                /**
                 * Creamos el registro de Cliente
                 */
                CatalogoGastos catalogoGastosDto = new CatalogoGastos();
                CatalogoGastosDaoImpl catalogoGastosDaoImpl = new CatalogoGastosDaoImpl(user.getConn());
                
                catalogoGastosDto.setIdEstatus(estatus);
                catalogoGastosDto.setNombre(nombreGastos);
                catalogoGastosDto.setDescripcion(descripcion);                              
                catalogoGastosDto.setIdEmpresa(idEmpresa);

                /**
                 * Realizamos el insert
                 */
                catalogoGastosDaoImpl.insert(catalogoGastosDto);

                out.print("<!--EXITO-->Registro creado satisfactoriamente.<br/>");
            
            }catch(Exception e){
                e.printStackTrace();
                msgError += "Ocurrio un error al guardar el registro: " + e.toString() ;
            }
        }
    }else{
        out.print("<!--ERROR-->"+msgError);
    }


%>