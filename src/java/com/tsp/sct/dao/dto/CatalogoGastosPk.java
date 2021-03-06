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
 * This class represents the primary key of the catalogo_gastos table.
 */
public class CatalogoGastosPk implements Serializable
{
	protected int idGastos;

	/** 
	 * This attribute represents whether the primitive attribute idGastos is null.
	 */
	protected boolean idGastosNull;

	/** 
	 * Sets the value of idGastos
	 */
	public void setIdGastos(int idGastos)
	{
		this.idGastos = idGastos;
	}

	/** 
	 * Gets the value of idGastos
	 */
	public int getIdGastos()
	{
		return idGastos;
	}

	/**
	 * Method 'CatalogoGastosPk'
	 * 
	 */
	public CatalogoGastosPk()
	{
	}

	/**
	 * Method 'CatalogoGastosPk'
	 * 
	 * @param idGastos
	 */
	public CatalogoGastosPk(final int idGastos)
	{
		this.idGastos = idGastos;
	}

	/** 
	 * Sets the value of idGastosNull
	 */
	public void setIdGastosNull(boolean idGastosNull)
	{
		this.idGastosNull = idGastosNull;
	}

	/** 
	 * Gets the value of idGastosNull
	 */
	public boolean isIdGastosNull()
	{
		return idGastosNull;
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
		
		if (!(_other instanceof CatalogoGastosPk)) {
			return false;
		}
		
		final CatalogoGastosPk _cast = (CatalogoGastosPk) _other;
		if (idGastos != _cast.idGastos) {
			return false;
		}
		
		if (idGastosNull != _cast.idGastosNull) {
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
		_hashCode = 29 * _hashCode + idGastos;
		_hashCode = 29 * _hashCode + (idGastosNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CatalogoGastosPk: " );
		ret.append( "idGastos=" + idGastos );
		return ret.toString();
	}

}
