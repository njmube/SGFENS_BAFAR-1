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

public class EmpresaModulosOcultos implements Serializable
{
	/** 
	 * This attribute maps to the column ID_EMPRESA_MODULO_OCULTO in the empresa_modulos_ocultos table.
	 */
	protected int idEmpresaModuloOculto;

	/** 
	 * This attribute represents whether the attribute idEmpresaModuloOculto has been modified since being read from the database.
	 */
	protected boolean idEmpresaModuloOcultoModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the empresa_modulos_ocultos table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column MODULOS_OCULTOS in the empresa_modulos_ocultos table.
	 */
	protected String modulosOcultos;

	/** 
	 * This attribute represents whether the attribute modulosOcultos has been modified since being read from the database.
	 */
	protected boolean modulosOcultosModified = false;

	/**
	 * Method 'EmpresaModulosOcultos'
	 * 
	 */
	public EmpresaModulosOcultos()
	{
	}

	/**
	 * Method 'getIdEmpresaModuloOculto'
	 * 
	 * @return int
	 */
	public int getIdEmpresaModuloOculto()
	{
		return idEmpresaModuloOculto;
	}

	/**
	 * Method 'setIdEmpresaModuloOculto'
	 * 
	 * @param idEmpresaModuloOculto
	 */
	public void setIdEmpresaModuloOculto(int idEmpresaModuloOculto)
	{
		this.idEmpresaModuloOculto = idEmpresaModuloOculto;
		this.idEmpresaModuloOcultoModified = true;
	}

	/** 
	 * Sets the value of idEmpresaModuloOcultoModified
	 */
	public void setIdEmpresaModuloOcultoModified(boolean idEmpresaModuloOcultoModified)
	{
		this.idEmpresaModuloOcultoModified = idEmpresaModuloOcultoModified;
	}

	/** 
	 * Gets the value of idEmpresaModuloOcultoModified
	 */
	public boolean isIdEmpresaModuloOcultoModified()
	{
		return idEmpresaModuloOcultoModified;
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
	 * Method 'getModulosOcultos'
	 * 
	 * @return String
	 */
	public String getModulosOcultos()
	{
		return modulosOcultos;
	}

	/**
	 * Method 'setModulosOcultos'
	 * 
	 * @param modulosOcultos
	 */
	public void setModulosOcultos(String modulosOcultos)
	{
		this.modulosOcultos = modulosOcultos;
		this.modulosOcultosModified = true;
	}

	/** 
	 * Sets the value of modulosOcultosModified
	 */
	public void setModulosOcultosModified(boolean modulosOcultosModified)
	{
		this.modulosOcultosModified = modulosOcultosModified;
	}

	/** 
	 * Gets the value of modulosOcultosModified
	 */
	public boolean isModulosOcultosModified()
	{
		return modulosOcultosModified;
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
		
		if (!(_other instanceof EmpresaModulosOcultos)) {
			return false;
		}
		
		final EmpresaModulosOcultos _cast = (EmpresaModulosOcultos) _other;
		if (idEmpresaModuloOculto != _cast.idEmpresaModuloOculto) {
			return false;
		}
		
		if (idEmpresaModuloOcultoModified != _cast.idEmpresaModuloOcultoModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (modulosOcultos == null ? _cast.modulosOcultos != modulosOcultos : !modulosOcultos.equals( _cast.modulosOcultos )) {
			return false;
		}
		
		if (modulosOcultosModified != _cast.modulosOcultosModified) {
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
		_hashCode = 29 * _hashCode + idEmpresaModuloOculto;
		_hashCode = 29 * _hashCode + (idEmpresaModuloOcultoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (modulosOcultos != null) {
			_hashCode = 29 * _hashCode + modulosOcultos.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (modulosOcultosModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpresaModulosOcultosPk
	 */
	public EmpresaModulosOcultosPk createPk()
	{
		return new EmpresaModulosOcultosPk(idEmpresaModuloOculto);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.EmpresaModulosOcultos: " );
		ret.append( "idEmpresaModuloOculto=" + idEmpresaModuloOculto );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", modulosOcultos=" + modulosOcultos );
		return ret.toString();
	}

}
