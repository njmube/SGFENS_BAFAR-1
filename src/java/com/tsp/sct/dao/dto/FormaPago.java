/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import com.tsp.sct.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class FormaPago implements Serializable
{
	/** 
	 * This attribute maps to the column ID_FORMA_PAGO in the forma_pago table.
	 */
	protected int idFormaPago;

	/** 
	 * This attribute maps to the column DESC_FORMA_PAGO in the forma_pago table.
	 */
	protected String descFormaPago;

	/** 
	 * This attribute maps to the column PARCIALIDAD in the forma_pago table.
	 */
	protected short parcialidad;

	/** 
	 * This attribute represents whether the primitive attribute parcialidad is null.
	 */
	protected boolean parcialidadNull = true;

	/**
	 * Method 'FormaPago'
	 * 
	 */
	public FormaPago()
	{
	}

	/**
	 * Method 'getIdFormaPago'
	 * 
	 * @return int
	 */
	public int getIdFormaPago()
	{
		return idFormaPago;
	}

	/**
	 * Method 'setIdFormaPago'
	 * 
	 * @param idFormaPago
	 */
	public void setIdFormaPago(int idFormaPago)
	{
		this.idFormaPago = idFormaPago;
	}

	/**
	 * Method 'getDescFormaPago'
	 * 
	 * @return String
	 */
	public String getDescFormaPago()
	{
		return descFormaPago;
	}

	/**
	 * Method 'setDescFormaPago'
	 * 
	 * @param descFormaPago
	 */
	public void setDescFormaPago(String descFormaPago)
	{
		this.descFormaPago = descFormaPago;
	}

	/**
	 * Method 'getParcialidad'
	 * 
	 * @return short
	 */
	public short getParcialidad()
	{
		return parcialidad;
	}

	/**
	 * Method 'setParcialidad'
	 * 
	 * @param parcialidad
	 */
	public void setParcialidad(short parcialidad)
	{
		this.parcialidad = parcialidad;
		this.parcialidadNull = false;
	}

	/**
	 * Method 'setParcialidadNull'
	 * 
	 * @param value
	 */
	public void setParcialidadNull(boolean value)
	{
		this.parcialidadNull = value;
	}

	/**
	 * Method 'isParcialidadNull'
	 * 
	 * @return boolean
	 */
	public boolean isParcialidadNull()
	{
		return parcialidadNull;
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
		
		if (!(_other instanceof FormaPago)) {
			return false;
		}
		
		final FormaPago _cast = (FormaPago) _other;
		if (idFormaPago != _cast.idFormaPago) {
			return false;
		}
		
		if (descFormaPago == null ? _cast.descFormaPago != descFormaPago : !descFormaPago.equals( _cast.descFormaPago )) {
			return false;
		}
		
		if (parcialidad != _cast.parcialidad) {
			return false;
		}
		
		if (parcialidadNull != _cast.parcialidadNull) {
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
		_hashCode = 29 * _hashCode + idFormaPago;
		if (descFormaPago != null) {
			_hashCode = 29 * _hashCode + descFormaPago.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) parcialidad;
		_hashCode = 29 * _hashCode + (parcialidadNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return FormaPagoPk
	 */
	public FormaPagoPk createPk()
	{
		return new FormaPagoPk(idFormaPago);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.FormaPago: " );
		ret.append( "idFormaPago=" + idFormaPago );
		ret.append( ", descFormaPago=" + descFormaPago );
		ret.append( ", parcialidad=" + parcialidad );
		return ret.toString();
	}

}