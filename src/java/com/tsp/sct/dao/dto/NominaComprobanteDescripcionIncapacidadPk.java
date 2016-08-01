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
 * This class represents the primary key of the nomina_comprobante_descripcion_incapacidad table.
 */
public class NominaComprobanteDescripcionIncapacidadPk implements Serializable
{
	protected int idNominaComprobanteDescripcion;

	/** 
	 * This attribute represents whether the primitive attribute idNominaComprobanteDescripcion is null.
	 */
	protected boolean idNominaComprobanteDescripcionNull;

	/** 
	 * Sets the value of idNominaComprobanteDescripcion
	 */
	public void setIdNominaComprobanteDescripcion(int idNominaComprobanteDescripcion)
	{
		this.idNominaComprobanteDescripcion = idNominaComprobanteDescripcion;
	}

	/** 
	 * Gets the value of idNominaComprobanteDescripcion
	 */
	public int getIdNominaComprobanteDescripcion()
	{
		return idNominaComprobanteDescripcion;
	}

	/**
	 * Method 'NominaComprobanteDescripcionIncapacidadPk'
	 * 
	 */
	public NominaComprobanteDescripcionIncapacidadPk()
	{
	}

	/**
	 * Method 'NominaComprobanteDescripcionIncapacidadPk'
	 * 
	 * @param idNominaComprobanteDescripcion
	 */
	public NominaComprobanteDescripcionIncapacidadPk(final int idNominaComprobanteDescripcion)
	{
		this.idNominaComprobanteDescripcion = idNominaComprobanteDescripcion;
	}

	/** 
	 * Sets the value of idNominaComprobanteDescripcionNull
	 */
	public void setIdNominaComprobanteDescripcionNull(boolean idNominaComprobanteDescripcionNull)
	{
		this.idNominaComprobanteDescripcionNull = idNominaComprobanteDescripcionNull;
	}

	/** 
	 * Gets the value of idNominaComprobanteDescripcionNull
	 */
	public boolean isIdNominaComprobanteDescripcionNull()
	{
		return idNominaComprobanteDescripcionNull;
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
		
		if (!(_other instanceof NominaComprobanteDescripcionIncapacidadPk)) {
			return false;
		}
		
		final NominaComprobanteDescripcionIncapacidadPk _cast = (NominaComprobanteDescripcionIncapacidadPk) _other;
		if (idNominaComprobanteDescripcion != _cast.idNominaComprobanteDescripcion) {
			return false;
		}
		
		if (idNominaComprobanteDescripcionNull != _cast.idNominaComprobanteDescripcionNull) {
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
		_hashCode = 29 * _hashCode + idNominaComprobanteDescripcion;
		_hashCode = 29 * _hashCode + (idNominaComprobanteDescripcionNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.NominaComprobanteDescripcionIncapacidadPk: " );
		ret.append( "idNominaComprobanteDescripcion=" + idNominaComprobanteDescripcion );
		return ret.toString();
	}

}