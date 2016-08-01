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

public class ServicioDaoImpl extends AbstractDAO implements ServicioDao
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
	protected final String SQL_SELECT = "SELECT ID_SERVICIO, ID_EMPRESA, ID_ESTATUS, NOMBRE, DESCRIPCION, UNIDAD, PRECIO, SKU FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_SERVICIO, ID_EMPRESA, ID_ESTATUS, NOMBRE, DESCRIPCION, UNIDAD, PRECIO, SKU ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_SERVICIO = ?, ID_EMPRESA = ?, ID_ESTATUS = ?, NOMBRE = ?, DESCRIPCION = ?, UNIDAD = ?, PRECIO = ?, SKU = ? WHERE ID_SERVICIO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_SERVICIO = ?";

	/** 
	 * Index of column ID_SERVICIO
	 */
	protected static final int COLUMN_ID_SERVICIO = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 3;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 4;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 5;

	/** 
	 * Index of column UNIDAD
	 */
	protected static final int COLUMN_UNIDAD = 6;

	/** 
	 * Index of column PRECIO
	 */
	protected static final int COLUMN_PRECIO = 7;

	/** 
	 * Index of column SKU
	 */
	protected static final int COLUMN_SKU = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Index of primary-key column ID_SERVICIO
	 */
	protected static final int PK_COLUMN_ID_SERVICIO = 1;

	/** 
	 * Inserts a new row in the SERVICIO table.
	 */
	public ServicioPk insert(Servicio dto) throws ServicioDaoException
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
			if (dto.isIdServicioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_SERVICIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPRESA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ESTATUS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DESCRIPCION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isUnidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "UNIDAD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPrecioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "PRECIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isSkuModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "SKU" );
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
			if (dto.isIdServicioModified()) {
				stmt.setInt( index++, dto.getIdServicio() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isUnidadModified()) {
				stmt.setString( index++, dto.getUnidad() );
			}
		
			if (dto.isPrecioModified()) {
				if (dto.isPrecioNull()) {
					stmt.setNull( index++, java.sql.Types.FLOAT );
				} else {
					stmt.setFloat( index++, dto.getPrecio() );
				}
		
			}
		
			if (dto.isSkuModified()) {
				stmt.setString( index++, dto.getSku() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdServicio( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ServicioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the SERVICIO table.
	 */
	public void update(ServicioPk pk, Servicio dto) throws ServicioDaoException
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
			if (dto.isIdServicioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_SERVICIO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DESCRIPCION=?" );
				modified=true;
			}
		
			if (dto.isUnidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "UNIDAD=?" );
				modified=true;
			}
		
			if (dto.isPrecioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PRECIO=?" );
				modified=true;
			}
		
			if (dto.isSkuModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "SKU=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_SERVICIO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdServicioModified()) {
				stmt.setInt( index++, dto.getIdServicio() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isUnidadModified()) {
				stmt.setString( index++, dto.getUnidad() );
			}
		
			if (dto.isPrecioModified()) {
				if (dto.isPrecioNull()) {
					stmt.setNull( index++, java.sql.Types.FLOAT );
				} else {
					stmt.setFloat( index++, dto.getPrecio() );
				}
		
			}
		
			if (dto.isSkuModified()) {
				stmt.setString( index++, dto.getSku() );
			}
		
			stmt.setInt( index++, pk.getIdServicio() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ServicioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the SERVICIO table.
	 */
	public void delete(ServicioPk pk) throws ServicioDaoException
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
			stmt.setInt( 1, pk.getIdServicio() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ServicioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the SERVICIO table that matches the specified primary-key value.
	 */
	public Servicio findByPrimaryKey(ServicioPk pk) throws ServicioDaoException
	{
		return findByPrimaryKey( pk.getIdServicio() );
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the criteria 'ID_SERVICIO = :idServicio'.
	 */
	public Servicio findByPrimaryKey(int idServicio) throws ServicioDaoException
	{
		Servicio ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_SERVICIO = ?", new Object[] {  new Integer(idServicio) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the criteria ''.
	 */
	public Servicio[] findAll() throws ServicioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_SERVICIO", null );
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the criteria 'ID_SERVICIO = :idServicio'.
	 */
	public Servicio[] findWhereIdServicioEquals(int idServicio) throws ServicioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_SERVICIO = ? ORDER BY ID_SERVICIO", new Object[] {  new Integer(idServicio) } );
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Servicio[] findWhereIdEmpresaEquals(int idEmpresa) throws ServicioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Servicio[] findWhereIdEstatusEquals(int idEstatus) throws ServicioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Servicio[] findWhereNombreEquals(String nombre) throws ServicioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Servicio[] findWhereDescripcionEquals(String descripcion) throws ServicioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the criteria 'UNIDAD = :unidad'.
	 */
	public Servicio[] findWhereUnidadEquals(String unidad) throws ServicioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE UNIDAD = ? ORDER BY UNIDAD", new Object[] { unidad } );
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the criteria 'PRECIO = :precio'.
	 */
	public Servicio[] findWherePrecioEquals(float precio) throws ServicioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRECIO = ? ORDER BY PRECIO", new Object[] {  new Float(precio) } );
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the criteria 'SKU = :sku'.
	 */
	public Servicio[] findWhereSkuEquals(String sku) throws ServicioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SKU = ? ORDER BY SKU", new Object[] { sku } );
	}

	/**
	 * Method 'ServicioDaoImpl'
	 * 
	 */
	public ServicioDaoImpl()
	{
	}

	/**
	 * Method 'ServicioDaoImpl'
	 * 
	 * @param userConn
	 */
	public ServicioDaoImpl(final java.sql.Connection userConn)
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
		return "SERVICIO";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Servicio fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Servicio dto = new Servicio();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Servicio[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Servicio dto = new Servicio();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Servicio ret[] = new Servicio[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Servicio dto, ResultSet rs) throws SQLException
	{
		dto.setIdServicio( rs.getInt( COLUMN_ID_SERVICIO ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setUnidad( rs.getString( COLUMN_UNIDAD ) );
		dto.setPrecio( rs.getFloat( COLUMN_PRECIO ) );
		if (rs.wasNull()) {
			dto.setPrecioNull( true );
		}
		
		dto.setSku( rs.getString( COLUMN_SKU ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Servicio dto)
	{
		dto.setIdServicioModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdEstatusModified( false );
		dto.setNombreModified( false );
		dto.setDescripcionModified( false );
		dto.setUnidadModified( false );
		dto.setPrecioModified( false );
		dto.setSkuModified( false );
	}

	/** 
	 * Returns all rows from the SERVICIO table that match the specified arbitrary SQL statement
	 */
	public Servicio[] findByDynamicSelect(String sql, Object[] sqlParams) throws ServicioDaoException
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
			throw new ServicioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the SERVICIO table that match the specified arbitrary SQL statement
	 */
	public Servicio[] findByDynamicWhere(String sql, Object[] sqlParams) throws ServicioDaoException
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
			throw new ServicioDaoException( "Exception: " + _e.getMessage(), _e );
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