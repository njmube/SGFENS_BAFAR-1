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

public class ComprobanteDescripcionPersonalizada implements Serializable
{
	/** 
	 * This attribute maps to the column ID_COMPROBANTE_DESCRIPCION_PERSONALIZADA in the comprobante_descripcion_personalizada table.
	 */
	protected int idComprobanteDescripcionPersonalizada;

	/** 
	 * This attribute represents whether the attribute idComprobanteDescripcionPersonalizada has been modified since being read from the database.
	 */
	protected boolean idComprobanteDescripcionPersonalizadaModified = false;

	/** 
	 * This attribute maps to the column ID_COMPROBANTE_FISCAL in the comprobante_descripcion_personalizada table.
	 */
	protected int idComprobanteFiscal;

	/** 
	 * This attribute represents whether the attribute idComprobanteFiscal has been modified since being read from the database.
	 */
	protected boolean idComprobanteFiscalModified = false;

	/** 
	 * This attribute maps to the column DATOS_DE_PERSONALIZACION in the comprobante_descripcion_personalizada table.
	 */
	protected String datosDePersonalizacion;

	/** 
	 * This attribute represents whether the attribute datosDePersonalizacion has been modified since being read from the database.
	 */
	protected boolean datosDePersonalizacionModified = false;

	/**
	 * Method 'ComprobanteDescripcionPersonalizada'
	 * 
	 */
	public ComprobanteDescripcionPersonalizada()
	{
	}

	/**
	 * Method 'getIdComprobanteDescripcionPersonalizada'
	 * 
	 * @return int
	 */
	public int getIdComprobanteDescripcionPersonalizada()
	{
		return idComprobanteDescripcionPersonalizada;
	}

	/**
	 * Method 'setIdComprobanteDescripcionPersonalizada'
	 * 
	 * @param idComprobanteDescripcionPersonalizada
	 */
	public void setIdComprobanteDescripcionPersonalizada(int idComprobanteDescripcionPersonalizada)
	{
		this.idComprobanteDescripcionPersonalizada = idComprobanteDescripcionPersonalizada;
		this.idComprobanteDescripcionPersonalizadaModified = true;
	}

	/** 
	 * Sets the value of idComprobanteDescripcionPersonalizadaModified
	 */
	public void setIdComprobanteDescripcionPersonalizadaModified(boolean idComprobanteDescripcionPersonalizadaModified)
	{
		this.idComprobanteDescripcionPersonalizadaModified = idComprobanteDescripcionPersonalizadaModified;
	}

	/** 
	 * Gets the value of idComprobanteDescripcionPersonalizadaModified
	 */
	public boolean isIdComprobanteDescripcionPersonalizadaModified()
	{
		return idComprobanteDescripcionPersonalizadaModified;
	}

	/**
	 * Method 'getIdComprobanteFiscal'
	 * 
	 * @return int
	 */
	public int getIdComprobanteFiscal()
	{
		return idComprobanteFiscal;
	}

	/**
	 * Method 'setIdComprobanteFiscal'
	 * 
	 * @param idComprobanteFiscal
	 */
	public void setIdComprobanteFiscal(int idComprobanteFiscal)
	{
		this.idComprobanteFiscal = idComprobanteFiscal;
		this.idComprobanteFiscalModified = true;
	}

	/** 
	 * Sets the value of idComprobanteFiscalModified
	 */
	public void setIdComprobanteFiscalModified(boolean idComprobanteFiscalModified)
	{
		this.idComprobanteFiscalModified = idComprobanteFiscalModified;
	}

	/** 
	 * Gets the value of idComprobanteFiscalModified
	 */
	public boolean isIdComprobanteFiscalModified()
	{
		return idComprobanteFiscalModified;
	}

	/**
	 * Method 'getDatosDePersonalizacion'
	 * 
	 * @return String
	 */
	public String getDatosDePersonalizacion()
	{
		return datosDePersonalizacion;
	}

	/**
	 * Method 'setDatosDePersonalizacion'
	 * 
	 * @param datosDePersonalizacion
	 */
	public void setDatosDePersonalizacion(String datosDePersonalizacion)
	{
		this.datosDePersonalizacion = datosDePersonalizacion;
		this.datosDePersonalizacionModified = true;
	}

	/** 
	 * Sets the value of datosDePersonalizacionModified
	 */
	public void setDatosDePersonalizacionModified(boolean datosDePersonalizacionModified)
	{
		this.datosDePersonalizacionModified = datosDePersonalizacionModified;
	}

	/** 
	 * Gets the value of datosDePersonalizacionModified
	 */
	public boolean isDatosDePersonalizacionModified()
	{
		return datosDePersonalizacionModified;
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
		
		if (!(_other instanceof ComprobanteDescripcionPersonalizada)) {
			return false;
		}
		
		final ComprobanteDescripcionPersonalizada _cast = (ComprobanteDescripcionPersonalizada) _other;
		if (idComprobanteDescripcionPersonalizada != _cast.idComprobanteDescripcionPersonalizada) {
			return false;
		}
		
		if (idComprobanteDescripcionPersonalizadaModified != _cast.idComprobanteDescripcionPersonalizadaModified) {
			return false;
		}
		
		if (idComprobanteFiscal != _cast.idComprobanteFiscal) {
			return false;
		}
		
		if (idComprobanteFiscalModified != _cast.idComprobanteFiscalModified) {
			return false;
		}
		
		if (datosDePersonalizacion == null ? _cast.datosDePersonalizacion != datosDePersonalizacion : !datosDePersonalizacion.equals( _cast.datosDePersonalizacion )) {
			return false;
		}
		
		if (datosDePersonalizacionModified != _cast.datosDePersonalizacionModified) {
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
		_hashCode = 29 * _hashCode + idComprobanteDescripcionPersonalizada;
		_hashCode = 29 * _hashCode + (idComprobanteDescripcionPersonalizadaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idComprobanteFiscal;
		_hashCode = 29 * _hashCode + (idComprobanteFiscalModified ? 1 : 0);
		if (datosDePersonalizacion != null) {
			_hashCode = 29 * _hashCode + datosDePersonalizacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (datosDePersonalizacionModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ComprobanteDescripcionPersonalizadaPk
	 */
	public ComprobanteDescripcionPersonalizadaPk createPk()
	{
		return new ComprobanteDescripcionPersonalizadaPk(idComprobanteDescripcionPersonalizada);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ComprobanteDescripcionPersonalizada: " );
		ret.append( "idComprobanteDescripcionPersonalizada=" + idComprobanteDescripcionPersonalizada );
		ret.append( ", idComprobanteFiscal=" + idComprobanteFiscal );
		ret.append( ", datosDePersonalizacion=" + datosDePersonalizacion );
		return ret.toString();
	}

}
