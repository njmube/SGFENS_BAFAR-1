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

public interface CuentaDeTercerosDao
{
	/** 
	 * Inserts a new row in the cuenta_de_terceros table.
	 */
	public CuentaDeTercerosPk insert(CuentaDeTerceros dto) throws CuentaDeTercerosDaoException;

	/** 
	 * Updates a single row in the cuenta_de_terceros table.
	 */
	public void update(CuentaDeTercerosPk pk, CuentaDeTerceros dto) throws CuentaDeTercerosDaoException;

	/** 
	 * Deletes a single row in the cuenta_de_terceros table.
	 */
	public void delete(CuentaDeTercerosPk pk) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns the rows from the cuenta_de_terceros table that matches the specified primary-key value.
	 */
	public CuentaDeTerceros findByPrimaryKey(CuentaDeTercerosPk pk) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'ID_CUENTA_TERCEROS = :idCuentaTerceros'.
	 */
	public CuentaDeTerceros findByPrimaryKey(int idCuentaTerceros) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria ''.
	 */
	public CuentaDeTerceros[] findAll() throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'ID_CUENTA_TERCEROS = :idCuentaTerceros'.
	 */
	public CuentaDeTerceros[] findWhereIdCuentaTercerosEquals(int idCuentaTerceros) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'ID_COMPROBANTE_DESCRIPCION = :idComprobanteDescripcion'.
	 */
	public CuentaDeTerceros[] findWhereIdComprobanteDescripcionEquals(int idComprobanteDescripcion) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'ID_COMPROBANTE_FISCAL = :idComprobanteFiscal'.
	 */
	public CuentaDeTerceros[] findWhereIdComprobanteFiscalEquals(int idComprobanteFiscal) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'RFC = :rfc'.
	 */
	public CuentaDeTerceros[] findWhereRfcEquals(String rfc) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'NOMBRE = :nombre'.
	 */
	public CuentaDeTerceros[] findWhereNombreEquals(String nombre) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'CALLE = :calle'.
	 */
	public CuentaDeTerceros[] findWhereCalleEquals(String calle) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'NUMERO = :numero'.
	 */
	public CuentaDeTerceros[] findWhereNumeroEquals(String numero) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'NUMERO_INTERIOR = :numeroInterior'.
	 */
	public CuentaDeTerceros[] findWhereNumeroInteriorEquals(String numeroInterior) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'COLONIA = :colonia'.
	 */
	public CuentaDeTerceros[] findWhereColoniaEquals(String colonia) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'LOCALIDAD = :localidad'.
	 */
	public CuentaDeTerceros[] findWhereLocalidadEquals(String localidad) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'REFERENCIA = :referencia'.
	 */
	public CuentaDeTerceros[] findWhereReferenciaEquals(String referencia) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'MUNICIPIO = :municipio'.
	 */
	public CuentaDeTerceros[] findWhereMunicipioEquals(String municipio) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'ESTADO = :estado'.
	 */
	public CuentaDeTerceros[] findWhereEstadoEquals(String estado) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'PAIS = :pais'.
	 */
	public CuentaDeTerceros[] findWherePaisEquals(String pais) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'CODIGO_POSTAL = :codigoPostal'.
	 */
	public CuentaDeTerceros[] findWhereCodigoPostalEquals(String codigoPostal) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'CUENTA_PREDIAL = :cuentaPredial'.
	 */
	public CuentaDeTerceros[] findWhereCuentaPredialEquals(String cuentaPredial) throws CuentaDeTercerosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the specified arbitrary SQL statement
	 */
	public CuentaDeTerceros[] findByDynamicSelect(String sql, Object[] sqlParams) throws CuentaDeTercerosDaoException;

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the specified arbitrary SQL statement
	 */
	public CuentaDeTerceros[] findByDynamicWhere(String sql, Object[] sqlParams) throws CuentaDeTercerosDaoException;

}
