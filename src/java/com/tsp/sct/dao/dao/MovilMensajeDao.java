/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import java.util.Date;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface MovilMensajeDao
{
	/** 
	 * Inserts a new row in the MOVIL_MENSAJE table.
	 */
	public MovilMensajePk insert(MovilMensaje dto) throws MovilMensajeDaoException;

	/** 
	 * Updates a single row in the MOVIL_MENSAJE table.
	 */
	public void update(MovilMensajePk pk, MovilMensaje dto) throws MovilMensajeDaoException;

	/** 
	 * Deletes a single row in the MOVIL_MENSAJE table.
	 */
	public void delete(MovilMensajePk pk) throws MovilMensajeDaoException;

	/** 
	 * Returns the rows from the MOVIL_MENSAJE table that matches the specified primary-key value.
	 */
	public MovilMensaje findByPrimaryKey(MovilMensajePk pk) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'ID_MOVIL_MENSAJE = :idMovilMensaje'.
	 */
	public MovilMensaje findByPrimaryKey(int idMovilMensaje) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria ''.
	 */
	public MovilMensaje[] findAll() throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'ID_MOVIL_MENSAJE = :idMovilMensaje'.
	 */
	public MovilMensaje[] findWhereIdMovilMensajeEquals(int idMovilMensaje) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'EMISOR_TIPO = :emisorTipo'.
	 */
	public MovilMensaje[] findWhereEmisorTipoEquals(int emisorTipo) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'ID_EMPLEADO_EMISOR = :idEmpleadoEmisor'.
	 */
	public MovilMensaje[] findWhereIdEmpleadoEmisorEquals(int idEmpleadoEmisor) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'RECEPTOR_TIPO = :receptorTipo'.
	 */
	public MovilMensaje[] findWhereReceptorTipoEquals(int receptorTipo) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'ID_EMPLEADO_RECEPTOR = :idEmpleadoReceptor'.
	 */
	public MovilMensaje[] findWhereIdEmpleadoReceptorEquals(int idEmpleadoReceptor) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'FECHA_EMISION = :fechaEmision'.
	 */
	public MovilMensaje[] findWhereFechaEmisionEquals(Date fechaEmision) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'FECHA_RECEPCION = :fechaRecepcion'.
	 */
	public MovilMensaje[] findWhereFechaRecepcionEquals(Date fechaRecepcion) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'MENSAJE = :mensaje'.
	 */
	public MovilMensaje[] findWhereMensajeEquals(String mensaje) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'RECIBIDO = :recibido'.
	 */
	public MovilMensaje[] findWhereRecibidoEquals(int recibido) throws MovilMensajeDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the specified arbitrary SQL statement
	 */
	public MovilMensaje[] findByDynamicSelect(String sql, Object[] sqlParams) throws MovilMensajeDaoException;

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the specified arbitrary SQL statement
	 */
	public MovilMensaje[] findByDynamicWhere(String sql, Object[] sqlParams) throws MovilMensajeDaoException;

}