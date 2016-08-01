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

public class PosMovilEstatusParametros implements Serializable
{
	/** 
	 * This attribute maps to the column id_estatus_parametro in the pos_movil_estatus_parametros table.
	 */
	protected int idEstatusParametro;

	/** 
	 * This attribute represents whether the attribute idEstatusParametro has been modified since being read from the database.
	 */
	protected boolean idEstatusParametroModified = false;

	/** 
	 * This attribute maps to the column id_empresa in the pos_movil_estatus_parametros table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column id_empleado in the pos_movil_estatus_parametros table.
	 */
	protected int idEmpleado;

	/** 
	 * This attribute represents whether the primitive attribute idEmpleado is null.
	 */
	protected boolean idEmpleadoNull = true;

	/** 
	 * This attribute represents whether the attribute idEmpleado has been modified since being read from the database.
	 */
	protected boolean idEmpleadoModified = false;

	/** 
	 * This attribute maps to the column tiempo_minutos_actualiza in the pos_movil_estatus_parametros table.
	 */
	protected int tiempoMinutosActualiza;

	/** 
	 * This attribute represents whether the attribute tiempoMinutosActualiza has been modified since being read from the database.
	 */
	protected boolean tiempoMinutosActualizaModified = false;

	/** 
	 * This attribute maps to the column t_minutos_recordatorio in the pos_movil_estatus_parametros table.
	 */
	protected int tMinutosRecordatorio;

	/** 
	 * This attribute represents whether the primitive attribute tMinutosRecordatorio is null.
	 */
	protected boolean tMinutosRecordatorioNull = true;

	/** 
	 * This attribute represents whether the attribute tMinutosRecordatorio has been modified since being read from the database.
	 */
	protected boolean tMinutosRecordatorioModified = false;

	/**
	 * Method 'PosMovilEstatusParametros'
	 * 
	 */
	public PosMovilEstatusParametros()
	{
	}

	/**
	 * Method 'getIdEstatusParametro'
	 * 
	 * @return int
	 */
	public int getIdEstatusParametro()
	{
		return idEstatusParametro;
	}

	/**
	 * Method 'setIdEstatusParametro'
	 * 
	 * @param idEstatusParametro
	 */
	public void setIdEstatusParametro(int idEstatusParametro)
	{
		this.idEstatusParametro = idEstatusParametro;
		this.idEstatusParametroModified = true;
	}

	/** 
	 * Sets the value of idEstatusParametroModified
	 */
	public void setIdEstatusParametroModified(boolean idEstatusParametroModified)
	{
		this.idEstatusParametroModified = idEstatusParametroModified;
	}

	/** 
	 * Gets the value of idEstatusParametroModified
	 */
	public boolean isIdEstatusParametroModified()
	{
		return idEstatusParametroModified;
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
	 * Method 'getIdEmpleado'
	 * 
	 * @return int
	 */
	public int getIdEmpleado()
	{
		return idEmpleado;
	}

	/**
	 * Method 'setIdEmpleado'
	 * 
	 * @param idEmpleado
	 */
	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
		this.idEmpleadoNull = false;
		this.idEmpleadoModified = true;
	}

	/**
	 * Method 'setIdEmpleadoNull'
	 * 
	 * @param value
	 */
	public void setIdEmpleadoNull(boolean value)
	{
		this.idEmpleadoNull = value;
		this.idEmpleadoModified = true;
	}

	/**
	 * Method 'isIdEmpleadoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmpleadoNull()
	{
		return idEmpleadoNull;
	}

	/** 
	 * Sets the value of idEmpleadoModified
	 */
	public void setIdEmpleadoModified(boolean idEmpleadoModified)
	{
		this.idEmpleadoModified = idEmpleadoModified;
	}

	/** 
	 * Gets the value of idEmpleadoModified
	 */
	public boolean isIdEmpleadoModified()
	{
		return idEmpleadoModified;
	}

	/**
	 * Method 'getTiempoMinutosActualiza'
	 * 
	 * @return int
	 */
	public int getTiempoMinutosActualiza()
	{
		return tiempoMinutosActualiza;
	}

	/**
	 * Method 'setTiempoMinutosActualiza'
	 * 
	 * @param tiempoMinutosActualiza
	 */
	public void setTiempoMinutosActualiza(int tiempoMinutosActualiza)
	{
		this.tiempoMinutosActualiza = tiempoMinutosActualiza;
		this.tiempoMinutosActualizaModified = true;
	}

	/** 
	 * Sets the value of tiempoMinutosActualizaModified
	 */
	public void setTiempoMinutosActualizaModified(boolean tiempoMinutosActualizaModified)
	{
		this.tiempoMinutosActualizaModified = tiempoMinutosActualizaModified;
	}

	/** 
	 * Gets the value of tiempoMinutosActualizaModified
	 */
	public boolean isTiempoMinutosActualizaModified()
	{
		return tiempoMinutosActualizaModified;
	}

	/**
	 * Method 'getTMinutosRecordatorio'
	 * 
	 * @return int
	 */
	public int getTMinutosRecordatorio()
	{
		return tMinutosRecordatorio;
	}

	/**
	 * Method 'setTMinutosRecordatorio'
	 * 
	 * @param tMinutosRecordatorio
	 */
	public void setTMinutosRecordatorio(int tMinutosRecordatorio)
	{
		this.tMinutosRecordatorio = tMinutosRecordatorio;
		this.tMinutosRecordatorioNull = false;
		this.tMinutosRecordatorioModified = true;
	}

	/**
	 * Method 'setTMinutosRecordatorioNull'
	 * 
	 * @param value
	 */
	public void setTMinutosRecordatorioNull(boolean value)
	{
		this.tMinutosRecordatorioNull = value;
		this.tMinutosRecordatorioModified = true;
	}

	/**
	 * Method 'isTMinutosRecordatorioNull'
	 * 
	 * @return boolean
	 */
	public boolean isTMinutosRecordatorioNull()
	{
		return tMinutosRecordatorioNull;
	}

	/** 
	 * Sets the value of tMinutosRecordatorioModified
	 */
	public void setTMinutosRecordatorioModified(boolean tMinutosRecordatorioModified)
	{
		this.tMinutosRecordatorioModified = tMinutosRecordatorioModified;
	}

	/** 
	 * Gets the value of tMinutosRecordatorioModified
	 */
	public boolean isTMinutosRecordatorioModified()
	{
		return tMinutosRecordatorioModified;
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
		
		if (!(_other instanceof PosMovilEstatusParametros)) {
			return false;
		}
		
		final PosMovilEstatusParametros _cast = (PosMovilEstatusParametros) _other;
		if (idEstatusParametro != _cast.idEstatusParametro) {
			return false;
		}
		
		if (idEstatusParametroModified != _cast.idEstatusParametroModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idEmpleado != _cast.idEmpleado) {
			return false;
		}
		
		if (idEmpleadoNull != _cast.idEmpleadoNull) {
			return false;
		}
		
		if (idEmpleadoModified != _cast.idEmpleadoModified) {
			return false;
		}
		
		if (tiempoMinutosActualiza != _cast.tiempoMinutosActualiza) {
			return false;
		}
		
		if (tiempoMinutosActualizaModified != _cast.tiempoMinutosActualizaModified) {
			return false;
		}
		
		if (tMinutosRecordatorio != _cast.tMinutosRecordatorio) {
			return false;
		}
		
		if (tMinutosRecordatorioNull != _cast.tMinutosRecordatorioNull) {
			return false;
		}
		
		if (tMinutosRecordatorioModified != _cast.tMinutosRecordatorioModified) {
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
		_hashCode = 29 * _hashCode + idEstatusParametro;
		_hashCode = 29 * _hashCode + (idEstatusParametroModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpleado;
		_hashCode = 29 * _hashCode + (idEmpleadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpleadoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + tiempoMinutosActualiza;
		_hashCode = 29 * _hashCode + (tiempoMinutosActualizaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + tMinutosRecordatorio;
		_hashCode = 29 * _hashCode + (tMinutosRecordatorioNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (tMinutosRecordatorioModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PosMovilEstatusParametrosPk
	 */
	public PosMovilEstatusParametrosPk createPk()
	{
		return new PosMovilEstatusParametrosPk(idEstatusParametro);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.PosMovilEstatusParametros: " );
		ret.append( "idEstatusParametro=" + idEstatusParametro );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEmpleado=" + idEmpleado );
		ret.append( ", tiempoMinutosActualiza=" + tiempoMinutosActualiza );
		ret.append( ", tMinutosRecordatorio=" + tMinutosRecordatorio );
		return ret.toString();
	}

}