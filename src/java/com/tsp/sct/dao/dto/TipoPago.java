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

public class TipoPago implements Serializable
{
	/** 
	 * This attribute maps to the column ID_TIPO_PAGO in the tipo_pago table.
	 */
	protected int idTipoPago;

	/** 
	 * This attribute represents whether the attribute idTipoPago has been modified since being read from the database.
	 */
	protected boolean idTipoPagoModified = false;

	/** 
	 * This attribute maps to the column DESC_TIPO_PAGO in the tipo_pago table.
	 */
	protected String descTipoPago;

	/** 
	 * This attribute represents whether the attribute descTipoPago has been modified since being read from the database.
	 */
	protected boolean descTipoPagoModified = false;

	/** 
	 * This attribute maps to the column NUMERO_CUENTA in the tipo_pago table.
	 */
	protected String numeroCuenta;

	/** 
	 * This attribute represents whether the attribute numeroCuenta has been modified since being read from the database.
	 */
	protected boolean numeroCuentaModified = false;

	/** 
	 * This attribute maps to the column CLAVE_METODO_SAT in the tipo_pago table.
	 */
	protected String claveMetodoSat;

	/** 
	 * This attribute represents whether the attribute claveMetodoSat has been modified since being read from the database.
	 */
	protected boolean claveMetodoSatModified = false;

	/**
	 * Method 'TipoPago'
	 * 
	 */
	public TipoPago()
	{
	}

	/**
	 * Method 'getIdTipoPago'
	 * 
	 * @return int
	 */
	public int getIdTipoPago()
	{
		return idTipoPago;
	}

	/**
	 * Method 'setIdTipoPago'
	 * 
	 * @param idTipoPago
	 */
	public void setIdTipoPago(int idTipoPago)
	{
		this.idTipoPago = idTipoPago;
		this.idTipoPagoModified = true;
	}

	/** 
	 * Sets the value of idTipoPagoModified
	 */
	public void setIdTipoPagoModified(boolean idTipoPagoModified)
	{
		this.idTipoPagoModified = idTipoPagoModified;
	}

	/** 
	 * Gets the value of idTipoPagoModified
	 */
	public boolean isIdTipoPagoModified()
	{
		return idTipoPagoModified;
	}

	/**
	 * Method 'getDescTipoPago'
	 * 
	 * @return String
	 */
	public String getDescTipoPago()
	{
		return descTipoPago;
	}

	/**
	 * Method 'setDescTipoPago'
	 * 
	 * @param descTipoPago
	 */
	public void setDescTipoPago(String descTipoPago)
	{
		this.descTipoPago = descTipoPago;
		this.descTipoPagoModified = true;
	}

	/** 
	 * Sets the value of descTipoPagoModified
	 */
	public void setDescTipoPagoModified(boolean descTipoPagoModified)
	{
		this.descTipoPagoModified = descTipoPagoModified;
	}

	/** 
	 * Gets the value of descTipoPagoModified
	 */
	public boolean isDescTipoPagoModified()
	{
		return descTipoPagoModified;
	}

	/**
	 * Method 'getNumeroCuenta'
	 * 
	 * @return String
	 */
	public String getNumeroCuenta()
	{
		return numeroCuenta;
	}

	/**
	 * Method 'setNumeroCuenta'
	 * 
	 * @param numeroCuenta
	 */
	public void setNumeroCuenta(String numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
		this.numeroCuentaModified = true;
	}

	/** 
	 * Sets the value of numeroCuentaModified
	 */
	public void setNumeroCuentaModified(boolean numeroCuentaModified)
	{
		this.numeroCuentaModified = numeroCuentaModified;
	}

	/** 
	 * Gets the value of numeroCuentaModified
	 */
	public boolean isNumeroCuentaModified()
	{
		return numeroCuentaModified;
	}

	/**
	 * Method 'getClaveMetodoSat'
	 * 
	 * @return String
	 */
	public String getClaveMetodoSat()
	{
		return claveMetodoSat;
	}

	/**
	 * Method 'setClaveMetodoSat'
	 * 
	 * @param claveMetodoSat
	 */
	public void setClaveMetodoSat(String claveMetodoSat)
	{
		this.claveMetodoSat = claveMetodoSat;
		this.claveMetodoSatModified = true;
	}

	/** 
	 * Sets the value of claveMetodoSatModified
	 */
	public void setClaveMetodoSatModified(boolean claveMetodoSatModified)
	{
		this.claveMetodoSatModified = claveMetodoSatModified;
	}

	/** 
	 * Gets the value of claveMetodoSatModified
	 */
	public boolean isClaveMetodoSatModified()
	{
		return claveMetodoSatModified;
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
		
		if (!(_other instanceof TipoPago)) {
			return false;
		}
		
		final TipoPago _cast = (TipoPago) _other;
		if (idTipoPago != _cast.idTipoPago) {
			return false;
		}
		
		if (idTipoPagoModified != _cast.idTipoPagoModified) {
			return false;
		}
		
		if (descTipoPago == null ? _cast.descTipoPago != descTipoPago : !descTipoPago.equals( _cast.descTipoPago )) {
			return false;
		}
		
		if (descTipoPagoModified != _cast.descTipoPagoModified) {
			return false;
		}
		
		if (numeroCuenta == null ? _cast.numeroCuenta != numeroCuenta : !numeroCuenta.equals( _cast.numeroCuenta )) {
			return false;
		}
		
		if (numeroCuentaModified != _cast.numeroCuentaModified) {
			return false;
		}
		
		if (claveMetodoSat == null ? _cast.claveMetodoSat != claveMetodoSat : !claveMetodoSat.equals( _cast.claveMetodoSat )) {
			return false;
		}
		
		if (claveMetodoSatModified != _cast.claveMetodoSatModified) {
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
		_hashCode = 29 * _hashCode + idTipoPago;
		_hashCode = 29 * _hashCode + (idTipoPagoModified ? 1 : 0);
		if (descTipoPago != null) {
			_hashCode = 29 * _hashCode + descTipoPago.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descTipoPagoModified ? 1 : 0);
		if (numeroCuenta != null) {
			_hashCode = 29 * _hashCode + numeroCuenta.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (numeroCuentaModified ? 1 : 0);
		if (claveMetodoSat != null) {
			_hashCode = 29 * _hashCode + claveMetodoSat.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (claveMetodoSatModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TipoPagoPk
	 */
	public TipoPagoPk createPk()
	{
		return new TipoPagoPk(idTipoPago);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.TipoPago: " );
		ret.append( "idTipoPago=" + idTipoPago );
		ret.append( ", descTipoPago=" + descTipoPago );
		ret.append( ", numeroCuenta=" + numeroCuenta );
		ret.append( ", claveMetodoSat=" + claveMetodoSat );
		return ret.toString();
	}

}
