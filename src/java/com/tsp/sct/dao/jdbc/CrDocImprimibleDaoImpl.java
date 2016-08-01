/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.jdbc;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import java.util.Date;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class CrDocImprimibleDaoImpl extends AbstractDAO implements CrDocImprimibleDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT id_doc_imprimible, nombre, descripcion, fecha_hr_creacion, fecha_hr_ultima_edicion, id_usuario_edicion, tipo_imprimible, nombre_archivo_jasper, id_empresa, id_estatus FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_doc_imprimible, nombre, descripcion, fecha_hr_creacion, fecha_hr_ultima_edicion, id_usuario_edicion, tipo_imprimible, nombre_archivo_jasper, id_empresa, id_estatus ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_doc_imprimible = ?, nombre = ?, descripcion = ?, fecha_hr_creacion = ?, fecha_hr_ultima_edicion = ?, id_usuario_edicion = ?, tipo_imprimible = ?, nombre_archivo_jasper = ?, id_empresa = ?, id_estatus = ? WHERE id_doc_imprimible = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_doc_imprimible = ?";

	/** 
	 * Index of column id_doc_imprimible
	 */
	protected static final int COLUMN_ID_DOC_IMPRIMIBLE = 1;

	/** 
	 * Index of column nombre
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column descripcion
	 */
	protected static final int COLUMN_DESCRIPCION = 3;

	/** 
	 * Index of column fecha_hr_creacion
	 */
	protected static final int COLUMN_FECHA_HR_CREACION = 4;

	/** 
	 * Index of column fecha_hr_ultima_edicion
	 */
	protected static final int COLUMN_FECHA_HR_ULTIMA_EDICION = 5;

	/** 
	 * Index of column id_usuario_edicion
	 */
	protected static final int COLUMN_ID_USUARIO_EDICION = 6;

	/** 
	 * Index of column tipo_imprimible
	 */
	protected static final int COLUMN_TIPO_IMPRIMIBLE = 7;

	/** 
	 * Index of column nombre_archivo_jasper
	 */
	protected static final int COLUMN_NOMBRE_ARCHIVO_JASPER = 8;

	/** 
	 * Index of column id_empresa
	 */
	protected static final int COLUMN_ID_EMPRESA = 9;

	/** 
	 * Index of column id_estatus
	 */
	protected static final int COLUMN_ID_ESTATUS = 10;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 10;

	/** 
	 * Index of primary-key column id_doc_imprimible
	 */
	protected static final int PK_COLUMN_ID_DOC_IMPRIMIBLE = 1;

	/** 
	 * Inserts a new row in the cr_doc_imprimible table.
	 */
	public CrDocImprimiblePk insert(CrDocImprimible dto) throws CrDocImprimibleDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdDocImprimibleModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_doc_imprimible" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "nombre" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "descripcion" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaHrCreacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "fecha_hr_creacion" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaHrUltimaEdicionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "fecha_hr_ultima_edicion" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdUsuarioEdicionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_usuario_edicion" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTipoImprimibleModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "tipo_imprimible" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreArchivoJasperModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "nombre_archivo_jasper" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_empresa" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_estatus" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdDocImprimibleModified()) {
				stmt.setInt( index++, dto.getIdDocImprimible() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isFechaHrCreacionModified()) {
				stmt.setTimestamp(index++, dto.getFechaHrCreacion()==null ? null : new java.sql.Timestamp( dto.getFechaHrCreacion().getTime() ) );
			}
		
			if (dto.isFechaHrUltimaEdicionModified()) {
				stmt.setTimestamp(index++, dto.getFechaHrUltimaEdicion()==null ? null : new java.sql.Timestamp( dto.getFechaHrUltimaEdicion().getTime() ) );
			}
		
			if (dto.isIdUsuarioEdicionModified()) {
				stmt.setInt( index++, dto.getIdUsuarioEdicion() );
			}
		
			if (dto.isTipoImprimibleModified()) {
				stmt.setString( index++, dto.getTipoImprimible() );
			}
		
			if (dto.isNombreArchivoJasperModified()) {
				stmt.setString( index++, dto.getNombreArchivoJasper() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdDocImprimible( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrDocImprimibleDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the cr_doc_imprimible table.
	 */
	public void update(CrDocImprimiblePk pk, CrDocImprimible dto) throws CrDocImprimibleDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdDocImprimibleModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_doc_imprimible=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "nombre=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "descripcion=?" );
				modified=true;
			}
		
			if (dto.isFechaHrCreacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "fecha_hr_creacion=?" );
				modified=true;
			}
		
			if (dto.isFechaHrUltimaEdicionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "fecha_hr_ultima_edicion=?" );
				modified=true;
			}
		
			if (dto.isIdUsuarioEdicionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_usuario_edicion=?" );
				modified=true;
			}
		
			if (dto.isTipoImprimibleModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "tipo_imprimible=?" );
				modified=true;
			}
		
			if (dto.isNombreArchivoJasperModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "nombre_archivo_jasper=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_empresa=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_estatus=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id_doc_imprimible=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdDocImprimibleModified()) {
				stmt.setInt( index++, dto.getIdDocImprimible() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isFechaHrCreacionModified()) {
				stmt.setTimestamp(index++, dto.getFechaHrCreacion()==null ? null : new java.sql.Timestamp( dto.getFechaHrCreacion().getTime() ) );
			}
		
			if (dto.isFechaHrUltimaEdicionModified()) {
				stmt.setTimestamp(index++, dto.getFechaHrUltimaEdicion()==null ? null : new java.sql.Timestamp( dto.getFechaHrUltimaEdicion().getTime() ) );
			}
		
			if (dto.isIdUsuarioEdicionModified()) {
				stmt.setInt( index++, dto.getIdUsuarioEdicion() );
			}
		
			if (dto.isTipoImprimibleModified()) {
				stmt.setString( index++, dto.getTipoImprimible() );
			}
		
			if (dto.isNombreArchivoJasperModified()) {
				stmt.setString( index++, dto.getNombreArchivoJasper() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			stmt.setInt( index++, pk.getIdDocImprimible() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrDocImprimibleDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the cr_doc_imprimible table.
	 */
	public void delete(CrDocImprimiblePk pk) throws CrDocImprimibleDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdDocImprimible() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrDocImprimibleDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the cr_doc_imprimible table that matches the specified primary-key value.
	 */
	public CrDocImprimible findByPrimaryKey(CrDocImprimiblePk pk) throws CrDocImprimibleDaoException
	{
		return findByPrimaryKey( pk.getIdDocImprimible() );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'id_doc_imprimible = :idDocImprimible'.
	 */
	public CrDocImprimible findByPrimaryKey(int idDocImprimible) throws CrDocImprimibleDaoException
	{
		CrDocImprimible ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_doc_imprimible = ?", new Object[] {  new Integer(idDocImprimible) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria ''.
	 */
	public CrDocImprimible[] findAll() throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_doc_imprimible", null );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'id_doc_imprimible = :idDocImprimible'.
	 */
	public CrDocImprimible[] findWhereIdDocImprimibleEquals(int idDocImprimible) throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_doc_imprimible = ? ORDER BY id_doc_imprimible", new Object[] {  new Integer(idDocImprimible) } );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'nombre = :nombre'.
	 */
	public CrDocImprimible[] findWhereNombreEquals(String nombre) throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre = ? ORDER BY nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'descripcion = :descripcion'.
	 */
	public CrDocImprimible[] findWhereDescripcionEquals(String descripcion) throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion = ? ORDER BY descripcion", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'fecha_hr_creacion = :fechaHrCreacion'.
	 */
	public CrDocImprimible[] findWhereFechaHrCreacionEquals(Date fechaHrCreacion) throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fecha_hr_creacion = ? ORDER BY fecha_hr_creacion", new Object[] { fechaHrCreacion==null ? null : new java.sql.Timestamp( fechaHrCreacion.getTime() ) } );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'fecha_hr_ultima_edicion = :fechaHrUltimaEdicion'.
	 */
	public CrDocImprimible[] findWhereFechaHrUltimaEdicionEquals(Date fechaHrUltimaEdicion) throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fecha_hr_ultima_edicion = ? ORDER BY fecha_hr_ultima_edicion", new Object[] { fechaHrUltimaEdicion==null ? null : new java.sql.Timestamp( fechaHrUltimaEdicion.getTime() ) } );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'id_usuario_edicion = :idUsuarioEdicion'.
	 */
	public CrDocImprimible[] findWhereIdUsuarioEdicionEquals(int idUsuarioEdicion) throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_usuario_edicion = ? ORDER BY id_usuario_edicion", new Object[] {  new Integer(idUsuarioEdicion) } );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'tipo_imprimible = :tipoImprimible'.
	 */
	public CrDocImprimible[] findWhereTipoImprimibleEquals(String tipoImprimible) throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tipo_imprimible = ? ORDER BY tipo_imprimible", new Object[] { tipoImprimible } );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'nombre_archivo_jasper = :nombreArchivoJasper'.
	 */
	public CrDocImprimible[] findWhereNombreArchivoJasperEquals(String nombreArchivoJasper) throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre_archivo_jasper = ? ORDER BY nombre_archivo_jasper", new Object[] { nombreArchivoJasper } );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public CrDocImprimible[] findWhereIdEmpresaEquals(int idEmpresa) throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_empresa = ? ORDER BY id_empresa", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public CrDocImprimible[] findWhereIdEstatusEquals(int idEstatus) throws CrDocImprimibleDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_estatus = ? ORDER BY id_estatus", new Object[] {  new Integer(idEstatus) } );
	}

	/**
	 * Method 'CrDocImprimibleDaoImpl'
	 * 
	 */
	public CrDocImprimibleDaoImpl()
	{
	}

	/**
	 * Method 'CrDocImprimibleDaoImpl'
	 * 
	 * @param userConn
	 */
	public CrDocImprimibleDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "cr_doc_imprimible";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected CrDocImprimible fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			CrDocImprimible dto = new CrDocImprimible();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected CrDocImprimible[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			CrDocImprimible dto = new CrDocImprimible();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		CrDocImprimible ret[] = new CrDocImprimible[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(CrDocImprimible dto, ResultSet rs) throws SQLException
	{
		dto.setIdDocImprimible( rs.getInt( COLUMN_ID_DOC_IMPRIMIBLE ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setFechaHrCreacion( rs.getTimestamp(COLUMN_FECHA_HR_CREACION ) );
		dto.setFechaHrUltimaEdicion( rs.getTimestamp(COLUMN_FECHA_HR_ULTIMA_EDICION ) );
		dto.setIdUsuarioEdicion( rs.getInt( COLUMN_ID_USUARIO_EDICION ) );
		dto.setTipoImprimible( rs.getString( COLUMN_TIPO_IMPRIMIBLE ) );
		dto.setNombreArchivoJasper( rs.getString( COLUMN_NOMBRE_ARCHIVO_JASPER ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(CrDocImprimible dto)
	{
		dto.setIdDocImprimibleModified( false );
		dto.setNombreModified( false );
		dto.setDescripcionModified( false );
		dto.setFechaHrCreacionModified( false );
		dto.setFechaHrUltimaEdicionModified( false );
		dto.setIdUsuarioEdicionModified( false );
		dto.setTipoImprimibleModified( false );
		dto.setNombreArchivoJasperModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdEstatusModified( false );
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the specified arbitrary SQL statement
	 */
	public CrDocImprimible[] findByDynamicSelect(String sql, Object[] sqlParams) throws CrDocImprimibleDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrDocImprimibleDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the cr_doc_imprimible table that match the specified arbitrary SQL statement
	 */
	public CrDocImprimible[] findByDynamicWhere(String sql, Object[] sqlParams) throws CrDocImprimibleDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrDocImprimibleDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}