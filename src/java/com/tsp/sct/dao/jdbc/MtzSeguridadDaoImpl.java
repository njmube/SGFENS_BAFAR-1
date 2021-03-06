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

public class MtzSeguridadDaoImpl extends AbstractDAO implements MtzSeguridadDao
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
	protected final String SQL_SELECT = "SELECT ID_MTZ_SEGURIDAD, ID_ROLES, ID_PERMISOS, ID_APLICATIVO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_MTZ_SEGURIDAD, ID_ROLES, ID_PERMISOS, ID_APLICATIVO ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_MTZ_SEGURIDAD = ?, ID_ROLES = ?, ID_PERMISOS = ?, ID_APLICATIVO = ? WHERE ID_MTZ_SEGURIDAD = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_MTZ_SEGURIDAD = ?";

	/** 
	 * Index of column ID_MTZ_SEGURIDAD
	 */
	protected static final int COLUMN_ID_MTZ_SEGURIDAD = 1;

	/** 
	 * Index of column ID_ROLES
	 */
	protected static final int COLUMN_ID_ROLES = 2;

	/** 
	 * Index of column ID_PERMISOS
	 */
	protected static final int COLUMN_ID_PERMISOS = 3;

	/** 
	 * Index of column ID_APLICATIVO
	 */
	protected static final int COLUMN_ID_APLICATIVO = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column ID_MTZ_SEGURIDAD
	 */
	protected static final int PK_COLUMN_ID_MTZ_SEGURIDAD = 1;

	/** 
	 * Inserts a new row in the mtz_seguridad table.
	 */
	public MtzSeguridadPk insert(MtzSeguridad dto) throws MtzSeguridadDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getIdMtzSeguridad() );
			if (dto.isIdRolesNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdRoles() );
			}
		
			if (dto.isIdPermisosNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdPermisos() );
			}
		
			if (dto.isIdAplicativoNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdAplicativo() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MtzSeguridadDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the mtz_seguridad table.
	 */
	public void update(MtzSeguridadPk pk, MtzSeguridad dto) throws MtzSeguridadDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getIdMtzSeguridad() );
			if (dto.isIdRolesNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdRoles() );
			}
		
			if (dto.isIdPermisosNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdPermisos() );
			}
		
			if (dto.isIdAplicativoNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdAplicativo() );
			}
		
			stmt.setInt( 5, pk.getIdMtzSeguridad() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MtzSeguridadDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the mtz_seguridad table.
	 */
	public void delete(MtzSeguridadPk pk) throws MtzSeguridadDaoException
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
			stmt.setInt( 1, pk.getIdMtzSeguridad() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MtzSeguridadDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the mtz_seguridad table that matches the specified primary-key value.
	 */
	public MtzSeguridad findByPrimaryKey(MtzSeguridadPk pk) throws MtzSeguridadDaoException
	{
		return findByPrimaryKey( pk.getIdMtzSeguridad() );
	}

	/** 
	 * Returns all rows from the mtz_seguridad table that match the criteria 'ID_MTZ_SEGURIDAD = :idMtzSeguridad'.
	 */
	public MtzSeguridad findByPrimaryKey(int idMtzSeguridad) throws MtzSeguridadDaoException
	{
		MtzSeguridad ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_MTZ_SEGURIDAD = ?", new Object[] {  new Integer(idMtzSeguridad) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the mtz_seguridad table that match the criteria ''.
	 */
	public MtzSeguridad[] findAll() throws MtzSeguridadDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_MTZ_SEGURIDAD", null );
	}

	/** 
	 * Returns all rows from the mtz_seguridad table that match the criteria 'ID_MTZ_SEGURIDAD = :idMtzSeguridad'.
	 */
	public MtzSeguridad[] findWhereIdMtzSeguridadEquals(int idMtzSeguridad) throws MtzSeguridadDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_MTZ_SEGURIDAD = ? ORDER BY ID_MTZ_SEGURIDAD", new Object[] {  new Integer(idMtzSeguridad) } );
	}

	/** 
	 * Returns all rows from the mtz_seguridad table that match the criteria 'ID_ROLES = :idRoles'.
	 */
	public MtzSeguridad[] findWhereIdRolesEquals(int idRoles) throws MtzSeguridadDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ROLES = ? ORDER BY ID_ROLES", new Object[] {  new Integer(idRoles) } );
	}

	/** 
	 * Returns all rows from the mtz_seguridad table that match the criteria 'ID_PERMISOS = :idPermisos'.
	 */
	public MtzSeguridad[] findWhereIdPermisosEquals(int idPermisos) throws MtzSeguridadDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PERMISOS = ? ORDER BY ID_PERMISOS", new Object[] {  new Integer(idPermisos) } );
	}

	/** 
	 * Returns all rows from the mtz_seguridad table that match the criteria 'ID_APLICATIVO = :idAplicativo'.
	 */
	public MtzSeguridad[] findWhereIdAplicativoEquals(int idAplicativo) throws MtzSeguridadDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_APLICATIVO = ? ORDER BY ID_APLICATIVO", new Object[] {  new Integer(idAplicativo) } );
	}

	/**
	 * Method 'MtzSeguridadDaoImpl'
	 * 
	 */
	public MtzSeguridadDaoImpl()
	{
	}

	/**
	 * Method 'MtzSeguridadDaoImpl'
	 * 
	 * @param userConn
	 */
	public MtzSeguridadDaoImpl(final java.sql.Connection userConn)
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
		return "MTZ_SEGURIDAD";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected MtzSeguridad fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			MtzSeguridad dto = new MtzSeguridad();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected MtzSeguridad[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			MtzSeguridad dto = new MtzSeguridad();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		MtzSeguridad ret[] = new MtzSeguridad[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(MtzSeguridad dto, ResultSet rs) throws SQLException
	{
		dto.setIdMtzSeguridad( rs.getInt( COLUMN_ID_MTZ_SEGURIDAD ) );
		dto.setIdRoles( rs.getInt( COLUMN_ID_ROLES ) );
		if (rs.wasNull()) {
			dto.setIdRolesNull( true );
		}
		
		dto.setIdPermisos( rs.getInt( COLUMN_ID_PERMISOS ) );
		if (rs.wasNull()) {
			dto.setIdPermisosNull( true );
		}
		
		dto.setIdAplicativo( rs.getInt( COLUMN_ID_APLICATIVO ) );
		if (rs.wasNull()) {
			dto.setIdAplicativoNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(MtzSeguridad dto)
	{
	}

	/** 
	 * Returns all rows from the mtz_seguridad table that match the specified arbitrary SQL statement
	 */
	public MtzSeguridad[] findByDynamicSelect(String sql, Object[] sqlParams) throws MtzSeguridadDaoException
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
			throw new MtzSeguridadDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the mtz_seguridad table that match the specified arbitrary SQL statement
	 */
	public MtzSeguridad[] findByDynamicWhere(String sql, Object[] sqlParams) throws MtzSeguridadDaoException
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
			throw new MtzSeguridadDaoException( "Exception: " + _e.getMessage(), _e );
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
