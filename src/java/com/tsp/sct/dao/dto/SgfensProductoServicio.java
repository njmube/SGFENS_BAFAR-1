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

public class SgfensProductoServicio implements Serializable
{
	/** 
	 * This attribute maps to the column ID_PRODUCTO_SERVICIO in the sgfens_producto_servicio table.
	 */
	protected int idProductoServicio;

	/** 
	 * This attribute represents whether the attribute idProductoServicio has been modified since being read from the database.
	 */
	protected boolean idProductoServicioModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the sgfens_producto_servicio table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the primitive attribute idEmpresa is null.
	 */
	protected boolean idEmpresaNull = true;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the sgfens_producto_servicio table.
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
	 * This attribute maps to the column NOMBRE in the sgfens_producto_servicio table.
	 */
	protected String nombre;

	/** 
	 * This attribute represents whether the attribute nombre has been modified since being read from the database.
	 */
	protected boolean nombreModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION in the sgfens_producto_servicio table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column UNIDAD in the sgfens_producto_servicio table.
	 */
	protected String unidad;

	/** 
	 * This attribute represents whether the attribute unidad has been modified since being read from the database.
	 */
	protected boolean unidadModified = false;

	/** 
	 * This attribute maps to the column PRECIO_MEDIO_MAYOREO in the sgfens_producto_servicio table.
	 */
	protected double precioMedioMayoreo;

	/** 
	 * This attribute represents whether the primitive attribute precioMedioMayoreo is null.
	 */
	protected boolean precioMedioMayoreoNull = true;

	/** 
	 * This attribute represents whether the attribute precioMedioMayoreo has been modified since being read from the database.
	 */
	protected boolean precioMedioMayoreoModified = false;

	/** 
	 * This attribute maps to the column MIN_MEDIO_MAYOREO in the sgfens_producto_servicio table.
	 */
	protected double minMedioMayoreo;

	/** 
	 * This attribute represents whether the primitive attribute minMedioMayoreo is null.
	 */
	protected boolean minMedioMayoreoNull = true;

	/** 
	 * This attribute represents whether the attribute minMedioMayoreo has been modified since being read from the database.
	 */
	protected boolean minMedioMayoreoModified = false;

	/** 
	 * This attribute maps to the column MAX_MEDIO_MAYOREO in the sgfens_producto_servicio table.
	 */
	protected double maxMedioMayoreo;

	/** 
	 * This attribute represents whether the primitive attribute maxMedioMayoreo is null.
	 */
	protected boolean maxMedioMayoreoNull = true;

	/** 
	 * This attribute represents whether the attribute maxMedioMayoreo has been modified since being read from the database.
	 */
	protected boolean maxMedioMayoreoModified = false;

	/** 
	 * This attribute maps to the column PRECIO_MENUDEO in the sgfens_producto_servicio table.
	 */
	protected double precioMenudeo;

	/** 
	 * This attribute represents whether the primitive attribute precioMenudeo is null.
	 */
	protected boolean precioMenudeoNull = true;

	/** 
	 * This attribute represents whether the attribute precioMenudeo has been modified since being read from the database.
	 */
	protected boolean precioMenudeoModified = false;

	/** 
	 * This attribute maps to the column MAX_MENUDEO in the sgfens_producto_servicio table.
	 */
	protected double maxMenudeo;

	/** 
	 * This attribute represents whether the primitive attribute maxMenudeo is null.
	 */
	protected boolean maxMenudeoNull = true;

	/** 
	 * This attribute represents whether the attribute maxMenudeo has been modified since being read from the database.
	 */
	protected boolean maxMenudeoModified = false;

	/** 
	 * This attribute maps to the column PRECIO_MAYOREO in the sgfens_producto_servicio table.
	 */
	protected double precioMayoreo;

	/** 
	 * This attribute represents whether the primitive attribute precioMayoreo is null.
	 */
	protected boolean precioMayoreoNull = true;

	/** 
	 * This attribute represents whether the attribute precioMayoreo has been modified since being read from the database.
	 */
	protected boolean precioMayoreoModified = false;

	/** 
	 * This attribute maps to the column MIN_MAYOREO in the sgfens_producto_servicio table.
	 */
	protected double minMayoreo;

	/** 
	 * This attribute represents whether the primitive attribute minMayoreo is null.
	 */
	protected boolean minMayoreoNull = true;

	/** 
	 * This attribute represents whether the attribute minMayoreo has been modified since being read from the database.
	 */
	protected boolean minMayoreoModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_IMAGEN_PRODUCTO_SERVICIO in the sgfens_producto_servicio table.
	 */
	protected String nombreImagenProductoServicio;

	/** 
	 * This attribute represents whether the attribute nombreImagenProductoServicio has been modified since being read from the database.
	 */
	protected boolean nombreImagenProductoServicioModified = false;

	/** 
	 * This attribute maps to the column ID_CATEGORIA in the sgfens_producto_servicio table.
	 */
	protected int idCategoria;

	/** 
	 * This attribute represents whether the primitive attribute idCategoria is null.
	 */
	protected boolean idCategoriaNull = true;

	/** 
	 * This attribute represents whether the attribute idCategoria has been modified since being read from the database.
	 */
	protected boolean idCategoriaModified = false;

	/**
	 * Method 'SgfensProductoServicio'
	 * 
	 */
	public SgfensProductoServicio()
	{
	}

	/**
	 * Method 'getIdProductoServicio'
	 * 
	 * @return int
	 */
	public int getIdProductoServicio()
	{
		return idProductoServicio;
	}

	/**
	 * Method 'setIdProductoServicio'
	 * 
	 * @param idProductoServicio
	 */
	public void setIdProductoServicio(int idProductoServicio)
	{
		this.idProductoServicio = idProductoServicio;
		this.idProductoServicioModified = true;
	}

	/** 
	 * Sets the value of idProductoServicioModified
	 */
	public void setIdProductoServicioModified(boolean idProductoServicioModified)
	{
		this.idProductoServicioModified = idProductoServicioModified;
	}

	/** 
	 * Gets the value of idProductoServicioModified
	 */
	public boolean isIdProductoServicioModified()
	{
		return idProductoServicioModified;
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
		this.idEmpresaNull = false;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'setIdEmpresaNull'
	 * 
	 * @param value
	 */
	public void setIdEmpresaNull(boolean value)
	{
		this.idEmpresaNull = value;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'isIdEmpresaNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmpresaNull()
	{
		return idEmpresaNull;
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
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
		this.nombreModified = true;
	}

	/** 
	 * Sets the value of nombreModified
	 */
	public void setNombreModified(boolean nombreModified)
	{
		this.nombreModified = nombreModified;
	}

	/** 
	 * Gets the value of nombreModified
	 */
	public boolean isNombreModified()
	{
		return nombreModified;
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
	 * Method 'getUnidad'
	 * 
	 * @return String
	 */
	public String getUnidad()
	{
		return unidad;
	}

	/**
	 * Method 'setUnidad'
	 * 
	 * @param unidad
	 */
	public void setUnidad(String unidad)
	{
		this.unidad = unidad;
		this.unidadModified = true;
	}

	/** 
	 * Sets the value of unidadModified
	 */
	public void setUnidadModified(boolean unidadModified)
	{
		this.unidadModified = unidadModified;
	}

	/** 
	 * Gets the value of unidadModified
	 */
	public boolean isUnidadModified()
	{
		return unidadModified;
	}

	/**
	 * Method 'getPrecioMedioMayoreo'
	 * 
	 * @return double
	 */
	public double getPrecioMedioMayoreo()
	{
		return precioMedioMayoreo;
	}

	/**
	 * Method 'setPrecioMedioMayoreo'
	 * 
	 * @param precioMedioMayoreo
	 */
	public void setPrecioMedioMayoreo(double precioMedioMayoreo)
	{
		this.precioMedioMayoreo = precioMedioMayoreo;
		this.precioMedioMayoreoNull = false;
		this.precioMedioMayoreoModified = true;
	}

	/**
	 * Method 'setPrecioMedioMayoreoNull'
	 * 
	 * @param value
	 */
	public void setPrecioMedioMayoreoNull(boolean value)
	{
		this.precioMedioMayoreoNull = value;
		this.precioMedioMayoreoModified = true;
	}

	/**
	 * Method 'isPrecioMedioMayoreoNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioMedioMayoreoNull()
	{
		return precioMedioMayoreoNull;
	}

	/** 
	 * Sets the value of precioMedioMayoreoModified
	 */
	public void setPrecioMedioMayoreoModified(boolean precioMedioMayoreoModified)
	{
		this.precioMedioMayoreoModified = precioMedioMayoreoModified;
	}

	/** 
	 * Gets the value of precioMedioMayoreoModified
	 */
	public boolean isPrecioMedioMayoreoModified()
	{
		return precioMedioMayoreoModified;
	}

	/**
	 * Method 'getMinMedioMayoreo'
	 * 
	 * @return double
	 */
	public double getMinMedioMayoreo()
	{
		return minMedioMayoreo;
	}

	/**
	 * Method 'setMinMedioMayoreo'
	 * 
	 * @param minMedioMayoreo
	 */
	public void setMinMedioMayoreo(double minMedioMayoreo)
	{
		this.minMedioMayoreo = minMedioMayoreo;
		this.minMedioMayoreoNull = false;
		this.minMedioMayoreoModified = true;
	}

	/**
	 * Method 'setMinMedioMayoreoNull'
	 * 
	 * @param value
	 */
	public void setMinMedioMayoreoNull(boolean value)
	{
		this.minMedioMayoreoNull = value;
		this.minMedioMayoreoModified = true;
	}

	/**
	 * Method 'isMinMedioMayoreoNull'
	 * 
	 * @return boolean
	 */
	public boolean isMinMedioMayoreoNull()
	{
		return minMedioMayoreoNull;
	}

	/** 
	 * Sets the value of minMedioMayoreoModified
	 */
	public void setMinMedioMayoreoModified(boolean minMedioMayoreoModified)
	{
		this.minMedioMayoreoModified = minMedioMayoreoModified;
	}

	/** 
	 * Gets the value of minMedioMayoreoModified
	 */
	public boolean isMinMedioMayoreoModified()
	{
		return minMedioMayoreoModified;
	}

	/**
	 * Method 'getMaxMedioMayoreo'
	 * 
	 * @return double
	 */
	public double getMaxMedioMayoreo()
	{
		return maxMedioMayoreo;
	}

	/**
	 * Method 'setMaxMedioMayoreo'
	 * 
	 * @param maxMedioMayoreo
	 */
	public void setMaxMedioMayoreo(double maxMedioMayoreo)
	{
		this.maxMedioMayoreo = maxMedioMayoreo;
		this.maxMedioMayoreoNull = false;
		this.maxMedioMayoreoModified = true;
	}

	/**
	 * Method 'setMaxMedioMayoreoNull'
	 * 
	 * @param value
	 */
	public void setMaxMedioMayoreoNull(boolean value)
	{
		this.maxMedioMayoreoNull = value;
		this.maxMedioMayoreoModified = true;
	}

	/**
	 * Method 'isMaxMedioMayoreoNull'
	 * 
	 * @return boolean
	 */
	public boolean isMaxMedioMayoreoNull()
	{
		return maxMedioMayoreoNull;
	}

	/** 
	 * Sets the value of maxMedioMayoreoModified
	 */
	public void setMaxMedioMayoreoModified(boolean maxMedioMayoreoModified)
	{
		this.maxMedioMayoreoModified = maxMedioMayoreoModified;
	}

	/** 
	 * Gets the value of maxMedioMayoreoModified
	 */
	public boolean isMaxMedioMayoreoModified()
	{
		return maxMedioMayoreoModified;
	}

	/**
	 * Method 'getPrecioMenudeo'
	 * 
	 * @return double
	 */
	public double getPrecioMenudeo()
	{
		return precioMenudeo;
	}

	/**
	 * Method 'setPrecioMenudeo'
	 * 
	 * @param precioMenudeo
	 */
	public void setPrecioMenudeo(double precioMenudeo)
	{
		this.precioMenudeo = precioMenudeo;
		this.precioMenudeoNull = false;
		this.precioMenudeoModified = true;
	}

	/**
	 * Method 'setPrecioMenudeoNull'
	 * 
	 * @param value
	 */
	public void setPrecioMenudeoNull(boolean value)
	{
		this.precioMenudeoNull = value;
		this.precioMenudeoModified = true;
	}

	/**
	 * Method 'isPrecioMenudeoNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioMenudeoNull()
	{
		return precioMenudeoNull;
	}

	/** 
	 * Sets the value of precioMenudeoModified
	 */
	public void setPrecioMenudeoModified(boolean precioMenudeoModified)
	{
		this.precioMenudeoModified = precioMenudeoModified;
	}

	/** 
	 * Gets the value of precioMenudeoModified
	 */
	public boolean isPrecioMenudeoModified()
	{
		return precioMenudeoModified;
	}

	/**
	 * Method 'getMaxMenudeo'
	 * 
	 * @return double
	 */
	public double getMaxMenudeo()
	{
		return maxMenudeo;
	}

	/**
	 * Method 'setMaxMenudeo'
	 * 
	 * @param maxMenudeo
	 */
	public void setMaxMenudeo(double maxMenudeo)
	{
		this.maxMenudeo = maxMenudeo;
		this.maxMenudeoNull = false;
		this.maxMenudeoModified = true;
	}

	/**
	 * Method 'setMaxMenudeoNull'
	 * 
	 * @param value
	 */
	public void setMaxMenudeoNull(boolean value)
	{
		this.maxMenudeoNull = value;
		this.maxMenudeoModified = true;
	}

	/**
	 * Method 'isMaxMenudeoNull'
	 * 
	 * @return boolean
	 */
	public boolean isMaxMenudeoNull()
	{
		return maxMenudeoNull;
	}

	/** 
	 * Sets the value of maxMenudeoModified
	 */
	public void setMaxMenudeoModified(boolean maxMenudeoModified)
	{
		this.maxMenudeoModified = maxMenudeoModified;
	}

	/** 
	 * Gets the value of maxMenudeoModified
	 */
	public boolean isMaxMenudeoModified()
	{
		return maxMenudeoModified;
	}

	/**
	 * Method 'getPrecioMayoreo'
	 * 
	 * @return double
	 */
	public double getPrecioMayoreo()
	{
		return precioMayoreo;
	}

	/**
	 * Method 'setPrecioMayoreo'
	 * 
	 * @param precioMayoreo
	 */
	public void setPrecioMayoreo(double precioMayoreo)
	{
		this.precioMayoreo = precioMayoreo;
		this.precioMayoreoNull = false;
		this.precioMayoreoModified = true;
	}

	/**
	 * Method 'setPrecioMayoreoNull'
	 * 
	 * @param value
	 */
	public void setPrecioMayoreoNull(boolean value)
	{
		this.precioMayoreoNull = value;
		this.precioMayoreoModified = true;
	}

	/**
	 * Method 'isPrecioMayoreoNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioMayoreoNull()
	{
		return precioMayoreoNull;
	}

	/** 
	 * Sets the value of precioMayoreoModified
	 */
	public void setPrecioMayoreoModified(boolean precioMayoreoModified)
	{
		this.precioMayoreoModified = precioMayoreoModified;
	}

	/** 
	 * Gets the value of precioMayoreoModified
	 */
	public boolean isPrecioMayoreoModified()
	{
		return precioMayoreoModified;
	}

	/**
	 * Method 'getMinMayoreo'
	 * 
	 * @return double
	 */
	public double getMinMayoreo()
	{
		return minMayoreo;
	}

	/**
	 * Method 'setMinMayoreo'
	 * 
	 * @param minMayoreo
	 */
	public void setMinMayoreo(double minMayoreo)
	{
		this.minMayoreo = minMayoreo;
		this.minMayoreoNull = false;
		this.minMayoreoModified = true;
	}

	/**
	 * Method 'setMinMayoreoNull'
	 * 
	 * @param value
	 */
	public void setMinMayoreoNull(boolean value)
	{
		this.minMayoreoNull = value;
		this.minMayoreoModified = true;
	}

	/**
	 * Method 'isMinMayoreoNull'
	 * 
	 * @return boolean
	 */
	public boolean isMinMayoreoNull()
	{
		return minMayoreoNull;
	}

	/** 
	 * Sets the value of minMayoreoModified
	 */
	public void setMinMayoreoModified(boolean minMayoreoModified)
	{
		this.minMayoreoModified = minMayoreoModified;
	}

	/** 
	 * Gets the value of minMayoreoModified
	 */
	public boolean isMinMayoreoModified()
	{
		return minMayoreoModified;
	}

	/**
	 * Method 'getNombreImagenProductoServicio'
	 * 
	 * @return String
	 */
	public String getNombreImagenProductoServicio()
	{
		return nombreImagenProductoServicio;
	}

	/**
	 * Method 'setNombreImagenProductoServicio'
	 * 
	 * @param nombreImagenProductoServicio
	 */
	public void setNombreImagenProductoServicio(String nombreImagenProductoServicio)
	{
		this.nombreImagenProductoServicio = nombreImagenProductoServicio;
		this.nombreImagenProductoServicioModified = true;
	}

	/** 
	 * Sets the value of nombreImagenProductoServicioModified
	 */
	public void setNombreImagenProductoServicioModified(boolean nombreImagenProductoServicioModified)
	{
		this.nombreImagenProductoServicioModified = nombreImagenProductoServicioModified;
	}

	/** 
	 * Gets the value of nombreImagenProductoServicioModified
	 */
	public boolean isNombreImagenProductoServicioModified()
	{
		return nombreImagenProductoServicioModified;
	}

	/**
	 * Method 'getIdCategoria'
	 * 
	 * @return int
	 */
	public int getIdCategoria()
	{
		return idCategoria;
	}

	/**
	 * Method 'setIdCategoria'
	 * 
	 * @param idCategoria
	 */
	public void setIdCategoria(int idCategoria)
	{
		this.idCategoria = idCategoria;
		this.idCategoriaNull = false;
		this.idCategoriaModified = true;
	}

	/**
	 * Method 'setIdCategoriaNull'
	 * 
	 * @param value
	 */
	public void setIdCategoriaNull(boolean value)
	{
		this.idCategoriaNull = value;
		this.idCategoriaModified = true;
	}

	/**
	 * Method 'isIdCategoriaNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdCategoriaNull()
	{
		return idCategoriaNull;
	}

	/** 
	 * Sets the value of idCategoriaModified
	 */
	public void setIdCategoriaModified(boolean idCategoriaModified)
	{
		this.idCategoriaModified = idCategoriaModified;
	}

	/** 
	 * Gets the value of idCategoriaModified
	 */
	public boolean isIdCategoriaModified()
	{
		return idCategoriaModified;
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
		
		if (!(_other instanceof SgfensProductoServicio)) {
			return false;
		}
		
		final SgfensProductoServicio _cast = (SgfensProductoServicio) _other;
		if (idProductoServicio != _cast.idProductoServicio) {
			return false;
		}
		
		if (idProductoServicioModified != _cast.idProductoServicioModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaNull != _cast.idEmpresaNull) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
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
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreModified != _cast.nombreModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (unidad == null ? _cast.unidad != unidad : !unidad.equals( _cast.unidad )) {
			return false;
		}
		
		if (unidadModified != _cast.unidadModified) {
			return false;
		}
		
		if (precioMedioMayoreo != _cast.precioMedioMayoreo) {
			return false;
		}
		
		if (precioMedioMayoreoNull != _cast.precioMedioMayoreoNull) {
			return false;
		}
		
		if (precioMedioMayoreoModified != _cast.precioMedioMayoreoModified) {
			return false;
		}
		
		if (minMedioMayoreo != _cast.minMedioMayoreo) {
			return false;
		}
		
		if (minMedioMayoreoNull != _cast.minMedioMayoreoNull) {
			return false;
		}
		
		if (minMedioMayoreoModified != _cast.minMedioMayoreoModified) {
			return false;
		}
		
		if (maxMedioMayoreo != _cast.maxMedioMayoreo) {
			return false;
		}
		
		if (maxMedioMayoreoNull != _cast.maxMedioMayoreoNull) {
			return false;
		}
		
		if (maxMedioMayoreoModified != _cast.maxMedioMayoreoModified) {
			return false;
		}
		
		if (precioMenudeo != _cast.precioMenudeo) {
			return false;
		}
		
		if (precioMenudeoNull != _cast.precioMenudeoNull) {
			return false;
		}
		
		if (precioMenudeoModified != _cast.precioMenudeoModified) {
			return false;
		}
		
		if (maxMenudeo != _cast.maxMenudeo) {
			return false;
		}
		
		if (maxMenudeoNull != _cast.maxMenudeoNull) {
			return false;
		}
		
		if (maxMenudeoModified != _cast.maxMenudeoModified) {
			return false;
		}
		
		if (precioMayoreo != _cast.precioMayoreo) {
			return false;
		}
		
		if (precioMayoreoNull != _cast.precioMayoreoNull) {
			return false;
		}
		
		if (precioMayoreoModified != _cast.precioMayoreoModified) {
			return false;
		}
		
		if (minMayoreo != _cast.minMayoreo) {
			return false;
		}
		
		if (minMayoreoNull != _cast.minMayoreoNull) {
			return false;
		}
		
		if (minMayoreoModified != _cast.minMayoreoModified) {
			return false;
		}
		
		if (nombreImagenProductoServicio == null ? _cast.nombreImagenProductoServicio != nombreImagenProductoServicio : !nombreImagenProductoServicio.equals( _cast.nombreImagenProductoServicio )) {
			return false;
		}
		
		if (nombreImagenProductoServicioModified != _cast.nombreImagenProductoServicioModified) {
			return false;
		}
		
		if (idCategoria != _cast.idCategoria) {
			return false;
		}
		
		if (idCategoriaNull != _cast.idCategoriaNull) {
			return false;
		}
		
		if (idCategoriaModified != _cast.idCategoriaModified) {
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
		_hashCode = 29 * _hashCode + idProductoServicio;
		_hashCode = 29 * _hashCode + (idProductoServicioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		if (unidad != null) {
			_hashCode = 29 * _hashCode + unidad.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (unidadModified ? 1 : 0);
		long temp_precioMedioMayoreo = Double.doubleToLongBits(precioMedioMayoreo);
		_hashCode = 29 * _hashCode + (int) (temp_precioMedioMayoreo ^ (temp_precioMedioMayoreo >>> 32));
		_hashCode = 29 * _hashCode + (precioMedioMayoreoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioMedioMayoreoModified ? 1 : 0);
		long temp_minMedioMayoreo = Double.doubleToLongBits(minMedioMayoreo);
		_hashCode = 29 * _hashCode + (int) (temp_minMedioMayoreo ^ (temp_minMedioMayoreo >>> 32));
		_hashCode = 29 * _hashCode + (minMedioMayoreoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (minMedioMayoreoModified ? 1 : 0);
		long temp_maxMedioMayoreo = Double.doubleToLongBits(maxMedioMayoreo);
		_hashCode = 29 * _hashCode + (int) (temp_maxMedioMayoreo ^ (temp_maxMedioMayoreo >>> 32));
		_hashCode = 29 * _hashCode + (maxMedioMayoreoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (maxMedioMayoreoModified ? 1 : 0);
		long temp_precioMenudeo = Double.doubleToLongBits(precioMenudeo);
		_hashCode = 29 * _hashCode + (int) (temp_precioMenudeo ^ (temp_precioMenudeo >>> 32));
		_hashCode = 29 * _hashCode + (precioMenudeoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioMenudeoModified ? 1 : 0);
		long temp_maxMenudeo = Double.doubleToLongBits(maxMenudeo);
		_hashCode = 29 * _hashCode + (int) (temp_maxMenudeo ^ (temp_maxMenudeo >>> 32));
		_hashCode = 29 * _hashCode + (maxMenudeoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (maxMenudeoModified ? 1 : 0);
		long temp_precioMayoreo = Double.doubleToLongBits(precioMayoreo);
		_hashCode = 29 * _hashCode + (int) (temp_precioMayoreo ^ (temp_precioMayoreo >>> 32));
		_hashCode = 29 * _hashCode + (precioMayoreoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (precioMayoreoModified ? 1 : 0);
		long temp_minMayoreo = Double.doubleToLongBits(minMayoreo);
		_hashCode = 29 * _hashCode + (int) (temp_minMayoreo ^ (temp_minMayoreo >>> 32));
		_hashCode = 29 * _hashCode + (minMayoreoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (minMayoreoModified ? 1 : 0);
		if (nombreImagenProductoServicio != null) {
			_hashCode = 29 * _hashCode + nombreImagenProductoServicio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreImagenProductoServicioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCategoria;
		_hashCode = 29 * _hashCode + (idCategoriaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idCategoriaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SgfensProductoServicioPk
	 */
	public SgfensProductoServicioPk createPk()
	{
		return new SgfensProductoServicioPk(idProductoServicio);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SgfensProductoServicio: " );
		ret.append( "idProductoServicio=" + idProductoServicio );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", nombre=" + nombre );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", unidad=" + unidad );
		ret.append( ", precioMedioMayoreo=" + precioMedioMayoreo );
		ret.append( ", minMedioMayoreo=" + minMedioMayoreo );
		ret.append( ", maxMedioMayoreo=" + maxMedioMayoreo );
		ret.append( ", precioMenudeo=" + precioMenudeo );
		ret.append( ", maxMenudeo=" + maxMenudeo );
		ret.append( ", precioMayoreo=" + precioMayoreo );
		ret.append( ", minMayoreo=" + minMayoreo );
		ret.append( ", nombreImagenProductoServicio=" + nombreImagenProductoServicio );
		ret.append( ", idCategoria=" + idCategoria );
		return ret.toString();
	}

}
