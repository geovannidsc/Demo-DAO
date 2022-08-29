package model.dao;

import model.dao.impl.SellerDaoJDC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		
		return new SellerDaoJDC();
	}
	
}
