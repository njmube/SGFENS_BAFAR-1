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

public class QuartzImpuesto implements Serializable
{
	/** 
	 * This attribute maps to the column ID_QUARTZ in the quartz_impuesto table.
	 */
	protected int idQuartz;

	/** 
	 * This attribute represents whether the attribute idQuartz has been modified since being read from the database.
	 */
	protected boolean idQuartzModified = false;

	/** 
	 * This attribute maps to the column ID_IMPUESTO_EVC in the quartz_impuesto table.
	 */
	protected int idImpuestoEvc;

	/** 
	 * This attribute represents whether the primitive attribute idImpuestoEvc is null.
	 */
	protected boolean idImpuestoEvcNull = true;

	/** 
	 * This attribute represents whether the attribute idImpuestoEvc has been modified since being read from the database.
	 */
	protected boolean idImpuestoEvcModified = false;

	/** 
	 * This attribute maps to the column ID_IMPUESTO_SISTEM_TERCERO in the quartz_impuesto table.
	 */
	protected int idImpuestoSistemTercero;

	/** 
	 * This attribute represents whether the primitive attribute idImpuestoSistemTercero is null.
	 */
	protected boolean idImpuestoSistemTerceroNull = true;

	/** 
	 * This attribute represents whether the attribute idImpuestoSistemTercero has been modified since being read from the database.
	 */
	protected boolean idImpuestoSistemTerceroModified = false;

	/** 
	 * This attribute maps to the column CLAVE in the quartz_impuesto table.
	 */
	protected String clave;

	/** 
	 * This attribute represents whether the attribute clave has been modified since being read from the database.
	 */
	protected boolean claveModified = false;

	/** 
	 * This attribute maps to the column ID_SISTEMA_TERCERO in the quartz_impuesto table.
	 */
	protected int idSistemaTercero;

	/** 
	 * This attribute represents whether the primitive attribute idSistemaTercero is null.
	 */
	protected boolean idSistemaTerceroNull = true;

	/** 
	 * This attribute represents whether the attribute idSistemaTercero has been modified since being read from the database.
	 */
	protected boolean idSistemaTerceroModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the quartz_impuesto table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/**
	 * Method 'QuartzImpuesto'
	 * 
	 */
	public QuartzImpuesto()
	{
	}

	/**
	 * Method 'getIdQuartz'
	 * 
	 * @return int
	 */
	public int getIdQuartz()
	{
		return idQuartz;
	}

	/**
	 * Method 'setIdQuartz'
	 * 
	 * @param idQuartz
	 */
	public void setIdQuartz(int idQuartz)
	{
		this.idQuartz = idQuartz;
		this.idQuartzModified = true;
	}

	/** 
	 * Sets the value of idQuartzModified
	 */
	public void setIdQuartzModified(boolean idQuartzModified)
	{
		this.idQuartzModified = idQuartzModified;
	}

	/** 
	 * Gets the value of idQuartzModified
	 */
	public boolean isIdQuartzModified()
	{
		return idQuartzModified;
	}

	/**
	 * Method 'getIdImpuestoEvc'
	 * 
	 * @return int
	 */
	public int getIdImpuestoEvc()
	{
		return idImpuestoEvc;
	}

	/**
	 * Method 'setIdImpuestoEvc'
	 * 
	 * @param idImpuestoEvc
	 */
	public void setIdImpuestoEvc(int idImpuestoEvc)
	{
		this.idImpuestoEvc = idImpuestoEvc;
		this.idImpuestoEvcNull = false;
		this.idImpuestoEvcModified = true;
	}

	/**
	 * Method 'setIdImpuestoEvcNull'
	 * 
	 * @param value
	 */
	public void setIdImpuestoEvcNull(boolean value)
	{
		this.idImpuestoEvcNull = value;
		this.idImpuestoEvcModified = true;
	}

	/**
	 * Method 'isIdImpuestoEvcNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdImpuestoEvcNull()
	{
		return idImpuestoEvcNull;
	}

	/** 
	 * Sets the value of idImpuestoEvcModified
	 */
	public void setIdImpuestoEvcModified(boolean idImpuestoEvcModified)
	{
		this.idImpuestoEvcModified = idImpuestoEvcModified;
	}

	/** 
	 * Gets the value of idImpuestoEvcModified
	 */
	public boolean isIdImpuestoEvcModified()
	{
		return idImpuestoEvcModified;
	}

	/**
	 * Method 'getIdImpuestoSistemTercero'
	 * 
	 * @return int
	 */
	public int getIdImpuestoSistemTercero()
	{
		return idImpuestoSistemTercero;
	}

	/**
	 * Method 'setIdImpuestoSistemTercero'
	 * 
	 * @param idImpuestoSistemTercero
	 */
	public void setIdImpuestoSistemTercero(int idImpuestoSistemTercero)
	{
		this.idImpuestoSistemTercero = idImpuestoSistemTercero;
		this.idImpuestoSistemTerceroNull = false;
		this.idImpuestoSistemTerceroModified = true;
	}

	/**
	 * Method 'setIdImpuestoSistemTerceroNull'
	 * 
	 * @param value
	 */
	public void setIdImpuestoSistemTerceroNull(boolean value)
	{
		this.idImpuestoSistemTerceroNull = value;
		this.idImpuestoSistemTerceroModified = true;
	}

	/**
	 * Method 'isIdImpuestoSistemTerceroNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdImpuestoSistemTerceroNull()
	{
		return idImpuestoSistemTerceroNull;
	}

	/** 
	 * Sets the value of idImpuestoSistemTerceroModified
	 */
	public void setIdImpuestoSistemTerceroModified(boolean idImpuestoSistemTerceroModified)
	{
		this.idImpuestoSistemTerceroModified = idImpuestoSistemTerceroModified;
	}

	/** 
	 * Gets the value of idImpuestoSistemTerceroModified
	 */
	public boolean isIdImpuestoSistemTerceroModified()
	{
		return idImpuestoSistemTerceroModified;
	}

	/**
	 * Method 'getClave'
	 * 
	 * @return String
	 */
	public String getClave()
	{
		return clave;
	}

	/**
	 * Method 'setClave'
	 * 
	 * @param clave
	 */
	public void setClave(String clave)
	{
		this.clave = clave;
		this.claveModified = true;
	}

	/** 
	 * Sets the value of claveModified
	 */
	public void setClaveModified(boolean claveModified)
	{
		this.claveModified = claveModified;
	}

	/** 
	 * Gets the value of claveModified
	 */
	public boolean isClaveModified()
	{
		return claveModified;
	}

	/**
	 * Method 'getIdSistemaTercero'
	 * 
	 * @return int
	 */
	public int getIdSistemaTercero()
	{
		return idSistemaTercero;
	}

	/**
	 * Method 'setIdSistemaTercero'
	 * 
	 * @param idSistemaTercero
	 */
	public void setIdSistemaTercero(int idSistemaTercero)
	{
		this.idSistemaTercero = idSistemaTercero;
		this.idSistemaTerceroNull = false;
		this.idSistemaTerceroModified = true;
	}

	/**
	 * Method 'setIdSistemaTerceroNull'
	 * 
	 * @param value
	 */
	public void setIdSistemaTerceroNull(boolean value)
	{
		this.idSistemaTerceroNull = value;
		this.idSistemaTerceroModified = true;
	}

	/**
	 * Method 'isIdSistemaTerceroNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdSistemaTerceroNull()
	{
		return idSistemaTerceroNull;
	}

	/** 
	 * Sets the value of idSistemaTerceroModified
	 */
	public void setIdSistemaTerceroModified(boolean idSistemaTerceroModified)
	{
		this.idSistemaTerceroModified = idSistemaTerceroModified;
	}

	/** 
	 * Gets the value of idSistemaTerceroModified
	 */
	public boolean isIdSistemaTerceroModified()
	{
		return idSistemaTerceroModified;
	}

	/**
	 * Method 'getIdEmpresa'
	 * 
	 * @return int
	 */
	public int getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'setIdEmpresa'
	 * 
	 * @param idEmpresa
	 */
	public void setIdEmpresa(int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
		this.idEmpresaModified = true;
	}

	/** 
	 * Sets the value of idEmpresaModified
	 */
	public void setIdEmpresaModified(boolean idEmpresaModified)
	{
		this.idEmpresaModified = idEmpresaModified;
	}

	/** 
	 * Gets the value of idEmpresaModified
	 */
	public boolean isIdEmpresaModified()
	{
		return idEmpresaModified;
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
		
		if (!(_other instanceof QuartzImpuesto)) {
			return false;
		}
		
		final QuartzImpuesto _cast = (QuartzImpuesto) _other;
		if (idQuartz != _cast.idQuartz) {
			return false;
		}
		
		if (idQuartzModified != _cast.idQuartzModified) {
			return false;
		}
		
		if (idImpuestoEvc != _cast.idImpuestoEvc) {
			return false;
		}
		
		if (idImpuestoEvcNull != _cast.idImpuestoEvcNull) {
			return false;
		}
		
		if (idImpuestoEvcModified != _cast.idImpuestoEvcModified) {
			return false;
		}
		
		if (idImpuestoSistemTercero != _cast.idImpuestoSistemTercero) {
			return false;
		}
		
		if (idImpuestoSistemTerceroNull != _cast.idImpuestoSistemTerceroNull) {
			return false;
		}
		
		if (idImpuestoSistemTerceroModified != _cast.idImpuestoSistemTerceroModified) {
			return false;
		}
		
		if (clave == null ? _cast.clave != clave : !clave.equals( _cast.clave )) {
			return false;
		}
		
		if (claveModified != _cast.claveModified) {
			return false;
		}
		
		if (idSistemaTercero != _cast.idSistemaTercero) {
			return false;
		}
		
		if (idSistemaTerceroNull != _cast.idSistemaTerceroNull) {
			return false;
		}
		
		if (idSistemaTerceroModified != _cast.idSistemaTerceroModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
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
		_hashCode = 29 * _hashCode + idQuartz;
		_hashCode = 29 * _hashCode + (idQuartzModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idImpuestoEvc;
		_hashCode = 29 * _hashCode + (idImpuestoEvcNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idImpuestoEvcModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idImpuestoSistemTercero;
		_hashCode = 29 * _hashCode + (idImpuestoSistemTerceroNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idImpuestoSistemTerceroModified ? 1 : 0);
		if (clave != null) {
			_hashCode = 29 * _hashCode + clave.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (claveModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idSistemaTercero;
		_hashCode = 29 * _hashCode + (idSistemaTerceroNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idSistemaTerceroModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return QuartzImpuestoPk
	 */
	public QuartzImpuestoPk createPk()
	{
		return new QuartzImpuestoPk(idQuartz);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.QuartzImpuesto: " );
		ret.append( "idQuartz=" + idQuartz );
		ret.append( ", idImpuestoEvc=" + idImpuestoEvc );
		ret.append( ", idImpuestoSistemTercero=" + idImpuestoSistemTercero );
		ret.append( ", clave=" + clave );
		ret.append( ", idSistemaTercero=" + idSistemaTercero );
		ret.append( ", idEmpresa=" + idEmpresa );
		return ret.toString();
	}

}
