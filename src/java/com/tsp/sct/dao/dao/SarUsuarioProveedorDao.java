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

public interface SarUsuarioProveedorDao
{
	/** 
	 * Inserts a new row in the sar_usuario_proveedor table.
	 */
	public SarUsuarioProveedorPk insert(SarUsuarioProveedor dto) throws SarUsuarioProveedorDaoException;

	/** 
	 * Updates a single row in the sar_usuario_proveedor table.
	 */
	public void update(SarUsuarioProveedorPk pk, SarUsuarioProveedor dto) throws SarUsuarioProveedorDaoException;

	/** 
	 * Deletes a single row in the sar_usuario_proveedor table.
	 */
	public void delete(SarUsuarioProveedorPk pk) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns the rows from the sar_usuario_proveedor table that matches the specified primary-key value.
	 */
	public SarUsuarioProveedor findByPrimaryKey(SarUsuarioProveedorPk pk) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'ID_SAR_USUARIO = :idSarUsuario'.
	 */
	public SarUsuarioProveedor findByPrimaryKey(int idSarUsuario) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria ''.
	 */
	public SarUsuarioProveedor[] findAll() throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'ID_SAR_USUARIO = :idSarUsuario'.
	 */
	public SarUsuarioProveedor[] findWhereIdSarUsuarioEquals(int idSarUsuario) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public SarUsuarioProveedor[] findWhereIdEmpresaEquals(int idEmpresa) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'EXT_SAR_ID_USUARIO = :extSarIdUsuario'.
	 */
	public SarUsuarioProveedor[] findWhereExtSarIdUsuarioEquals(int extSarIdUsuario) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'EXT_SAR_USUARIO = :extSarUsuario'.
	 */
	public SarUsuarioProveedor[] findWhereExtSarUsuarioEquals(String extSarUsuario) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'EXT_SAR_PASS = :extSarPass'.
	 */
	public SarUsuarioProveedor[] findWhereExtSarPassEquals(String extSarPass) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'EXT_SAR_ID_PROVEEDOR = :extSarIdProveedor'.
	 */
	public SarUsuarioProveedor[] findWhereExtSarIdProveedorEquals(int extSarIdProveedor) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'EXT_SAR_RFC_PROVEEDOR = :extSarRfcProveedor'.
	 */
	public SarUsuarioProveedor[] findWhereExtSarRfcProveedorEquals(String extSarRfcProveedor) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public SarUsuarioProveedor[] findWhereIdEstatusEquals(int idEstatus) throws SarUsuarioProveedorDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the specified arbitrary SQL statement
	 */
	public SarUsuarioProveedor[] findByDynamicSelect(String sql, Object[] sqlParams) throws SarUsuarioProveedorDaoException;

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the specified arbitrary SQL statement
	 */
	public SarUsuarioProveedor[] findByDynamicWhere(String sql, Object[] sqlParams) throws SarUsuarioProveedorDaoException;

}