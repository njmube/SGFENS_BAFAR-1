/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface NominaPeriodicidadPagoDao
{
	/** 
	 * Inserts a new row in the nomina_periodicidad_pago table.
	 */
	public NominaPeriodicidadPagoPk insert(NominaPeriodicidadPago dto) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Updates a single row in the nomina_periodicidad_pago table.
	 */
	public void update(NominaPeriodicidadPagoPk pk, NominaPeriodicidadPago dto) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Deletes a single row in the nomina_periodicidad_pago table.
	 */
	public void delete(NominaPeriodicidadPagoPk pk) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Returns the rows from the nomina_periodicidad_pago table that matches the specified primary-key value.
	 */
	public NominaPeriodicidadPago findByPrimaryKey(NominaPeriodicidadPagoPk pk) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Returns all rows from the nomina_periodicidad_pago table that match the criteria 'ID_PERIODICIDAD_PAGO = :idPeriodicidadPago'.
	 */
	public NominaPeriodicidadPago findByPrimaryKey(int idPeriodicidadPago) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Returns all rows from the nomina_periodicidad_pago table that match the criteria ''.
	 */
	public NominaPeriodicidadPago[] findAll() throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Returns all rows from the nomina_periodicidad_pago table that match the criteria 'ID_PERIODICIDAD_PAGO = :idPeriodicidadPago'.
	 */
	public NominaPeriodicidadPago[] findWhereIdPeriodicidadPagoEquals(int idPeriodicidadPago) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Returns all rows from the nomina_periodicidad_pago table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public NominaPeriodicidadPago[] findWhereIdEmpresaEquals(int idEmpresa) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Returns all rows from the nomina_periodicidad_pago table that match the criteria 'NOMBRE = :nombre'.
	 */
	public NominaPeriodicidadPago[] findWhereNombreEquals(String nombre) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Returns all rows from the nomina_periodicidad_pago table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public NominaPeriodicidadPago[] findWhereDescripcionEquals(String descripcion) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Returns all rows from the nomina_periodicidad_pago table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public NominaPeriodicidadPago[] findWhereIdEstatusEquals(int idEstatus) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the nomina_periodicidad_pago table that match the specified arbitrary SQL statement
	 */
	public NominaPeriodicidadPago[] findByDynamicSelect(String sql, Object[] sqlParams) throws NominaPeriodicidadPagoDaoException;

	/** 
	 * Returns all rows from the nomina_periodicidad_pago table that match the specified arbitrary SQL statement
	 */
	public NominaPeriodicidadPago[] findByDynamicWhere(String sql, Object[] sqlParams) throws NominaPeriodicidadPagoDaoException;

}
