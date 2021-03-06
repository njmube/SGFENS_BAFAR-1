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
 * This class represents the primary key of the comodato_mantenimiento table.
 */
public class ComodatoMantenimientoPk implements Serializable
{
	protected int idComodatoMantenimiento;

	/** 
	 * This attribute represents whether the primitive attribute idComodatoMantenimiento is null.
	 */
	protected boolean idComodatoMantenimientoNull;

	/** 
	 * Sets the value of idComodatoMantenimiento
	 */
	public void setIdComodatoMantenimiento(int idComodatoMantenimiento)
	{
		this.idComodatoMantenimiento = idComodatoMantenimiento;
	}

	/** 
	 * Gets the value of idComodatoMantenimiento
	 */
	public int getIdComodatoMantenimiento()
	{
		return idComodatoMantenimiento;
	}

	/**
	 * Method 'ComodatoMantenimientoPk'
	 * 
	 */
	public ComodatoMantenimientoPk()
	{
	}

	/**
	 * Method 'ComodatoMantenimientoPk'
	 * 
	 * @param idComodatoMantenimiento
	 */
	public ComodatoMantenimientoPk(final int idComodatoMantenimiento)
	{
		this.idComodatoMantenimiento = idComodatoMantenimiento;
	}

	/** 
	 * Sets the value of idComodatoMantenimientoNull
	 */
	public void setIdComodatoMantenimientoNull(boolean idComodatoMantenimientoNull)
	{
		this.idComodatoMantenimientoNull = idComodatoMantenimientoNull;
	}

	/** 
	 * Gets the value of idComodatoMantenimientoNull
	 */
	public boolean isIdComodatoMantenimientoNull()
	{
		return idComodatoMantenimientoNull;
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
		
		if (!(_other instanceof ComodatoMantenimientoPk)) {
			return false;
		}
		
		final ComodatoMantenimientoPk _cast = (ComodatoMantenimientoPk) _other;
		if (idComodatoMantenimiento != _cast.idComodatoMantenimiento) {
			return false;
		}
		
		if (idComodatoMantenimientoNull != _cast.idComodatoMantenimientoNull) {
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
		_hashCode = 29 * _hashCode + idComodatoMantenimiento;
		_hashCode = 29 * _hashCode + (idComodatoMantenimientoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.ComodatoMantenimientoPk: " );
		ret.append( "idComodatoMantenimiento=" + idComodatoMantenimiento );
		return ret.toString();
	}

}
