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

public interface CrProductoXImprimibleDao
{
	/** 
	 * Inserts a new row in the cr_producto_x_imprimible table.
	 */
	public CrProductoXImprimiblePk insert(CrProductoXImprimible dto) throws CrProductoXImprimibleDaoException;

	/** 
	 * Updates a single row in the cr_producto_x_imprimible table.
	 */
	public void update(CrProductoXImprimiblePk pk, CrProductoXImprimible dto) throws CrProductoXImprimibleDaoException;

	/** 
	 * Deletes a single row in the cr_producto_x_imprimible table.
	 */
	public void delete(CrProductoXImprimiblePk pk) throws CrProductoXImprimibleDaoException;

	/** 
	 * Returns the rows from the cr_producto_x_imprimible table that matches the specified primary-key value.
	 */
	public CrProductoXImprimible findByPrimaryKey(CrProductoXImprimiblePk pk) throws CrProductoXImprimibleDaoException;

	/** 
	 * Returns all rows from the cr_producto_x_imprimible table that match the criteria 'id_producto_x_imprimible = :idProductoXImprimible'.
	 */
	public CrProductoXImprimible findByPrimaryKey(int idProductoXImprimible) throws CrProductoXImprimibleDaoException;

	/** 
	 * Returns all rows from the cr_producto_x_imprimible table that match the criteria ''.
	 */
	public CrProductoXImprimible[] findAll() throws CrProductoXImprimibleDaoException;

	/** 
	 * Returns all rows from the cr_producto_x_imprimible table that match the criteria 'id_producto_x_imprimible = :idProductoXImprimible'.
	 */
	public CrProductoXImprimible[] findWhereIdProductoXImprimibleEquals(int idProductoXImprimible) throws CrProductoXImprimibleDaoException;

	/** 
	 * Returns all rows from the cr_producto_x_imprimible table that match the criteria 'id_doc_imprimible = :idDocImprimible'.
	 */
	public CrProductoXImprimible[] findWhereIdDocImprimibleEquals(int idDocImprimible) throws CrProductoXImprimibleDaoException;

	/** 
	 * Returns all rows from the cr_producto_x_imprimible table that match the criteria 'id_producto_credito = :idProductoCredito'.
	 */
	public CrProductoXImprimible[] findWhereIdProductoCreditoEquals(int idProductoCredito) throws CrProductoXImprimibleDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cr_producto_x_imprimible table that match the specified arbitrary SQL statement
	 */
	public CrProductoXImprimible[] findByDynamicSelect(String sql, Object[] sqlParams) throws CrProductoXImprimibleDaoException;

	/** 
	 * Returns all rows from the cr_producto_x_imprimible table that match the specified arbitrary SQL statement
	 */
	public CrProductoXImprimible[] findByDynamicWhere(String sql, Object[] sqlParams) throws CrProductoXImprimibleDaoException;

}