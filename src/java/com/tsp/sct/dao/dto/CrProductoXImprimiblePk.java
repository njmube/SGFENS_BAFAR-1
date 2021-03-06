/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the cr_producto_x_imprimible table.
 */
public class CrProductoXImprimiblePk implements Serializable
{
	protected int idProductoXImprimible;

	/** 
	 * This attribute represents whether the primitive attribute idProductoXImprimible is null.
	 */
	protected boolean idProductoXImprimibleNull;

	/** 
	 * Sets the value of idProductoXImprimible
	 */
	public void setIdProductoXImprimible(int idProductoXImprimible)
	{
		this.idProductoXImprimible = idProductoXImprimible;
	}

	/** 
	 * Gets the value of idProductoXImprimible
	 */
	public int getIdProductoXImprimible()
	{
		return idProductoXImprimible;
	}

	/**
	 * Method 'CrProductoXImprimiblePk'
	 * 
	 */
	public CrProductoXImprimiblePk()
	{
	}

	/**
	 * Method 'CrProductoXImprimiblePk'
	 * 
	 * @param idProductoXImprimible
	 */
	public CrProductoXImprimiblePk(final int idProductoXImprimible)
	{
		this.idProductoXImprimible = idProductoXImprimible;
	}

	/** 
	 * Sets the value of idProductoXImprimibleNull
	 */
	public void setIdProductoXImprimibleNull(boolean idProductoXImprimibleNull)
	{
		this.idProductoXImprimibleNull = idProductoXImprimibleNull;
	}

	/** 
	 * Gets the value of idProductoXImprimibleNull
	 */
	public boolean isIdProductoXImprimibleNull()
	{
		return idProductoXImprimibleNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof CrProductoXImprimiblePk)) {
			return false;
		}
		
		final CrProductoXImprimiblePk _cast = (CrProductoXImprimiblePk) _other;
		if (idProductoXImprimible != _cast.idProductoXImprimible) {
			return false;
		}
		
		if (idProductoXImprimibleNull != _cast.idProductoXImprimibleNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idProductoXImprimible;
		_hashCode = 29 * _hashCode + (idProductoXImprimibleNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.CrProductoXImprimiblePk: " );
		ret.append( "idProductoXImprimible=" + idProductoXImprimible );
		return ret.toString();
	}

}
