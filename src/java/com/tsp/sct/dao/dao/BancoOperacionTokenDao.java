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

public interface BancoOperacionTokenDao
{
	/** 
	 * Inserts a new row in the banco_operacion_token table.
	 */
	public BancoOperacionTokenPk insert(BancoOperacionToken dto) throws BancoOperacionTokenDaoException;

	/** 
	 * Updates a single row in the banco_operacion_token table.
	 */
	public void update(BancoOperacionTokenPk pk, BancoOperacionToken dto) throws BancoOperacionTokenDaoException;

	/** 
	 * Deletes a single row in the banco_operacion_token table.
	 */
	public void delete(BancoOperacionTokenPk pk) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns the rows from the banco_operacion_token table that matches the specified primary-key value.
	 */
	public BancoOperacionToken findByPrimaryKey(BancoOperacionTokenPk pk) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'ID_BANCO_OPERACION = :idBancoOperacion'.
	 */
	public BancoOperacionToken findByPrimaryKey(int idBancoOperacion) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria ''.
	 */
	public BancoOperacionToken[] findAll() throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'ID_BANCO_OPERACION = :idBancoOperacion'.
	 */
	public BancoOperacionToken[] findWhereIdBancoOperacionEquals(int idBancoOperacion) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public BancoOperacionToken[] findWhereIdEmpresaEquals(int idEmpresa) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public BancoOperacionToken[] findWhereIdEstatusEquals(int idEstatus) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'ID_USUARIO = :idUsuario'.
	 */
	public BancoOperacionToken[] findWhereIdUsuarioEquals(int idUsuario) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'NOMBRE_TITULAR = :nombreTitular'.
	 */
	public BancoOperacionToken[] findWhereNombreTitularEquals(String nombreTitular) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'CONCEPTO_DESCRIPCION = :conceptoDescripcion'.
	 */
	public BancoOperacionToken[] findWhereConceptoDescripcionEquals(String conceptoDescripcion) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'MONTO = :monto'.
	 */
	public BancoOperacionToken[] findWhereMontoEquals(double monto) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'TOKEN_GENERADO = :tokenGenerado'.
	 */
	public BancoOperacionToken[] findWhereTokenGeneradoEquals(String tokenGenerado) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'LIGA_GENERADA = :ligaGenerada'.
	 */
	public BancoOperacionToken[] findWhereLigaGeneradaEquals(String ligaGenerada) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'FECHA_GENERACION = :fechaGeneracion'.
	 */
	public BancoOperacionToken[] findWhereFechaGeneracionEquals(Date fechaGeneracion) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'FECHA_USO = :fechaUso'.
	 */
	public BancoOperacionToken[] findWhereFechaUsoEquals(Date fechaUso) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'CORREO_DESTINO_LIGA = :correoDestinoLiga'.
	 */
	public BancoOperacionToken[] findWhereCorreoDestinoLigaEquals(String correoDestinoLiga) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the criteria 'ID_TABLA_BANCO_OPERACION = :idTablaBancoOperacion'.
	 */
	public BancoOperacionToken[] findWhereIdTablaBancoOperacionEquals(int idTablaBancoOperacion) throws BancoOperacionTokenDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the banco_operacion_token table that match the specified arbitrary SQL statement
	 */
	public BancoOperacionToken[] findByDynamicSelect(String sql, Object[] sqlParams) throws BancoOperacionTokenDaoException;

	/** 
	 * Returns all rows from the banco_operacion_token table that match the specified arbitrary SQL statement
	 */
	public BancoOperacionToken[] findByDynamicWhere(String sql, Object[] sqlParams) throws BancoOperacionTokenDaoException;

}
