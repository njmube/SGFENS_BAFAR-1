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

public interface FoliosFensDao
{
	/** 
	 * Inserts a new row in the folios_fens table.
	 */
	public FoliosFensPk insert(FoliosFens dto) throws FoliosFensDaoException;

	/** 
	 * Updates a single row in the folios_fens table.
	 */
	public void update(FoliosFensPk pk, FoliosFens dto) throws FoliosFensDaoException;

	/** 
	 * Deletes a single row in the folios_fens table.
	 */
	public void delete(FoliosFensPk pk) throws FoliosFensDaoException;

	/** 
	 * Returns the rows from the folios_fens table that matches the specified primary-key value.
	 */
	public FoliosFens findByPrimaryKey(FoliosFensPk pk) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'ID_FOLIOS_FENS = :idFoliosFens'.
	 */
	public FoliosFens findByPrimaryKey(int idFoliosFens) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria ''.
	 */
	public FoliosFens[] findAll() throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'ID_FOLIOS_FENS = :idFoliosFens'.
	 */
	public FoliosFens[] findWhereIdFoliosFensEquals(int idFoliosFens) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'ID_TIPO_FOLIO_FENS = :idTipoFolioFens'.
	 */
	public FoliosFens[] findWhereIdTipoFolioFensEquals(int idTipoFolioFens) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public FoliosFens[] findWhereIdEmpresaEquals(int idEmpresa) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'USER_NAME = :userName'.
	 */
	public FoliosFens[] findWhereUserNameEquals(String userName) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'CLAVE = :clave'.
	 */
	public FoliosFens[] findWhereClaveEquals(String clave) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'FOLIOS_DISPONIBLES = :foliosDisponibles'.
	 */
	public FoliosFens[] findWhereFoliosDisponiblesEquals(int foliosDisponibles) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'FECHA_ALTA = :fechaAlta'.
	 */
	public FoliosFens[] findWhereFechaAltaEquals(Date fechaAlta) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'FECHA_VIGENCIA = :fechaVigencia'.
	 */
	public FoliosFens[] findWhereFechaVigenciaEquals(Date fechaVigencia) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'ACTIVO = :activo'.
	 */
	public FoliosFens[] findWhereActivoEquals(short activo) throws FoliosFensDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the folios_fens table that match the specified arbitrary SQL statement
	 */
	public FoliosFens[] findByDynamicSelect(String sql, Object[] sqlParams) throws FoliosFensDaoException;

	/** 
	 * Returns all rows from the folios_fens table that match the specified arbitrary SQL statement
	 */
	public FoliosFens[] findByDynamicWhere(String sql, Object[] sqlParams) throws FoliosFensDaoException;

}