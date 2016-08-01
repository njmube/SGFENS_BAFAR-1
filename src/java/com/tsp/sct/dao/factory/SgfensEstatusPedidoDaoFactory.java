/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.factory;

import java.sql.Connection;
import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.jdbc.*;

public class SgfensEstatusPedidoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return SgfensEstatusPedidoDao
	 */
	public static SgfensEstatusPedidoDao create()
	{
		return new SgfensEstatusPedidoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return SgfensEstatusPedidoDao
	 */
	public static SgfensEstatusPedidoDao create(Connection conn)
	{
		return new SgfensEstatusPedidoDaoImpl( conn );
	}

}