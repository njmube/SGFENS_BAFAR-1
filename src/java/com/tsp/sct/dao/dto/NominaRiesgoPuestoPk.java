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
 * This class represents the primary key of the nomina_riesgo_puesto table.
 */
public class NominaRiesgoPuestoPk implements Serializable
{
	protected int idRiesgoPuesto;

	/** 
	 * This attribute represents whether the primitive attribute idRiesgoPuesto is null.
	 */
	protected boolean idRiesgoPuestoNull;

	/** 
	 * Sets the value of idRiesgoPuesto
	 */
	public void setIdRiesgoPuesto(int idRiesgoPuesto)
	{
		this.idRiesgoPuesto = idRiesgoPuesto;
	}

	/** 
	 * Gets the value of idRiesgoPuesto
	 */
	public int getIdRiesgoPuesto()
	{
		return idRiesgoPuesto;
	}

	/**
	 * Method 'NominaRiesgoPuestoPk'
	 * 
	 */
	public NominaRiesgoPuestoPk()
	{
	}

	/**
	 * Method 'NominaRiesgoPuestoPk'
	 * 
	 * @param idRiesgoPuesto
	 */
	public NominaRiesgoPuestoPk(final int idRiesgoPuesto)
	{
		this.idRiesgoPuesto = idRiesgoPuesto;
	}

	/** 
	 * Sets the value of idRiesgoPuestoNull
	 */
	public void setIdRiesgoPuestoNull(boolean idRiesgoPuestoNull)
	{
		this.idRiesgoPuestoNull = idRiesgoPuestoNull;
	}

	/** 
	 * Gets the value of idRiesgoPuestoNull
	 */
	public boolean isIdRiesgoPuestoNull()
	{
		return idRiesgoPuestoNull;
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
		
		if (!(_other instanceof NominaRiesgoPuestoPk)) {
			return false;
		}
		
		final NominaRiesgoPuestoPk _cast = (NominaRiesgoPuestoPk) _other;
		if (idRiesgoPuesto != _cast.idRiesgoPuesto) {
			return false;
		}
		
		if (idRiesgoPuestoNull != _cast.idRiesgoPuestoNull) {
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
		_hashCode = 29 * _hashCode + idRiesgoPuesto;
		_hashCode = 29 * _hashCode + (idRiesgoPuestoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.NominaRiesgoPuestoPk: " );
		ret.append( "idRiesgoPuesto=" + idRiesgoPuesto );
		return ret.toString();
	}

}
