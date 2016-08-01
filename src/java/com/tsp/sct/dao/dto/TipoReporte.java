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

public class TipoReporte implements Serializable
{
	/** 
	 * This attribute maps to the column ID_REPORTE in the tipo_reporte table.
	 */
	protected int idReporte;

	/** 
	 * This attribute represents whether the attribute idReporte has been modified since being read from the database.
	 */
	protected boolean idReporteModified = false;

	/** 
	 * This attribute maps to the column ID_TIPO_REPORTE in the tipo_reporte table.
	 */
	protected int idTipoReporte;

	/** 
	 * This attribute represents whether the primitive attribute idTipoReporte is null.
	 */
	protected boolean idTipoReporteNull = true;

	/** 
	 * This attribute represents whether the attribute idTipoReporte has been modified since being read from the database.
	 */
	protected boolean idTipoReporteModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the tipo_reporte table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the primitive attribute idEstatus is null.
	 */
	protected boolean idEstatusNull = true;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/** 
	 * This attribute maps to the column VISIBLE in the tipo_reporte table.
	 */
	protected int visible;

	/** 
	 * This attribute represents whether the primitive attribute visible is null.
	 */
	protected boolean visibleNull = true;

	/** 
	 * This attribute represents whether the attribute visible has been modified since being read from the database.
	 */
	protected boolean visibleModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION in the tipo_reporte table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/**
	 * Method 'TipoReporte'
	 * 
	 */
	public TipoReporte()
	{
	}

	/**
	 * Method 'getIdReporte'
	 * 
	 * @return int
	 */
	public int getIdReporte()
	{
		return idReporte;
	}

	/**
	 * Method 'setIdReporte'
	 * 
	 * @param idReporte
	 */
	public void setIdReporte(int idReporte)
	{
		this.idReporte = idReporte;
		this.idReporteModified = true;
	}

	/** 
	 * Sets the value of idReporteModified
	 */
	public void setIdReporteModified(boolean idReporteModified)
	{
		this.idReporteModified = idReporteModified;
	}

	/** 
	 * Gets the value of idReporteModified
	 */
	public boolean isIdReporteModified()
	{
		return idReporteModified;
	}

	/**
	 * Method 'getIdTipoReporte'
	 * 
	 * @return int
	 */
	public int getIdTipoReporte()
	{
		return idTipoReporte;
	}

	/**
	 * Method 'setIdTipoReporte'
	 * 
	 * @param idTipoReporte
	 */
	public void setIdTipoReporte(int idTipoReporte)
	{
		this.idTipoReporte = idTipoReporte;
		this.idTipoReporteNull = false;
		this.idTipoReporteModified = true;
	}

	/**
	 * Method 'setIdTipoReporteNull'
	 * 
	 * @param value
	 */
	public void setIdTipoReporteNull(boolean value)
	{
		this.idTipoReporteNull = value;
		this.idTipoReporteModified = true;
	}

	/**
	 * Method 'isIdTipoReporteNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdTipoReporteNull()
	{
		return idTipoReporteNull;
	}

	/** 
	 * Sets the value of idTipoReporteModified
	 */
	public void setIdTipoReporteModified(boolean idTipoReporteModified)
	{
		this.idTipoReporteModified = idTipoReporteModified;
	}

	/** 
	 * Gets the value of idTipoReporteModified
	 */
	public boolean isIdTipoReporteModified()
	{
		return idTipoReporteModified;
	}

	/**
	 * Method 'getIdEstatus'
	 * 
	 * @return int
	 */
	public int getIdEstatus()
	{
		return idEstatus;
	}

	/**
	 * Method 'setIdEstatus'
	 * 
	 * @param idEstatus
	 */
	public void setIdEstatus(int idEstatus)
	{
		this.idEstatus = idEstatus;
		this.idEstatusNull = false;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'setIdEstatusNull'
	 * 
	 * @param value
	 */
	public void setIdEstatusNull(boolean value)
	{
		this.idEstatusNull = value;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'isIdEstatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEstatusNull()
	{
		return idEstatusNull;
	}

	/** 
	 * Sets the value of idEstatusModified
	 */
	public void setIdEstatusModified(boolean idEstatusModified)
	{
		this.idEstatusModified = idEstatusModified;
	}

	/** 
	 * Gets the value of idEstatusModified
	 */
	public boolean isIdEstatusModified()
	{
		return idEstatusModified;
	}

	/**
	 * Method 'getVisible'
	 * 
	 * @return int
	 */
	public int getVisible()
	{
		return visible;
	}

	/**
	 * Method 'setVisible'
	 * 
	 * @param visible
	 */
	public void setVisible(int visible)
	{
		this.visible = visible;
		this.visibleNull = false;
		this.visibleModified = true;
	}

	/**
	 * Method 'setVisibleNull'
	 * 
	 * @param value
	 */
	public void setVisibleNull(boolean value)
	{
		this.visibleNull = value;
		this.visibleModified = true;
	}

	/**
	 * Method 'isVisibleNull'
	 * 
	 * @return boolean
	 */
	public boolean isVisibleNull()
	{
		return visibleNull;
	}

	/** 
	 * Sets the value of visibleModified
	 */
	public void setVisibleModified(boolean visibleModified)
	{
		this.visibleModified = visibleModified;
	}

	/** 
	 * Gets the value of visibleModified
	 */
	public boolean isVisibleModified()
	{
		return visibleModified;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
		this.descripcionModified = true;
	}

	/** 
	 * Sets the value of descripcionModified
	 */
	public void setDescripcionModified(boolean descripcionModified)
	{
		this.descripcionModified = descripcionModified;
	}

	/** 
	 * Gets the value of descripcionModified
	 */
	public boolean isDescripcionModified()
	{
		return descripcionModified;
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
		
		if (!(_other instanceof TipoReporte)) {
			return false;
		}
		
		final TipoReporte _cast = (TipoReporte) _other;
		if (idReporte != _cast.idReporte) {
			return false;
		}
		
		if (idReporteModified != _cast.idReporteModified) {
			return false;
		}
		
		if (idTipoReporte != _cast.idTipoReporte) {
			return false;
		}
		
		if (idTipoReporteNull != _cast.idTipoReporteNull) {
			return false;
		}
		
		if (idTipoReporteModified != _cast.idTipoReporteModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusNull != _cast.idEstatusNull) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
			return false;
		}
		
		if (visible != _cast.visible) {
			return false;
		}
		
		if (visibleNull != _cast.visibleNull) {
			return false;
		}
		
		if (visibleModified != _cast.visibleModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
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
		_hashCode = 29 * _hashCode + idReporte;
		_hashCode = 29 * _hashCode + (idReporteModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idTipoReporte;
		_hashCode = 29 * _hashCode + (idTipoReporteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idTipoReporteModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		_hashCode = 29 * _hashCode + visible;
		_hashCode = 29 * _hashCode + (visibleNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (visibleModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TipoReportePk
	 */
	public TipoReportePk createPk()
	{
		return new TipoReportePk(idReporte);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.TipoReporte: " );
		ret.append( "idReporte=" + idReporte );
		ret.append( ", idTipoReporte=" + idTipoReporte );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", visible=" + visible );
		ret.append( ", descripcion=" + descripcion );
		return ret.toString();
	}

}